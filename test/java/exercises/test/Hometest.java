package exercises.test;

import org.junit.BeforeClass;
import org.junit.Test;
import exercises.page.HomePage;

public class Hometest extends BaseTest {

    private static HomePage homePage;

    @BeforeClass
    public static void prepararTeste() {

        homePage = new HomePage(driver);

    }

    @Test
    public void testeClicarCarrinhoDeCompras() {

        homePage.clicarBotaoCarrinho();
        homePage.verificarTexto("Shopping Cart");
    

    }

}
