package sprint4;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pageobjects.CreateOrderPage;

import java.util.Arrays;
import java.util.Collection;


@RunWith(value = Parameterized.class)
public class FaqTest {
    private String argText;
    static WebDriver driver = new ChromeDriver();
    static CreateOrderPage createOrder = new CreateOrderPage(driver);

    public FaqTest(String argText) {
        this.argText = argText;
    }

    @Parameterized.Parameters()
    public static Collection<Object[]> data() {
        Object[][] data = {{createOrder.faqButtonExist()}, {createOrder.secondFaqButtonExist()}, {createOrder.thirdFaqButtonExist()},
                {createOrder.fourthFaqButtonExist()}, {createOrder.fifthFaqButtonExist()}, {createOrder.sixthFaqButtonExist()},
                {createOrder.seventhFaqButtonExist()}, {createOrder.eighthFaqButtonExist()}};
        return Arrays.asList(data);
    }

    @Test
    public void faqExist() {
        String[] texts = new String[]{"Сутки — 400 рублей. Оплата курьеру — наличными или картой.", "Пока что у нас так: один заказ — один самокат. Если хотите покататься с друзьями, можете просто сделать несколько заказов — один за другим.",
                "Допустим, вы оформляете заказ на 8 мая. Мы привозим самокат 8 мая в течение дня. Отсчёт времени аренды начинается с момента, когда вы оплатите заказ курьеру. Если мы привезли самокат 8 мая в 20:30, суточная аренда закончится 9 мая в 20:30.",
                "Только начиная с завтрашнего дня. Но скоро станем расторопнее.", "Пока что нет! Но если что-то срочное — всегда можно позвонить в поддержку по красивому номеру 1010.",
                "Самокат приезжает к вам с полной зарядкой. Этого хватает на восемь суток — даже если будете кататься без передышек и во сне. Зарядка не понадобится.",
                "Да, пока самокат не привезли. Штрафа не будет, объяснительной записки тоже не попросим. Все же свои.", "Да, обязательно. Всем самокатов! И Москве, и Московской области."};
        Assert.assertTrue(Arrays.asList(texts).contains(argText));
    }
}
