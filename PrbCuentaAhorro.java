
package Unidad2;


public class PrbCuentaAhorro{

    public static void main(String[] args){
        CuentaAhorro c, c1, c2;//Declaración de la variable c 
        c = new CuentaAhorro("Juanito", "12345-ABC");//Creación del objeto
        c.mostrarDatos();
        System.out.println(c.retirar(500));
        c.mostrarDatos();
        c.depositar(2000);
        c.mostrarDatos();
        c1 = new CuentaAhorro(2850.60);
        System.out.println("C1");
        System.out.println("*************************************************");
        c1.mostrarDatos();
        c2 = new CuentaAhorro(1789.30, 200, "458ABCD");
        System.out.println("*************************************************");
        c2.mostrarDatos();
        System.out.println("*************************************************");
        c2.depositar(100);
        c2.mostrarDatos();
    }
    
}
