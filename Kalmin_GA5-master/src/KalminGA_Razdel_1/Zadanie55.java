/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package KalminGA_Razdel_1;

public class Zadanie55 {
    public static void main(String[] args) {
        int[] heights5 = new int[25];
        
        for (int i = 0; i < heights5.length; i++) {
            heights5[i] = (int) (Math.random() * 51) + 140;
        }
        
        System.out.println("Рост учеников (см):");
        for (int i = 0; i < heights5.length; i++) {
            System.out.println("Ученик " + (i + 1) + ": " + heights5[i] + " см");
        }
        
        int maxHeight = heights5[0];
        for (int i = 1; i < heights5.length; i++) {
            if (heights5[i] > maxHeight) {
                maxHeight = heights5[i];
            }
        }
        
        System.out.println();
        System.out.println("Максимальный рост: " + maxHeight + " см");
    }
}


