
package unidad2;

public class Figura {
    public float lado1;
    public float lado2;
    public float lado3;
    
    public Figura(){
    }

    public Figura(float lado1) {
        this.lado1 = lado1;
    }

    public Figura(float lado1, float lado2, float lado3) {
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
    }
    public float perimetro(){
        return lado1+lado2+lado3;
    }
}
