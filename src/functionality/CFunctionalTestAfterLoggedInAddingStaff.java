package functionality;


import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.junit.*;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class CFunctionalTestAfterLoggedInAddingStaff {
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
  public void testFunctionalTestAfterLoggedInAddingStaff() throws Exception {
    driver.get("http://127.0.0.1:8080");
    driver.findElement(By.linkText("login")).click();
    driver.findElement(By.id("username")).clear();
    driver.findElement(By.id("username")).sendKeys("admin");
    driver.findElement(By.id("password")).clear();
    driver.findElement(By.id("password")).sendKeys("admin");
    driver.findElement(By.id("rememberMe")).click();
    driver.findElement(By.xpath("//button[@type='submit']")).click();
    // ERROR: Caught exception [ERROR: Unsupported command [selectWindow | null | ]]
    driver.findElement(By.cssSelector("span.hidden-tablet.ng-scope")).click();
    driver.findElement(By.xpath("//div[@id='navbar-collapse']/ul/li[2]/ul/li[2]/a/span[2]")).click();
    driver.findElement(By.cssSelector("button.btn.btn-primary")).click();
    driver.findElement(By.name("name")).clear();
    driver.findElement(By.name("name")).sendKeys("Amy");
    new Select(driver.findElement(By.name("related_branch"))).selectByVisibleText("Apple");
    driver.findElement(By.cssSelector("div.modal-footer > button.btn.btn-primary")).click();
    driver.findElement(By.cssSelector("button.btn.btn-primary")).click();
    driver.findElement(By.name("name")).clear();
    driver.findElement(By.name("name")).sendKeys("Billy");
    new Select(driver.findElement(By.name("related_branch"))).selectByVisibleText("Banana");
    driver.findElement(By.cssSelector("div.modal-footer > button.btn.btn-primary")).click();
    driver.findElement(By.cssSelector("button.btn.btn-primary")).click();
    driver.findElement(By.name("name")).clear();
    driver.findElement(By.name("name")).sendKeys("Chris");
    new Select(driver.findElement(By.name("related_branch"))).selectByVisibleText("Clementine");
    driver.findElement(By.cssSelector("div.modal-footer > button.btn.btn-primary")).click();
    driver.findElement(By.cssSelector("button.btn.btn-primary")).click();
    driver.findElement(By.name("name")).clear();
    driver.findElement(By.name("name")).sendKeys("Dave");
    new Select(driver.findElement(By.name("related_branch"))).selectByVisibleText("Dates");
    driver.findElement(By.cssSelector("div.modal-footer > button.btn.btn-primary")).click();
    driver.findElement(By.cssSelector("button.btn.btn-primary")).click();
    driver.findElement(By.name("name")).clear();
    driver.findElement(By.name("name")).sendKeys("Evelin");
    new Select(driver.findElement(By.name("related_branch"))).selectByVisibleText("Elderberries");
    driver.findElement(By.cssSelector("div.modal-footer > button.btn.btn-primary")).click();
    driver.findElement(By.cssSelector("button.btn.btn-primary")).click();
    driver.findElement(By.name("name")).clear();
    driver.findElement(By.name("name")).sendKeys("Felicity");
    new Select(driver.findElement(By.name("related_branch"))).selectByVisibleText("Figss");
    driver.findElement(By.cssSelector("div.modal-footer > button.btn.btn-primary")).click();
    driver.findElement(By.cssSelector("button.btn.btn-primary")).click();
    driver.findElement(By.name("name")).clear();
    driver.findElement(By.name("name")).sendKeys("Gabriel");
    new Select(driver.findElement(By.name("related_branch"))).selectByVisibleText("Lemon");
    driver.findElement(By.cssSelector("div.modal-footer > button.btn.btn-primary")).click();
    driver.findElement(By.cssSelector("button.btn.btn-primary")).click();
    driver.findElement(By.name("name")).clear();
    driver.findElement(By.name("name")).sendKeys("Hannah");
    new Select(driver.findElement(By.name("related_branch"))).selectByVisibleText("Hazelnut");
    driver.findElement(By.cssSelector("div.modal-footer > button.btn.btn-primary")).click();
    driver.findElement(By.cssSelector("button.btn.btn-primary")).click();
    driver.findElement(By.name("name")).clear();
    driver.findElement(By.name("name")).sendKeys("Ivan");
    new Select(driver.findElement(By.name("related_branch"))).selectByVisibleText("Ita Palm");
    driver.findElement(By.cssSelector("div.modal-footer > button.btn.btn-primary")).click();
    driver.findElement(By.cssSelector("button.btn.btn-primary")).click();
    driver.findElement(By.name("name")).clear();
    driver.findElement(By.name("name")).sendKeys("Johanna");
    new Select(driver.findElement(By.name("related_branch"))).selectByVisibleText("Apple");
    driver.findElement(By.cssSelector("div.modal-footer > button.btn.btn-primary")).click();
    driver.findElement(By.cssSelector("button.btn.btn-primary")).click();
    driver.findElement(By.name("name")).clear();
    driver.findElement(By.name("name")).sendKeys("Kurt");
    new Select(driver.findElement(By.name("related_branch"))).selectByVisibleText("Kei Apple");
    driver.findElement(By.cssSelector("div.modal-footer > button.btn.btn-primary")).click();
    driver.findElement(By.cssSelector("button.btn.btn-primary")).click();
    driver.findElement(By.name("name")).clear();
    driver.findElement(By.name("name")).sendKeys("Lucy");
    new Select(driver.findElement(By.name("related_branch"))).selectByVisibleText("Lemon");
    driver.findElement(By.cssSelector("div.modal-footer > button.btn.btn-primary")).click();
    driver.findElement(By.cssSelector("button.btn.btn-primary")).click();
    driver.findElement(By.name("name")).clear();
    driver.findElement(By.name("name")).sendKeys("Martin");
    new Select(driver.findElement(By.name("related_branch"))).selectByVisibleText("Apple");
    driver.findElement(By.cssSelector("div.modal-footer > button.btn.btn-primary")).click();
    driver.findElement(By.cssSelector("button.btn.btn-primary")).click();
    driver.findElement(By.name("name")).clear();
    driver.findElement(By.name("name")).sendKeys("Nilly");
    new Select(driver.findElement(By.name("related_branch"))).selectByVisibleText("Orange");
    driver.findElement(By.cssSelector("div.modal-footer > button.btn.btn-primary")).click();
    driver.findElement(By.cssSelector("button.btn.btn-primary")).click();
    driver.findElement(By.name("name")).clear();
    driver.findElement(By.name("name")).sendKeys("Oscar");
    new Select(driver.findElement(By.name("related_branch"))).selectByVisibleText("Orange");
    driver.findElement(By.cssSelector("div.modal-footer > button.btn.btn-primary")).click();
    driver.findElement(By.cssSelector("button.btn.btn-primary")).click();
    driver.findElement(By.name("name")).clear();
    driver.findElement(By.name("name")).sendKeys("Petra");
    new Select(driver.findElement(By.name("related_branch"))).selectByVisibleText("Pineapple");
    driver.findElement(By.cssSelector("div.modal-footer > button.btn.btn-primary")).click();
    driver.findElement(By.cssSelector("button.btn.btn-primary")).click();
    driver.findElement(By.name("name")).clear();
    driver.findElement(By.name("name")).sendKeys("Quayle");
    new Select(driver.findElement(By.name("related_branch"))).selectByVisibleText("Quince");
    driver.findElement(By.cssSelector("div.modal-footer > button.btn.btn-primary")).click();
    driver.findElement(By.cssSelector("button.btn.btn-primary")).click();
    driver.findElement(By.name("name")).clear();
    driver.findElement(By.name("name")).sendKeys("Rihanna");
    new Select(driver.findElement(By.name("related_branch"))).selectByVisibleText("Raspberry");
    driver.findElement(By.cssSelector("div.modal-footer > button.btn.btn-primary")).click();
    driver.findElement(By.cssSelector("button.btn.btn-primary")).click();
    driver.findElement(By.name("name")).clear();
    driver.findElement(By.name("name")).sendKeys("Sam");
    new Select(driver.findElement(By.name("related_branch"))).selectByVisibleText("Strawberry");
    driver.findElement(By.cssSelector("div.modal-footer > button.btn.btn-primary")).click();
    driver.findElement(By.cssSelector("button.btn.btn-primary")).click();
    driver.findElement(By.name("name")).clear();
    driver.findElement(By.name("name")).sendKeys("Tanya");
    new Select(driver.findElement(By.name("related_branch"))).selectByVisibleText("Tomato");
    driver.findElement(By.cssSelector("div.modal-footer > button.btn.btn-primary")).click();
    driver.findElement(By.cssSelector("button.btn.btn-primary")).click();
    driver.findElement(By.name("name")).clear();
    driver.findElement(By.name("name")).sendKeys("Umberto");
    new Select(driver.findElement(By.name("related_branch"))).selectByVisibleText("Ugli Fruit");
    driver.findElement(By.cssSelector("div.modal-footer > button.btn.btn-primary")).click();
    driver.findElement(By.cssSelector("button.btn.btn-primary")).click();
    driver.findElement(By.name("name")).clear();
    driver.findElement(By.name("name")).sendKeys("Violet");
    new Select(driver.findElement(By.name("related_branch"))).selectByVisibleText("Vanilla Beans");
    driver.findElement(By.cssSelector("div.modal-footer > button.btn.btn-primary")).click();
    driver.findElement(By.cssSelector("button.btn.btn-primary")).click();
    driver.findElement(By.name("name")).clear();
    driver.findElement(By.name("name")).sendKeys("William");
    new Select(driver.findElement(By.name("related_branch"))).selectByVisibleText("Watermelon");
    driver.findElement(By.cssSelector("div.modal-footer > button.btn.btn-primary")).click();
    driver.findElement(By.cssSelector("button.btn.btn-primary")).click();
    driver.findElement(By.name("name")).clear();
    driver.findElement(By.name("name")).sendKeys("Xandra");
    new Select(driver.findElement(By.name("related_branch"))).selectByVisibleText("Xigua");
    driver.findElement(By.cssSelector("div.modal-footer > button.btn.btn-primary")).click();
    driver.findElement(By.cssSelector("button.btn.btn-primary")).click();
    driver.findElement(By.name("name")).clear();
    driver.findElement(By.name("name")).sendKeys("Yuhan");
    new Select(driver.findElement(By.name("related_branch"))).selectByVisibleText("Yellow Passion");
    driver.findElement(By.cssSelector("div.modal-footer > button.btn.btn-primary")).click();
    driver.findElement(By.cssSelector("button.btn.btn-primary")).click();
    driver.findElement(By.name("name")).clear();
    driver.findElement(By.name("name")).sendKeys("Zelda");
    new Select(driver.findElement(By.name("related_branch"))).selectByVisibleText("Zucchini");
    driver.findElement(By.cssSelector("button.btn.btn-primary")).click();
    driver.findElement(By.name("name")).clear();
    driver.findElement(By.name("name")).sendKeys("Chris");
    new Select(driver.findElement(By.name("related_branch"))).selectByVisibleText("Clementine");
    driver.findElement(By.cssSelector("div.modal-footer > button.btn.btn-primary")).click();
    driver.findElement(By.cssSelector("button.btn.btn-primary")).click();
    driver.findElement(By.name("name")).clear();
    driver.findElement(By.name("name")).sendKeys("Dave");
    new Select(driver.findElement(By.name("related_branch"))).selectByVisibleText("Dates");
    driver.findElement(By.cssSelector("div.modal-footer > button.btn.btn-primary")).click();
    driver.findElement(By.cssSelector("button.btn.btn-primary")).click();
    driver.findElement(By.name("name")).clear();
    driver.findElement(By.name("name")).sendKeys("Evelin");
    new Select(driver.findElement(By.name("related_branch"))).selectByVisibleText("Elderberries");
    driver.findElement(By.cssSelector("div.modal-footer > button.btn.btn-primary")).click();
    driver.findElement(By.cssSelector("button.btn.btn-primary")).click();
    driver.findElement(By.name("name")).clear();
    driver.findElement(By.name("name")).sendKeys("Felicity");
    new Select(driver.findElement(By.name("related_branch"))).selectByVisibleText("Figss");
    driver.findElement(By.cssSelector("div.modal-footer > button.btn.btn-primary")).click();
    driver.findElement(By.cssSelector("button.btn.btn-primary")).click();
    driver.findElement(By.name("name")).clear();
    driver.findElement(By.name("name")).sendKeys("Gabriel");
    new Select(driver.findElement(By.name("related_branch"))).selectByVisibleText("Orange");
    driver.findElement(By.cssSelector("div.modal-footer > button.btn.btn-primary")).click();
    driver.findElement(By.cssSelector("button.btn.btn-primary")).click();
    driver.findElement(By.name("name")).clear();
    driver.findElement(By.name("name")).sendKeys("Hannah");
    new Select(driver.findElement(By.name("related_branch"))).selectByVisibleText("Hazelnut");
    driver.findElement(By.cssSelector("div.modal-footer > button.btn.btn-primary")).click();
    driver.findElement(By.cssSelector("button.btn.btn-primary")).click();
    driver.findElement(By.name("name")).clear();
    driver.findElement(By.name("name")).sendKeys("Ivan");
    new Select(driver.findElement(By.name("related_branch"))).selectByVisibleText("Ita Palm");
    driver.findElement(By.cssSelector("div.modal-footer > button.btn.btn-primary")).click();
    driver.findElement(By.cssSelector("button.btn.btn-primary")).click();
    driver.findElement(By.name("name")).clear();
    driver.findElement(By.name("name")).sendKeys("Johanna");
    new Select(driver.findElement(By.name("related_branch"))).selectByVisibleText("Jackfruit");
    driver.findElement(By.cssSelector("div.modal-footer > button.btn.btn-primary")).click();
    driver.findElement(By.cssSelector("button.btn.btn-primary")).click();
    driver.findElement(By.name("name")).clear();
    driver.findElement(By.name("name")).sendKeys("Kurt");
    new Select(driver.findElement(By.name("related_branch"))).selectByVisibleText("Kei Apple");
    driver.findElement(By.cssSelector("div.modal-footer > button.btn.btn-primary")).click();
    driver.findElement(By.cssSelector("button.btn.btn-primary")).click();
    driver.findElement(By.name("name")).clear();
    driver.findElement(By.name("name")).sendKeys("Lucy");
    new Select(driver.findElement(By.name("related_branch"))).selectByVisibleText("Lemon");
    driver.findElement(By.cssSelector("div.modal-footer > button.btn.btn-primary")).click();
    driver.findElement(By.cssSelector("button.btn.btn-primary")).click();
    driver.findElement(By.name("name")).clear();
    driver.findElement(By.name("name")).sendKeys("Martin");
    new Select(driver.findElement(By.name("related_branch"))).selectByVisibleText("Apple");
    driver.findElement(By.cssSelector("div.modal-footer > button.btn.btn-primary")).click();
    driver.findElement(By.cssSelector("button.btn.btn-primary")).click();
    driver.findElement(By.name("name")).clear();
    driver.findElement(By.name("name")).sendKeys("Nilly");
    new Select(driver.findElement(By.name("related_branch"))).selectByVisibleText("Orange");
    driver.findElement(By.cssSelector("div.modal-footer > button.btn.btn-primary")).click();
    driver.findElement(By.cssSelector("button.btn.btn-primary")).click();
    driver.findElement(By.name("name")).clear();
    driver.findElement(By.name("name")).sendKeys("Oscar");
    new Select(driver.findElement(By.name("related_branch"))).selectByVisibleText("Orange");
    driver.findElement(By.cssSelector("div.modal-footer > button.btn.btn-primary")).click();
    driver.findElement(By.cssSelector("button.btn.btn-primary")).click();
    driver.findElement(By.name("name")).clear();
    driver.findElement(By.name("name")).sendKeys("Petra");
    new Select(driver.findElement(By.name("related_branch"))).selectByVisibleText("Pineapple");
    driver.findElement(By.cssSelector("div.modal-footer > button.btn.btn-primary")).click();
    driver.findElement(By.cssSelector("button.btn.btn-primary")).click();
    driver.findElement(By.name("name")).clear();
    driver.findElement(By.name("name")).sendKeys("Quayle");
    new Select(driver.findElement(By.name("related_branch"))).selectByVisibleText("Quince");
    driver.findElement(By.cssSelector("div.modal-footer > button.btn.btn-primary")).click();
    driver.findElement(By.cssSelector("button.btn.btn-primary")).click();
    driver.findElement(By.name("name")).clear();
    driver.findElement(By.name("name")).sendKeys("Rihanna");
    new Select(driver.findElement(By.name("related_branch"))).selectByVisibleText("Raspberry");
    driver.findElement(By.cssSelector("div.modal-footer > button.btn.btn-primary")).click();
    driver.findElement(By.cssSelector("button.btn.btn-primary")).click();
    driver.findElement(By.name("name")).clear();
    driver.findElement(By.name("name")).sendKeys("Sam");
    new Select(driver.findElement(By.name("related_branch"))).selectByVisibleText("Strawberry");
    driver.findElement(By.cssSelector("div.modal-footer > button.btn.btn-primary")).click();
    driver.findElement(By.cssSelector("button.btn.btn-primary")).click();
    driver.findElement(By.name("name")).clear();
    driver.findElement(By.name("name")).sendKeys("Tanya");
    new Select(driver.findElement(By.name("related_branch"))).selectByVisibleText("Tomato");
    driver.findElement(By.cssSelector("div.modal-footer > button.btn.btn-primary")).click();
    driver.findElement(By.cssSelector("button.btn.btn-primary")).click();
    driver.findElement(By.name("name")).clear();
    driver.findElement(By.name("name")).sendKeys("Umberto");
    new Select(driver.findElement(By.name("related_branch"))).selectByVisibleText("Ugli Fruit");
    driver.findElement(By.cssSelector("div.modal-footer > button.btn.btn-primary")).click();
    driver.findElement(By.cssSelector("button.btn.btn-primary")).click();
    driver.findElement(By.name("name")).clear();
    driver.findElement(By.name("name")).sendKeys("Violet");
    new Select(driver.findElement(By.name("related_branch"))).selectByVisibleText("Vanilla Beans");
    driver.findElement(By.cssSelector("div.modal-footer > button.btn.btn-primary")).click();
    driver.findElement(By.cssSelector("button.btn.btn-primary")).click();
    driver.findElement(By.name("name")).clear();
    driver.findElement(By.name("name")).sendKeys("William");
    new Select(driver.findElement(By.name("related_branch"))).selectByVisibleText("Watermelon");
    driver.findElement(By.cssSelector("div.modal-footer > button.btn.btn-primary")).click();
    driver.findElement(By.cssSelector("button.btn.btn-primary")).click();
    driver.findElement(By.name("name")).clear();
    driver.findElement(By.name("name")).sendKeys("Xandra");
    new Select(driver.findElement(By.name("related_branch"))).selectByVisibleText("Xigua");
    driver.findElement(By.cssSelector("div.modal-footer > button.btn.btn-primary")).click();
    driver.findElement(By.cssSelector("button.btn.btn-primary")).click();
    driver.findElement(By.name("name")).clear();
    driver.findElement(By.name("name")).sendKeys("Yuhan");
    new Select(driver.findElement(By.name("related_branch"))).selectByVisibleText("");
    driver.findElement(By.cssSelector("div.modal-footer > button.btn.btn-primary")).click();
    driver.findElement(By.linkText("<<")).click();
    driver.findElement(By.linkText(">>")).click();
    driver.findElement(By.linkText("<")).click();
    driver.findElement(By.linkText(">")).click();
    driver.findElement(By.linkText("<")).click();
    driver.findElement(By.linkText("<")).click();
    driver.findElement(By.xpath("(//button[@type='submit'])[39]")).click();
    driver.findElement(By.cssSelector("button.btn.btn-info")).click();
    driver.findElement(By.xpath("(//button[@type='submit'])[17]")).click();
    driver.findElement(By.cssSelector("button.btn.btn-danger")).click();
    driver.findElement(By.xpath("(//button[@type='submit'])[21]")).click();
    driver.findElement(By.cssSelector("button.btn.btn-info")).click();
    driver.findElement(By.xpath("(//button[@type='submit'])[19]")).click();
    driver.findElement(By.name("name")).clear();
    driver.findElement(By.name("name")).sendKeys("");
    driver.findElement(By.name("name")).clear();
    driver.findElement(By.name("name")).sendKeys("Gabriela");
    new Select(driver.findElement(By.name("related_branch"))).selectByVisibleText("Clementine");
    driver.findElement(By.cssSelector("div.modal-footer > button.btn.btn-primary")).click();
    driver.findElement(By.id("searchQuery")).clear();
    driver.findElement(By.id("searchQuery")).sendKeys("gabriela");
    driver.findElement(By.cssSelector("button.btn.btn-info")).click();
    driver.findElement(By.id("searchQuery")).clear();
    driver.findElement(By.id("searchQuery")).sendKeys("gabriel");
    driver.findElement(By.cssSelector("button.btn.btn-info")).click();
    driver.findElement(By.cssSelector("button.btn.btn-info")).click();
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
