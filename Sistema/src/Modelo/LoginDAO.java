package Modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class LoginDAO {
  Connection con;
  
  PreparedStatement ps;
  
  ResultSet rs;
  
  Conexion cn = new Conexion();
  
  public login log(String usuario, String password) {
    login l = new login();
    String sql = "SELECT * FROM usuarios WHERE usuario = ? AND password = ?";
    try {
     con = cn.getConnection();
      ps = con.prepareStatement(sql);
      ps.setString(1, usuario);
      ps.setString(2, password);
      rs = ps.executeQuery();   
      if (rs.next()) {
        l.setId(rs.getInt("id"));
        l.setNombre(rs.getString("nombre"));
        l.setApellido(rs.getString("apellido"));
        l.setTipo_usuario(rs.getString("tipo_usuario"));
        l.setUsuario(rs.getString("usuario"));
        l.setPassword(rs.getString("password"));
      } 
    } catch (SQLException e) {
      System.out.println(e.toString());
    } 
    return l;
  }
}
