package cuentas;
/**
 * Esta clase es la que almacena los datos de la cuenta bancaria
 * en cuestión.
 * @author Fer
 * @version 
 */

public class CCuenta {

    /**
     * @return El nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre método setter de nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return  cuenta
     */
    public String getCuenta() {
        return cuenta;
    }

    /**
     * @param cuenta método setter de cuenta.
     */
    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    /**
     * @return  saldo
     */
    public double getSaldo() {
        return saldo;
    }

    /**
     * @param saldo método setter de saldo.
     */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    /**
     * @return  tipoInterés
     */
    public double getTipoInterés() {
        return tipoInterés;
    }

    /**
     * @param tipoInterés método setter de tipoInterés.
     */
    public void setTipoInterés(double tipoInterés) {
        this.tipoInterés = tipoInterés;
    }

/**
 *  variable nombre para el nombre del usuario
 * cuenta para la cuenta corriente,
 * saldo para el saldo en cuenta y
 * tipo de interés para el tipo de interés que se aplica.
 */
    private String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInterés;

    public CCuenta()
    {
    }

    /**
     * Método constructor
     * @param nom  para el nombre del usuario.
     * @param cue para la cuenta corriente.
     * @param sal para el saldo en cuenta.
     * @param tipo para el tipo de interés que se aplica.
     */
    public CCuenta(String nom, String cue, double sal, double tipo)
    {
        nombre =nom;
        cuenta=cue;
        saldo=sal;
    }

    /**
     * 
     * @return el saldo de la cuenta.
     */
    public double estado()
    {
        return getSaldo();
    }
    
    /**
     * Método para ingresar .
     * @param cantidad
     * @throws Exception 
     */

    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        setSaldo(getSaldo() + cantidad);
    }

    /**
     * Método para retirar dinero.
     * @param cantidad
     * @throws Exception 
     */
    public void retirar(double cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (estado()< cantidad)
            throw new Exception ("No se hay suficiente saldo");
        setSaldo(getSaldo() - cantidad);
    }
}
