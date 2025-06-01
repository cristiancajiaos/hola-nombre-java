package controllers;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import models.Modelo;
import vista.Vista;

public class Controlador implements ActionListener {
    private Vista vista;
    private Modelo modelo;

    public Controlador(Vista vista, Modelo modelo) {
        this.vista = vista;
        this.modelo = modelo;
        this.vista.btnSaludar.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        modelo.setNombre(vista.cajaNombre.getText());
        modelo.saludar();
        this.vista.etiquetaSaludo.setText(modelo.getSaludo());
    }
    
}
