package pages;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import steps.Hooks;
import support.DriverQA;

public class HomePage extends Hooks {

    // **** COMENTEI O CODIGO ABAIXO POIS É O MODO MAIS BÁSICO DE INICIAR UMA PÁGINA

//    @Before
//    public void seTup()
//    {
//        System.setProperty("webdriver.chrome.driver", "/Users/qazando/Documents/chromedriver");
//        WebDriver navegador = new ChromeDriver();
//        navegador.get("https://www.google.com");
//    }

    @Before
    public void beforeScenario(){

    }


    @After
    public void depoisDoTeste(){

        driver.quit();
    }

    public DriverQA driver;

    public HomePage(DriverQA stepDriver) {
        driver = stepDriver;
    }

    public void openPage() {
        String url = "https://www.enjoei.com.br/";
        driver.openURL(url);
    }

    public void clickMotoG7() {
        driver.click("//a[@title='moto g7'][contains(text(),'moto g7')]", "xpath");
    }

    public String checkTextMotoG7() {
        return driver.getText("//h1[@class='page-title']", "xpath");
    }

    public void writeFieldSearch(String value) throws InterruptedException {
        driver.sendKeys(value, "h_search-input","id");
    }

    public void clickForSearch() {
        driver.click("h_search-btn", "id");
    }

    public void clickForSearchCelular() {
        driver.click("//li[@class='ac-lst-it sz sz-1']//a[@class='ac-lnk src-lnk ac-term-key']", "xpath");
    }

    public String checkTitleForSearch() {
        return driver.getText("//h1[@class='h1 page-title']", "xpath");
    }

    public void clicarcriarconta() {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.click("//a[@class='c-new-buyer-intervention__button o-button -xs-fill -xs-primary -xs-flat -md-flat -xs-small -md-medium']","xpath");
    }

    public void escreverNome(){
        driver.sendKeys("Wanderson","user_name","id");
    }

    public void escreverEmail(){
        driver.sendKeys("wanderson.ipms@gmail.com","user_email","id");

    }

    public void escreverSenha(){
        driver.sendKeys("teste123","user_password", "id");
    }

    public void clicarRoupaMasculina(){
        driver.click("//span[contains(text(),'Roupas masculinas')]", "xpath");
    }

}