package poo;

/**
 *
 * @author capri
 */
public class Conductor {
    private int idConductor;
    private String nombre;
    private String numLicencia;
    private int celular;
    
    public Conductor(){
        
    }

    public Conductor(int idConductor, String nombre, String numLicencia, int celular) {
        this.idConductor = idConductor;
        this.nombre = nombre;
        this.numLicencia = numLicencia;
        this.celular = celular;
    }

    public int getIdConductor() {
        return idConductor;
    }

    public void setIdConductor(int idConductor) {
        this.idConductor = idConductor;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNumLicencia() {
        return numLicencia;
    }

    public void setNumLicencia(String numLicencia) {
        this.numLicencia = numLicencia;
    }

    public int getCelular() {
        return celular;
    }

    public void setCelular(int celular) {
        this.celular = celular;
    }
    
    
    
}
