
package poo;

import java.util.Date;

/**
 *
 * @author capri
 */
public class Multa {
    private int id_Multa;
    private Date fecha;
    private String placa;
    private String motivo;
    private int monto;
   
    
    public Multa (){
        
    }

    public Multa(int id_Multa, Date fecha, String placa, String motivo, int monto) {
        this.id_Multa = id_Multa;
        this.fecha = fecha;
        this.placa = placa;
        this.motivo = motivo;
        this.monto = monto;
    }

    public int getId_Multa() {
        return id_Multa;
    }

    public void setId_Multa(int id_Multa) {
        this.id_Multa = id_Multa;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getMotivo() {
        return motivo;
    }

    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }

    public int getMonto() {
        return monto;
    }

    public void setMonto(int monto) {
        this.monto = monto;
    }

    

}
