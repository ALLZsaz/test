package selenium;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;
import static org.junit.Assert.*;

public class MyTest {

    private WebDriver driver;

    @Before
    public void setUp() {
        driver = new ChromeDriver();

    }


    @Test
    public void testLedgerList() throws Exception {
        driver.navigate().to("http://localhost:8080/ledger");
        (new WebDriverWait(driver, 1)).until((ExpectedCondition<Boolean>) (WebDriver d) -> d.getPageSource().contains("март")
                && d.getPageSource().contains("17")
                && d.getPageSource().contains("18"));
        driver.quit();
    }

    @Test
    public void tryLogin() throws Exception {
        driver.navigate().to("http://localhost:8080/ledger");
        Thread.sleep(3000);
        driver.findElement(By.name("btnLogin")).sendKeys(Keys.RETURN);
        Thread.sleep(3000);
        String url1 = driver.getCurrentUrl();
        assertEquals(url1, "https://localhost:8443/login");
        driver.findElement(By.name("login")).sendKeys("admin");
        driver.findElement(By.name("pass")).sendKeys("password");
        Thread.sleep(3000);
        driver.findElement(By.name("btnLogin")).sendKeys(Keys.RETURN);
        String url2 = driver.getCurrentUrl();
        assertEquals(url2, "https://localhost:8443/login?error");//Unknown username and password.
        (new WebDriverWait(driver, 1)).until((ExpectedCondition<Boolean>) (WebDriver d) ->
                d.getPageSource().contains("Неправильные логин и пароль"));
        Thread.sleep(3000);
        driver.navigate().to("http://localhost:8080/ledger");
        Thread.sleep(3000);
        driver.findElement(By.name("btnLogin")).sendKeys(Keys.RETURN);
        Thread.sleep(3000);
        url1 = driver.getCurrentUrl();
        assertEquals(url1, "https://localhost:8443/login");
        driver.findElement(By.name("login")).sendKeys("user");
        driver.findElement(By.name("pass")).sendKeys("generalgrievous");
        Thread.sleep(3000);
        driver.findElement(By.name("btnLogin")).sendKeys(Keys.RETURN);
        url2 = driver.getCurrentUrl();
        assertEquals(url2, "https://localhost:8443/");
        driver.quit();
    }



    @Test
    public void addLedger() throws Exception {
        driver.navigate().to("http://localhost:8080/ledger");
        driver.findElement(By.name("btnLogin")).sendKeys(Keys.RETURN);
        driver.findElement(By.name("login")).sendKeys("user");
        driver.findElement(By.name("pass")).sendKeys("generalgrievous");
        driver.findElement(By.name("btnLogin")).sendKeys(Keys.RETURN);
        Thread.sleep(3000);
        driver.findElement(By.name("btnToLedger")).sendKeys(Keys.RETURN);
        Thread.sleep(3000);
        driver.findElement(By.name("num")).sendKeys("10");
        driver.findElement(By.name("month_name")).sendKeys("month");
        driver.findElement(By.name("water")).sendKeys("11");
        driver.findElement(By.name("electricity")).sendKeys("12");
        Thread.sleep(3000);
        driver.findElement(By.name("addMonth")).sendKeys(Keys.RETURN);
        Thread.sleep(3000);

        (new WebDriverWait(driver, 1)).until((ExpectedCondition<Boolean>) (WebDriver d) -> d.getPageSource().contains("10")
                && d.getPageSource().contains("month")
                && d.getPageSource().contains("11")
                && d.getPageSource().contains("12"));
        driver.quit();
    }

    @Test
    public void deleteLedger() throws Exception {
        driver.navigate().to("http://localhost:8080/ledger");
        driver.findElement(By.name("btnLogin")).sendKeys(Keys.RETURN);
        driver.findElement(By.name("login")).sendKeys("user");
        driver.findElement(By.name("pass")).sendKeys("generalgrievous");
        driver.findElement(By.name("btnLogin")).sendKeys(Keys.RETURN);
        Thread.sleep(3000);
        driver.findElement(By.name("btnToLedger")).sendKeys(Keys.RETURN);
        Thread.sleep(3000);
        (new WebDriverWait(driver, 1)).until((ExpectedCondition<Boolean>) (WebDriver d) ->
                d.getPageSource().contains("январь"));
        driver.findElement(By.name("delMonth")).sendKeys(Keys.RETURN);
        Thread.sleep(3000);
        (new WebDriverWait(driver, 1)).until((ExpectedCondition<Boolean>) (WebDriver d) ->
                !( d.getPageSource().contains("январь") ));
        Thread.sleep(3000);
        driver.quit();
    }

    @Test
    public void searchLedger() throws Exception {
        driver.navigate().to("http://localhost:8080/ledger");
        Thread.sleep(3000);
        driver.findElement(By.name("toSearch")).sendKeys(Keys.RETURN);
        Thread.sleep(3000);
        driver.findElement(By.name("month_name")).sendKeys("февраль");
        Thread.sleep(3000);
        driver.findElement(By.name("btnSearch")).sendKeys(Keys.RETURN);
        (new WebDriverWait(driver, 1)).until((ExpectedCondition<Boolean>) (WebDriver d) -> d.getPageSource().contains("2")
                && d.getPageSource().contains("февраль")
                && d.getPageSource().contains("15")
                && d.getPageSource().contains("21"));
        Thread.sleep(3000);
        driver.quit();
    }

}