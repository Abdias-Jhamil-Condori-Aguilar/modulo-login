import java.util.Date;

public class Usuario extends Persona{
    String usuario;
    String contraseña;

    public Usuario(String nombre, String primerApellido, String segundoApellido, String ci, Date fechaNacimiento, String direccion, int celular, int telefono, String email, String usuario, String contraseña) {
        super(nombre, primerApellido, segundoApellido, ci, fechaNacimiento, direccion, celular, telefono, email);
        this.usuario = usuario;
        this.contraseña = contraseña;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "usuario='" + usuario + '\'' +
                ", contraseña='" + contraseña + '\'' +
                '}';
    }
}
