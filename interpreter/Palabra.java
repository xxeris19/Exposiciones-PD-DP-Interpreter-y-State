package interpreter;

public class Palabra implements Expresion {
    private String palabra;

    public Palabra(String palabra) {
        this.palabra = palabra;
    }

    @Override
    public String interpretar() {
        return palabra;
    }
}
