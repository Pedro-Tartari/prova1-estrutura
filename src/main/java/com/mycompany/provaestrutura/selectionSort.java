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
public class selectionSort {
    
    //Ao contrário do Bubble onde a verificação irá selecionar dois intervalos, 
    //este irá buscar nos arrays o menor número assim o selecionando
    //e colocando como o primeiro da ordem.
    public static void selectionSort(int[] arr){  
        for (int i = 0; i < arr.length - 1; i++)  
        {  
            int index = i;  //Recebe o primeiro valor do feito pelo loop
            for (int j = i + 1; j < arr.length; j++){   // faz a verificação do menor numero
                if (arr[j] < arr[index]){   
                    index = j;//recebe o menor valor
                }  
            }  
            //Troca das "casas", o menor pela primeira.
            int smallerNumber = arr[index];   
            arr[index] = arr[i];   
            arr[i] = smallerNumber;  
        }  
    }  
       
    public static void main(String a[]){  
        int[] arr1 = {9,903,22,8,70};  //Array Antes da modificação
        int[] arr2 = {5,1,80,64,31,51};  //Array Antes da modificação
        
       
        selectionSort(arr1);//Saida esperada 8 9 22 70 903
        selectionSort(arr2);//Saida esperada 1 5 31 51 64 80
         
        System.out.println("Array1 depois do Selection Sort");  
        for(int i:arr1){  
            System.out.print(i+" ");  
        }  
        
        System.out.println("\nArray2 depois do Selection Sort");  
        for(int i:arr2){  
            System.out.print(i+" ");  
        } 
    }  
}
