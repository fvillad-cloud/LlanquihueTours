/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 * Esta clase "Persona" corresponde a una superclase de la cual derivan las subclases "Empleado" y "Cliente". Sirve
 * a modo de modelo estandar para representar a diferentes personas que tengan alguna relacion con la empresa 
 * Llanquihue Tours. Consta de 5 atributos basicos que representan la informacion escencial de cualquier persona. 
 * Tambien posee un metodo "mostrarInforPersona()" el cual es utilizado por las subclases "Empleado" y "Cliente", para
 * impimir informacion por pantalla
 */
public class Persona {
    private String nombre;
    private int edad;
    private String rut;
    private String telefono;
    private Direccion direccion;

    /**
     * 
     * @param nombre, representa el nombre real de una persona
     * @param edad, representa la edad (en años) de una persona
     * @param rut, representa el rol unico nacional de una persona Chilena.
     * @param telefono, representa el numero telefonico de una persona.
     * @param direccion, representa la direccion completa de una persona.  
     */
    
    public Persona(String nombre, int edad, String rut, String telefono, Direccion direccion) {
        this.nombre = nombre;
        this.edad = edad;
        this.rut = rut;
        this.telefono = telefono;
        this.direccion = direccion;
    }
    
    /**
     * Metodo imprime los datos personales basicos de alguna persona (Empleado, Cliente, Accionistas, etc.)
     * relacionada con la empresa LLanquihue Tours. 
     */
    
    public void mostrarInfoPersona(){
        System.out.println("=== DATOS PERSONALES ===");
        System.out.println("Nombre              : "+nombre);
        System.out.println("Edad                : "+edad);
        System.out.println("RUT                 : "+rut);
        System.out.println("Fono                : "+telefono);
        System.out.println(direccion);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public Direccion getDireccion() {
        return direccion;
    }

    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }
    
    
    
}
