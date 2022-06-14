package Modelo;

public class login {
  private int id;
  
  private String nombre;
  
  private String apellido;
  
  private String tipo_usuario;
  
  private String usuario;
  
  private String password;
  
  public login() {}
  
  public login(int id, String nombre, String apellido, String tipo_usuario, String usuario, String password) {
    this.id = id;
    this.nombre = nombre;
    this.apellido = apellido;
    this.tipo_usuario = tipo_usuario;
    this.usuario = usuario;
    this.password = password;
  }
  
  public int getId() {
    return id;
  }
  
  public void setId(int id) {
    this.id = id;
  }
  
  public String getNombre() {
    return nombre;
  }
  
  public void setNombre(String nombre) {
    this.nombre = nombre;
  }
  
  public String getApellido() {
    return apellido;
  }
  
  public void setApellido(String apellido) {
    this.apellido = apellido;
  }
  
  public String getTipo_usuario() {
    return tipo_usuario;
  }
  
  public void setTipo_usuario(String tipo_usuario) {
    this.tipo_usuario = tipo_usuario;
  }
  
  public String getUsuario() {
    return usuario;
  }
  
  public void setUsuario(String usuario) {
    this.usuario = usuario;
  }
  
  public String getPassword() {
    return password;
  }
  
  public void setPassword(String password) {
    this.password = password;
  }
}