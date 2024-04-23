public class ConstructorExpresion {
    public Empleado validarExpresion(Empleado empleado1, String operador, Empleado empleado2) {
        switch (operador.toLowerCase()) {
            case "or":
                return new ExpresionO(empleado1, empleado2);
            case "and":
                return new ExpresionY(empleado1, empleado2);
            case "not":
                return new ExpresionNo(empleado1);
            default:
                System.out.println("Operador invalido" + operador);
                return new ExpresionInvalida();
        }
    }

    public Empleado validarExpresionCompleja(Empleado empleado1, Empleado empleado2, Empleado empleado3, Empleado empleado4) {
        Empleado primeraFase = new ExpresionO(empleado3, empleado4);
        Empleado segundaFase = new ExpresionO(empleado2, primeraFase);
        Empleado ultimaFase = new ExpresionY(empleado1, segundaFase);

        return ultimaFase;
    }
}
