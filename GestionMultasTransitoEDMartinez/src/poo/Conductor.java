package poo;

/**
 *
 * @author capri
 */
public class Conductor {
    private int idConductor;
    private String nombre;
    private String numLicencia;
    private String correo;
    private Long celular;
    
    public Conductor(){
        
    }

    public Conductor(int idConductor, String nombre, String numLicencia, Long celular,String correo) {
        this.idConductor = idConductor;
        this.nombre = nombre;
        this.numLicencia = numLicencia;
        this.celular = celular;
        this.correo = correo;
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

    public Long getCelular() {
        return celular;
    }

    public void setCelular(Long celular) {
        this.celular = celular;
    }

  

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }
    
    
    
}
