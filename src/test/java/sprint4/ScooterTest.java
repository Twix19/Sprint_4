package sprint4;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import pageobjects.CreateOrderPage;
import pageobjects.SecondCreateOrderPage;

public class ScooterTest {
    WebDriver driver = new ChromeDriver(); //закоммитить, если запуск через файрфокс
    WebDriver mozillaDriver = new FirefoxDriver();
    CreateOrderPage createOrder = new CreateOrderPage(mozillaDriver);
    SecondCreateOrderPage secondOrder = new SecondCreateOrderPage(mozillaDriver);

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
        secondOrder.writeComment("Подъезд 3");
        secondOrder.orderScooter();
        Assert.assertEquals("Заказ оформлен", secondOrder.orderConfirmSuccessfull());
        driver.quit();
    }

    @Test
    public void orderScooterWithSecondButton() {
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

