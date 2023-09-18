package com.mycompany.seguimientopaquetes;

public class Estado {
    private String nombre;
    private String lugar;
    private String fecha;
    private String descripcion;

    public Estado(String nombre, String lugar, String fecha, String descripcion) {
        this.nombre = nombre;
        this.lugar = lugar;
        this.fecha = fecha;
        this.descripcion = descripcion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
    public void showInfo(){
        System.out.println("Nombre: " + this.getNombre());
        System.out.println("Lugar: " + this.getLugar());
        System.out.println("Fecha: " + this.getFecha());
        System.out.println("Descripcion: " + this.getDescripcion());
        System.out.println("");
    }  
}
