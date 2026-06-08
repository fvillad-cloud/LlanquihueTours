/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 * La clase "Cliente" es una subclase derivada de la superclase "Persona" y
 * representa a las personas que contratan los servicios de la empresa turistica Llanquihue Tours.
 */
public class Cliente extends Persona{
    private boolean clienteVIP;
    private int puntosAcumulados;
    private String servicioSolicitado;
    
    /**
     * 
     * @param clienteVIP, representa si el cliente es VIP o no (true o false)
     * @param puntosAcumulados, representa los puntos acumulados por el cliente. 
     * @param servicioSolicitado, representa el servicio solicitado por el cliente (tours completos, tour gastronomicos, tours de excursion, etc.)
     * @param nombre, representa el nombre completo del cliente
     * @param edad, representa la edad del cliente (años)
     * @param rut, representa el Rol Unico Nacional del cliente
     * @param telefono, representa el numero de telefono del cliente
     * @param direccion, representa la direccion del cliente. 
     */

    public Cliente(boolean clienteVIP, int puntosAcumulados, String servicioSolicitado, String nombre, int edad, String rut, String telefono, Direccion direccion) {
        super(nombre, edad, rut, telefono, direccion);
        this.clienteVIP = clienteVIP;
        this.puntosAcumulados = puntosAcumulados;
        this.servicioSolicitado = servicioSolicitado;
    }
    
    /**
     * El metodo a continuacion devuelve la impresion por pantalla de la informacion del cliente. 
     */
    
    @Override
    public void mostrarInfoPersona(){
        super.mostrarInfoPersona();
        System.out.println("Cliente VIP         : "+clienteVIP);
        System.out.println("Puntos cliente      : "+puntosAcumulados);
        System.out.println("Servicio Solicitado : "+servicioSolicitado);
        
    }

    public boolean isClienteVIP() {
        return clienteVIP;
    }

    public void setClienteVIP(boolean clienteVIP) {
        this.clienteVIP = clienteVIP;
    }

    public int getPuntosAcumulados() {
        return puntosAcumulados;
    }

    public void setPuntosAcumulados(int puntosAcumulados) {
        this.puntosAcumulados = puntosAcumulados;
    }

    public String getServicioSolicitado() {
        return servicioSolicitado;
    }

    public void setServicioSolicitado(String servicioSolicitado) {
        this.servicioSolicitado = servicioSolicitado;
    }

    
    
    
}
