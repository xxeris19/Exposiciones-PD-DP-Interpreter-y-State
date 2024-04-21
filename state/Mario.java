package state;
public class Mario {
    private EstadoMario estado;

    public Mario() {
        estado = new MarioPequeño();
    }

    public void cambiarEstado(EstadoMario estado) {
        this.estado = estado;
    }

    public void obtenerHongo() {
        estado.obtenerHongo();
    }

    public void obtenerFlor() {
        estado.obtenerFlor();
    }

    public void chocarEnemigo() {
        estado.chocarEnemigo();
    }
}
