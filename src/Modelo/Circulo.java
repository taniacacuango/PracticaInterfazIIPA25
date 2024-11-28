/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author Usuario
 */
public class Circulo implements FiguraGeometrica {
    private String nombre;
    private double radio;

    public Circulo() {
    }

    public Circulo(String nombre, double radio) {
        this.nombre = nombre;
        this.radio = radio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    @Override
    public double calcularArea() {
        return PI*getRadio()*getRadio();
         }

    @Override
    public double calcularPerimetro() {
        
        return 2*PI*getRadio();
         }

    @Override
    public String toString() {
        return "CÍRCULO:"+"\n"+"Nombre:"+getNombre()+"\n"+
                "Radio:"+getRadio();}

    
         
}
