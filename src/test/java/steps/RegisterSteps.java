package steps;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Então;
import io.cucumber.java.pt.Quando;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import register.Registerpag;

import java.time.Duration;

public class RegisterSteps {
    WebDriver driver;
}
    public void abrirBrowser() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(5));
        driver.get("https://demo.automationtesting.in/Register.html");
    }

    @Dado("que eu acesso o site Register")
    public void queEuAcessoOSiteRegister() {
    }

    @Quando("preencho o campo nome com valor {string}")
    public void preenchoOCampoNomeComValor(String arg0) {
    }

    @E("preencho o campo sobrenome com valor {string}")
    public void preenchoOCampoSobrenomeComValor(String arg0) {
    }

    @E("preencho o campo endereço com valor {string}")
    public void preenchoOCampoEndereçoComValor(String arg0) {
    }

    @E("preencho o campo email com valor {string}")
    public void preenchoOCampoEmailComValor(String arg0) {
    }

    @E("preencho o campo Gender selecionando a opção {string}")
    public void preenchoOCampoGenderSelecionandoAOpção(String arg0) {
    }

    @E("preencho o campo Hobbies selecionando a opção {string}")
    public void preenchoOCampoHobbiesSelecionandoAOpção(String arg0) {
    }

    @E("preencho o campo Skills selecionando a opção {string}")
    public void preenchoOCampoSkillsSelecionandoAOpção(String arg0) {
    }

    @E("preencho o campo Country selecionando a opção {string}")
    public void preenchoOCampoCountrySelecionandoAOpção(String arg0) {
    }

    @E("preencho o campo Select Country selecionando a opção {string}")
    public void preenchoOCampoSelectCountrySelecionandoAOpção(String arg0) {
    }

    @E("preencho o campo Ano selecionando a opção {string}")
    public void preenchoOCampoAnoSelecionandoAOpção(String arg0) {
    }

    @E("preencho o campo Mes selecionando a opção {string}")
    public void preenchoOCampoMesSelecionandoAOpção(String arg0) {
    }

    @E("preencho o campo Dia selecionando a opção {string}")
    public void preenchoOCampoDiaSelecionandoAOpção(String arg0) {
    }

    @Então("o cadastro será realizado com sucesso.")
    public void oCadastroSeráRealizadoComSucesso() {
    }
}
