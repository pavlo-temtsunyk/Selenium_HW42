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
public class OrderInfo {

    @FindBy(xpath = "//*[@id=\"center_column\"]/p[2]/a[1]")
    private WebElement checkout;







    public void checkout(){
        checkout.click();

    }





    public OrderInfo(WebDriver driver){
        PageFactory.initElements(driver, this);
    }

}
