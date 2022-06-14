package Modelo;

public class Cliente {
  private int id;
  
  private int dui;
  
  private String nombre;
  
  private int telefono;
  
  private String direccion;
  
  public Cliente() {}
  
  public Cliente(int id, int dui, String nombre, int telefono, String direccion) {
    this.id = id;
    this.dui = dui;
    this.nombre = nombre;
    this.telefono = telefono;
    this.direccion = direccion;
  }
  
  public int getId() {
    return id;
  }
  
  public void setId(int id) {
    this.id = id;
  }
  
  public int getDui() {
    return dui;
  }
  
  public void setDui(int dui) {
    this.dui = dui;
  }
  
  public String getNombre() {
    return nombre;
  }
  
  public void setNombre(String nombre) {
    this.nombre = nombre;
  }
  
  public int getTelefono() {
    return telefono;
  }
  
  public void setTelefono(int telefeno) {
    this.telefono = telefeno;
  }
  
  public String getDireccion() {
    return direccion;
  }
  
  public void setDireccion(String direccion) {
    this.direccion = direccion;
  }
}
