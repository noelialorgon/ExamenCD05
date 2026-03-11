package examen_cd_ud05;

public class Main {

    public static void main(String[] args) {
        Examen5 cuentaExamen;
        double saldoActual;

        operativa_cuenta_examen(10.0F);
    }

    private static void operativa_cuenta_examen(float cantidad) {
        Examen5 cuentaExamen;
        double saldoActual;
        cuentaExamen = new Examen5("Antonio López", "1000-2365-85-1230456789", 2500, 0);
        saldoActual = cuentaExamen.estado();
        System.out.println("El saldo actual es" + saldoActual);
        try {
            cuentaExamen.retirar(2300);
        } catch (Exception e) {
            System.out.print("Fallo al retirar");
        }
        try {
            System.out.println("Ingreso en cuenta");
            cuentaExamen.ingresar(695);
        } catch (Exception e) {
            System.out.print("Fallo al ingresar");
        }
    }
}
