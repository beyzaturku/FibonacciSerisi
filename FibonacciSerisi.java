
package fibonacciserisi;
import java.util.*;
public class FibonacciSerisi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen dizi uzunluğunu giriniz:");
        int n = input.nextInt();
        
        int birinciEleman =0;
        int ikinciEleman=1;
        int ucuncuEleman = birinciEleman + ikinciEleman;
        int toplam =0;
        System.out.print(birinciEleman + " ");
        System.out.print(ikinciEleman + " ");
        
        for(int i=2; i<=n; i++){
            toplam = birinciEleman + ikinciEleman;
            birinciEleman = ikinciEleman;
            ikinciEleman = toplam;
            System.out.print(toplam + " ");
            
        }
        
    }
    
}