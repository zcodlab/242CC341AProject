package uni.isw.principles.solid;
//Principio de segregacion de la Interfaz
import java.util.List;
public interface ReporteService {
    public void generarReporte(List<Producto> productos);
}
