package exercises.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage extends BasePage {

    public HomePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(className = "fa-shopping-cart")
    private WebElement botaoCarrinho;

    @FindBy(className = "active")
    private WebElement textoShoppingCart;

    public void clicarBotaoCarrinho() {
        botaoCarrinho.click();
    }

    public boolean verificarTexto(String texto) {
        WebDriverWait wait = new WebDriverWait(driver, 10); // Aguardar até 10 segundos
        wait.until(ExpectedConditions.textToBePresentInElement(textoShoppingCart, texto));
        return textoShoppingCart.getText().contains(texto);
    }

    
}
