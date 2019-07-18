package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


import java.util.HashSet;
import java.util.List;
import java.util.Random;
public class AuthPage {

    @FindBy(xpath = "//*[@id=\"email\"]")
    private WebElement emailInput;

    @FindBy(xpath = "//*[@id=\"passwd\"]")
    private WebElement pwdInput;

    @FindBy(xpath =    "//*[@id=\"SubmitLogin\"]")
    private WebElement submitBtn;





    public void setEmail(String firstName){
        emailInput.clear();
        emailInput.sendKeys(firstName);
    }

    public void setPwd(String firstName){
        pwdInput.clear();
        pwdInput.sendKeys(firstName);
    }

    public void Submit(){
        submitBtn.click();

    }





    public AuthPage(WebDriver driver){
        PageFactory.initElements(driver, this);
    }

}
