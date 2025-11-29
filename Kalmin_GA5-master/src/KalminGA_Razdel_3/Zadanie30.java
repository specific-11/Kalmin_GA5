/*
 * To change this license header, choose License Headers in Project Properties.
 * НЕДОДЕЛАНО
 * and open the template in the editor.
 */
package KalminGA_Razdel_3;
import java.util.Scanner;
/**
 *
 * @author student
 */
public class Zadanie30 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Введенную строку вывести, расположив в каждой подстроке по 5 цифр.");
          Scanner sc5 = new Scanner(System.in);
       System.out.println("Введите числа:");
       String counterWord5 = sc5.nextLine();
       System.out.println("Спасибо! Вы ввели число " + counterWord5);
      System.out.println(counterWord5.substring(1));
      System.out.println(counterWord5.substring(2));
      System.out.println(counterWord5.substring(3));
      System.out.println(counterWord5.substring(4));
      System.out.println(counterWord5.substring(5));
      System.out.println(counterWord5.substring(6));
       sc5.close();
   }
}
