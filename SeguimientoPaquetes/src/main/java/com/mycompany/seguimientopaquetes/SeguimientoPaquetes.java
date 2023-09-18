package com.mycompany.seguimientopaquetes;

public class SeguimientoPaquetes {

    public static void main(String[] args) {
        
        ListaClientes liClientes = new ListaClientes();
        
        liClientes.addCliente(new Cliente("Juan","A1", "Mocoa"));
        liClientes.addCliente(new Cliente("Manuel","A2", "Girardoth"));
        liClientes.addCliente(new Cliente("Maria","A3", "Puerto Asis"));
        liClientes.addCliente(new Cliente("Robinson","A4", "Bogotá"));
        
        
        ListaPaquetes liPaquetes = new ListaPaquetes();
        
        Paquete paquete1 = new Paquete("0A", "01", "Mocoa", "Girardoth", "10/03/2023", 50, "A1", "A2");
        Paquete paquete2 = new Paquete("0B", "02", "Girardoth","Mocoa", "25/05/2023", 40,"A2", "A1");
        Paquete paquete3 = new Paquete("0C", "03", "Puerto Asis","Bogotá", "8/03/2022", 20, "A3", "A4");
        Paquete paquete4 = new Paquete("0D", "04", "Bogotá","Girardoth", "11/03/2023", 10, "A4", "A2");
        
        paquete1.addEstado(new Estado("Pendiente", "Neiva", "13/03/2023", "Está en revision en Neiva"));
        paquete1.addEstado(new Estado("Pendiente", "Bogotá", "16/03/2023", "Está en revision en Bogotá"));
        paquete1.addEstado(new Estado("Entregado", "Girardoth", "18/03/2023", "Se entregó en la bodega de Girardoth."));
        
        paquete2.addEstado(new Estado("Pendiente", "Bogotá", "28/05/2023", "Está en revision en Bogotá"));
        paquete2.addEstado(new Estado("Pendiente", "Neiva", "30/05/2023", "Está en revision en Neiva"));
        
        paquete3.addEstado(new Estado("Pendiente", "Mocoa", "12/03/2023", "Está en revision en Mocoa"));
        paquete3.addEstado(new Estado("Pendiente", "Neiva", "15/03/2023", "Está en revision en Neiva"));
        paquete3.addEstado(new Estado("Pendiente", "Bogotá", "19/03/2023", "Está en revision en Bogotá"));
        
        paquete4.addEstado(new Estado("Entregado", "Girardoth", "21/03/2023", "Se entregó en la bodega de Girardoth."));
        
        liPaquetes.addPaquete(paquete1);
        liPaquetes.addPaquete(paquete2);
        liPaquetes.addPaquete(paquete3);
        liPaquetes.addPaquete(paquete4);
        
        
        //liClientes.showList(liPaquetes);
        
        //liPaquetes.showList();
        
        //paquete1.showEstados("0A");
        //paquete2.showEstados("0B");
        //paquete3.showEstados("0C");
        //paquete4.showEstados("0D");
         
        //liPaquetes.showPaquetesPendientes();
        //liPaquetes.showPaquetesEntregados();
    }
}