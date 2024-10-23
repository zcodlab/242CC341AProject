package uni.isw.grasp.Indireccion;

// Clase intermediaria que gestiona las reservas
public class ReservarVueloController {
    public void realizarReserva(Vuelo vuelo) {
        // Aquí podríamos añadir lógica adicional como validar la disponibilidad
        vuelo.reservar();
    }
}
