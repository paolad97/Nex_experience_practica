package co.com.choucair.certification.proyecto.new_experience.stepdefinitions;

import co.com.choucair.certification.proyecto.new_experience.stepdefinitions.questions.Verificar;
import co.com.choucair.certification.proyecto.new_experience.stepdefinitions.tasks.Abrir;
import co.com.choucair.certification.proyecto.new_experience.stepdefinitions.tasks.Ingresar;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import org.hamcrest.Matcher;
import org.hamcrest.Matchers;

public class MyStepDefinitions {

    @Before
    public void iniciarEscenario(){
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^Paola quiere ingresar a new experience$")
    public void paolaQuiereIngresarANewExperience() {
        OnStage.theActorCalled("Paola").wasAbleTo(Abrir.paginaNewExperience());
    }

    @When("^ingresa las credenciales en los campos requeridos$")
    public void ingresaLasCredencialesEnLosCamposRequeridos() {
        OnStage.theActorInTheSpotlight().attemptsTo(Ingresar.credenciales());
    }

    @Then("^verifica que ingreso de manera correcta$")
    public void verificaQueIngresoDeManeraCorrecta() {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Verificar.resultado(), Matchers.equalTo("Paola Diaz")));
    }

}
