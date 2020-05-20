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
public class CCliente {
    private String nombre;
    private String aplellido;
    private String dir;
    private String nif;
    private int edad;
    private int tf;
    private ArrayList<CCuenta> alCuentas;

    public CCliente(String nombre, String aplellido, String dir, String nif, int edad, int tf) {
        this.nombre = nombre;
        this.aplellido = aplellido;
        this.dir = dir;
        this.nif = nif;
        this.edad = edad;
        this.tf = tf;
    }


    public CCliente(String nombre, String aplellido, String dir, String nif, int edad, int tf, ArrayList<CCuenta> alCuentas) {
        this.nombre = nombre;
        this.aplellido = aplellido;
        this.dir = dir;
        this.nif = nif;
        this.edad = edad;
        this.tf = tf;
        this.alCuentas = alCuentas;
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAplellido() {
        return aplellido;
    }

    public void setAplellido(String aplellido) {
        this.aplellido = aplellido;
    }

    public String getDir() {
        return dir;
    }

    public void setDir(String dir) {
        this.dir = dir;
    }

    public String getNif() {
        return nif;
    }

    public void setNif(String nif) {
        this.nif = nif;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getTf() {
        return tf;
    }

    public void setTf(int tf) {
        this.tf = tf;
    }

    public ArrayList<CCuenta> getAlCuentas() {
        return alCuentas;
    }

    public void setAlCuentas(ArrayList<CCuenta> alCuentas) {
        this.alCuentas = alCuentas;
    }

    @Override
    public String toString() {
        return "Para el cliente: " + "nombre=" + nombre + ", aplellido=" + aplellido + ", dir=" + dir + ", nif=" + nif + ", edad=" + edad + ", tf=" + tf + ", alCuentas=" + alCuentas + '}';
    }
    
    public void mvInsertar(int cantidad){}
    public void  mcSacar(int cantidad){}
    
}
