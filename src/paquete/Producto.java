package paquete;


import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import java.util.Date;


public class Producto implements Serializable{

    private String descripcion;
    private int idproducto;
    private int stockminimo;
    private float pvp;
    private int stockactual;
    
PropertyChangeSupport propertySupport;

    public Producto() {
        propertySupport=new PropertyChangeSupport(this);
        stockminimo =0;
      
    }
    public void addPropertyChangeListener(PropertyChangeListener listener){
        
        propertySupport.addPropertyChangeListener(listener);
    }
    
  

    public void setStockactual(int valornovo) {
        if (valornovo<stockminimo){
            
       propertySupport.firePropertyChange("stockactual",stockactual,valornovo);
       
        }
        
       this.stockactual = valornovo;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setIdproducto(int idproducto) {
        this.idproducto = idproducto;
    }

    public void setStockminimo(int stockminimo) {
        this.stockminimo = stockminimo;
    }

    public void setPvp(float pvp) {
        this.pvp = pvp;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public int getIdproducto() {
        return idproducto;
    }

    public int getStockminimo() {
        return stockminimo;
    }

    public float getPvp() {
        return pvp;
    }

    public int getStockactual() {
        return stockactual;
    }

}
