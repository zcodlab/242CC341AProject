package uni.isw.tpdv.model;

import java.util.Date;
import java.util.List;

public class Venta {
    private Date fecha;
    private boolean estaTerminada;
    private int hora;
    private List<VentasLineaDeProducto> VentaDet;
    private Pago pago;
    
    public void seTermina(){
    }
    /*Por Patron 2.Creador*/
    public void hacerLineaDeProducto(int cantidad){
    }
    /*Por Patron 3.BajoAcoplamiento*/
    public void efectuarPago(Pago pago){
        this.pago=pago;
    }
    /*Por Patron 1.Experto*/
    public void total(){
    }
    
}
