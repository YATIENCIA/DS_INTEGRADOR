
import facturador.Comportamental.AutorizadorSRI;
import facturador.Comportamental.EsquemaOnLine;
import facturador.creacional.ComprobanteElectronico;
import facturador.creacional.ComprobantesFactory;
import facturador.creacional.Factura;
import facturador.creacional.Interface_Comprobante;
import facturador.estructural.LemaDecorator;
import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;

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
        ComprobanteElectronico cp = cf.getComprobante("Factura");
        cp.setClaveAcceso("0951479123");
        cp.setCodigo(90000);
        ArrayList<String> detalles = new ArrayList<>();
        detalles.add("0991225129");
        detalles.add("csesme@espol.edu.ec");
        cp.setDetallesEmisor(detalles);
        LocalDate date = LocalDate.of(2018, Month.DECEMBER, 18);
        cp.setFecha(date);
        cp.setNombreCliente("Carlos");
        Factura fact = (Factura)cp;
        fact.setTotal(20.00);
        ArrayList<String> productos = new ArrayList<>();
        productos.add("carro");
        productos.add("mesa");
        fact.setProductos(productos);
        AutorizadorSRI autorizacion = new AutorizadorSRI(new EsquemaOnLine());
        autorizacion.autorizar(cp);
        Interface_Comprobante comprobante=(Interface_Comprobante) cp;
        System.out.println(comprobante.getExtras());
        System.out.println(fact.toString());
        comprobante= new LemaDecorator(comprobante);
        System.out.println(comprobante.getExtras());
        
        
        
        
    }
}
