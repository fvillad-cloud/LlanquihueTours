/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package app;

import model.Cliente;
import model.Direccion;
import model.Empleado;


/**
 *
 * Esta es la clase principal del programa LLanquihueTours.
 * 
 * Su funcion principal es dar inicio a la ejecucion del programa, es la clase donde se crean los objetos de los tipos
 * "Direccion", "Empleado" y "Cliente"  y se organiza la impresion de los datos correspondiente por consola. 
 * 
 */
public class LlanquihueTours {

    /**
     * @param args argumentos recibidos por linea de comandos, que en este caso no se utilizan
     */
    public static void main(String[] args) {
        Direccion direccionEmpleado1 = new Direccion("Eduardo Frei", 72, "Concepcion", "BioBio");
        Empleado  empleado1 = new Empleado(true, "Fonasa", "Cuprum", 16, "Juan Carlos Gonzalez Tapia", 37, "15259635-8", "995631852", direccionEmpleado1);
        
        Direccion direccionEmpleado2 = new Direccion("Sargento Aldea",32, "Llanquihue", "Los Lagos");
        Empleado  empleado2 = new Empleado(false, "Isapre Cruz Blanca", "Capital", 12, "Maria Cristina Salamanca Pereira", 41, "15985632-5", "9854123674", direccionEmpleado2);
        
        
        Direccion direccionCliente1 = new Direccion("Arturo Prat", 325, "Talcahuano", "BioBio");
        Cliente cliente1 = new Cliente(false, 3500, "Tour Gastronomico por Llanquihue y Puerto Varas", "Carolina Fernanda Arriagada Soto", 28, "19235637-1", "952478963", direccionCliente1);
        
        Direccion direccionCliente2 = new Direccion("Avenida Vitacura", 4570, "Vitacura", "Metropolitana");
        Cliente cliente2 = new Cliente(true, 15400, "Tour VIP 7 dias y 7 noches en lago Llanquihue", "Andronico Luksic Craig", 72, "7824651-2", "978456321", direccionCliente2);
        
        System.out.println("=== PERSONAL EMPRESA LLANQUIHUE TOURS ===");
        //Imprime a continuacion los datos de empleado 1 con metodo "mostrarInfoPersona()" correspondiente a Override
        empleado1.mostrarInfoPersona();
        //A continuacion se imprimen datos de empleado 2 mediante metodos get().
        System.out.print("\n");
        System.out.println("Nombre              : "+empleado2.getNombre());
        System.out.println("Edad                : "+empleado2.getEdad());
        System.out.println("RUT                 : "+empleado2.getRut());
        System.out.println("Fono                : "+empleado2.getTelefono());
        System.out.println(empleado2.getDireccion());
        System.out.println("Contrato Indefinido : "+empleado2.isContratoIndefinido());
        System.out.println("Sist. Prevision     : "+empleado2.getSistemaPrevisional());
        System.out.println("AFP                 : "+empleado2.getAfp());
        System.out.println("Horas Extras        : "+empleado2.getHorasExtras());
        
        //Se imprimen ahora los datos de los Clientes.
        System.out.println("\n=== LISTA CLIENTES ===");
        cliente1.mostrarInfoPersona();
        System.out.print("\n");
        cliente2.mostrarInfoPersona();
    }
    
}
