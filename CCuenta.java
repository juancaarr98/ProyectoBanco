/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Proyecto_Banco;

import java.util.ArrayList;

/**
 *
 * @author Juan carlos
 */
public class CCuenta {
    private int saldo;
    private String fch;
    private ArrayList<CTarjeta> alTarjetas;

    public CCuenta(int saldo, String fch) {
        this.saldo = saldo;
        this.fch = fch;
    }

    public CCuenta(int saldo, String fch, ArrayList<CTarjeta> alTarjetas) {
        this.saldo = saldo;
        this.fch = fch;
        this.alTarjetas = alTarjetas;
    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    public String getFch() {
        return fch;
    }

    public void setFch(String fch) {
        this.fch = fch;
    }

    public ArrayList<CTarjeta> getAlTarjetas() {
        return alTarjetas;
    }

    public void setAlTarjetas(ArrayList<CTarjeta> alTarjetas) {
        this.alTarjetas = alTarjetas;
    }
    public double mdSalarioMedio(){}
    
}
