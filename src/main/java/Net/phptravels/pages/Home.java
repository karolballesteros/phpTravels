package Net.phptravels.pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Home {

    @FindBy(xpath = "/html/body/div[4]/section/div[2]/div/div[2]/ul/li[3]/a[@href='#TOURS']")
    WebElement pestTours;



   public void hacerclicpestanatour(){
       pestTours.click();
   }

}
