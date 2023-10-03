public class Q6 {
  
        public static void main(String[] args) {
            for (int i = 1; i <= 10; i++) {
                long fatorial = calculaFatorial(i);
                System.out.println("O fatorial de " + i + " é " + fatorial);
            }
        }
    
        public static long calculaFatorial(int n) {
            if (n == 0 || n == 1) {
                return 1;
            } else {
                long resultado = 1;
                for (int i = 2; i <= n; i++) {
                    resultado *= i;
                }
                return resultado;
            }
        }

}
