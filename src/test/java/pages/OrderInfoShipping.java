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
public class OrderInfoShipping {

    @FindBy(id = "cgv")
    private WebElement agreebox;

    @FindBy(xpath = "//*[@id=\"form\"]/p/button"    )
    private WebElement proccedtocheckout;







    public void AgreeWithTermsAndConditions(){
        agreebox.click();

    }

    public void ProceedToCheckout(){
        proccedtocheckout.click();

    }







    public OrderInfoShipping(WebDriver driver){
        PageFactory.initElements(driver, this);
    }

}
