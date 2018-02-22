package paquete;



import java.beans.*;
import java.io.Serializable;
import java.util.Date;


public class Pedido implements Serializable, PropertyChangeListener {

    
    private int numeropedido;
    private int idproducto;
    private Date fecha;
    private int cantidad;
    private boolean pedir;

    public Pedido() {
  
    }




    @Override
    public void propertyChange(PropertyChangeEvent obj) {
        
        System.out.println("Valor anterior :"+obj.getOldValue());
        System.out.println ("Valor actual :"+obj.getNewValue());
        
       
        System.out.println(""+obj.getPropagationId());
        pedir=true; // indicamos que se recibiu un cambio nunha propiedade.
               
    }

  
    

}
