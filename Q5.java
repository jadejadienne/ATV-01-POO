//Imprima os primeiros números da série de Fibonacci até passar de 100. A série de Fibonacci é a seguinte: 0, 1, 1, 2, 3, 5, 8, 13, 21, etc. Para calculá-la, o primeiro elemento vale 0, o segundo vale 1, e daí por diante. O n-ésimo elemento vale o (n-1)-ésimo elemento somado ao (n-2)- ésimo elemento (ex: 8 = 5 + 3).


public class Q5 {

     public static void main(String[] args) {
        int primeiro = 0;
        int segundo = 1;
        
        System.out.println("Série de Fibonacci até passar de 100:");
        System.out.print(primeiro + " " + segundo + " ");
        
        while (primeiro + segundo <= 100) {
            int proximo = primeiro + segundo;
            System.out.print(proximo + " ");
            
            primeiro = segundo;
            segundo = proximo;
        }
    }
}
