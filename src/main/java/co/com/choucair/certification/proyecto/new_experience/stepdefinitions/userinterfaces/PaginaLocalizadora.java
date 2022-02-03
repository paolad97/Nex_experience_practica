package co.com.choucair.certification.proyecto.new_experience.stepdefinitions.userinterfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class PaginaLocalizadora {
    public static final Target INGRESAR = Target.the("Ingreso al login").located(By.xpath("//a[@class='login']"));
    public static final Target USUARIO = Target.the("Ingresa usuario").located(By.cssSelector("#email"));
    public static final Target CONTRASEÑA = Target.the("Ingresar contraseña").located(By.cssSelector("#passwd"));
    public static final Target BOTON_INGRESAR = Target.the("Ingreso a cuenta").located(By.cssSelector("#SubmitLogin > span"));
    public static final Target CUENTA = Target.the("Verificación ingreso a cuenta").located(By.cssSelector("#header > div.nav > div > div > nav > div:nth-child(1) > a > span"));
}
