/*
* Ejercicio 1 - valor 65%

Si se realiza bien por completo este ejercicio obtienes el 65% de la nota.


Crear una lista de mínimo 30 correos, de los cuales se le deben aplicar los siguientes operadores:

Distinct: para ver si hay correo repetidos, si hay correos repetidos eliminarlos
Filtro: para saber si hay correos con dominio gmail, hotmail y outlook.
Map: para saber si todos los correos cumple con todas las condiciones (Que cuente con el @ y el dominio)
Saber la cantidad de correos que hay, sin usar un ciclo
Saber la cantidad de correos gmail, hotmail y outlook sin usar un ciclo
En la misma lista determinar si se envió un correo o no a cada uno de los correos, si se le envió cambiar el estado en la lista,


* */

package co.com.sofkau.reactividadFuncional;

import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class ejercicio1 {

    public static void main(String[] args) {

        List<Email> emails = Arrays.asList(
                new Email("maeillanes@hotmail.com", true),
                new Email("osabarca@hotmail.com", true),
                new Email("c_arnes@hotmail.com", false),
                new Email("Sb.nashxo.sk8@hotmail.com", true),
                new Email("kristian_siempre_azul@gmail.com", false),
                new Email("carlosaguileram@ outlook.com" , false),
                new Email("daniela_aguilera_m500@hotmail.com", false),
                new Email("alexus3@hotmail.com", false),
                new Email("capitanaguilera@hotmail.com", false),
                new Email("fran.afull@live.cl", true),
                new Email("kristian_siempre_azul@gmail.com",false),
                new Email("luuuuuuci@hotmail.com", false ) ,
                new Email("carlosaguileram@ outlook.com", true),
                new Email("faraya1910@gmail.com", false),
                new Email("luuuuuuci@hotmail.com", true),
                new Email("arahuetes@gmail.com", false),
                new Email("Sb.nashxo.sk8@hotmail.com", true),
                new Email("Sb.nashxo.sk8@hotmail.com", true),
                new Email("cabrigo@garmendia.cl", true),
                new Email("c_arnes@hotmail.com", true),
                new Email("kristian_siempre_azul@gmail.com",false),
                new Email("luuuuuuci@hotmail.com", false ) ,
                new Email("carlosaguileram@ outlook.com", true),
                new Email("faraya1910@gmail.com", false),
                new Email("luuuuuuci@hotmail.com", true),
                new Email("arahuetes@gmail.com", false),
                new Email("Sb.nashxo.sk8@hotmail.com", true),
                new Email("Sb.nashxo.sk8@hotmail.com", true),
                new Email("cabrigo@garmendia.cl", true),
                new Email("c_arnes@hotmail.com", true));

        Pattern pattern = Pattern
                .compile("^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
                        + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$");


        // a. Distinct: para ver si hay correo repetidos, si hay correos repetidos eliminarlos
        var emailsDistinct = emails.stream().map(element -> element.getValor()).distinct().collect(Collectors.toList());

        // b. Filtro: para saber si hay correos con dominio gmail, hotmail y outlook.
        var emailsFilterBygmail = emailsDistinct.stream().filter(element -> element.contains("gmail")).collect(Collectors.toList());
        var emailsFilterByhotmail = emailsDistinct.stream().filter(element -> element.contains("hotmail")).collect(Collectors.toList());
        var emailsFilterByoutlook = emailsDistinct.stream().filter(element -> element.contains("outlook")).collect(Collectors.toList());

        // c. Map: para saber si todos los correos cumple con todas las condiciones (Que cuente con el @ y el dominio)


        var emailsVerifys = emails.stream().map(element -> {
            Matcher matcher = pattern.matcher(element.getValor());
            if(matcher.find()){
                System.out.println("El email "+ element.getValor() + "Es Valido");
            }else{
                System.out.println("El email ingresado NO es válido.");
            }
            return element ;
        }).collect(Collectors.toList());



        // d. Saber la cantidad de correos que hay, sin usar un ciclo
        System.out.println("cantidad total de correos " + emails.size());

        System.out.println(emailsDistinct.size());

        // e. Saber la cantidad de correos gmail, hotmail y outlook sin usar un ciclo
        System.out.println("cantidad total de correos Gmail " + emailsFilterBygmail.size());
        System.out.println("cantidad total de correos  Hotmail " + emailsFilterByhotmail.size());
        System.out.println("cantidad total de correos  Outlook " + emailsFilterByoutlook.size());

        // f. En la misma lista determinar si se envió un correo o no a cada uno de los correos,
        // si se le envió cambiar el estado en la lista
        // ,todo esto respetando la inmutabilidad.

        List <Email> newList =  emails.stream()
                .filter(c -> {
                    if(c.isEstado() == true) {
                        //System.out.println("se envio");
                        c.setEstado(false);
                    }
                    return false;
                }).
                collect(Collectors.toList());

        System.out.println("===================");

                emails.stream()
                        .map(c -> c.isEstado())
                        .forEach(System.out::println);

    }
}
