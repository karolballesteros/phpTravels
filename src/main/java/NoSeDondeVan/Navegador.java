package NoSeDondeVan;

import Net.phptravels.Utils.Constantes;
import Net.phptravels.pages.Home;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;


public class Navegador extends Constantes {

    private WebDriver driver= null;
    String ruta = null;
    Home home;

    public WebDriver getDriver() {
        return driver;
    }

    public Navegador setDriver(WebDriver driver) {
        this.driver = driver;
        return this;
    }

    public WebDriver abrirApp(String navegador, String url) {
        try {
            driver = obtenerDriver(navegador);
            driver.get(url);
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
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.phptravels.net/");
        Home home;
        home = PageFactory.initElements(driver, Home.class);
        home.hacerclicpestanatour();
        Thread.sleep(1000);
    }

}
