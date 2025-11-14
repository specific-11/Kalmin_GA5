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
public class Zadanie5 {
    public static void main(String[] args) {
                int n5 = 5;
        int[] array5 = new int[2 * n5];
        System.out.println("Исходный массив:");
        for (int i5 = 0; i5 < array5.length; i5++) {
            array5[i5] = (int) (Math.random() * 100 - 200); 
            System.out.print(array5[i5] + " ");
        }
        System.out.println(); 
        int sumFirst = 0;
        for (int i5 = 0; i5 < n5; i5++) {
            sumFirst += array5[i5];
        }
        int sumLast = 0;
        for (int i5 = n5; i5 < 2 * n5; i5++) {
            sumLast += array5[i5];
        }
        int result = sumFirst - sumLast;
        System.out.println("Сумма первых " + n5 + " элементов: " + sumFirst);
        System.out.println("Сумма последних " + n5 + " элементов: " + sumLast);
        System.out.println("Результат (сумма первых - сумма последних ): " + result);
}}

