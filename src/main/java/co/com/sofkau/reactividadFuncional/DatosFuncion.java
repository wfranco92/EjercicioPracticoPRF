package co.com.sofkau.reactividadFuncional;

public class DatosFuncion {
    private String iteral;
    private Integer exponente;
    private Integer coeficiente;

    public DatosFuncion(String iteral, Integer exponente, Integer coeficiente) {
        this.iteral = iteral;
        this.exponente = exponente;
        this.coeficiente = coeficiente;
    }

    public String getIteral() {
        return iteral;
    }

    public void setIteral(String iteral) {
        this.iteral = iteral;
    }

    public Integer getExponente() {
        return exponente;
    }

    public void setExponente(Integer exponente) {
        this.exponente = exponente;
    }

    public Integer getCoeficiente() {
        return coeficiente;
    }

    public void setCoeficiente(Integer coeficiente) {
        this.coeficiente = coeficiente;
    }
}