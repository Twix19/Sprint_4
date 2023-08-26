package pageobjects;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class SecondCreateOrderPage {
    WebDriver driver;
    public SecondCreateOrderPage(WebDriver driver) {
        this.driver = driver;
    }
    //Нажимаем на кнопку "Когда привезти самокат"
    private By dataElement = By.xpath(".//input[contains(@placeholder,'привезти самокат')]");
    //Выбираем дату
    private By chooseDataElement = By.xpath(".//div[contains(@aria-label,'среда, 23-е августа')]");
    //Выбираем дату(второю)
    private By chooseSecondDataElement = By.xpath(".//div[contains(@aria-label,'пятница, 25-е августа')]");
    //Нажимаем на кнопку "Срок аренды"
    private By clickRentalPeriod = By.xpath(".//div[contains(@class, 'Dropdown-placeholder')]");
    //Выбираем срок аренды
    private By chooseRentalPeriod = By.xpath(".//div[text()='пятеро суток']");
    //Выбираем срок аренды(второй)
    private By chooseSecondRentalPeriod = By.xpath(".//div[text()='трое суток']");
    //Выбираем цвет самоката
    private By scooterColorChoice = By.xpath(".//input[contains(@id, 'black')]");
    //Выбираем цвет самоката
    private By secondScooterColorChoice = By.xpath(".//input[contains(@id, 'grey')]");
    //Нажимаем на кнопку "Комментарий для курьера" и пишем комментарий
    private By commentForCourier = By.xpath(".//input[contains(@placeholder, 'Комментарий для курьера')]");
    //Нажимаем на кнопку "Заказать"
    private By clickOrderButton = By.xpath(".//button[contains(@class, 'Button_Middle__1CSJM') and (text() = 'Заказать')]");
    //Нажимаем на кнопку "Да" и подтверждаем заказ
    private By confirmationOfOrder = By.xpath(".//button[contains(@class, 'Button_Button__ra12g') and (text() = 'Да')]");
    private By orderConfirm = By.xpath(".//div[contains(@class,'Order_Header__BZXOb')]");


    public void arrivalDateOfScooter(){
        driver.findElement(dataElement).click();
        driver.findElement(chooseDataElement).click();
    }
    public void arrivalSecondDateOfScooter(){
        driver.findElement(dataElement).click();
        driver.findElement(chooseSecondDataElement).click();
    }
    public void rentalPeriod(){
        driver.findElement(clickRentalPeriod).click();
        driver.findElement(chooseRentalPeriod).click();
    }
    public void secondRentalPeriod(){
        driver.findElement(clickRentalPeriod).click();
        driver.findElement(chooseSecondRentalPeriod).click();
    }
    public void scooterColor(){
        driver.findElement(scooterColorChoice).click();
    }
    public void secondScooterColor(){
        driver.findElement(secondScooterColorChoice).click();
    }
    public void writeComment(String comment){
        driver.findElement(commentForCourier).click();
        driver.findElement(commentForCourier).sendKeys(comment);
    }
    public void orderScooter(){
        driver.findElement(clickOrderButton).click();
        driver.findElement(confirmationOfOrder).click();
    }
    public void orderConfirmSuccessfull(){
        driver.findElement(orderConfirm);
        Assert.assertEquals("Заказ оформлен", driver.findElement(orderConfirm).getText());
    }

}
