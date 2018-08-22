package Net.phptravels.Utils;

import NoSeDondeVan.NavegadorConstructor;
import org.openqa.selenium.WebDriver;

public class NavegadorGetSet {
    private String url;
    private String navegador;
    private WebDriver driver ;

    public NavegadorGetSet() {
        this.url="";
        this.navegador="";
        this.driver=null;
    }
    public NavegadorGetSet(String url,String navegador){

    }





    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getNavegador() {
        return navegador;
    }

    public void setNavegador(String navegador) {
        this.navegador = navegador;
    }

    public WebDriver getDriver() {
        return driver;
    }

    public void setDriver(WebDriver driver) {
        this.driver = driver;
    }
}
