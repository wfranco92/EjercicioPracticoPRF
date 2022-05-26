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

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ejercicio1 {

    public static void main(String[] args) {

        List<String> emails = Arrays.asList("maeillanes@hotmail.com",
                "osabarca@hotmail.com",
                "cabrigo@garmendia.cl", "c_arnes@hotmail.com",
                "Sb.nashxo.sk8@hotmail.com", "Sb.nashxo.sk8@hotmail.com",
                "fran.afull@live.cl", "kristian_siempre_azul@gmail.com",
                "luuuuuuci@hotmail.com", "carlosaguileram@ outlook.com" ,
                "ikis_rojo@hotmail.com", "daniela_aguilera_m500@hotmail.com",
                "vizkala@hotmail.com", "alexus3@hotmail.com",
                "capitanaguilera@hotmail.com", "apalamosg@gmail.com",
                "faraya1910@gmail.com", "niikhox__@hotmail.com", "luuuuuuci@hotmail.com",
                "mapuchin@hotmail.com", "arahuetes@gmail.com", "osabarca@hotmail.com",
                "cabrigo@garmendia.cl", "c_arnes@hotmail.com",
                "Sb.nashxo.sk8@hotmail.com", "Sb.nashxo.sk8@hotmail.com",
                "fran.afull@live.cl", "kristian_siempre_azul@gmail.com",
                "luuuuuuci@hotmail.com", "carlosaguileram@ outlook.com");


        var emailsDistinct = emails.stream().distinct().collect(Collectors.toList());

        var emailsFilterBygmail = emailsDistinct.stream().filter(element -> element.contains("gmail")).collect(Collectors.toList());
        var emailsFilterByhotmail = emailsDistinct.stream().filter(element -> element.contains("hotmail")).collect(Collectors.toList());
        var emailsFilterByoutlook = emailsDistinct.stream().filter(element -> element.contains("outlook")).collect(Collectors.toList());

        System.out.println(emailsDistinct.size());
        System.out.println(emails.size());

        System.out.println(emailsFilterBygmail);
        System.out.println(emailsFilterByhotmail);
        System.out.println(emailsFilterByoutlook);

    }
}
