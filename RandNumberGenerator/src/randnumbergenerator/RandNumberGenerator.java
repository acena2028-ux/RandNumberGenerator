/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package randnumbergenerator;
import java.util.Random;
/**
 *
 * @author acena2028
 */
public class RandNumberGenerator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // Part 1 - Phone Number Generator
        System.out.println("Your phone number:");
        // create new Random object
        Random random = new Random();
        // generate first 3 digits individually (values 0-7 allowed) and concatenate
        // print without adding a new line
        System.out.print("" + random.nextInt(8) + random.nextInt(8) + random.nextInt(8));
        // generate middle 3 digits (values 0-655 allowed) and pad values with length less than 3 with 0's
        var middle = String.format("%03d", (random.nextInt(656)));
        // print on same line
        System.out.print("-" + middle);
        // generate last 4 digits (values 0-1000 allowed) and pad values with length less than 4 with 0's
        var last = String.format("%04d", (random.nextInt(10000)));
        // print on same line
        System.out.println("-" + last + "\n");
        
        
        // Part 2 - 6-sided Die Generator
        // reuse Random object from Phone Number Generator
        System.out.println("Your die roll:");
        System.out.println(random.nextInt(6) + 1);
    }
    
}
