public class ExpresionO implements Empleado{
    private Empleado empleado1;
    private Empleado empleado2;

    public ExpresionO(Empleado empleado1, Empleado empleado2) {
        this.empleado1 = empleado1;
        this.empleado2 = empleado2;
    }

    @Override
    public boolean interpretar(Contexto contexto) {
        return empleado1.interpretar(contexto) ||
                empleado2.interpretar(contexto);
    }
}
