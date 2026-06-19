# Multithreading & Synchronization Examples

This module demonstrates core concepts of Java Multithreading and Concurrency through layered, incremental implementations. The aim is to showcase not just *how* to use threading constructs, but *why* they exist and the exact problems they solve in concurrent programming.

## Table of Contents

1. [Thread Basics & ExecutorService](#1-thread-basics--executorservice)
2. [Synchronization & Shared Mutable State](#2-synchronization--shared-mutable-state)
3. [Divide and Conquer with Callables (MergeSort)](#3-divide-and-conquer-with-callables-mergesort)
4. [Coordination with Semaphores (Producer-Consumer)](#4-coordination-with-semaphores-producer-consumer)
5. [Real-World Application: URL Scraping](#5-real-world-application-url-scraping)

---

## 1. Thread Basics & ExecutorService
*(Found in `src/ClientV1.java`, `src/ClientV2.java`, `src/ClientV3.java`)*

**The Problem:**
Creating raw `Thread` instances is expensive. Each thread mapping to an OS thread consumes significant memory (thread stack) and causes CPU context-switching overhead. 

**The Evolution:**
- **ClientV1:** Demonstrates the anti-pattern of creating a `new Thread()` in a loop.
- **ClientV2:** Introduces `ExecutorService` with a Thread Pool, reusing threads to execute `Runnable` tasks.
- **ClientV3:** Advances to `Callable<V>`, allowing tasks to return values and throw exceptions, communicating results via `Future<V>`.

---

## 2. Synchronization & Shared Mutable State
*(Found in `src/synchronization/`)*

**The Problem:**
When multiple threads read and write to the same memory location simultaneously (e.g., `Value.x`), they encounter Race Conditions. A simple `x = x + 1` involves three non-atomic CPU instructions (Read, Increment, Write). 

**The Evolution:**
- **AdderV1 & SubtracterV1:** Early versions demonstrating race conditions. Without synchronization, incrementing and decrementing the same variable 100 times concurrently will randomly produce non-zero results.
- **AdderV2 & SubtracterV2:** Iterative improvement using synchronized blocks (`synchronized(value)`) inside the thread. 
- **Adder, Subtracter, and Value:** The final design encapsulates the synchronization within the `Value` class itself (Monitor Pattern). `increment()` and `decrement()` are `synchronized` methods. This hides the lock mechanism from the caller, enforcing encapsulation and thread safety at the object level.

---

## 3. Divide and Conquer with Callables (MergeSort)
*(Found in `src/mergeSort/`)*

**The Problem:**
We want to distribute computationally intensive tasks across multiple cores. 

**The Implementation:**
`Sorter.java` leverages `Callable` to split an array in half and recursively submit both halves to an `ExecutorService`.
- **Recursive Forking:** `Future<List<Integer>>` handles the asynchronous execution of sub-arrays.
- **Joining:** `future.get()` forces the current thread to block until the sub-task completes.
- **Merge:** Finally, it merges the two sorted sub-arrays. 
*Note: In modern Java, `ForkJoinPool` is typically preferred for this specific recursive task splitting, but `ExecutorService` effectively illustrates the core principle.*

---

## 4. Coordination with Semaphores (Producer-Consumer)
*(Found in `src/semaphore/`)*

**The Problem:**
Multiple Producers and Consumers interact with a shared `Store` with a finite capacity. Producers must not overfill the store; consumers must not read from an empty store.

**The Evolution:**
- **ProducerV1 & ConsumerV1:** Early implementations attempting to manage the store using basic `synchronized` blocks. This easily leads to busy-waiting or thread starvation if `wait()` and `notifyAll()` aren't used correctly.
- **Producer & Consumer:** Utilizes `java.util.concurrent.Semaphore`. 
    - `producerSema`: Initialized to max capacity. Permits are acquired before adding, representing available space.
    - `consumerSema`: Initialized to 0. Permits are released by the producer and acquired by the consumer, representing available items.
This perfectly decouples the synchronization of the queue state from the coordination of the producers and consumers.

---

## 5. Real-World Application: URL Scraping
*(Found in `Problems/src/UrlScrapping/`)*

**The Problem:**
I/O bound operations (like network requests) spend most of their time blocking. 

**The Implementation:**
Compares the time taken by a `FixedThreadPool` vs a `CachedThreadPool` when scraping 100 URLs. Because network tasks spend time waiting on I/O, a CachedThreadPool can aggressively spin up more threads to handle concurrent I/O waits, significantly reducing total wall-clock execution time compared to a smaller fixed pool.

## Running Tests
JUnit tests validate thread safety and logic constraints. You can run them from the root directory using the standalone JUnit console launcher:
```bash
java -jar junit-platform-console-standalone.jar -cp out --scan-class-path
```
