package sprint4;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScooterTest {
    WebDriver driver = new ChromeDriver();

    CreateOrderPage createOrder = new CreateOrderPage(driver);
    SecondCreateOrderPage secondOrder = new SecondCreateOrderPage(driver);
    @Test
    public void orderScooter() {
        createOrder.clickOrderButton();
        createOrder.enterNameAndLastName("Василий", "Иванов");
        createOrder.enterAdress("Введенского 1А");
        createOrder.chooseAndergroundStation();
        createOrder.textPhoneNumber("89165678903");
        createOrder.moveToAnotherPage();

        secondOrder.arrivalDateOfScooter();
        secondOrder.rentalPeriod();
        secondOrder.scooterColor();
        secondOrder.writeComment();
        secondOrder.orderScooter();

        driver.quit();
    }
}