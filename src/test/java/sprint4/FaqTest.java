package sprint4;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pageobjects.CreateOrderPage;


import java.time.Duration;

public class FaqTest {
    WebDriver driver = new ChromeDriver();

    CreateOrderPage createOrder = new CreateOrderPage(driver);

    @Test

    public void FaqExist() {
        createOrder.ifCookieButtonExists();
        Assert.assertEquals("Сутки — 400 рублей. Оплата курьеру — наличными или картой.", createOrder.faqButtonExist());
        Assert.assertEquals("Пока что у нас так: один заказ — один самокат. Если хотите покататься с друзьями, можете просто сделать несколько заказов — один за другим.", createOrder.secondFaqButtonExist());
        Assert.assertEquals("Допустим, вы оформляете заказ на 8 мая. Мы привозим самокат 8 мая в течение дня. Отсчёт времени аренды начинается с момента, когда вы оплатите заказ курьеру. Если мы привезли самокат 8 мая в 20:30, суточная аренда закончится 9 мая в 20:30.", createOrder.thirdFaqButtonExist());
        Assert.assertEquals("Только начиная с завтрашнего дня. Но скоро станем расторопнее.", createOrder.fourthFaqButtonExist());
        Assert.assertEquals("Пока что нет! Но если что-то срочное — всегда можно позвонить в поддержку по красивому номеру 1010.", createOrder.fifthFaqButtonExist());
        Assert.assertEquals("Самокат приезжает к вам с полной зарядкой. Этого хватает на восемь суток — даже если будете кататься без передышек и во сне. Зарядка не понадобится.", createOrder.sixthFaqButtonExist());
        Assert.assertEquals("Да, пока самокат не привезли. Штрафа не будет, объяснительной записки тоже не попросим. Все же свои.", createOrder.seventhFaqButtonExist());
        Assert.assertEquals("Да, обязательно. Всем самокатов! И Москве, и Московской области.", createOrder.eighthFaqButtonExist());
    }


}
