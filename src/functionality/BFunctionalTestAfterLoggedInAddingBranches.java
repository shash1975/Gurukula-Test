package functionality;


import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.junit.*;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class BFunctionalTestAfterLoggedInAddingBranches {
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
  public void testFunctionalTestAfterLoggedInAddingBranches() throws Exception {
    driver.get("http://127.0.0.1:8080");
    driver.findElement(By.linkText("login")).click();
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
    driver.findElement(By.name("name")).sendKeys("Apple");
    driver.findElement(By.name("code")).clear();
    driver.findElement(By.name("code")).sendKeys("A1234");
    driver.findElement(By.cssSelector("div.modal-footer > button.btn.btn-primary")).click();
    driver.findElement(By.cssSelector("button.btn.btn-primary")).click();
    driver.findElement(By.name("name")).clear();
    driver.findElement(By.name("name")).sendKeys("Banana");
    driver.findElement(By.name("code")).clear();
    driver.findElement(By.name("code")).sendKeys("B1234");
    driver.findElement(By.cssSelector("div.modal-footer > button.btn.btn-primary")).click();
    driver.findElement(By.cssSelector("button.btn.btn-primary")).click();
    driver.findElement(By.name("name")).clear();
    driver.findElement(By.name("name")).sendKeys("Clementine");
    driver.findElement(By.name("code")).clear();
    driver.findElement(By.name("code")).sendKeys("C1234");
    driver.findElement(By.cssSelector("div.modal-footer > button.btn.btn-primary")).click();
    driver.findElement(By.cssSelector("button.btn.btn-primary")).click();
    driver.findElement(By.name("name")).clear();
    driver.findElement(By.name("name")).sendKeys("Dates");
    driver.findElement(By.name("code")).clear();
    driver.findElement(By.name("code")).sendKeys("D1234");
    driver.findElement(By.cssSelector("div.modal-footer > button.btn.btn-primary")).click();
    driver.findElement(By.cssSelector("button.btn.btn-primary")).click();
    driver.findElement(By.name("name")).clear();
    driver.findElement(By.name("name")).sendKeys("Elderberries");
    driver.findElement(By.name("code")).clear();
    driver.findElement(By.name("code")).sendKeys("E1234");
    driver.findElement(By.cssSelector("div.modal-footer > button.btn.btn-primary")).click();
    driver.findElement(By.cssSelector("button.btn.btn-primary")).click();
    driver.findElement(By.name("name")).clear();
    driver.findElement(By.name("name")).sendKeys("Figss");
    driver.findElement(By.name("code")).clear();
    driver.findElement(By.name("code")).sendKeys("F1234");
    driver.findElement(By.cssSelector("div.modal-footer > button.btn.btn-primary")).click();
    driver.findElement(By.cssSelector("button.btn.btn-primary")).click();
    driver.findElement(By.name("name")).clear();
    driver.findElement(By.name("name")).sendKeys("Grapes");
    driver.findElement(By.name("code")).clear();
    driver.findElement(By.name("code")).sendKeys("G1234");
    driver.findElement(By.cssSelector("button.btn.btn-primary")).click();
    driver.findElement(By.name("name")).clear();
    driver.findElement(By.name("name")).sendKeys("Apple");
    driver.findElement(By.name("code")).clear();
    driver.findElement(By.name("code")).sendKeys("A1234");
    driver.findElement(By.cssSelector("div.modal-footer > button.btn.btn-primary")).click();
    driver.findElement(By.cssSelector("button.btn.btn-primary")).click();
    driver.findElement(By.name("name")).clear();
    driver.findElement(By.name("name")).sendKeys("Banana");
    driver.findElement(By.name("code")).clear();
    driver.findElement(By.name("code")).sendKeys("B1234");
    driver.findElement(By.cssSelector("div.modal-footer > button.btn.btn-primary")).click();
    driver.findElement(By.cssSelector("button.btn.btn-primary")).click();
    driver.findElement(By.name("name")).clear();
    driver.findElement(By.name("name")).sendKeys("Clementine");
    driver.findElement(By.name("code")).clear();
    driver.findElement(By.name("code")).sendKeys("C1234");
    driver.findElement(By.cssSelector("div.modal-footer > button.btn.btn-primary")).click();
    driver.findElement(By.cssSelector("button.btn.btn-primary")).click();
    driver.findElement(By.name("name")).clear();
    driver.findElement(By.name("name")).sendKeys("Dates");
    driver.findElement(By.name("code")).clear();
    driver.findElement(By.name("code")).sendKeys("D1234");
    driver.findElement(By.cssSelector("div.modal-footer > button.btn.btn-primary")).click();
    driver.findElement(By.cssSelector("button.btn.btn-primary")).click();
    driver.findElement(By.name("name")).clear();
    driver.findElement(By.name("name")).sendKeys("Elderberries");
    driver.findElement(By.name("code")).clear();
    driver.findElement(By.name("code")).sendKeys("E1234");
    driver.findElement(By.cssSelector("div.modal-footer > button.btn.btn-primary")).click();
    driver.findElement(By.cssSelector("button.btn.btn-primary")).click();
    driver.findElement(By.name("name")).clear();
    driver.findElement(By.name("name")).sendKeys("Figss");
    driver.findElement(By.name("code")).clear();
    driver.findElement(By.name("code")).sendKeys("F1234");
    driver.findElement(By.cssSelector("button.btn.btn-primary")).click();
    driver.findElement(By.name("name")).clear();
    driver.findElement(By.name("name")).sendKeys("Hazelnut");
    driver.findElement(By.name("code")).clear();
    driver.findElement(By.name("code")).sendKeys("H1234");
    driver.findElement(By.cssSelector("div.modal-footer > button.btn.btn-primary")).click();
    driver.findElement(By.cssSelector("button.btn.btn-primary")).click();
    driver.findElement(By.name("name")).clear();
    driver.findElement(By.name("name")).sendKeys("Ita Palm");
    driver.findElement(By.name("code")).clear();
    driver.findElement(By.name("code")).sendKeys("I1234");
    driver.findElement(By.cssSelector("div.modal-footer > button.btn.btn-primary")).click();
    driver.findElement(By.cssSelector("button.btn.btn-primary")).click();
    driver.findElement(By.name("name")).clear();
    driver.findElement(By.name("name")).sendKeys("Jackfruit");
    driver.findElement(By.name("code")).clear();
    driver.findElement(By.name("code")).sendKeys("J1234");
    driver.findElement(By.cssSelector("div.modal-footer > button.btn.btn-primary")).click();
    driver.findElement(By.cssSelector("button.btn.btn-primary")).click();
    driver.findElement(By.name("name")).clear();
    driver.findElement(By.name("name")).sendKeys("Kei Apple");
    driver.findElement(By.name("code")).clear();
    driver.findElement(By.name("code")).sendKeys("K234");
    driver.findElement(By.cssSelector("div.modal-footer > button.btn.btn-primary")).click();
    driver.findElement(By.cssSelector("button.btn.btn-primary")).click();
    driver.findElement(By.name("name")).clear();
    driver.findElement(By.name("name")).sendKeys("Lemon");
    driver.findElement(By.name("code")).clear();
    driver.findElement(By.name("code")).sendKeys("L1234");
    driver.findElement(By.cssSelector("div.modal-footer > button.btn.btn-primary")).click();
    driver.findElement(By.cssSelector("button.btn.btn-primary")).click();
    driver.findElement(By.name("name")).clear();
    driver.findElement(By.name("name")).sendKeys("Orange");
    driver.findElement(By.name("code")).clear();
    driver.findElement(By.name("code")).sendKeys("O1234");
    driver.findElement(By.cssSelector("div.modal-footer > button.btn.btn-primary")).click();
    driver.findElement(By.cssSelector("button.btn.btn-primary")).click();
    driver.findElement(By.name("name")).clear();
    driver.findElement(By.name("name")).sendKeys("Pineapple");
    driver.findElement(By.name("code")).clear();
    driver.findElement(By.name("code")).sendKeys("P1234");
    driver.findElement(By.cssSelector("div.modal-footer > button.btn.btn-primary")).click();
    driver.findElement(By.cssSelector("button.btn.btn-primary")).click();
    driver.findElement(By.name("name")).clear();
    driver.findElement(By.name("name")).sendKeys("Quince");
    driver.findElement(By.name("code")).clear();
    driver.findElement(By.name("code")).sendKeys("Q1234");
    driver.findElement(By.cssSelector("div.modal-footer > button.btn.btn-primary")).click();
    driver.findElement(By.cssSelector("button.btn.btn-primary")).click();
    driver.findElement(By.name("name")).clear();
    driver.findElement(By.name("name")).sendKeys("Raspberry");
    driver.findElement(By.name("code")).clear();
    driver.findElement(By.name("code")).sendKeys("R1234");
    driver.findElement(By.cssSelector("div.modal-footer > button.btn.btn-primary")).click();
    driver.findElement(By.cssSelector("button.btn.btn-primary")).click();
    driver.findElement(By.name("name")).clear();
    driver.findElement(By.name("name")).sendKeys("Strawberry");
    driver.findElement(By.name("code")).clear();
    driver.findElement(By.name("code")).sendKeys("S1234");
    driver.findElement(By.cssSelector("div.modal-footer > button.btn.btn-primary")).click();
    driver.findElement(By.cssSelector("button.btn.btn-primary")).click();
    driver.findElement(By.name("name")).clear();
    driver.findElement(By.name("name")).sendKeys("Tomato");
    driver.findElement(By.name("code")).clear();
    driver.findElement(By.name("code")).sendKeys("T1234");
    driver.findElement(By.cssSelector("div.modal-footer > button.btn.btn-primary")).click();
    driver.findElement(By.cssSelector("button.btn.btn-primary")).click();
    driver.findElement(By.name("name")).clear();
    driver.findElement(By.name("name")).sendKeys("Ugli Fruit");
    driver.findElement(By.name("code")).clear();
    driver.findElement(By.name("code")).sendKeys("U1234");
    driver.findElement(By.cssSelector("div.modal-footer > button.btn.btn-primary")).click();
    driver.findElement(By.cssSelector("button.btn.btn-primary")).click();
    driver.findElement(By.name("name")).clear();
    driver.findElement(By.name("name")).sendKeys("Vanilla Beans");
    driver.findElement(By.name("code")).clear();
    driver.findElement(By.name("code")).sendKeys("V1234");
    driver.findElement(By.cssSelector("div.modal-footer > button.btn.btn-primary")).click();
    driver.findElement(By.cssSelector("button.btn.btn-primary")).click();
    driver.findElement(By.name("name")).clear();
    driver.findElement(By.name("name")).sendKeys("Watermelon");
    driver.findElement(By.name("code")).clear();
    driver.findElement(By.name("code")).sendKeys("W1234");
    driver.findElement(By.cssSelector("div.modal-footer > button.btn.btn-primary")).click();
    driver.findElement(By.cssSelector("button.btn.btn-primary")).click();
    driver.findElement(By.name("name")).clear();
    driver.findElement(By.name("name")).sendKeys("Xigua");
    driver.findElement(By.name("code")).clear();
    driver.findElement(By.name("code")).sendKeys("X1234");
    driver.findElement(By.cssSelector("div.modal-footer > button.btn.btn-primary")).click();
    driver.findElement(By.cssSelector("button.btn.btn-primary")).click();
    driver.findElement(By.name("name")).clear();
    driver.findElement(By.name("name")).sendKeys("Yellow Passion");
    driver.findElement(By.name("code")).clear();
    driver.findElement(By.name("code")).sendKeys("Y1234");
    driver.findElement(By.cssSelector("div.modal-footer > button.btn.btn-primary")).click();
    driver.findElement(By.cssSelector("button.btn.btn-primary")).click();
    driver.findElement(By.name("name")).clear();
    driver.findElement(By.name("name")).sendKeys("Zucchini");
    driver.findElement(By.name("code")).clear();
    driver.findElement(By.name("code")).sendKeys("Z1234");
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
    driver.findElement(By.name("name")).sendKeys("Banana");
    driver.findElement(By.name("code")).clear();
    driver.findElement(By.name("code")).sendKeys("B12345");
    driver.findElement(By.cssSelector("div.modal-footer > button.btn.btn-primary")).click();
    driver.findElement(By.id("searchQuery")).clear();
    driver.findElement(By.id("searchQuery")).sendKeys("B1234");
    driver.findElement(By.cssSelector("button.btn.btn-info")).click();
    driver.findElement(By.id("searchQuery")).clear();
    driver.findElement(By.id("searchQuery")).sendKeys("B12345");
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
