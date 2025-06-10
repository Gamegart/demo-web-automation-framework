package pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Form {
    private WebDriver driver;

    public Form(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    // Locators
    //Desclick
    @FindBy(xpath = "//*[@id='section']/div/div")
    public WebElement exit;

    @FindBy(xpath = "//*[@id='basicBootstrapForm']/div[1]/div[1]/input")
    public WebElement firstNameInput;

    @FindBy(xpath = "//*[@id='basicBootstrapForm']/div[1]/div[2]/input")
    public WebElement lastNameInput;

    @FindBy(xpath = "//*[@id='basicBootstrapForm']/div[2]/div/textarea")
    public WebElement addressInput;

    @FindBy(xpath = "//*[@id='eid']/input")
    public WebElement emailInput;

    @FindBy(xpath = "//*[@id='basicBootstrapForm']/div[4]/div/input")
    public WebElement phoneNumberInput;

    @FindBy(xpath = "//*[@id='basicBootstrapForm']/div[5]/div/label[2]/input")
    public WebElement femaleGenderRadioButton;

    @FindBy(xpath = "//*[@id='basicBootstrapForm']/div[5]/div/label[1]/input")
    public WebElement maleGenderRadioButton;

    @FindBy(id = "checkbox1")
    public WebElement hobbyCricketCheckbox;

    @FindBy(id = "checkbox2")
    public WebElement hobbyMoviesCheckbox;

    @FindBy(id = "checkbox3")
    public WebElement hobbyHockeyCheckbox;

    @FindBy(xpath = "//*[@id='msdd']")
    public WebElement languageList;

    @FindBy(xpath = "//li/a[text()='Dutch']")
    public WebElement dutchLanguageItem;

    @FindBy(id = "Skills")
    public WebElement skillsDropdown;

    @FindBy(xpath = "//*[@id='Skills']/option[36]")
    public WebElement iOSSkillItem;

    @FindBy(xpath = "//*[@id='basicBootstrapForm']/div[10]/div/span/span[1]/span")
    public WebElement selectCountryDropdown;

    @FindBy(className = "select2-search__field")
    public WebElement countryInput;

    @FindBy(xpath = "//*[@id='select2-country-results']/li[2]")
    public WebElement southAfricaCountryItem;

    @FindBy(id = "yearbox")
    public WebElement yearDropdown;

    @FindBy(xpath = "//*[@id='yearbox']/option[83]")
    public WebElement yearOptionItem;

    @FindBy(xpath = "//*[@id='basicBootstrapForm']/div[11]/div[2]/select")
    public WebElement monthDropdown;

    @FindBy(xpath = "//*[@id='basicBootstrapForm']/div[11]/div[2]/select/option[12]")
    public WebElement monthOptionItem;

    @FindBy(id = "daybox")
    public WebElement dayDropdown;

    @FindBy(xpath = "//*[@id='daybox']/option[26]")
    public WebElement dayOptionItem;

    @FindBy(id="firstpassword")
    public WebElement passwordInput;

    @FindBy(id="secondpassword")
    public WebElement confirmPasswordInput;

    @FindBy(id = "submitbtn")
    public WebElement submitButton;

    // Methods
    public void typeFirstName (String name){
        this.firstNameInput.sendKeys(name);
    }

    public void typeLastName (String lastName) {
        this.lastNameInput.clear();
        this.lastNameInput.sendKeys(lastName);
    }

    public void typeAddress (String address) {
        this.addressInput.clear();
        this.addressInput.sendKeys(address);
    }

    public void typeEmail (String email){
        this.emailInput.clear();
        this.emailInput.sendKeys(email);
    }

    public void typePhoneNumber (String phone) {
        this.phoneNumberInput.sendKeys(phone);
    }

    public void selectGender (String gender) {
        if(gender.equals("M")){
            this.maleGenderRadioButton.click();
        }else{
            this.femaleGenderRadioButton.click();
        }
    }

    public void selectHobbies () {
        List<WebElement> options = Arrays.asList(hobbyCricketCheckbox,hobbyMoviesCheckbox,hobbyHockeyCheckbox);
        Collections.shuffle(options);
        options.get(0).click();
        options.get(1).click();
    }

    public void selectLanguages () throws InterruptedException {
        Thread.sleep(1000);
        this.languageList.click();
        this.dutchLanguageItem.click();
        this.exit.click();
    }

    public void selectSkill () {
        this.skillsDropdown.click();
        this.iOSSkillItem.click();
    }

    public void selectCountry (String letter) {
        this.selectCountryDropdown.click();
        this.countryInput.sendKeys(letter);
        this.southAfricaCountryItem.click();
    }

    public void selectDate () {
        this.yearDropdown.click();
        this.yearOptionItem.click();
        this.monthDropdown.click();
        this.monthOptionItem.click();
        this.dayDropdown.click();
        this.dayOptionItem.click();
    }

    public void typePassword (String pass) {
        this.passwordInput.sendKeys(pass);
        this.confirmPasswordInput.sendKeys(pass);
    }

    public void submitButton () {
        this.submitButton.click();
    }

    public void scrollDown() {
        Actions actions = new Actions(driver);
        actions.sendKeys(Keys.ARROW_DOWN).perform();

    }
}
