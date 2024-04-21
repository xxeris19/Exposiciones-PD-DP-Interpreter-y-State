package interpreter;

public class Main {
    public static void main(String[] args) {
        Expresion expresion = new Saludar(new Palabra("Hola "),new Palabra("Mundo"));

        String resultado = expresion.interpretar();
        System.out.println(resultado);
    }
}
