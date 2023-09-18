package com.mycompany.seguimientopaquetes;

import java.util.ArrayList;
import java.util.List;

public class ListaPaquetes {
    private List <Paquete> lPaquetes;

    public ListaPaquetes(List<Paquete> lPaquetes) {
        this.lPaquetes = lPaquetes;
    }

    public ListaPaquetes() {
        this.lPaquetes = new ArrayList<>();
    }
    
    public void addPaquete(Paquete paquete){
        this.lPaquetes.add(paquete);
    }

    public List<Paquete> getlPaquetes() {
        return lPaquetes;
    }

    public void setlPaquetes(List<Paquete> lPaquetes) {
        this.lPaquetes = lPaquetes;
    }
    
    public void showList(){
        for(Paquete paquete : lPaquetes){
            paquete.showInfo();
        }
    }
    
    public void showPaquetesPendientes(){
        for(Paquete paquete : lPaquetes){
            int flag = 0;
            for(Estado estado : paquete.getEstados()){
                if(estado.getNombre() == "Entregado"){
                    flag = 1;
                }
            }
            if(flag == 0){
                paquete.showInfo();
            }
        }
    }
    
     public void showPaquetesEntregados(){
        for(Paquete paquete : lPaquetes){
            int flag = 0;
            for(Estado estado : paquete.getEstados()){
                if(estado.getNombre() == "Entregado"){
                    flag = 1;
                }
            }
            if(flag == 1){
                paquete.showInfo();
            }
        }
    } 
}
