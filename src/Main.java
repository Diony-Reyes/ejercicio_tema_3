public class Main {
    public static void main(String[] args) {
        // Primera parte
        int sumResult = suma(10,20,30);
        System.out.println(sumResult);

        // Segunda parte
        Coche miCoche = new Coche();
        miCoche.agregarPuerta();
        miCoche.agregarPuerta();
        System.out.println(miCoche.puertas);
    }

    public static int suma(int firstValue, int secondValue, int thirdValue) {
        return firstValue + secondValue + thirdValue;
    }
}

class Coche {
    int puertas = 0;

    void agregarPuerta() {
        puertas++;
    }
}
