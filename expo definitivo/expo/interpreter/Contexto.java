import java.util.ArrayList;
import java.util.List;

public class Contexto {
    private int experiencia;
    private List<String> puestosPermitibles;

    public Contexto(int experiencia, String ... puestosPermitidos) {
        this.experiencia = experiencia;
        this.puestosPermitibles = new ArrayList<>();
        for (String puesto : puestosPermitidos) {
            puestosPermitibles.add(puesto);
        }
    }

    public int getExperiencia() {
        return this.experiencia;
    }

    public List<String> getPuestosPermitidos() {
        return this.puestosPermitibles;
    }
}
