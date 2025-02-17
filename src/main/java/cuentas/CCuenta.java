package cuentas;

/**
 * Clase que representa una cuenta bancaria con operaciones de depósito y retiro.
 * @author TuNombre
 * @version 1.0
 * @since 2025
 */
public class CCuenta { 

    // 🔒 Atributos privados (Encapsulados)
    private String nombre; 
    private String cuenta; 
    private double saldo; 
    private double tipoInterés; 

    /**
     * Constructor vacío de la clase CCuenta
     */
    public CCuenta() {
    }

    /**
     * Constructor con parámetros
     * @param nom Nombre del titular
     * @param cue Número de cuenta
     * @param sal Saldo inicial
     * @param tipo Tipo de interés
     */
    public CCuenta(String nom, String cue, double sal, double tipo) { 
        this.nombre = nom;
        this.cuenta = cue;
        this.saldo = sal;
        this.tipoInterés = tipo;
    }

    /**
     * Método que devuelve el saldo actual de la cuenta.
     * @return saldo actual
     */
    public double estado() { 
        return saldo; 
    }

    /**
     * Método para retirar dinero de la cuenta.
     * @param cantidad Cantidad a retirar
     */
    public void retirar(double cantidad) { 
        try { 
            System.out.println("Retiro en cuenta: " + cantidad);
            if (cantidad <= 0) 
                throw new Exception("No se puede retirar una cantidad negativa");
            if (estado() < cantidad) 
                throw new Exception("No hay suficiente saldo");

            saldo -= cantidad; 
        } catch (Exception e) { 
            System.out.println(e.getMessage()); 
        }
    }

    /**
     * Método para ingresar dinero en la cuenta.
     * @param cantidad Cantidad a ingresar
     */
    public void ingresar(double cantidad) { 
        try { 
            System.out.println("Ingreso en cuenta: " + cantidad);
            if (cantidad < 0) 
                throw new Exception("No se puede ingresar una cantidad negativa");

            saldo += cantidad; 
        } catch (Exception e) { 
            System.out.println(e.getMessage()); 
        }
    }

    // Métodos Getters y Setters (Encapsulación)

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCuenta() {
        return cuenta;
    }

    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getTipoInterés() {
        return tipoInterés;
    }

    public void setTipoInterés(double tipoInterés) {
        this.tipoInterés = tipoInterés;
    }
}
