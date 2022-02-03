package co.com.choucair.certification.proyecto.new_experience.stepdefinitions.tasks;

import co.com.choucair.certification.proyecto.new_experience.stepdefinitions.userinterfaces.PaginaNewExperience;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Open;

public class Abrir implements Task {

    private PaginaNewExperience paginaNewExperience;

    public static Abrir paginaNewExperience() {
        return Tasks.instrumented(Abrir.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
           actor.attemptsTo(Open.browserOn(paginaNewExperience));
    }
}
