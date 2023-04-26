package exercises.test;

import org.junit.BeforeClass;
import org.junit.Test;
import exercises.page.CartPage;
import exercises.page.HomePage;

public class CartTest extends BaseTest {
    private static HomePage homePage;

    @BeforeClass
    public static void prepararTeste() {

        homePage = new HomePage(driver);

    }

    @Test
    public void testeSubmeterEmailCarrinhodecompras() {
        CartPage cartPage = new CartPage(driver);
        homePage.clicarBotaoCarrinho();
        cartPage.preencherEmail();
        cartPage.clicarBotaoseta();
    }

    public void verificarTextoCart() {
    }
}
