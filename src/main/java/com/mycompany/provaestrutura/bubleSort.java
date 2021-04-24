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
public class bubleSort {

//O Bubble irá pegar o conteúdo e arrumá-lo de forma crescente, fazendo 
//uma verificação entre pares de números, se o da esquerda for maior 
//que o da direita esse deve mudar de “casa” .
    static void bubbleSort(int[] arr) {
        int n = arr.length;
        int temp = 0;
        for (int i = 0; i < n; i++) {  //Percorre o array
            for (int j = 1; j < (n - i); j++) {  // Loop para organização
                if (arr[j - 1] > arr[j]) { //troca de elemnentos caso sejam maiores.
                    temp = arr[j - 1]; //usado para facilitar na organização das casas.
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                }

            }
        }

    }

    public static void main(String[] args) {
        int arr1[] = {8, 100, 45, 90, 38, 50, 5}; //Array Antes da modificação
        int arr2[] = {50, 10, 5, 3, 4, 8, 9}; //Array Antes da modificação

        bubbleSort(arr1);// Saida esperada 5 8 38 45 50 90 100 
        bubbleSort(arr2);// Saida esperada 3 4 5 8 9 10 50

        System.out.println("Array1 depois do Bubble Sort");
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i] + " ");
        }

        System.out.println("\nArray2 depois do Bubble Sort");
        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i] + " ");
        }

    }
}
