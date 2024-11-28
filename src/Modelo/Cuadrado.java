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
    private String nombre;
    private double lado;

    public Cuadrado() {
    }

    public Cuadrado(String nombre, double lado) {
        this.nombre = nombre;
        this.lado = lado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
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
        return "CUADRADO:"+"\n"+"Nombre:"+getNombre()+"\n"
                +"Lado:"+getLado()+"\n";}
                
    public void imprimir(){
    
    }
    public void imprimir(String nombre){
    
    }
}
