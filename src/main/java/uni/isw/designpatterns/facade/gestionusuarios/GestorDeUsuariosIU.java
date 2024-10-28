package uni.isw.designpatterns.facade.gestionusuarios;
//MVC: View: capa de la vista
public class GestorDeUsuariosIU {
    public static void main(String[] args){
        GestorDeUsuariosFacade gestor=new GestorDeUsuariosFacade();
        gestor.listarUsuarios();        
    }
}
