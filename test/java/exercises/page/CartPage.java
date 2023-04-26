package exercises.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CartPage extends BasePage {

    public CartPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "susbscribe_email")
    private WebElement campoEmail;

    public void preencherEmail() {
        String email = "ze@teste.com";
        campoEmail.sendKeys(email);
    }

    @FindBy(css = "footer div:nth-child(1) div div div:nth-child(2) div form button i")
    private WebElement botaoseta;

    public void clicarBotaoseta() {
        botaoseta.click();
    }

    public boolean verificarTextoNaPagina(String textoEsperado) {
        String pagina = driver.getPageSource();
        return pagina.contains(textoEsperado);
    }

    public boolean verificarTextoCart() {
        String textoEsperado = "SUBSCRIPTION";
        return verificarTextoNaPagina(textoEsperado);
    }

    
}
