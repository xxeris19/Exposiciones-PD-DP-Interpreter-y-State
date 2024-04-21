package interpreter;

public class Saludar implements Expresion{

    private Expresion regularExpresion1;
    private Expresion regularExpresion2;
    
    public Saludar(Expresion regExpresion1, Expresion regExpresion2) {
        this.regularExpresion1 = regExpresion1;
        this.regularExpresion2 = regExpresion2;
    }
    
    @Override
    public String interpretar() {
        return regularExpresion1.interpretar() + regularExpresion2.interpretar();
    }
    
}
