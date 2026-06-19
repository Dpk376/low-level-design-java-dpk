import adapter.BankAPI;
import adapter.IciciBankAdapter;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AdapterTest {
    @Test
    public void testBankAdapter() {
        BankAPI bankAPI = new IciciBankAdapter();
        assertNotNull(bankAPI);
    }
}
