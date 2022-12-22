import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import ru.netology.BinOps;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class BinaryFacadeTest {
    @BeforeEach
    public void init() {
        System.out.println("Test begin");
    }

    @AfterEach
    public void finish() {
        System.out.println("End of test");
    }

    @CsvFileSource(files = "src/test/resources/binops.csv")
    @ParameterizedTest
    public void calcTest(String a, String b, String expect, String oper) {
        System.out.println("======== Calculation test");

        BinOps binOps = new BinOps();

        switch (oper) {
            case "sum":
                assertEquals(expect,binOps.sum(a,b));
                break;
            case "mult":
                assertEquals(expect, binOps.mult(a,b));
                break;
        }
    }

    @CsvFileSource(files = "src/test/resources/binopsexcept.csv")
    @ParameterizedTest
    public void calcExceptTest(String a, String b, String oper) {
        System.out.println("======== Exception test");

        BinOps binOps = new BinOps();

        switch (oper) {
            case "sum":
                assertThrows(NumberFormatException.class, () -> binOps.sum(a,b), "Integer overflow");
                break;
            case "mult":
                assertThrows(NumberFormatException.class, () -> binOps.mult(a,b), "Integer overflow");
                break;
        }
    }
}
