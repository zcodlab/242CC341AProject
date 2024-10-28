package uni.isw.principles.solid;
//aplicando inversion de dependencia
import java.util.List;
public class SolidIU {
    public static void main(String[] args){
        ProductoService prodService=new ProductoServiceImpl();
        ReporteService repService=new ReporteServiceImpl();
        //agregando producto
        prodService.agregarProducto(new Producto("Laptop HP",1000.0));
        prodService.agregarProducto(new Producto("Smartphone",500.0));
        prodService.agregarProducto(new Producto("Tablet",300.0));
        
        //Generar reporte
        List<Producto> productos=prodService.listarProductos();
        repService.generarReporte(productos);
    }
    
}
