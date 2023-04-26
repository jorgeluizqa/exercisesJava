package exercises.test;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public abstract class BaseTest {
    protected static WebDriver driver;
    private static String URL_BASE = "https://automationexercise.com/";
    private static String CAMINHO_DRIVER = "src/test/java/exercises/resource/chromedriver-111.0.5563.65.exe";

    @BeforeClass
    public static void iniciar() {
        System.setProperty("webdriver.chrome.driver", CAMINHO_DRIVER);
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(URL_BASE);
    }

    @AfterClass
    public static void finalizar() {
        driver.quit();
        
    }

}
