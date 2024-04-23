public class ExpresionNo implements Empleado{
    private Empleado empleado;

    public ExpresionNo(Empleado empleado) {
        this.empleado = empleado;
    }

    @Override
    public boolean interpretar(Contexto contexto) {
        return !empleado.interpretar(contexto);
    }
}
