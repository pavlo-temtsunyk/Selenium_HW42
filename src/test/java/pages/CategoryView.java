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
public class CategoryView {

    @FindBy(xpath = "//*[@id=\"center_column\"]/ul/li[2]/div/div[1]/div/a[1]/img")
    private WebElement Item;




    public void GoToItem(){
        Item.click();

    }







    public CategoryView(WebDriver driver){
        PageFactory.initElements(driver, this);
    }

}
