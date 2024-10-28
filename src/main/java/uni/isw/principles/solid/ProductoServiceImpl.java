package uni.isw.principles.solid;
import java.util.ArrayList;
import java.util.List;
//aplicando el principio Open/Close
public class ProductoServiceImpl implements ProductoService{
    private List<Producto> productos=new ArrayList<>();
    @Override
    public void agregarProducto(Producto producto) {
        productos.add(producto);
    }

    @Override
    public List<Producto> listarProductos() {
        return productos;
    }
    
    
    
    
    
}
