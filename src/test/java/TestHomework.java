import org.openqa.selenium.chrome.ChromeOptions;

public class TestHomework extends BaseTest{


    @Test
    public void testMethod() {
        provideEmail("demo@class.com");
        providePassword("te$tStudent");
        clickSubmit();
        Thread.sleep(millis: 2000);

        WebElement search = driver.findElement(By.cssSelector("[type = 'search']"));
        search.sendKeys(...keysToSend: "Pluto");

        WebElement viewAll = driver.findElement(By.cssSelector("[div.results h1 > button']"));
        viewAll.click();
        Thread.sleep(millis: 2000);

        WebElement firstSong = driver.findElement(By.cssSelector("section#songResultsWrapper td.title"));
        firstSong.click();
        Thread.sleep(millis: 1000);

        WebElement addToButton = driver.findElement(By.cssSelector("button[title= 'Add selected songs to...']"));
        addToButton.click();
        Thread.sleep(millis: 1000);

        WebElement favoritePlaylist = driver.findElement(By.cssSelector("section#songResultsWrapper li.favorites"));
        favoritesPlaylist.click();








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


