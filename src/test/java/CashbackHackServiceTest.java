import org.example.CashbackHackService;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;


public class CashbackHackServiceTest {
    @Test
    void shouldReturn100IfAmountIs900() {
        // подготовка данных
        CashbackHackService service = new CashbackHackService();
        int amount = 900;
        int expected = 100;

        // выполнение целевого действия
        int actual = service.remain(amount);

        // сравнение ФР и ОР
        assertEquals(actual,expected);
    }

    @Test
    void shouldReturn0IfAmountIs1000() {
        // подготовка данных
        CashbackHackService service = new CashbackHackService();
        int amount = 1000;
        int expected = 0;

        // выполнение целевого действия
        int actual = service.remain(amount);

        // сравнение ОР и ФР
        assertEquals(actual, expected);
    }

}