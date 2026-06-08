/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 * La clase "Direccion" representa la direccion física de las diferentes personas,
 * ya sean empleados o clientes de la empresa LLanquihue Tours. Esta clase se utiliza
 * como parte de la composicion de la superclase "Persona".
 */

public class Direccion {
    private String calle;
    private int numero;
    private String ciudad;
    private String region;

    /**
     * 
     * @param calle, representa la calle en la que vive el empleado o cliente 
     * @param numero, represneta el numero del domicilio
     * @param ciudad, reprenta la ciudad en la que se ubica el domicilio fisico de cliente o empleado
     * @param region, reprenta la region del país en la que se ubica el domicilio fisico de cliente o empleado
     */
    
    public Direccion(String calle, int numero, String ciudad, String region) {
        this.calle = calle;
        this.numero = numero;
        this.ciudad = ciudad;
        this.region = region;
    }
    
    /**
     * 
     * @return Devuelve la impresion por pantalla de la direccion (Calle, numero, ciudad y region) del cliente o empleado.
     */
    
    @Override
    
    public String toString(){
        return "Direccion           : Calle "+calle+" #"+numero+", "+ciudad+", Region de "+region+".";
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }  
    
}
