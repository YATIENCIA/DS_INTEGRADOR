/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facturador.creacional;

/**
 *
 * @author Palacios
 */
public class ComprobantesFactory{
    
    public ComprobanteElectronico getComprobante(String tipoComprobante){
      if(tipoComprobante == null){
         return null;
      }		
      if(tipoComprobante.equalsIgnoreCase("FACTURA")){
          Factura factura=new Factura();
         return factura;
         
      } else if(tipoComprobante.equalsIgnoreCase("GUIAREMISION")){
          GuiaRemision gr= new GuiaRemision();
         return gr;
         
      } else if(tipoComprobante.equalsIgnoreCase("NOTACREDITO")){
          NotaCredito nc=new NotaCredito();
         return nc;
      }
      
      return null;
   }
    
}
