package co.com.sofkau.reactividadFuncional;

import java.util.ArrayList;
import java.util.List;

public class Ejercicio3 {
    static String resultado;

    public static void main(String[] args) {
        System.out.println(derivada("x",2,4));

    }
    public static String derivada(String iteral, Integer exponente, Integer coeficiente) {
        List<DatosFuncion> funciones = new ArrayList<>();
        DatosFuncion datos = new DatosFuncion(iteral, exponente, coeficiente);
        funciones.add(datos);

        String resultados = String.valueOf(funciones.stream()
                .map(datosFuncion -> {
                    if (datosFuncion.getExponente() == 0) {
                        return 0;
                    } else {
                        Integer nuevoCoeficiente = datosFuncion.getCoeficiente() * datosFuncion.getExponente();
                        datosFuncion.setCoeficiente(nuevoCoeficiente);
                        Integer nuevoExponente = datosFuncion.getExponente() - 1;
                        datosFuncion.setExponente(nuevoExponente);

                        if (datosFuncion.getExponente() == 0) {
                            return datosFuncion.getCoeficiente();
                        }
                        return datosFuncion.getCoeficiente() + datosFuncion.getIteral() + "^" + datosFuncion.getExponente();
                    }
                })
                .reduce((acumulador, fico)-> {return acumulador;}));

        return resultados;
    }
}
