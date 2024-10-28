package uni.isw.designpatterns.observador;

public class Cliente implements Observador  {
    private String nombre;

    public Cliente(String nombre) {
        this.nombre = nombre;
    }
    
    @Override
    public void actualizar(Producto producto) {
        System.out.println("Hola "+ nombre + " el nuevo precio del "
        + producto.getNombre() + " es:"+ producto.getPrecio());
    }
    
}
