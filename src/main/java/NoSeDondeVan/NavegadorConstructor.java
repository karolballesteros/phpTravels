package NoSeDondeVan;

import Net.phptravels.Utils.Constantes;
import Net.phptravels.Utils.NavegadorGetSet;
import Net.phptravels.pages.Home;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;


public class NavegadorConstructor extends Constantes {

    private WebDriver driver= null;
    String ruta = null;
    Home home;

    public NavegadorConstructor(String navegador, String url){
        abrirApp(navegador,url);
    }

    public WebDriver getDriver() {
        return driver;
    }

    public NavegadorConstructor setDriver(WebDriver driver) {
        this.driver = driver;
        return this;
    }

    public WebDriver abrirApp(String navegador, String url) {
        try {
            driver = obtenerDriver(navegador);
            driver.navigate().to(url);
            //driver.get(url);
            setDriver(driver);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        System.out.println("driver: "+driver);
        return driver;

    }

    private WebDriver obtenerDriver(String navegador) {
        switch (navegador) {
            case "chrome":
                ruta = RUTANAVEGADOR + CHROME;
                System.setProperty("webdriver.chrome.driver", ruta);
                driver = new ChromeDriver();
                break;
            case "firefox":

        }
        return driver;
    }



    public static void main(String[] args) throws InterruptedException {

        NavegadorGetSet navegadorGetSet=new NavegadorGetSet();
        Home home;
        NavegadorConstructor na = new NavegadorConstructor(NAVEGADORCHROME, URL);
        home= PageFactory.initElements(na.getDriver(), Home.class);
        home.hacerclicpestanatour();
    }
}
