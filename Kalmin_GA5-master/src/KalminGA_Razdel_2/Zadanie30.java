/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package KalminGA_Razdel_2;

/**
 *
 * @author student
 */
public class Zadanie30 {

    public static void main(String[] args) {

        int[][] matrica5 = new int[8][8];

 
        for (int i5 = 0; i5 < 8; i5++) {       
            for (int j5 = 0; j5 < 8; j5++) {     
                matrica5[i5][j5] = (int)(Math.random() * 19) - 9;
            }
        }


        System.out.println("Исходная матрица:");
        for (int i5 = 0; i5 < 8; i5++) {
            for (int j5 = 0; j5 < 8; j5++) {
                System.out.print(matrica5[i5][j5] + "\t");
            }
            System.out.println();
        }

        for (int i5 = 0; i5 < 8; i5++) { 

            // ищем максимум в строке i5
            int max = matrica5[i5][0];
            int kolonkaMax = 0;

            for (int j5 = 1; j5 < 8; j5++) {
                if (matrica5[i5][j5] > max) {
                    max = matrica5[i5][j5];
                    kolonkaMax = j5;
                }
            }

            int posledniy = matrica5[i5][7];
            matrica5[i5][7] = max;  
            matrica5[i5][kolonkaMax] = posledniy;
        }

        System.out.println("\n Матрица после замены:");
        for (int i5 = 0; i5 < 8; i5++) {
            for (int j5 = 0; j5 < 8; j5++) {
                System.out.print(matrica5[i5][j5] + "\t");
            }
            System.out.println();
        }
    }
}
