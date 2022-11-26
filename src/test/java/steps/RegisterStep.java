package steps;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Então;
import io.cucumber.java.pt.Quando;
import io.qameta.allure.Allure;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import register.Registerpag;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.time.Duration;

public class RegisterStep {
    WebDriver driver;
    Registerpag registerpag;

    @Before("@register")
    public void abrirBrowser() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));

}
@AfterStep("@register")
    public void  print () {
    TakesScreenshot screenshot = ((TakesScreenshot) driver); // Convertendo o driver em TakesScreenshot
    byte[] printBytes = screenshot.getScreenshotAs(OutputType.BYTES);
    InputStream printStream = new ByteArrayInputStream(printBytes);
    Allure.addAttachment("register", printStream);

}
    @Dado("que eu acesso o site Register {string}")
    public void queEuAcessoOSiteRegister(String url) {
        driver.get("https://demo.automationtesting.in/Register.html");
        registerpag = new Registerpag(driver);

    }

    @Quando("preencho o campo nome com valor {string}")
    public void preenchoOCampoNomeComValor(String nome) {
        Registerpag registerpag = new Registerpag(driver);
        registerpag.preencherNome(nome);

    }

    @E("preencho o campo sobrenome com valor {string}")
    public void preenchoOCampoSobrenomeComValor(String sob) {
               registerpag.preencherSobrenome(sob);
    }

    @E("preencho o campo endereço com valor {string}")
    public void preenchoOCampoEndereçoComValor(String endereco){
        registerpag.preencherEndereço(endereco);
    }

    @E("preencho o campo email com valor {string}")
    public void preenchoOCampoEmailComValor(String email) {
        registerpag.preencherEmail(email);
    }

    @E("preencho o campo Gender selecionando a opção {string}")
    public void preenchoOCampoGenderSelecionandoAOpção(String Gender) {
        registerpag.selecioneGenero(Gender);
    }

    @E("preencho o campo Hobbies selecionando a opção {string}")
    public void preenchoOCampoHobbiesSelecionandoAOpção(String Hobbies) {
        registerpag.selecHobbies(Hobbies);
    }

    @E("preencho o campo Skills selecionando a opção {string}")
    public void preenchoOCampoSkillsSelecionandoAOpção(String Skills) {
        registerpag.selecSkills(Skills);
    }


    @E("preencho o campo Select Country")
    public void preenchoOCampoSelectCountrySelecionandoAOpção() {
        registerpag.selecionarseleccountry();
    }

    @E("preencho o campo Ano selecionando a opção {string}")
    public void preenchoOCampoAnoSelecionandoAOpção(String ano) {
        registerpag.preencherAno(ano);
    }

    @E("preencho o campo Mes selecionando a opção {string}")
    public void preenchoOCampoMesSelecionandoAOpção(String mes) {
        registerpag.preencherMes(mes);
    }

    @E("preencho o campo Dia selecionando a opção {string}")
    public void preenchoOCampoDiaSelecionandoAOpção(String dia) {
        registerpag.preencherDia(dia);
    }

    @After
    public void fechar(){
        driver.quit();
    }



    }


