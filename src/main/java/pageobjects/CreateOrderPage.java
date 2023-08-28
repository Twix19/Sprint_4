package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.time.Duration;

public class CreateOrderPage {
    WebDriver driver;
    static final int DRIVER_DURATION = 10;
    static final String DRIVER_SITE = "https://qa-scooter.praktikum-services.ru/";

    public CreateOrderPage(WebDriver driver) {
        this.driver = driver;
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(DRIVER_DURATION)); //испольуем ожидание
        driver.get(DRIVER_SITE);
    }

    //Нажимаем на кнопку "Имя" и вводим своё имя
    private By nameElement = By.xpath(".//div[@class='Input_InputContainer__3NykH']/input[@placeholder='* Имя']");
    //Нажимаем на кнопку "Фамилия" и вводим свою фамилию
    private By lastNameElement = By.xpath(".//div[@class='Input_InputContainer__3NykH']/input[@placeholder='* Фамилия']");
    //Нажимаем на кнопку "Адрес: куда привезти заказ" и вводим адрес
    private By adressElement = By.xpath(".//div[@class='Input_InputContainer__3NykH']/input[@placeholder='* Адрес: куда привезти заказ']");
    //Нажимаем на кнопку "Заказать"
    private By orderButton = By.className("Button_Button__ra12g");
    //Выбираем станцию метро(вторая станция метро)
    private By secondOrderButton = By.xpath(".//button[contains(@class,'Button_Middle__1CSJM')]");
    //Нажимаем на кнопку "Станция метро"
    private By metroElement = By.xpath(".//div[@class='select-search__value']/input[@placeholder='* Станция метро']");
    //Выбираем станцию метро
    private By chooseMetroElement = By.xpath(".//div[@class='select-search__select']/ul/li[@data-index='1']/button");
    private By chooseSecondMetroElement = By.xpath(".//div[@class='select-search__select']/ul/li[@data-index='5']/button");
    //Нажимаем на кнопку "Телефон: на него позвонит курьер" и вводим свой номер телефона
    private By numberElement = By.xpath(".//div[@class='Input_InputContainer__3NykH']/input[@placeholder='* Телефон: на него позвонит курьер']");
    //Нажимаем на кнопку "Далее"
    private By clickNext = By.xpath(".//button[contains(@class, 'Button_Middle__1CSJM')]");
    //Кнопка принятия куки
    private By cookieButton = By.xpath(".//button[contains(@class,'CookieButton')]");
    private By faqButton = By.xpath(".//div[contains(@id, 'accordion__heading-0')]");
    private By faqButtonText = By.xpath(".//div/p[contains(text(),'Сутки')]");
    private By faqButtonSecond = By.xpath(".//div[contains(@id,'accordion__heading-1')]");
    private By faqButtonTextSecond = By.xpath(".//div/p[contains(text(),'Пока что у нас так')]");
    private By faqButtonThird = By.xpath(".//div[contains(@id,'accordion__heading-2')]");
    private By faqButtonTextSThird = By.xpath(".//div/p[contains(text(),'Допустим, вы оформляете заказ на 8 мая')]");
    private By faqButtonFourth = By.xpath(".//div[contains(@id,'accordion__heading-3')]");
    private By faqButtonTextFourth = By.xpath(".//div/p[contains(text(),'Только начиная с завтрашнего дня')]");
    private By faqButtonFifth = By.xpath(".//div[contains(@id,'accordion__heading-4')]");
    private By faqButtonTextFifth = By.xpath(".//div/p[contains(text(),'Пока что нет!')]");
    private By faqButtonSixth = By.xpath(".//div[contains(@id,'accordion__heading-5')]");
    private By faqButtonTextSixth = By.xpath(".//div/p[contains(text(),'Самокат приезжает к вам с полной зарядкой')]");
    private By faqButtonSeventh = By.xpath(".//div[contains(@id,'accordion__heading-6')]");
    private By faqButtonTextSeventh = By.xpath(".//div/p[contains(text(),'Да, пока самокат')]");
    private By faqButtonEighth = By.xpath(".//div[contains(@id,'accordion__heading-7')]");
    private By faqButtonTextEighth = By.xpath(".//div/p[contains(text(),'Да, обязательно')]");


    public void ifCookieButtonExists() {
        if (driver.findElements(cookieButton).size() == 1) {
            driver.findElement(cookieButton).click();
        }
    }

    public void clickOrderButton() {
        driver.findElement(orderButton).click();
    }

    public void clickSecondOrderButton() {
        ifCookieButtonExists(); // кнопка с куки не позволяет нажать на нижнюю кнопку заказа.
        driver.findElement(secondOrderButton).click();
    }

    public void enterNameAndLastName(String name, String lastName) {
        driver.findElement(nameElement).click();
        driver.findElement(nameElement).sendKeys(name);
        driver.findElement(lastNameElement).click();
        driver.findElement(lastNameElement).sendKeys(lastName);
    }

    public void enterAdress(String adress) {
        driver.findElement(adressElement).click();
        driver.findElement(adressElement).sendKeys(adress);
    }

    public void chooseAndergroundStation() {
        driver.findElement(metroElement).click();
        driver.findElement(chooseMetroElement).click();
    }

    public void chooseSecondAndergroundStation() {
        driver.findElement(metroElement).click();
        driver.findElement(chooseSecondMetroElement).click();
    }

    public void textPhoneNumber(String number) {
        driver.findElement(numberElement).click();
        driver.findElement(numberElement).sendKeys(number);
    }

    public void moveToAnotherPage() {
        driver.findElement(clickNext).click();
    }

    public String faqButtonExist() {
        driver.findElement(faqButton).click();
        driver.findElement(faqButtonText).click(); // клики для скролла страницы до текста, иначе не срабатывает .getText и тест падает
        return driver.findElement(faqButtonText).getText();
    }

    public String secondFaqButtonExist() {
        driver.findElement(faqButtonSecond).click();
        driver.findElement(faqButtonTextSecond).click();
        return driver.findElement(faqButtonTextSecond).getText();
    }

    public String thirdFaqButtonExist() {
        driver.findElement(faqButtonThird).click();
        driver.findElement(faqButtonTextSThird).click();
        return driver.findElement(faqButtonTextSThird).getText();
    }

    public String fourthFaqButtonExist() {
        driver.findElement(faqButtonFourth).click();
        driver.findElement(faqButtonTextFourth).click();
        return driver.findElement(faqButtonTextFourth).getText();
    }

    public String fifthFaqButtonExist() {
        driver.findElement(faqButtonFifth).click();
        driver.findElement(faqButtonTextFifth).click();
        return driver.findElement(faqButtonTextFifth).getText();
    }

    public String sixthFaqButtonExist() {
        driver.findElement(faqButtonSixth).click();
        driver.findElement(faqButtonTextSixth).click();
        return driver.findElement(faqButtonTextSixth).getText();
    }

    public String seventhFaqButtonExist() {
        driver.findElement(faqButtonSeventh).click();
        driver.findElement(faqButtonTextSeventh).click();
        return driver.findElement(faqButtonTextSeventh).getText();
    }

    public String eighthFaqButtonExist() {
        driver.findElement(faqButtonEighth).click();
        driver.findElement(faqButtonTextEighth).click();
        return driver.findElement(faqButtonTextEighth).getText();
    }


}
