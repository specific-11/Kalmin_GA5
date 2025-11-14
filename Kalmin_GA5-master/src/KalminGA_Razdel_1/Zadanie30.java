/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package KalminGA_Razdel_1;

/**
 *
 * @author student
 */
public class Zadanie30 {
    public static void main(String[] args) {
        int[] A5 = new int[20];
        
        // Заполняем массив случайными числами от -50 до 50
        for (int i = 0; i < A5.length; i++) {
            A5[i] = (int) (Math.random() * 101) - 50;
        }
        
        // Выводим массив
        System.out.println("Массив A:");
        for (int i = 0; i < A5.length; i++) {
            System.out.println("A[" + (i + 1) + "] = " + A5[i]);
        }
        
        // Задаём границы диапазона (в математической нумерации)
        int n5 = 3;
        int k5 = 15;
        
        // Находим минимум в диапазоне [n5..k5] (переводим в Java-индексы)
        int min = A5[n5 - 1];  // начинаем с элемента A[n5]
        for (int i = n5; i < k5; i++) {  // i от n5 до k5-1 (в Java-индексах)
            if (A5[i] < min) {
                min = A5[i];
            }
        }
        
        // Выводим результат
        System.out.println("Минимальный элемент среди A[" + n5 + ".." + k5 + "]: " + min);
    }
}
