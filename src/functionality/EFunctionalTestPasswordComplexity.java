package functionality;


import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.junit.*;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class EFunctionalTestPasswordComplexity {
  private WebDriver driver;
  private String baseUrl;
  private boolean acceptNextAlert = true;
  private StringBuffer verificationErrors = new StringBuffer();

  @Before
  public void setUp() throws Exception {
    driver = new FirefoxDriver();
    baseUrl = "http://localhost:8080/";
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }

  @Test
  public void testFunctionalTestPasswordComplexity() throws Exception {
    driver.get("http://127.0.0.1:8080");
    driver.findElement(By.linkText("login")).click();
    driver.findElement(By.id("username")).clear();
    driver.findElement(By.id("username")).sendKeys("admin");
    driver.findElement(By.id("password")).clear();
    driver.findElement(By.id("password")).sendKeys("admin");
    driver.findElement(By.id("rememberMe")).click();
    driver.findElement(By.xpath("//button[@type='submit']")).click();
    driver.findElement(By.linkText("Account")).click();
    driver.findElement(By.xpath("//div[@id='navbar-collapse']/ul/li[3]/ul/li[2]/a/span[2]")).click();
    driver.findElement(By.name("password")).clear();
    driver.findElement(By.name("password")).sendKeys("abc");
    driver.findElement(By.name("confirmPassword")).clear();
    driver.findElement(By.name("confirmPassword")).sendKeys("abc");
    driver.findElement(By.name("password")).clear();
    driver.findElement(By.name("password")).sendKeys("abcde");
    driver.findElement(By.name("confirmPassword")).clear();
    driver.findElement(By.name("confirmPassword")).sendKeys("abcde");
    driver.findElement(By.xpath("//button[@type='submit']")).click();
    driver.findElement(By.name("password")).clear();
    driver.findElement(By.name("password")).sendKeys("abcd1234");
    driver.findElement(By.name("confirmPassword")).clear();
    driver.findElement(By.name("confirmPassword")).sendKeys("abcd1234");
    driver.findElement(By.name("password")).clear();
    driver.findElement(By.name("password")).sendKeys("abcd!234");
    driver.findElement(By.name("confirmPassword")).clear();
    driver.findElement(By.name("confirmPassword")).sendKeys("abcd!234");
    driver.findElement(By.name("password")).clear();
    driver.findElement(By.name("password")).sendKeys("Abcd!234");
    driver.findElement(By.name("confirmPassword")).clear();
    driver.findElement(By.name("confirmPassword")).sendKeys("Abcd!234");
    driver.findElement(By.xpath("//button[@type='submit']")).click();
    driver.findElement(By.linkText("Account")).click();
    driver.findElement(By.xpath("//div[@id='navbar-collapse']/ul/li[3]/ul/li[4]/a/span[2]")).click();
  }

  @After
  public void tearDown() throws Exception {
    driver.quit();
    String verificationErrorString = verificationErrors.toString();
    if (!"".equals(verificationErrorString)) {
      fail(verificationErrorString);
    }
  }

  private boolean isElementPresent(By by) {
    try {
      driver.findElement(by);
      return true;
    } catch (NoSuchElementException e) {
      return false;
    }
  }

  private boolean isAlertPresent() {
    try {
      driver.switchTo().alert();
      return true;
    } catch (NoAlertPresentException e) {
      return false;
    }
  }

  private String closeAlertAndGetItsText() {
    try {
      Alert alert = driver.switchTo().alert();
      String alertText = alert.getText();
      if (acceptNextAlert) {
        alert.accept();
      } else {
        alert.dismiss();
      }
      return alertText;
    } finally {
      acceptNextAlert = true;
    }
  }
}
