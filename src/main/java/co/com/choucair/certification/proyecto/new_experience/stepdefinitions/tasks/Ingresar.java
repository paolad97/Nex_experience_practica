package co.com.choucair.certification.proyecto.new_experience.stepdefinitions.tasks;

import co.com.choucair.certification.proyecto.new_experience.stepdefinitions.userinterfaces.PaginaLocalizadora;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class Ingresar implements Task {
    public static Ingresar credenciales() {
        return Tasks.instrumented(Ingresar.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(PaginaLocalizadora.INGRESAR),
              Enter.theValue("pao.535@hotmail.com").into(PaginaLocalizadora.USUARIO),
                Enter.theValue("Paola123.").into(PaginaLocalizadora.CONTRASEÑA),
                Click.on(PaginaLocalizadora.BOTON_INGRESAR)
        );
    }
}
