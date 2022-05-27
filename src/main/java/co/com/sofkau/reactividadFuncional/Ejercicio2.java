package co.com.sofkau.reactividadFuncional;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import reactor.core.publisher.Flux;

public class Ejercicio2 {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("chat ...... ");

        String cadena = scanner.nextLine();

        String[] arreglo = cadena.split(" ");

        List<String> chat = Arrays.asList(arreglo);

        Flux<String> nuevoChat = Flux.fromIterable(chat).map(p -> comparar(p));

        nuevoChat.subscribe(x -> System.out.print(" " + x + " "));
    }
    private static String comparar(String p1) {
        String retorno = "****";

        List<String> groserias = new ArrayList<>();
        groserias.add("Hijueputa");
        groserias.add("MalParido");
        groserias.add("CareVerga");
        groserias.add("Hijo de verga");
        groserias.add("Guevon");
        groserias.add("Marica");
        groserias.add("Puta");
        groserias.add("Imbecil");
        groserias.add("Bobo");
        groserias.add("Estupido");

        Stream<String> res = groserias.stream().filter(x -> x.equals(p1));

        String r = res.collect(Collectors.joining());

        if(r.equals(p1)){
            return retorno;
        }
        return p1;
    }
}