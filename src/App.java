public class App {
    public static void main(String[] args) throws Exception {
        /*
         * Crear una instancia de la clase Repaso.
         * 
         * Una 'instancia' es un objeto concreto creado a partir de una clase.
         * En este caso, estamos creando un nuevo objeto llamado 'dataStructuresPrep' a
         * partir
         * de la clase 'Repaso'. Cada instancia de una clase tiene sus propios
         * atributos y métodos, lo que significa que podemos usar 'dataStructuresPrep'
         * para
         * acceder a los métodos definidos dentro de la clase 'Repaso'.
         */
        DataStructuresPrep dataStructuresPrep = new DataStructuresPrep();

        /*
         * Usar la instancia 'dataStructuresPrep' para llamar al método
         * 'subtractWithoutSubtracting'.
         * 
         * Ahora que tenemos una instancia de 'Repaso', podemos usarla para llamar a sus
         * métodos.
         * Aquí, llamamos al método 'subtractWithoutSubtracting', pasando 15 y 5 como
         * argumentos.
         * Este método está diseñado para restar el segundo número del primero sin usar
         * el
         * operador de resta tradicional. Es un buen ejercicio para entender cómo
         * podemos
         * realizar operaciones básicas de manera creativa en programación.
         */
        int resultado = dataStructuresPrep.subtractAlgorithm(15, 5);
        int mult = dataStructuresPrep.multiplyAlgorithm(5, 3);
        int div = dataStructuresPrep.divideWAlgorithm(10, 2);
        boolean per = dataStructuresPrep.isPerfectNumber(28);
        int fac = dataStructuresPrep.getFactorial(5);
        int maf = dataStructuresPrep.findMaximum(new int[]{1, 2, 3, 4, 5, 6, 7, 8});
        int pow = dataStructuresPrep.powerAlgorithm(2, 3);
        boolean pri = dataStructuresPrep.isPrime(5);
        int dig = dataStructuresPrep.countDigits(12345);
        /*
         * Imprimir el resultado de la operación.
         * 
         * Finalmente, imprimimos el resultado de la operación a la consola. Esto nos
         * permite
         * ver el resultado de nuestro método 'subtractWithoutSubtracting'. En este
         * ejemplo,
         * estamos esperando que el resultado sea 10, ya que 15 menos 5 es igual a 10.
         * Esta línea demuestra cómo podemos interactuar con los métodos de nuestras
         * instancias
         * y usar los resultados de sus operaciones en otras partes de nuestro código,
         * como
         * parte de mensajes de salida o en lógicas de decisión más complejas.
         */
        System.out.println("El resultado de subtractAlgorithm  es: " + resultado);
        System.out.println("El resultado de subtractAlgorithm  es: " + mult);
        System.out.println("El resultado de divideWAlgorithm  es: " + div);
        System.out.println("El resultado de isPerfectNumber  es: " + per);
        System.out.println("El resultado de getFactorial  es: " + fac);
        System.out.println("El resultado de findMaximum  es: " + maf);
        System.out.println("El resultado de powerAlgorithm  es: " + pow);
        System.out.println("El resultado de isPrime  es: " + pri);
        System.out.println("El resultado de countDigits  es: " + dig);

        


    }
}
