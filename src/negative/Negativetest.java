package negative ;


import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.junit.*;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Negativetest {
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
  public void testNegative() throws Exception {
    driver.get("http://127.0.0.1:8080");
    driver.findElement(By.linkText("login")).click();
    driver.findElement(By.id("username")).clear();
    driver.findElement(By.id("username")).sendKeys("(*&(*U(UJ");
    driver.findElement(By.id("password")).clear();
    driver.findElement(By.id("password")).sendKeys(")(*)(*)(");
    driver.findElement(By.xpath("//button[@type='submit']")).click();
    driver.findElement(By.linkText("Did you forget your password?")).click();
    driver.findElement(By.name("email")).clear();
    driver.findElement(By.name("email")).sendKeys("*)(*)(U)()(*)(I)");
    driver.findElement(By.name("email")).clear();
    driver.findElement(By.name("email")).sendKeys("*)(*)(U)()(*)(I)@)(*))(I)(I");
    driver.findElement(By.linkText("Home")).click();
    driver.findElement(By.linkText("Register a new account")).click();
    driver.findElement(By.name("login")).clear();
    driver.findElement(By.name("login")).sendKeys("KJHKJHKJHKJH");
    driver.findElement(By.name("email")).clear();
    driver.findElement(By.name("email")).sendKeys("KJHKJHKJHKJHKJ");
    driver.findElement(By.linkText("Account")).click();
    driver.findElement(By.cssSelector("li.ng-scope > a > span.ng-scope")).click();
    driver.findElement(By.id("username")).clear();
    driver.findElement(By.id("username")).sendKeys("admin");
    driver.findElement(By.id("password")).clear();
    driver.findElement(By.id("password")).sendKeys("admin");
    driver.findElement(By.id("rememberMe")).click();
    driver.findElement(By.cssSelector("label > span.ng-scope")).click();
    driver.findElement(By.xpath("//button[@type='submit']")).click();
    driver.findElement(By.linkText("Entities")).click();
    driver.findElement(By.cssSelector("ul.dropdown-menu > li > a > span.ng-scope")).click();
    driver.findElement(By.cssSelector("button.btn.btn-primary")).click();
    driver.findElement(By.name("code")).clear();
    driver.findElement(By.name("code")).sendKeys("U)(*)(*)(*");
    driver.findElement(By.cssSelector("button.btn.btn-default")).click();
    driver.findElement(By.cssSelector("span.hidden-tablet.ng-scope")).click();
    driver.findElement(By.linkText("Staff")).click();
    driver.findElement(By.cssSelector("button.btn.btn-primary")).click();
    driver.findElement(By.name("name")).clear();
    driver.findElement(By.name("name")).sendKeys("IUOIUOIJOIUOIU)(*)(*)(");
    new Select(driver.findElement(By.name("related_branch"))).selectByVisibleText("Hazelnut");
    driver.findElement(By.cssSelector("button.btn.btn-default")).click();
    driver.findElement(By.linkText("Account")).click();
    driver.findElement(By.cssSelector("li.ng-scope > a > span.ng-scope")).click();
    driver.findElement(By.name("firstName")).clear();
    driver.findElement(By.name("firstName")).sendKeys("*)(*)(*)(I)J)");
    driver.findElement(By.name("lastName")).clear();
    driver.findElement(By.name("lastName")).sendKeys(")(*)(*)(*)(*");
    driver.findElement(By.name("email")).clear();
    driver.findElement(By.name("email")).sendKeys("())(I)(I)(");
    driver.findElement(By.xpath("//div[@id='navbar-collapse']/ul/li[3]/a/span/span[2]")).click();
    driver.findElement(By.linkText("Password")).click();
    driver.findElement(By.name("password")).clear();
    driver.findElement(By.name("password")).sendKeys(")()(UI)(U)U))(*)(");
    driver.findElement(By.name("confirmPassword")).clear();
    driver.findElement(By.name("confirmPassword")).sendKeys("*)(*(*)(*))(*");
    driver.findElement(By.cssSelector("span.glyphicon.glyphicon-user")).click();
    driver.findElement(By.xpath("//div[@id='navbar-collapse']/ul/li[3]/ul/li[3]/a/span[2]")).click();
    driver.findElement(By.xpath("//div[@id='navbar-collapse']/ul/li[3]/a/span")).click();
    driver.findElement(By.xpath("//div[@id='navbar-collapse']/ul/li[3]/ul/li[4]/a/span[2]")).click();
    driver.findElement(By.linkText("login")).click();
    driver.findElement(By.id("username")).clear();
    driver.findElement(By.id("username")).sendKeys("^$&^$&^%*^(&*");
    driver.findElement(By.xpath("//button[@type='submit']")).click();
    driver.findElement(By.cssSelector("span.hidden-tablet.ng-scope")).click();
    driver.findElement(By.xpath("//div[@id='navbar-collapse']/ul/li[2]/ul/li[2]/a/span[2]")).click();
    driver.findElement(By.linkText("Account")).click();
    driver.findElement(By.cssSelector("li.ng-scope > a > span.ng-scope")).click();
    driver.findElement(By.linkText("Did you forget your password?")).click();
    driver.findElement(By.name("email")).clear();
    driver.findElement(By.name("email")).sendKeys("0980908");
    driver.findElement(By.name("email")).clear();
    driver.findElement(By.name("email")).sendKeys("hj");
    driver.findElement(By.cssSelector("span.hidden-tablet.ng-scope")).click();
    driver.findElement(By.cssSelector("body.ng-scope")).click();
    driver.findElement(By.linkText("Account")).click();
    driver.findElement(By.xpath("//div[@id='navbar-collapse']/ul/li[2]/ul/li[2]/a/span[2]")).click();
    driver.findElement(By.linkText("Account")).click();
    driver.findElement(By.cssSelector("li.ng-scope > a > span.ng-scope")).click();
    driver.findElement(By.id("username")).clear();
    driver.findElement(By.id("username")).sendKeys("admin");
    driver.findElement(By.id("password")).clear();
    driver.findElement(By.id("password")).sendKeys("admin");
    driver.findElement(By.id("rememberMe")).click();
    driver.findElement(By.xpath("//button[@type='submit']")).click();
    driver.findElement(By.linkText("Entities")).click();
    driver.findElement(By.cssSelector("ul.dropdown-menu > li > a > span.ng-scope")).click();
    driver.findElement(By.cssSelector("button.btn.btn-primary")).click();
    driver.findElement(By.name("name")).clear();
    driver.findElement(By.name("name")).sendKeys("987ad");
    driver.findElement(By.xpath("//div[@id='navbar-collapse']/ul/li[3]/a/span/span[2]")).click();
    driver.findElement(By.cssSelector("li.ng-scope > a > span.ng-scope")).click();
    driver.findElement(By.linkText("Account")).click();
    driver.findElement(By.cssSelector("a.dropdown-toggle > span")).click();
    driver.findElement(By.cssSelector("ul.dropdown-menu > li > a > span.ng-scope")).click();
    driver.findElement(By.cssSelector("button.btn.btn-primary")).click();
    driver.findElement(By.name("name")).clear();
    driver.findElement(By.name("name")).sendKeys("asd");
    driver.findElement(By.name("code")).clear();
    driver.findElement(By.name("code")).sendKeys("hjkhjkh");
    driver.findElement(By.cssSelector("button.btn.btn-default")).click();
    driver.findElement(By.xpath("//div[@id='navbar-collapse']/ul/li[3]/a/span")).click();
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
