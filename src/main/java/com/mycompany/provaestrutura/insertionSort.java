/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.provaestrutura;

/**
 *
 * @author Pedro Tartari
 */
public class insertionSort {

    //ao fazer a sua verificação ele irá selecionar uma “chave”,  
    //essa chave deve ser comparada ao item à sua esquerda, 
    //caso seja menor que ele
    public static void insertionSort(int array[]) {
        int n = array.length;
        for (int j = 1; j < n; j++) {
            int key = array[j]; // chave escolhida
            int i = j - 1; // Começar pela Ultima posição
            while ((i > -1) && (array[i] > key)) {
                array[i + 1] = array[i]; // Posição é mudada caso seja maior
                i--;
            }
            array[i + 1] = key; // A chave acaba por se tornar 
        }
    }

    public static void main(String a[]) {
        int[] arr1 = {9, 20, 100, 58, 70, 11};  //Array Antes da modificação
        int[] arr2 = {1, 30, 40, 55, 86, 16};  //Array Antes da modificação

        insertionSort(arr1);//  Saida esperada 9 11 20 58 70 100 
        insertionSort(arr2);//  Saida esperada 1 16 30 40 55 86

        System.out.println("Array1 depois do Insertion Sort");
        for (int i : arr1) {
            System.out.print(i + " ");
        }

        System.out.println("\nArray2 depois do Insertion Sort");
        for (int i : arr2) {
            System.out.print(i + " ");
        }
    }
}
