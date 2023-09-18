
package com.mycompany.seguimientopaquetes;

import java.util.ArrayList;
import java.util.List;

public class Paquete {
    private String codPaquete;
    private String numSeguimiento;
    private String origen;
    private String destino;
    private String fechaEnvio;
    private double peso;
    private String remitente;
    private String destinatario;

    private List <Estado> estados;

    public Paquete(String codPaquete, String numSeguimiento, String origen, String destino, String fechaEnvio, double peso, String remitente, String destinatario) {
        this.codPaquete = codPaquete;
        this.numSeguimiento = numSeguimiento;
        this.origen = origen;
        this.destino = destino;
        this.fechaEnvio = fechaEnvio;
        this.peso = peso;
        this.remitente = remitente;
        this.destinatario = destinatario;
        this.estados = new ArrayList<>();
        this.estados.add(new Estado("Enviado", origen, fechaEnvio, ""));
    }

    public String getCodPaquete() {
        return codPaquete;
    }

    public void setCodPaquete(String codPaquete) {
        this.codPaquete = codPaquete;
    }

    public String getNumSeguimiento() {
        return numSeguimiento;
    }

    public void setNumSeguimiento(String numSeguimiento) {
        this.numSeguimiento = numSeguimiento;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public String getFechaEnvio() {
        return fechaEnvio;
    }

    public void setFechaEnvio(String fechaEnvio) {
        this.fechaEnvio = fechaEnvio;
    }

    public List<Estado> getEstados() {
        return this.estados;
    }

    public void addEstado(Estado estado) {
        this.estados.add(estado);
    }

    public String getRemitente() {
        return remitente;
    }

    public void setRemitente(String remitente) {
        this.remitente = remitente;
    }

    public String getDestinatario() {
        return destinatario;
    }

    public void setDestinatario(String destinatario) {
        this.destinatario = destinatario;
    } 

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }
    
    public void showEstados(String n)
    {
        System.out.println("Estados del paquete " + n + ":");
        
        for(Estado estado : estados){
            estado.showInfo();
        }
    }    
    public void showInfo(){
        System.out.println("Codigo de paquete: " + this.getCodPaquete());
        System.out.println("Numero de seguimiento: " + this.getNumSeguimiento());
        System.out.println("Origen: " + this.getOrigen());
        System.out.println("Destino: " + this.getDestino());
        System.out.println("Fecha envío: " + this.getFechaEnvio());
        System.out.println("Peso: " + this.getPeso());
        
        int flag = 0;

        for(Estado estado : estados){
            if (estado.getNombre() == "Entregado"){
                flag = 1;
            }                 
        }     
        
        if (flag == 1){
            System.out.println("Estado: Entregado");
        }
        else {
            System.out.println("Estado: En transito");  
        }
        
        System.out.println("");
    }
    
}
