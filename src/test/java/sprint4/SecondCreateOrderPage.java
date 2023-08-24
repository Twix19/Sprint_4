package sprint4;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;




public class SecondCreateOrderPage {
    WebDriver driver;
    public SecondCreateOrderPage(WebDriver driver) {
        this.driver = driver;
    }
    //Нажимаем на кнопку "Когда привезти самокат"
    By dataElement = By.xpath(".//input[contains(@placeholder,'привезти самокат')]");
    //Выбираем дату
    By chooseDataElement = By.xpath(".//div[contains(@aria-label,'среда, 23-е августа')]");
    //Нажимаем на кнопку "Срок аренды"
    By clickRentalPeriod = By.xpath(".//div[contains(@class, 'Dropdown-placeholder')]");
    //Выбираем срок аренды
    By chooseRentalPeriod = By.xpath(".//div[text()='пятеро суток']");
    //Выбираем цвет самоката
    By scooterColorChoice = By.xpath(".//input[contains(@id, 'black')]");
    //Нажимаем на кнопку "Комментарий для курьера" и пишем комментарий
    By commentForCourier = By.xpath(".//input[contains(@placeholder, 'Комментарий для курьера')]");
    //Нажимаем на кнопку "Заказать"
    By clickOrderButton = By.xpath(".//button[contains(@class, 'Button_Middle__1CSJM') and (text() = 'Заказать')]");
    //Нажимаем на кнопку "Да" и подтверждаем заказ
    By confirmationOfOrder = By.xpath(".//button[contains(@class, 'Button_Button__ra12g') and (text() = 'Да')]");


    public void arrivalDateOfScooter(){
        driver.findElement(dataElement).click();
        driver.findElement(chooseDataElement).click();

    }
    public void rentalPeriod(){
        driver.findElement(clickRentalPeriod).click();
        driver.findElement(chooseRentalPeriod).click();
    }
    public void scooterColor(){
        driver.findElement(scooterColorChoice).click();
    }
    public void writeComment(){
        driver.findElement(commentForCourier).click();
        driver.findElement(commentForCourier).sendKeys("Подъезд 3");
    }
    public void orderScooter(){
        driver.findElement(clickOrderButton).click();
        driver.findElement(confirmationOfOrder).click();
    }

}
