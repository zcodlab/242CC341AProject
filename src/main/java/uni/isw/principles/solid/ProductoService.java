package uni.isw.principles.solid;
//2. Principio de Segregacion de la Interfaz
import java.util.List;
public interface ProductoService {
    public void agregarProducto(Producto producto);
    public List<Producto> listarProductos();
}
