
import facturador.creacional.ComprobantesFactory;
import facturador.creacional.Interface_Comprobante;
import facturador.estructural.LemaDecorator;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author IYAC
 */
public class main {
    public static void main(String[] args) {
        ComprobantesFactory cf=new ComprobantesFactory();
        Interface_Comprobante comprobante=(Interface_Comprobante) cf.getComprobante("Factura");
        System.out.println(comprobante.getExtras());
        comprobante= new LemaDecorator(comprobante);
        System.out.println(comprobante.getExtras());
    }
}
