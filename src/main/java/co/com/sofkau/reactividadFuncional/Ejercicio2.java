package co.com.sofkau.reactividadFuncional;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ejercicio2 {


    public static void main(String[] args) {

        List<String> groserias = new ArrayList<>();
        groserias.add("HP");
        groserias.add("MP");
        groserias.add("CV");
        groserias.add("HV");
        groserias.add("G");
        groserias.add("M");
        groserias.add("P");
        groserias.add("I");
        groserias.add("B");
        groserias.add("O");

        List<String> palabras = new ArrayList<>();
        Scanner valida = new Scanner(System.in);
        System.out.println("Digite S para ingresar palabras o N para salir ");
        String opcion = valida.nextLine();
        while (opcion.equals("S")){
            System.out.println("Ingrese palabra");
            Scanner palabra = new Scanner(System.in);
            palabras.add(palabra.nextLine());
            System.out.println("Digite S para ingresar palabras o N para salir ");
            Scanner validaopcion = new Scanner(System.in);
            opcion = validaopcion.nextLine();
        }

        palabras.stream()
                .forEach((palabra)-> System.out.println(palabra));
    }
}