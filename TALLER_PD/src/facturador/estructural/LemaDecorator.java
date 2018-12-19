/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facturador.estructural;

import facturador.creacional.ComprobanteElectronico;
import facturador.creacional.Interface_Comprobante;

/**
 *
 * @author Administrador
 */
public class LemaDecorator extends ComprobanteDecorator{
    public LemaDecorator(Interface_Comprobante c){
        super(c);
    }
 
    @Override
    public String getExtras(){
        String s = super.getExtras();
        s += "Accesorio: Lema de la empresa" + "\n";
        return s;
    }
    
}
