package functionality;

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.junit.*;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class FFunctionalTestAfterLoggedInAsUserAddingBranches {
  private WebDriver driver;
  private String baseUrl;
  private boolean acceptNextAlert = true;
  private StringBuffer verificationErrors = new StringBuffer();

  @Before
  public void setUp() throws Exception {
    driver = new FirefoxDriver();
    baseUrl = "http://127.0.0.1:8080/";
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }

  @Test
  public void testFunctionalTestAfterLoggedInAsUserAddingBranches() throws Exception {
    driver.get("http://127.0.0.1:8080");
    driver.findElement(By.linkText("login")).click();
    driver.findElement(By.id("username")).clear();
    driver.findElement(By.id("username")).sendKeys("user");
    driver.findElement(By.id("password")).clear();
    driver.findElement(By.id("password")).sendKeys("user");
    driver.findElement(By.id("rememberMe")).click();
    driver.findElement(By.xpath("//button[@type='submit']")).click();
    driver.findElement(By.linkText("Entities")).click();
    driver.findElement(By.cssSelector("ul.dropdown-menu > li > a > span.ng-scope")).click();
    driver.findElement(By.cssSelector("button.btn.btn-primary")).click();
    driver.findElement(By.name("name")).clear();
    driver.findElement(By.name("name")).sendKeys("Melon");
    driver.findElement(By.name("code")).clear();
    driver.findElement(By.name("code")).sendKeys("M5678");
    driver.findElement(By.cssSelector("div.modal-footer > button.btn.btn-primary")).click();
    driver.findElement(By.xpath("(//button[@type='submit'])[5]")).click();
    driver.findElement(By.cssSelector("button.btn.btn-danger")).click();
    driver.findElement(By.xpath("(//button[@type='submit'])[6]")).click();
    driver.findElement(By.cssSelector("button.btn.btn-info")).click();
    driver.findElement(By.xpath("(//button[@type='submit'])[10]")).click();
    driver.findElement(By.name("name")).clear();
    driver.findElement(By.name("name")).sendKeys("Dates2");
    driver.findElement(By.name("name")).clear();
    driver.findElement(By.name("name")).sendKeys("Dates two");
    driver.findElement(By.cssSelector("div.modal-footer > button.btn.btn-primary")).click();
    driver.findElement(By.xpath("(//button[@type='submit'])[7]")).click();
    driver.findElement(By.name("code")).clear();
    driver.findElement(By.name("code")).sendKeys("C12345");
    driver.findElement(By.cssSelector("div.modal-footer > button.btn.btn-primary")).click();
    driver.findElement(By.linkText("14")).click();
    driver.findElement(By.cssSelector("button.btn.btn-info")).click();
    driver.findElement(By.id("searchQuery")).clear();
    driver.findElement(By.id("searchQuery")).sendKeys("banana");
    driver.findElement(By.cssSelector("button.btn.btn-info")).click();
    driver.findElement(By.id("searchQuery")).clear();
    driver.findElement(By.id("searchQuery")).sendKeys("Banana");
    driver.findElement(By.cssSelector("button.btn.btn-info")).click();
    driver.findElement(By.id("searchQuery")).clear();
    driver.findElement(By.id("searchQuery")).sendKeys("Orange");
    driver.findElement(By.cssSelector("button.btn.btn-info")).click();
    driver.findElement(By.id("searchQuery")).clear();
    driver.findElement(By.id("searchQuery")).sendKeys("O1234");
    driver.findElement(By.cssSelector("button.btn.btn-info")).click();
    driver.findElement(By.id("searchQuery")).clear();
    driver.findElement(By.id("searchQuery")).sendKeys("L1234");
    driver.findElement(By.cssSelector("button.btn.btn-info")).click();
    driver.findElement(By.id("searchQuery")).clear();
    driver.findElement(By.id("searchQuery")).sendKeys("24");
    driver.findElement(By.cssSelector("button.btn.btn-info")).click();
    driver.findElement(By.id("searchQuery")).clear();
    driver.findElement(By.id("searchQuery")).sendKeys("1234");
    driver.findElement(By.cssSelector("button.btn.btn-info")).click();
    driver.findElement(By.id("searchQuery")).clear();
    driver.findElement(By.id("searchQuery")).sendKeys("B1234");
    driver.findElement(By.cssSelector("button.btn.btn-info")).click();
    driver.findElement(By.id("searchQuery")).clear();
    driver.findElement(By.id("searchQuery")).sendKeys("A1234");
    driver.findElement(By.cssSelector("button.btn.btn-info")).click();
    driver.findElement(By.id("searchQuery")).clear();
    driver.findElement(By.id("searchQuery")).sendKeys("");
    driver.findElement(By.cssSelector("button.btn.btn-info")).click();
    driver.findElement(By.cssSelector("button.btn.btn-primary")).click();
    driver.findElement(By.name("name")).clear();
    driver.findElement(By.name("name")).sendKeys("Apple");
    driver.findElement(By.name("code")).clear();
    driver.findElement(By.name("code")).sendKeys("A1234");
    driver.findElement(By.cssSelector("div.modal-footer > button.btn.btn-primary")).click();
    driver.findElement(By.cssSelector("button.btn.btn-primary")).click();
    driver.findElement(By.name("name")).clear();
    driver.findElement(By.name("name")).sendKeys("Orange");
    driver.findElement(By.name("code")).clear();
    driver.findElement(By.name("code")).sendKeys("O12345");
    driver.findElement(By.cssSelector("div.modal-footer > button.btn.btn-primary")).click();
    driver.findElement(By.id("searchQuery")).clear();
    driver.findElement(By.id("searchQuery")).sendKeys("O1234");
    driver.findElement(By.cssSelector("button.btn.btn-info")).click();
    driver.findElement(By.id("searchQuery")).clear();
    driver.findElement(By.id("searchQuery")).sendKeys("O12345");
    driver.findElement(By.cssSelector("button.btn.btn-info")).click();
    driver.findElement(By.xpath("(//button[@type='submit'])[3]")).click();
    driver.findElement(By.cssSelector("button.btn.btn-info")).click();
    driver.findElement(By.id("searchQuery")).clear();
    driver.findElement(By.id("searchQuery")).sendKeys("Banana");
    driver.findElement(By.cssSelector("button.btn.btn-info")).click();
    driver.findElement(By.xpath("(//button[@type='submit'])[7]")).click();
    driver.findElement(By.name("code")).clear();
    driver.findElement(By.name("code")).sendKeys("B123456");
    driver.findElement(By.cssSelector("div.modal-footer > button.btn.btn-primary")).click();
    driver.findElement(By.cssSelector("button.btn.btn-info")).click();
    driver.findElement(By.xpath("(//button[@type='submit'])[8]")).click();
    driver.findElement(By.cssSelector("button.btn.btn-danger")).click();
    driver.findElement(By.cssSelector("button.btn.btn-info")).click();
    driver.findElement(By.id("searchQuery")).clear();
    driver.findElement(By.id("searchQuery")).sendKeys("");
    driver.findElement(By.cssSelector("button.btn.btn-info")).click();
    driver.findElement(By.linkText("Entities")).click();
    driver.findElement(By.linkText("Staff")).click();
    driver.findElement(By.cssSelector("a.dropdown-toggle > span")).click();
    driver.findElement(By.cssSelector("ul.dropdown-menu > li > a > span.ng-scope")).click();
    driver.findElement(By.cssSelector("span.glyphicon.glyphicon-user")).click();
    driver.findElement(By.cssSelector("li.ng-scope > a > span.ng-scope")).click();
    driver.findElement(By.cssSelector("span.hidden-tablet.ng-scope")).click();
    driver.findElement(By.linkText("Branch")).click();
    driver.findElement(By.cssSelector("span.glyphicon.glyphicon-user")).click();
    driver.findElement(By.xpath("//div[@id='navbar-collapse']/ul/li[3]/ul/li[2]/a/span[2]")).click();
    driver.findElement(By.linkText("Entities")).click();
    driver.findElement(By.linkText("Branch")).click();
    driver.findElement(By.xpath("//div[@id='navbar-collapse']/ul/li[3]/a/span/span[2]")).click();
    driver.findElement(By.xpath("//div[@id='navbar-collapse']/ul/li[3]/ul/li[3]/a/span[2]")).click();
    driver.findElement(By.cssSelector("span.hidden-tablet.ng-scope")).click();
    driver.findElement(By.linkText("Staff")).click();
    driver.findElement(By.linkText("Entities")).click();
    driver.findElement(By.linkText("Branch")).click();
    driver.findElement(By.xpath("//div[@id='navbar-collapse']/ul/li[3]/a/span/span[2]")).click();
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
