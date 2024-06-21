/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package otroPaquete;

/**
 *
 * @author user
 */


public class OtraClase {
    String nombre, nombreRecibo = "Diego";
    String apellido = "Garcia";
    Double precio = 12000.500;
    boolean fueraStock = true;
    int cantidad = 2;
    double total;

    public static void main(String[] args) {
        OtraClase miObjeto = new OtraClase();
        miObjeto.calcularTotal();
        System.out.println(miObjeto.total);
    }

    public void calcularTotal() {
        total = precio * cantidad;
    }
}
