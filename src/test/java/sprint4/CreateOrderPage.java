package sprint4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


import java.time.Duration;

public class CreateOrderPage {
    WebDriver driver;
    public CreateOrderPage(WebDriver driver){
        this.driver = driver;
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); //испольуем ожидание
        driver.get("https://qa-scooter.praktikum-services.ru/");
    }
    //Нажимаем на кнопку "Имя" и вводим своё имя
    By nameElement = By.xpath(".//div[@class='Input_InputContainer__3NykH']/input[@placeholder='* Имя']");
    //Нажимаем на кнопку "Фамилия" и вводим свою фамилию
    By lastNameElement = By.xpath(".//div[@class='Input_InputContainer__3NykH']/input[@placeholder='* Фамилия']");
    //Нажимаем на кнопку "Адрес: куда привезти заказ" и вводим адрес
    By adressElement = By.xpath(".//div[@class='Input_InputContainer__3NykH']/input[@placeholder='* Адрес: куда привезти заказ']");
    //Нажимаем на кнопку "Заказать"
    By orderButton = By.className("Button_Button__ra12g");
    //Нажимаем на кнопку "Станция метро"
    By metroElement = By.xpath(".//div[@class='select-search__value']/input[@placeholder='* Станция метро']");
    //Выбираем станцию метро
    By chooseMetroElement = By.xpath(".//div[@class='select-search__select']/ul/li[@data-index='1']/button");
    //Нажимаем на кнопку "Телефон: на него позвонит курьер" и вводим свой номер телефона
    By numberElement = By.xpath(".//div[@class='Input_InputContainer__3NykH']/input[@placeholder='* Телефон: на него позвонит курьер']");
    //Нажимаем на кнопку "Далее"
    By clickNext = By.xpath(".//button[contains(@class, 'Button_Middle__1CSJM')]");
    public void clickOrderButton(){
        driver.findElement(orderButton).click();
    }
    public void enterNameAndLastName(String name, String lastName){
        driver.findElement(nameElement).click();
        driver.findElement(nameElement).sendKeys(name);
        driver.findElement(lastNameElement).click();
        driver.findElement(lastNameElement).sendKeys(lastName);
    }

    public void enterAdress(String adress){
        driver.findElement(adressElement).click();
        driver.findElement(adressElement).sendKeys(adress);
    }
    public void chooseAndergroundStation(){
        driver.findElement(metroElement).click();
        driver.findElement(chooseMetroElement ).click();
    }

    public void textPhoneNumber(String number){
        driver.findElement(numberElement).click();
        driver.findElement(numberElement).sendKeys("89165678903");
    }
    public void moveToAnotherPage(){
        driver.findElement(clickNext).click();
    }

}
