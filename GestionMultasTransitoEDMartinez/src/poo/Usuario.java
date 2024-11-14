package poo;

/**
 *
 * @author capri
 */
public class Usuario {
    private int idUsuario;
    private String nombre;
    private String tipoUsuario;
    private String username;
    private String password;
    
    
    public Usuario (){
        
    } 

    public Usuario(int idUsuario, String nombre, String tipoUsuario, String username, String password) {
        this.idUsuario = idUsuario;
        this.nombre = nombre;
        this.tipoUsuario = tipoUsuario;
        this.username = username;
        this.password = password;
    }

   

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipoUsuario() {
        return tipoUsuario;
    }

    public void setTipoUsuario(String tipoUsuario) {
        this.tipoUsuario = tipoUsuario;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    
    
    
     
    
}
