package cuentas;

/**
 * Clase principal que ejecuta operaciones sobre la cuenta bancaria.
 */
public class Main {
    public static void main(String[] args) {
        // 🔹 Cambio de nombre de miCuenta a cuenta1
        CCuenta cuenta1; 
        double saldoActual; 

        // 📌 Crear una cuenta con datos de prueba
        cuenta1 = new CCuenta("Antonio López", "1000-2365-85-1230456789", 2500, 0); 

        // 📌 Mostrar saldo inicial
        saldoActual = cuenta1.estado(); 
        System.out.println("El saldo actual es: " + saldoActual);

        // 🔹 Llamamos al método operaciones() para realizar ingresos y retiros
        operaciones(cuenta1);

        // 📌 Mostrar saldo final
        saldoActual = cuenta1.estado();
        System.out.println("El saldo final es: " + saldoActual);
    }

    /**
     * Método que realiza operaciones de retiro e ingreso en la cuenta.
     * @param cuenta1 Cuenta en la que se operará.
     */
    public static void operaciones(CCuenta cuenta1) {
        cuenta1.retirar(2300);
        cuenta1.ingresar(685);
    }
}
