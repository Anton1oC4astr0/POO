
package Unidad2;

public class CuentaAhorro{
    double saldo;
    double montoMax;
    String nombre;
    String numCuenta;
    double depositar;
    //Crear una cuenta con nombre, numero de cuenta, saldo inicial = 0, y monto disponible = 1000
    
    public CuentaAhorro(String nombre, String numCuenta){//Constructor
        saldo = 0;
        montoMax = 1000;
        this.nombre = nombre;
        this.numCuenta = numCuenta;
    }
    /*public CuentaAhorro(double saldo){//Sobrecargo de constructor
        this.saldo = saldo;
        montoMax = 0;
        nombre = "Sin asignar";
        numCuenta = "Sin asignar";
    }*/
    public CuentaAhorro(double saldo){//recibe y llama al constructor que tiene saldo, monto maximo, num de cuenta y nombre
        this(saldo, 0, "Sin número de cuenta");
    }
    public CuentaAhorro(double saldo, double montoMax, String numCuenta){//Sobrecargo de constructor
        this.saldo = saldo;
        this.montoMax = montoMax;
        this.numCuenta = numCuenta;
        this.nombre = "Sin asignar";
    }
    public void depositar(double cant){//Al poner un metodo entre parentesis quiere decir que recibe algo
        saldo += cant;
    }
    public String retirar(double cant){
        String msg = "";
        if ((saldo+montoMax)>= cant){
            saldo -= cant;
            msg = "Operación exitosa";
        }else{
            msg = "Fondos insuficientes";
        }
        return msg;
        
    }
    public void mostrarDatos(){
        System.out.println("Nombre: "+nombre);
        System.out.println("Número de cuenta: "+numCuenta);
        System.out.println("Saldo: "+saldo);
        System.out.println("Monto máximo: "+montoMax);
    }
}
