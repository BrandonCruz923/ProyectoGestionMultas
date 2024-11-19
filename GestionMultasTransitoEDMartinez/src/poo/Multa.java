
package poo;

import java.util.Date;

/**
 *
 * @author capri
 */
public class Multa {
    private String id_Multa;
    private Date fecha;
    private String motivo;
    private int monto;
    private int id_agente;
    private int id_vehiculo;
    
    public Multa (){
        
    }

    public Multa(String id_Multa, Date fecha, String motivo, int monto, int id_agente, int id_vehiculo) {
        this.id_Multa = id_Multa;
        this.fecha = fecha;
        this.motivo = motivo;
        this.monto = monto;
        this.id_agente = id_agente;
        this.id_vehiculo = id_vehiculo;
    }

    public String getId_Multa() {
        return id_Multa;
    }

    public void setId_Multa(String id_Multa) {
        this.id_Multa = id_Multa;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
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

    public int getId_agente() {
        return id_agente;
    }

    public void setId_agente(int id_agente) {
        this.id_agente = id_agente;
    }

    public int getId_vehiculo() {
        return id_vehiculo;
    }

    public void setId_vehiculo(int id_vehiculo) {
        this.id_vehiculo = id_vehiculo;
    }
    
}
