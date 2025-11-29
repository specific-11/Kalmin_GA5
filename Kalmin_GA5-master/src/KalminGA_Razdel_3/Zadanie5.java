/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package KalminGA_Razdel_3;
import java.util.Scanner;
/**
 *
 * @author student
 */
public class Zadanie5 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    System.out.println("Сколько раз в тексте встречается заданное слово (слова разделены пробелами).");
    Scanner sc5 = new Scanner(System.in); 
    System.out.println("Введите Предложение, содержащее friend N кол-во раз:"); 
    String counterWord = sc5.nextLine();
    
    String[] words5 = counterWord.split(" ");
    int count5 = 0;
    
    for (String word5:words5) {
        if (word5.equals("friend")) {
            count5++;
        }
    }
     sc5.close();
    System.out.println("Слово 'friend' встречается " + count5 + " раз(а)");
    }
}
