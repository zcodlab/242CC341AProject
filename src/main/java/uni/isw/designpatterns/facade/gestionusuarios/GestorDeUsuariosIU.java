package uni.isw.designpatterns.facade.gestionusuarios;
//MVC: View: capa de la vista
public class GestorDeUsuariosIU {
    public static void main(String[] args){
        GestorDeUsuariosFacade gestor=new GestorDeUsuariosFacade();
        gestor.listarUsuarios();
        System.out.println("Agregando Usuario");
        gestor.agregarUsuario(new Usuario("azapata","123456"));
        gestor.listarUsuarios();
        System.out.println("Eliminado Usuario");
        gestor.eliminarUsuario(4);
        gestor.listarUsuarios();
    }
}
