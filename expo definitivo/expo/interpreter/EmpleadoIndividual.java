public class EmpleadoIndividual implements Empleado{
    private int experiencia;
    private String puesto;

    public EmpleadoIndividual(int experiencia, String puesto) {
        this.experiencia = experiencia;
        this.puesto = puesto;
    }

    @Override
    public boolean interpretar(Contexto contexto) {
        if (experiencia >= contexto.getExperiencia() && contexto.getPuestosPermitidos().contains(puesto)) {
            return true;
        }
        return false;
    }
}
