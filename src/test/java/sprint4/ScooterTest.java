package sprint4;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pageobjects.CreateOrderPage;
import pageobjects.SecondCreateOrderPage;

public class ScooterTest {
    WebDriver driver = new ChromeDriver();

    CreateOrderPage createOrder = new CreateOrderPage(driver);
    SecondCreateOrderPage secondOrder = new SecondCreateOrderPage(driver);
    @Test
    public void orderScooter() {
        createOrder.faqButtonExist();
        createOrder.SecondFaqButtonExist();
        createOrder.clickOrderButton();
        createOrder.enterNameAndLastName("Василий", "Иванов");
        createOrder.enterAdress("Введенского 1А");
        createOrder.chooseAndergroundStation();
        createOrder.textPhoneNumber("89165678903");
        createOrder.moveToAnotherPage();

        secondOrder.arrivalDateOfScooter();
        secondOrder.rentalPeriod();
        secondOrder.scooterColor();
        secondOrder.writeComment("Подъезд 3");
        secondOrder.orderScooter();
        secondOrder.orderConfirmSuccessfull();

        driver.quit();
    }

    @Test
    public void orderScooterWithSecondButton(){
        createOrder.faqButtonExist();
        createOrder.SecondFaqButtonExist();
        createOrder.clickSecondOrderButton();
        createOrder.enterNameAndLastName("Петр", "Петров");
        createOrder.enterAdress("Тестильщиков 12Б");
        createOrder.chooseSecondAndergroundStation();
        createOrder.textPhoneNumber("88005553535");
        createOrder.moveToAnotherPage();

        secondOrder.arrivalSecondDateOfScooter();
        secondOrder.secondRentalPeriod();
        secondOrder.secondScooterColor();
        secondOrder.writeComment("Этаж 14");
        secondOrder.orderScooter();
        secondOrder.orderConfirmSuccessfull();

        driver.quit();
    }
}

