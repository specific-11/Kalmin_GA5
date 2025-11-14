/*
 * ВСЕ ДОЛЖНО ИМЕТЬ ВАРИАНТ НАПР i5 scanner5, array5.
sout -- быстрый ввод команд
 */
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kalmingleb_variant5;

/**
 * TEMPLATEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEE
 * @author student
 */
public class KalminGleb {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
           int[] array = new int[20];
        // Массивы индексируются с нуля, как показано ниже.
        //инициализация
           for(int i = 0; i < array.length; i++)
        array[i] = i*(-1);
           
         System.out.println(array.length);
        for(int i =0; i < array.length; i++){
    System.out.println("This is array[" + i + "] : " + array[i]);
 //System.out.println(array[i]);
 
        }}
    
}

