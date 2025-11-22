/*
 * Добавить вывод исходной таблицы
 * добавить math random 
 * выбирать там ноль
 */
package KalminGA_Razdel_2;

/**
 *
 * @author student
 */
public class Zadanie5 {

    /**
     * @param args the command line arguments
     */
public static void main(String[] args) {

        int[][] a5 = {
            {1, 2, 3, 4},
            {5, 0, 7, 8},
            {9, 8, 7, 6},
            {0, 3, 4, 5},
            {1, 2, 6, 4}
        };

        for (int i5 = 0; i5 < a5.length; i5++) {
            
            boolean FindZero5 = false;
            for (int j = 0; j < a5[i5].length; j++) {
                if (a5[i5][j] == 0) {
                    FindZero5 = true;
                }
            }
            if (FindZero5 == true) {
                for (int j = 0; j < a5[i5].length; j++) {
                    System.out.print(a5[i5][j] + " ");
                }
                System.out.println(); 
            }
        }
}}

