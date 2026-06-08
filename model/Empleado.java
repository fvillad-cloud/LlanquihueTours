/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 * La clase "Empleado" es una subclase derivada de la superclase "Persona" y
 * representa a las personas que trabajan en la empresa turistica Llanquihue Tours.
 *
 */
public class Empleado extends Persona {
    private boolean contratoIndefinido;
    private String sistemaPrevisional;
    private String afp;
    private double horasExtras;
    
    /**
     * 
     * @param contratoIndefinido, representa si el empleado cuententa o no con contrato indefinido (true o false)
     * @param sistemaPrevisional, representa el sistema de prevision de salud del empleado (Fonasa o alguna Isapre)
     * @param afp, representa el sistema de ahorro para la jubilacion del empleado.
     * @param horasExtras, representa el numero de horas extras realizadas por el empleado durante el periodo de un mes. 
     * @param nombre, representa el nombre completo del empleado
     * @param edad, representa la edad del empleado (años)
     * @param rut, representa el Rol Unico Nacional del empleado
     * @param telefono, representa el numero de telefono del empleado
     * @param direccion, representa la direccion del empleado. 
     */

    public Empleado(boolean contratoIndefinido, String sistemaPrevisional, String afp, double horasExtras, String nombre, 
                    int edad, String rut, String telefono, Direccion direccion) 
    {
        super(nombre, edad, rut, telefono, direccion);
        this.contratoIndefinido = contratoIndefinido;
        this.sistemaPrevisional = sistemaPrevisional;
        this.afp = afp;
        this.horasExtras = horasExtras;
    }
    
    /**
     * Metodo devuelve la impresion de la informacion personal completa del empleado. 
     */
    
    @Override
    public void mostrarInfoPersona(){
        super.mostrarInfoPersona();
        System.out.println("Contrato Indefinido : "+contratoIndefinido);
        System.out.println("Sist. Prevision     : "+sistemaPrevisional);
        System.out.println("AFP                 : "+afp);
        System.out.println("Horas Extras        : "+horasExtras);
    }

    public boolean isContratoIndefinido() {
        return contratoIndefinido;
    }

    public void setContratoIndefinido(boolean contratoIndefinido) {
        this.contratoIndefinido = contratoIndefinido;
    }

    public String getSistemaPrevisional() {
        return sistemaPrevisional;
    }

    public void setSistemaPrevisional(String sistemaPrevisional) {
        this.sistemaPrevisional = sistemaPrevisional;
    }

    public String getAfp() {
        return afp;
    }

    public void setAfp(String afp) {
        this.afp = afp;
    }

    public double getHorasExtras() {
        return horasExtras;
    }

    public void setHorasExtras(double horasExtras) {
        this.horasExtras = horasExtras;
    }


       
}
