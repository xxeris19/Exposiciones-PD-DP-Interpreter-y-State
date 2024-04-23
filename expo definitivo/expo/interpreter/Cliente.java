public class Cliente {
    static Empleado empleado1, empleado2, empleado3, empleado4;
    static Empleado empleado;
    static boolean resultado;
    static ConstructorExpresion constructor = new ConstructorExpresion();
    //Minimo de 10 años de experiencia y el puesto del empleado debe ser o G2 o G3
    static Contexto contexto;
    public static void main(String[] args) {
        contexto = new Contexto(10, "Full Stack", "Backend developer");
        inicializarEmpleados();
        validarCadaEmpleado();
        validarReglasSimples();
        validarReglasComplejas();

    }

    private static void inicializarEmpleados() {
        empleado1 = new EmpleadoIndividual(5, "QA Engineer");
        empleado2 = new EmpleadoIndividual(10, "Full Stack");
        empleado3 = new EmpleadoIndividual(15, "Backend developer");
        empleado4 = new EmpleadoIndividual(1, "Tester");
    }

    private static void validarCadaEmpleado() {
        System.out.println("Empleado1 elegible para promocion? " + empleado1.interpretar(contexto));
        System.out.println("Empleado2 elegible para promocion? " + empleado2.interpretar(contexto));
        System.out.println("Empleado3 elegible para promocion? " + empleado3.interpretar(contexto));
        System.out.println("Empleado elegible para promocion? " + empleado4.interpretar(contexto));
    }

    private static void validarReglasSimples() {
        System.out.println("\nEs elegible empleado1 o empleado3 para promocion?");
        empleado = constructor.validarExpresion(empleado1, "Or", empleado2);
        resultado = empleado.interpretar(contexto);
        System.out.println(resultado);
    }

    private static void validarReglasComplejas() {
        System.out.println("Es empleado1 y alguno entre empleado2, 3, 4 elegibles para promocion?");
        empleado = constructor.validarExpresionCompleja(empleado1, empleado2, empleado3, empleado4);
        resultado = empleado.interpretar(contexto);
        System.out.println(resultado);
    }
}
