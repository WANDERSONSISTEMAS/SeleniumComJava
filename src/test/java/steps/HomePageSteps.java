package steps;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import pages.HomePage;
import support.BaseSteps;

public class HomePageSteps extends BaseSteps {

    public static HomePage homePage = new HomePage(driver);

    @Given("^Que eu abra o site da enjoei$")
    public void userAccessTheAmericanasWebsite() {
        homePage.openPage();
    }

    @Given("^User clicks on moto g7$")
    public void userClickOnMotoG7() {
        homePage.clickMotoG7();
    }

    @Then("^User views \"([^\"]*)\" on screen moto g7$")
    public void userValidateStringMotoG7(String value) throws Throwable {
        Assert.assertEquals(value, homePage.checkTextMotoG7());
    }

    @Given("^User Write \"([^\"]*)\" on field for Search$")
    public void userWriteOnFieldSearch(String value) throws InterruptedException {
         homePage.writeFieldSearch(value);
    }

    @And("^User Click For Search$")
    public void userClickForSearch() {
        homePage.clickForSearch();
    }

    @And("^User Click For Search Celular$")
    public void userClickForSearchCelular() {
        homePage.clickForSearchCelular();
    }

    @Then("^User views \"([^\"]*)\" For Title Search$")
    public void userCheckTitleForSearch(String value) throws Throwable {
        Assert.assertEquals(value, homePage.checkTitleForSearch());
    }

    @And("^Clicar em criar conta$")
    public void clicarCriarConta() {
        homePage.clicarcriarconta();
    }

    @And("^Eu escrevo meu nome$")
    public void escrevendoNome(){
        homePage.escreverNome();
    }

    @And("^Eu escrevo meu email$")
    public void escrevendoEmail(){
        homePage.escreverEmail();
    }

    @And("^Eu escrevo minha senha$")
    public void escrevendoSenha(){
        homePage.escreverSenha();
    }

    @And("^Eu clico em roupa masculina$")
    public void clicoRoupaMasculina(){
        homePage.clicarRoupaMasculina();
    }

    @And("^eu clico em cadastrar$")
    public void clicoCadastrar() {
        homePage.clicarcriarconta();
    }

    @When("^eu preencher meus dados$")
    public void preencherDados() {
        homePage.escreverNome();
        homePage.escreverEmail();
        homePage.escreverSenha();
        homePage.clicarRoupaMasculina();
    }
}


