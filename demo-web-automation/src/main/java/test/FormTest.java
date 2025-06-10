package test;

import pages.Form;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.annotations.*;

public class FormTest {
    WebDriver driver;

    @BeforeMethod
    public void setUp() {
        // CHROME
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe"); // Ajusta la ruta si es necesario
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.setBinary("C:\\Program Files\\Google\\Chrome\\Application\\chrome.exe");
        chromeOptions.addArguments("--remote-allow-origins=*");
        chromeOptions.addArguments("--disable-blink-features=AutomationControlled");
        chromeOptions.addArguments("--disable-gpu");
        chromeOptions.addArguments("--no-sandbox");
        chromeOptions.addArguments("--disable-dev-shm-usage");
        chromeOptions.addArguments("--disable-extensions");
        chromeOptions.addArguments("--ignore-certificate-errors");
        driver = new ChromeDriver(chromeOptions);

        //FIREFOX
//        System.setProperty("webdriver.gecko.driver", "geckodriver.exe"); // Ajusta la ruta si es necesario
//        FirefoxOptions options = new FirefoxOptions();
//         options.setBinary("C://Users//jesus.h.gutierrez//AppData//Local//Mozilla Firefox//firefox.exe"); // Solo si no tienes Firefox en PATH
//        driver = new FirefoxDriver(options);

        driver.get("https://demo.automationtesting.in/Register.html");
        driver.manage().window().maximize();
    }

    @Test
    public void testAddRemoveElement() throws InterruptedException {
        Form webForm = new Form(driver);

        webForm.scrollDown();
        Thread.sleep(1000);
        webForm.typeFirstName("John");
        webForm.typeLastName("Doe");
        webForm.typeAddress("Av Siempre viva");
        webForm.typeEmail("testEmail@gmail.com");
        webForm.typePhoneNumber("5551234567");
        webForm.selectGender("F");
        webForm.selectHobbies();
        webForm.selectLanguages();
        webForm.selectSkill();
        webForm.selectCountry("H");
        webForm.selectDate();
        webForm.typePassword("#SecretPassword");
        Thread.sleep(5000);
        webForm.submitButton();
        Thread.sleep(5000);
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }
}
