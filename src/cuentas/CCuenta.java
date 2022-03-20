package cuentas;

/**
 *
 * @author saram
 * Se trata de una cuenta bancaria donde se recoge la información del titular, el saldo y el interés
 */
public class CCuenta {

    /**
     * Atributos de la cuenta bancaria (nombre, cuenta, saldo y tipoInterés)
     */
    private String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInterés;

    /**
     *
     * @return nombre de la persona titular de la cuenta bancaria
     */
    public String getNombre() {
        return nombre;
    }

    /**
     *
     * @param nombre de la persona titular, el cual se pasa como parámetro
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     *
     * @return número de la cuenta
     */
    public String getCuenta() {
        return cuenta;
    }

    /**
     *
     * @param cuenta número de cuenta pasado como parámetro
     */
    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    /**
     *
     * @return saldo de la cuenta
     */
    public double getSaldo() {
        return saldo;
    }

    /**
     *
     * @param saldo el saldo total pasado como parámetro
     */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    /**
     *
     * @return el tipo de interés de la cuenta
     */
    public double getTipoInterés() {
        return tipoInterés;
    }

    /**
     *
     * @param tipoInterés, pasado como parámetro
     */
    public void setTipoInterés(double tipoInterés) {
        this.tipoInterés = tipoInterés;
    }

    /**
     * Constructor vacío
     */
    public CCuenta() {
    }

    /**
     * Constructor con 4 parámetros
     * @param nom, que es un String con el nombre de la persona titular de la cuenta bancaria
     * @param cue, String con el número de la cuenta
     * @param sal, double con el saldo de la cuenta actual
     * @param tipo, double con el tipo de interés de la cuenta
     */
    public CCuenta(String nom, String cue, double sal, double tipo) {
        nombre = nom;
        cuenta = cue;
        saldo = sal;
    }

    /**
     *
     * @return
     */
    public double estado() {
        return saldo;
    }

    /**
     *
     * @param cantidad que se ingresa en la cuenta
     * @throws Exception si se introduce una cantidad menor que 0 (negativa)
     */
    public void ingresar(double cantidad) throws Exception {
        if (cantidad < 0) {
            throw new Exception("No se puede ingresar una cantidad negativa");
        }
        saldo = saldo + cantidad;
    }

    /**
     *
     * @param cantidad que se retira de la cuenta
     * @throws Exception si se retira una cantidad menor o igual que 0 (negativa)
     */
    public void retirar(double cantidad) throws Exception {
        if (cantidad <= 0) {
            throw new Exception("No se puede retirar una cantidad negativa");
        }
        if (estado() < cantidad) {
            throw new Exception("No se hay suficiente saldo");
        }
        saldo = saldo - cantidad;
    }

}
