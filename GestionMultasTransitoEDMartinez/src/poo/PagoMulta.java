package poo;

import java.util.Date;
import oracle.sql.DATE;

/**
 *
 * @author capri
 */
public class PagoMulta {
    private int idPago;
   private Date fecha;
   private int montoPagado;
   private int idMulta;
   private String estadoMulta;
   
   public PagoMulta(){
       
   }

    public PagoMulta(int idPago, Date fecha, int montoPagado, int idMulta, String estadoMulta) {
        this.idPago = idPago;
        this.fecha = fecha;
        this.montoPagado = montoPagado;
        this.idMulta = idMulta;
        this.estadoMulta = estadoMulta;
    }

    public int getIdPago() {
        return idPago;
    }

    public void setIdPago(int idPago) {
        this.idPago = idPago;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public int getMontoPagado() {
        return montoPagado;
    }

    public void setMontoPagado(int montoPagado) {
        this.montoPagado = montoPagado;
    }

    public int getIdMulta() {
        return idMulta;
    }

    public void setIdMulta(int idMulta) {
        this.idMulta = idMulta;
    }

    public String getEstadoMulta() {
        return estadoMulta;
    }

    public void setEstadoMulta(String estadoMulta) {
        this.estadoMulta = estadoMulta;
    }
    
    
    
}
