    import java.util.Scanner;
public class Q7 {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite o valor inicial de y: ");
        int y = scanner.nextInt();
        
        System.out.print(y + " ");
        
        while (y != 1) {
            if (y % 2 == 0) {
                y = y / 2;
            } else {
                y = 3 * y + 1;
            }
            
       System.out.print(y + " ");
        }
        
        System.out.println("\nA sequência terminou."); 
        scanner.close();
    }
    
}
