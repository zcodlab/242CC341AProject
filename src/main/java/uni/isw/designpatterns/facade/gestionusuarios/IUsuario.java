package uni.isw.designpatterns.facade.gestionusuarios;

import java.util.List;

public interface IUsuario {
    public void agregarUsuario(Usuario usuario);
    public String buscarUsuario(int id);    
    public void eliminarUsuario(int id);
    public List<Usuario> listarUsuario();    
}

