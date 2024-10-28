package uni.isw.designpatterns.facade.gestionusuarios;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class UsuarioDB implements IUsuario{
    private Connection conectar() throws SQLException{
        return DriverManager.getConnection("jdbc:postgresql://137.184.120.127:5432/Libreria",
        "modulo4","modulo4");        
    }

    @Override
    public void agregarUsuario(Usuario usuario) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public String buscarUsuario(int id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void eliminarUsuario(int id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<Usuario> listarUsuario() {
        List<Usuario> listaUsuarios=new ArrayList<>();
        try(Connection conn=conectar()){
            String sql="select id,username,password from usuarios";
            try(PreparedStatement stmt=conn.prepareStatement(sql)){
                ResultSet result=stmt.executeQuery();
                while(result.next()){
                    Usuario usuario=new Usuario(result.getInt("id"),result.getString("username"),result.getString("password"));
                    listaUsuarios.add(usuario);
                }
                result.close();
                stmt.close();
            }
        }catch(SQLException e){
            e.printStackTrace();
        }
        return listaUsuarios;
    }
    
    
}
