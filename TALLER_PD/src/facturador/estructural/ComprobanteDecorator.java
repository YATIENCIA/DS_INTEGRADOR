/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facturador.estructural;

import facturador.creacional.Interface_Comprobante;

/**
 *
 * @author Administrador
 */
public abstract class ComprobanteDecorator implements Interface_Comprobante{
    protected Interface_Comprobante comprobante;
    
    public ComprobanteDecorator(Interface_Comprobante comprobante){
        this.comprobante=comprobante; 
    }
    
    @Override
    public String getExtras(){
        return comprobante.getExtras();
    }
    
}
