/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package qc.hj.proyecto1.controller;

/**
 *
 * @author T
 */
public class Significado {
    
 
    private String Piscis;
    private String Tauro;
    private String Libra;

    @Override
    public String toString() {
        return "Significado{" + "Piscis=" + Piscis + ", Tauro=" + Tauro + ", Libra=" + Libra + '}';
    }

    public Significado(String Piscis, String Tauro, String Libra) {
        this.Piscis = Piscis;
        this.Tauro = Tauro;
        this.Libra = Libra;
    }

    public String getPiscis() {
        return Piscis;
    }

    public void setPiscis(String Piscis) {
        this.Piscis = Piscis;
    }

    public String getTauro() {
        return Tauro;
    }

    public void setTauro(String Tauro) {
        this.Tauro = Tauro;
    }

    public String getLibra() {
        return Libra;
    }

    public void setLibra(String Libra) {
        this.Libra = Libra;
    }
    
    
    
}
