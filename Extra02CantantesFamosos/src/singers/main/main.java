
package singers.main;

import singers.services.SingerService;

/**
 *
 * @author paula
 */
public class main {

    public static void main(String[] args) {
        
        SingerService ss = new SingerService();
        ss.showSingers();
        boolean stay;
        int opc;
        do {      
            stay = true;
            System.out.println("\nMENU\n");
            System.out.println("1. New Singer.");
            System.out.println("2. Show Singers.");
            System.out.println("3. Delete Singers.");
            System.out.println("4. Exit.");
            System.out.print("Choose an index from the menu: ");
            opc = ss.selection();
            
            switch(opc){
                case 1:
                    ss.newSinger();
                    break;
                case 2:
                    ss.showSingers();
                    break;
                case 3:
                    ss.deleteSinger();
                    break;
                case 4:
                    System.out.println();
                    System.out.print("Quit? Y/N: ");
                    stay = !ss.cont();
                    break;
                default:
                    System.out.println("Please, choose a valid index.");
            }
        } while (stay);
        ss.showSingers();
        
    }
    
}
