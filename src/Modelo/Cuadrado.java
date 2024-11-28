/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author Usuario
 */
public class Cuadrado implements FiguraGeometrica{

    private double lado;

    public Cuadrado() {
    }

    public Cuadrado(double lado) {
        this.lado = lado;
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    

    @Override
    public double calcularArea() {
        
        return getLado()*getLado();
        }

    @Override
    public double calcularPerimetro() {
        
        return getLado()*4;
          }

    @Override
    public String toString() {
        return "CUADRADO:"
                +"Lado:"+getLado()+"\n";}
                

}
