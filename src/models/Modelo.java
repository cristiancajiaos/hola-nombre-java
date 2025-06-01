package models;

public class Modelo {

    private String nombre;
    private String saludo;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getSaludo() {
        return saludo;
    }

    public void setSaludo(String saludo) {
        this.saludo = saludo;
    }
    
    public String saludar() {
        this.saludo = "Hola, " + this.getNombre() + "!";
        return this.saludo;
    }
}
