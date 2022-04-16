public class Main {
    public static void main(String[] args) {
        Coche miCoche = new Coche();
        miCoche.IncrementarPuerta();
        System.out.println(miCoche.puertas);
        int resultado;
        resultado = suma(10, 30, 50);
        System.out.println(resultado);
    }

    public static int suma(int a, int b, int c) {
        return a + b + c;
    }
}
    class Coche {
        public int puertas = 0;
        public void IncrementarPuerta() { this.puertas++; }
    }
