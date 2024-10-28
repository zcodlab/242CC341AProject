package uni.isw.designpatterns.observador;

public class CambioPrecioIU {
    public static void main(String[] args){
        Producto producto=new Producto("Laptop HP",1000.0);
        Cliente cliente1=new Cliente("Jose");
        Cliente cliente2=new Cliente("Maria");
        producto.agregarObservador(cliente1);
        producto.agregarObservador(cliente2);
        //asumiendo que cambia el estado de producto
        //debe notificar a las partes interesadas del cambio de precio
        producto.setPrecio(900.00);        
        producto.setPrecio(800.00);
    }
}
