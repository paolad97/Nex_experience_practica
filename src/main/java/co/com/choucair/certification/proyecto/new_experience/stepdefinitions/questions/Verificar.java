package co.com.choucair.certification.proyecto.new_experience.stepdefinitions.questions;

import co.com.choucair.certification.proyecto.new_experience.stepdefinitions.userinterfaces.PaginaLocalizadora;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class Verificar implements Question{
    public static Verificar resultado(){
        return new Verificar();
    }

    @Override
    public Object answeredBy(Actor actor) {
        return Text.of(PaginaLocalizadora.CUENTA).viewedBy(actor).asString();
    }
}
