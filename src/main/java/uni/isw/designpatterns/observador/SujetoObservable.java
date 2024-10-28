package uni.isw.designpatterns.observador;

public interface SujetoObservable {
    public void agregarObservador(Observador observador);
    public void eliminarObservador(Observador observador);
    public void notificar();
}
