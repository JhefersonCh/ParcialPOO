package com.mycompany.seguimientopaquetes;

import java.util.ArrayList;
import java.util.List;

public class ListaClientes {
    private List <Cliente> lClientes;

    public ListaClientes(List<Cliente> lClientes) {
        this.lClientes = lClientes;
    }

    public ListaClientes() {
        this.lClientes = new ArrayList<>();
    }
    
    public void showList(ListaPaquetes listaPaquetes){
        for(Cliente cliente : lClientes){
            cliente.showInfo(listaPaquetes);
        }
    }
    
    public void addCliente(Cliente cliente){
        this.lClientes.add(cliente);
    }

    public List<Cliente> getlClientes() {
        return lClientes;
    }

    public void setlClientes(List<Cliente> lClientes) {
        this.lClientes = lClientes;
    }
}
