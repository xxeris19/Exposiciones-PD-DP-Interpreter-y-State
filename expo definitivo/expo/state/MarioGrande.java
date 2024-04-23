package state;
public class MarioGrande implements EstadoMario {
    public void obtenerHongo() {
        System.out.println("Mario ahora tiene caparazón");
    }

    public void obtenerFlor() {
        System.out.println("Mario ahora tiene fuego");
    }

    public void chocarEnemigo() {
        System.out.println("Mario ahora es pequeño");
    }
} 
