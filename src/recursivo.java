import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class recursivo {
    public static BufferedReader bufer=new BufferedReader(new InputStreamReader(System.in));
    public static String dato;
    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
        System.out.println("El valor de y es: ");
        int y;
        dato = bufer.readLine();
        y = Integer.parseInt(dato);

        System.out.println("El valor de z es: ");
        int z;
        dato = bufer.readLine();
        z = Integer.parseInt(dato);

        int esIgual = sumaDeCuadrados(y, z);
        System.out.println("La suma de los cuadrados es: " + esIgual);
    }
        public static int sumaDeCuadrados(int y, int z) {
        if (y > z) {
            return 0;
        } else {
            int actual = y * y;
            return actual + sumaDeCuadrados(y + 1, z);
        }
    }
    }