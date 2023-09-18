package com.mycompany.seguimientopaquetes;

public class Cliente {
    private String nombre;
    private String direccion;
    private String codCliente;

    public Cliente(String nombre, String codCliente, String direccion) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.codCliente = codCliente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCodCliente() {
        return codCliente;
    }

    public void setCodCliente(String codCliente) {
        this.codCliente = codCliente;
    }
    
    public void showPaquetes(ListaPaquetes paquetes) {
        System.out.println("Paquetes enviados: ");
        for(Paquete paquete : paquetes.getlPaquetes()){
            if(paquete.getRemitente() == getCodCliente()){
                System.out.println(paquete.getCodPaquete());
            }
        }
        
        System.out.println("Paquetes recibidos: ");
        for(Paquete paquete : paquetes.getlPaquetes()){
            if(paquete.getDestinatario() == getCodCliente()){
                System.out.println(paquete.getCodPaquete());
            }
        }
    }
      
    public void showInfo(ListaPaquetes paquetes){
        
        System.out.println("Nombre del cliente: " + this.getNombre());
        System.out.println("Codigo del cliente: " + this.getCodCliente());
        System.out.println("Dirección: " + this.getDireccion());
        
        
        showPaquetes(paquetes);
        
        System.out.println("");
    }
}
