public class Main {

    public static void main(String[] args) {
        int numPrimos = 0;
        int num1 = 2; // Se inicia en 2 ya que es el primer numero primo, si se usa el 0 tendra el mismo resultado

        // Mientras la cantidad de numeros primos sea diferente de 10001 numPrimos seguira calculando,
        // si es numero primo o no, e imprimira cada numero primo
        while (numPrimos != 10001)
        {
            if(esPrimo(num1))
            {
                numPrimos++;
                System.out.println(num1 + " es primo");
            }
            num1++;
        }
    }


    // Calculamos si un numero es primo, al dividir entre 2, 3, 5, 7, 11 7 el modulo = 0, no es numero primo
    public static boolean esPrimo(int n)
    {
        for(int i = 2; i < n; i++)
        {
            if(n % i == 0)
            {
                return false;
            }
        }
        return true;
    }
}
