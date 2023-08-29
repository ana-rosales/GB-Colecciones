
package arrlist;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author paula
 */
public class main {

    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        ArrayList<Integer> nums = new ArrayList<>();
        Integer num, sum = 0;
        double prom;
        boolean fin = false;
        
        while(!fin){
            System.out.print("\nInserte un numero: ");
            num = ent.nextInt();
            if (num != -99) {
                nums.add(num);
                sum += num;
            } else {
                fin = true;
            }
        }
        
        prom = sum/nums.size();
        
        System.out.println("\n\tSe insertaron " + nums.size() + " numeros.");
        System.out.println("\n\tLa suma de esos numeros es " + sum + ".");
        System.out.println("\n\tY el promedio " + prom + ".");
        
        
        
        
    }
    
}
