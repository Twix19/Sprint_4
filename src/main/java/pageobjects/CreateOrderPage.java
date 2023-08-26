package pageobjects;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


import java.time.Duration;

public class CreateOrderPage {
    WebDriver driver;
    static final int driverDuration = 10;
    static final String driverSite = "https://qa-scooter.praktikum-services.ru/";
    public CreateOrderPage(WebDriver driver){
        this.driver = driver;
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(driverDuration)); //испольуем ожидание
        driver.get(driverSite);
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
    private By faqButtonSecond = By.xpath(".//div[contains(@id,'accordion__heading-1')]");
    public void ifCookieButtonExists(){
        if (driver.findElements(cookieButton).size() == 1){
            driver.findElement(cookieButton).click();
        }
    }
    public void clickOrderButton(){
        driver.findElement(orderButton).click();
    }
    public void clickSecondOrderButton(){
        ifCookieButtonExists(); // кнопка с куки не позволяет нажать на нижнюю кнопку заказа.
        driver.findElement(secondOrderButton).click();
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

    public void chooseSecondAndergroundStation(){
        driver.findElement(metroElement).click();
        driver.findElement(chooseSecondMetroElement).click();
    }

    public void textPhoneNumber(String number){
        driver.findElement(numberElement).click();
        driver.findElement(numberElement).sendKeys(number);
    }
    public void moveToAnotherPage(){
        driver.findElement(clickNext).click();
    }
    public void faqButtonExist(){
        driver.findElement(faqButton).click();
        Assert.assertEquals("Сутки — 400 рублей. Оплата курьеру — наличными или картой.", driver.findElement(faqButton).getText());
    }
    public void SecondFaqButtonExist(){
        driver.findElement(faqButtonSecond).click();
        Assert.assertEquals("Пока что у нас так: один заказ — один самокат. Если хотите покататься с друзьями, можете просто сделать несколько заказов — один за другим.", driver.findElement(faqButtonSecond).getText());
    }


}
