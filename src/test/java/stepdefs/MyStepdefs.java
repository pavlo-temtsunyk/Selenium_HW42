package stepdefs;
import cucumber.api.PendingException;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import pages.AuthPage;
import pageobjects.MyAccPage;
import pages.CategoryView;
import pages.ProductView;

import java.util.concurrent.TimeUnit;


public class MyStepdefs {
    pages.AuthPage authPage;
    pages.CartPopup cartPopup;
    pages.CategoryView categoryView;
    pageobjects.MyAccPage myaccpage;
    pages.OrderInfo orderinfo;
    pages.OrderInfoAddress orderinfoaddress;
    pages.OrderInfoPayment orderinfopayment;
    pages.OrderInfoShipping orderinfoshipping;
    pages.ProductView productview;

    WebDriver driver;

    @Before
    public void init(){
        System.setProperty("webdriver.chrome.driver","C:\\selenium\\chromedriver_win32\\chromedriver.exe");
       // driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        driver = new ChromeDriver();
        authPage = new AuthPage(driver);
        myaccpage=new MyAccPage(driver);
        categoryView=new CategoryView(driver);
        productview=new ProductView(driver);
    }

    @Given("^user navigates to the app url$")
    public void someTestInfo() {
        driver.get("http://automationpractice.com/index.php?controller=authentication&back=my-account");
    }

    @When("^user goes to women department$")
    public void userGoesToWomenDepartment() {
        myaccpage.GoToWomens();
    }

    @And("^user selects an item$")
    public void userSelectsAnItem() {
    categoryView.GoToItem();

    }

    @And("^user selects a black color$")
    public void userSelectsABlackColor() {
        productview.AddToCart();
    }

    /**
    @When("^user fills first name with value \"([^\"]*)\"$")
    public void userFillsFirstNameWithValue(String firstName){
      //  homepage.setFirstName(firstName);
    }

    @When("^user fills last name with value \"([^\"]*)\"$")
    public void userFillsLastNameWithValue(String lastName) {
        //homepage.setLastName(lastName);
    }



    @When("^user fills gender \"([^\"]*)\"$")
        public void user_fills_gender(int gender) {        homepage.setGender( gender );}

    @When("^user fills date of birth \"([^\"]*)\"$")
    public void userFillsDOBWithValue(String dob) {        homepage.setdob(dob);}

    @When("^user fills address (.*)$")
    public void user_fills_address(String adr) {        homepage.setAddress(adr);}

    @And("^user fills email \"([^\"]*)\"$")
    public void userFillsEmail(String arg0)  {homepage.setEmail(arg0);
        // Write code here that turns the phrase above into concrete actions
    }

    @And("^user fills password  \"([^\"]*)\"$")
    public void userFillsPassword(String arg0)     throws Throwable {
        homepage.setPassword(arg0);

    }

    @And("^user fills company \"([^\"]*)\"$")
    public void userFillsCompany(String arg0) throws Throwable {
      homepage.setCompany(arg0);

    }

    @And("^user selects role$")
    public void userSelectsRole() {
        homepage.setRole(0);
    }

    @And("^user selects job expectations$")
    public void userSelectsJobExpectations() {
        homepage.setExpectation("High salary");
        homepage.setExpectation("Challenging");
        homepage.setExpectation("Good teamwork");
    }
    @And("^user selects (\\d+) random ways of development$")
    public void userSelectsRandomWaysOfDevelopment(int arg0) {
        homepage.selectThreeRandomWaysOfDevelopment();
    }

    @And("^user fills the comment \"([^\"]*)\"$")
    public void userFillsTheComment(String arg0) throws Throwable {
      homepage.setcomment(arg0);
    }

    @And("^user submit form$")
    public void userSubmitForm() {
     homepage.submitForm();
    }


    @After
    public void close(){
    //    driver.close();
      //  driver.quit();
    }

    @Then("^form is submitted$")
    public void formIsSubmitted() {
        WebElement checkMessage = driver.findElement(By.id("submit-msg"));

        Assert.assertTrue(checkMessage.isDisplayed());
    }


     **/
}



