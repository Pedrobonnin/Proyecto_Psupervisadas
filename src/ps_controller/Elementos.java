/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ps_controller;


/**
 *
 * @author bonni
 */
public class Elementos {

    private int id;
    private String elemento;
    private String fechaOut;
    

    public Elementos() {
        id = 0;
        elemento = "";
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getElemento() {
        return elemento;
    }

    public void setelemento(String elemento) {
        this.elemento = elemento;
    }

    
    @Override
    public String toString() {
        return getElemento();
    }

    public String getFechaOut() {
        return fechaOut;
    }

    public void setFechaOut(String fechaOut) {
        this.fechaOut = fechaOut;
    }

    
}


