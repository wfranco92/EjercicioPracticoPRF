package co.com.sofkau.reactividadFuncional;

public class Email {

    private String valor;
    private boolean correoRecibido;

    public Email(String valor, boolean estado) {
        this.valor = valor;
        this.correoRecibido = estado;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    public boolean isEstado() {
        return correoRecibido;
    }

    public void setEstado(boolean estado) {
        this.correoRecibido = estado;
    }


}
