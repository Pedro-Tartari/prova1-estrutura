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
public class quickSort {
    
//   Vamos buscar o ultimo elemento a direita como pivo,
//   o colocamos no "meio" onde os valores menores que ele 
//   ficam a esqueda e os maiores a direita.  
    int partition(int arr[], int low, int high)
    {
        int pivot = arr[high]; 
        int i = (low-1); // Recebe o menor elemento 
        for (int j=low; j<high; j++)
        {
            // Se o elemento tiver um valor menor ou igual ao pivo
            if (arr[j] <= pivot)
            {
                i++;
  
                // Ira jogar a esquerda
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
  
        // Senao Ira jogar na direita.
        int temp = arr[i+1];
        arr[i+1] = arr[high];
        arr[high] = temp;
  
        return i+1;
    }
  
  
   
    void sort(int arr[], int low, int high)
    {
        if (low < high)
        {
            //Com o pi podemos estar trabalhando melhor com as informações
            int pi = partition(arr, low, high);
  
            //Faz a organização dos elementos e inicia o loop
            sort(arr, low, pi-1);
            sort(arr, pi+1, high);
        }
    }
  
    //Apenas printa na tela
    static void printArray(int arr[])
    {
        int n = arr.length;
        for (int i=0; i<n; ++i)
            System.out.print(arr[i]+" ");
        System.out.println();
    }
  
    // Driver program
    public static void main(String args[])
    {
        int arr1[] = {85, 35, 96, 5, 2, 5}; //Array Antes da modificação
        int n = arr1.length; // Medida Total de elementos
        
        int arr2[] = {10, 3, 89, 91, 100, 74}; //Array Antes da modificação
        int m = arr2.length;// Medida Total de elementos
  
        quickSort ob = new quickSort();
        ob.sort(arr1, 0, n-1);
        
        quickSort ob2 = new quickSort();
        ob2.sort(arr2, 0, m-1);
  
        System.out.println("Array1 depois do Quick Sort");
        printArray(arr1); // Espardo 2 5 5 35 85 96 
        System.out.println("Array2 depois do Quick Sort");
        printArray(arr2); // Esperado 3 10 74 89 91 100 
    }
    
}
