
package Unidad2;

public class Banco{
    final private String nomBanco;
    double capital = 5.2;
    public String direcci�n = "Sin asignar";
    public Banco(String nomBanco){
        this.nomBanco = nomBanco;
    }
    public Banco(String nombre, double capital, String direcci�n){
        nomBanco = nombre;
        this.capital = capital;
        this.direcci�n = direcci�n;
    }
    public void mostrarInformaci�n(){
        System.out.println("Nombre del banco: " + nomBanco);
        System.out.println("Capital: " + capital);
        System.out.println("Direcci�n: " + direcci�n);
    }
}
