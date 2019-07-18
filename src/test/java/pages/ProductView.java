package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


import java.util.HashSet;
import java.util.List;
import java.util.Random;
public class ProductView {

    @FindBy(css = "#add_to_cart > button")
    private WebElement addtocart;




    public void AddToCart(){


        addtocart.click();

    }







    public ProductView(WebDriver driver){
        PageFactory.initElements(driver, this);
    }

}
