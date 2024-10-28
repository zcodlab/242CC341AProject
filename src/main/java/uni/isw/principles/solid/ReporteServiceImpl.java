package uni.isw.principles.solid;

import java.util.List;
//aplicando el principio Open/Close
public class ReporteServiceImpl implements ReporteService{

    @Override
    public void generarReporte(List<Producto> productos) {
        System.out.println("Reporte de Productos:");
        for(Producto producto: productos )
            System.out.println("- "+ producto.getNombre()+"; $"+ producto.getPrecio());
    }
    
}
