import org.openqa.selenium.chrome.ChromeOptions;

public class TestHomework extends BaseTest{


    @Test
    public void testMethod() {


                ChromeOptions options = new ChromeOptions();
                options.addArguments("--remote-allow-origins=*");

                WebDriver driver = new ChromeDriver(options);
                driver.manage() .timeouts() .implicitlyWait(Durantion.ofSeconds(10));

                String url = "http://bbb.testpro.io/";
                driver.get(url);

                WebElement clickRegistration = driver.findElement(By.cssSelector("registration.submit"));

                Assert.assertTrue(driver.getCurrentUrl("https://bbb.testpro.io/registration.php"), url);
                driver.quit();

            }

        }


