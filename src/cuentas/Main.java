package cuentas;

/**
 *
 * @author saram
 */
public class Main {

    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        operativa_cuenta();

        /*CCuenta cuenta1; //Otra opción
        double saldoActual;
        cuenta1 = new CCuenta("Antonio López", "1000-2365-85-1230456789", 2500, 0);
        operativa_cuenta(cuenta1); */
    }

    /**
     * operativa_cuenta contiene los atributos cuenta1 (CCuenta), saldoActual (double) y cantidad (float)
     * Se creará una cuenta con el nombre de la persona titular, su número, el saldo y el tipo de interés
     */
    public static void operativa_cuenta() { //también vale private, le añado double saldoActual; y en los paréntesis CCuenta cuenta1
        CCuenta cuenta1;  //Si hubiera hecho operativa_cuenta de la otra manera, metería entre los () también float cantidad
        double saldoActual;
        float cantidad;

        cuenta1 = new CCuenta("Antonio López", "1000-2365-85-1230456789", 2500, 0);

        saldoActual = cuenta1.estado();
        System.out.println("El saldo actual es " + saldoActual);

        try {
            cuenta1.retirar(2300);
        } catch (Exception e) {
            System.out.print("Fallo al retirar");
        }
        try {
            System.out.println("Ingreso en cuenta");
            cuenta1.ingresar(695);
        } catch (Exception e) {
            System.out.print("Fallo al ingresar");
        }
    }
}
