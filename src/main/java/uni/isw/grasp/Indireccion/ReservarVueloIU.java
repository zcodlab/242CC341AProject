package uni.isw.grasp.Indireccion;

public class ReservarVueloIU {
    private ReservarVueloController reservaManager;    
    
    public static void main(String[] args) {                
        ReservarVueloIU reservaIU=new ReservarVueloIU();
        reservaIU.realizarReserva();
    }
    private void realizarReserva(){
        reservaManager = new ReservarVueloController();
        Vuelo vuelo = new Vuelo("Lima", "Arequipa");
        // El usuario no interactúa directamente con el vuelo
        reservaManager.realizarReserva(vuelo);
        
    }
}
