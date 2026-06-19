public class Teacher {

    private String name;
    private int age;

    public static Builder getBuilder() {
        return new Builder();
    }

    private Teacher(Builder builder) {
        this.name = builder.getName();
        this.age = builder.getAge();
    }

    public static class Builder {
        private String name;
        private int age;

        public String getName() {
            return name;
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public int getAge() {
            return age;
        }

        public Builder setAge(int age) {
            this.age = age;
            return this;
        }

        public void validate() {
            if (this.age < 0) {
                throw new IllegalArgumentException("Age cannot be negative");
            }
        }

        public Teacher build() {
            validate();
            return new Teacher(this);
        }
    }
}
