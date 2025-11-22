/*
 * Добавить вывод исходной таблицы
 * добавить math random (от 0 до 5) в таблицу, вместо конкретных чисел
 * выбирать там ноль (оставить тот же метод в поиске нуля)
 * 12345
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
        System.out.println("Из данной прямоугольной таблицы вывести на экран строки, содержащие\n" +
"хотя бы один нулевой элемент.");
        int[][] a5 = new int[5][4];
        
        for (int i = 0; i < a5.length; i++) {
            for (int j = 0; j < a5[i].length; j++) {
                a5[i][j] = (int)(Math.random() * 6); 
            }
        }
        
        System.out.println("Исходная таблица:");
        for (int i = 0; i < a5.length; i++) {
            for (int j = 0; j < a5[i].length; j++) {
                System.out.print(a5[i][j] + " ");
            }
            System.out.println();
        }
        
        System.out.println("\nСтроки, содержащие нули:");

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
    }
}
