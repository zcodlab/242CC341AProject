package uni.isw.designpatterns.facade.gestionusuarios;
import java.util.List;
public class GestorDeUsuariosFacade implements IUsuario{
    private IUsuario usuarioDB;

    public GestorDeUsuariosFacade() {
        this.usuarioDB = new UsuarioDB();
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
        return usuarioDB.listarUsuario();        
    }
    
    public void listarUsuarios(){
        for(Usuario usuario: usuarioDB.listarUsuario())
            System.out.println(usuario.toString());
    }
    
}
