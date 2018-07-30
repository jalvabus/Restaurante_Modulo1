/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Test;

import DAO.DAO_Pedido;

/**
 *
 * @author juana
 */
public class Probar {

    public void enviarCorreo() {
        DAO.DAO_Pedido ob = new DAO_Pedido();
        ob.reporteCompra(1, "juanalva432@gmail.com", "Buenas nocges", "juanalva432@gmail.com", null, 0);
        ob.sendEmail("juanalva432@gmail.com", null);
    }

    public static void main(String[] args) {
        Probar p = new Probar();
        p.enviarCorreo();
    }
}
