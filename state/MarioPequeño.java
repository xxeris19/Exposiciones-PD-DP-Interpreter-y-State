package state;
class MarioPequeño implements EstadoMario {
    public void obtenerHongo() {
        System.out.println("Mario ahora es grande");
    }

    public void obtenerFlor() {
        System.out.println("Mario ahora tiene fuego");
    }

    public void chocarEnemigo() {
        System.out.println("Mario ha muerto");
    }
}
