package br.com.hawlab.data_structures;

import java.util.Arrays;
import org.apache.commons.lang3.ArrayUtils;

public class DataStructureArray {
    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int element : row) {
                System.out.print(element + " ");
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {
        System.out.println("------------------------------------------");
        System.out.println("Java Essentials: Data Structures (Array)");

        int[] array = {9, 3, 7, 1, 6, 2, 5, 8, 4};

        // Array multidimensional (Matriz)
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        System.out.println("Matriz:");
        printMatrix(matrix);

        Arrays.sort(array);
        System.out.println("Array Ordenado: " + Arrays.toString(array));

        // Busca Binária (Divide o array meio a meio a cada intereção para a busca.)
        int index = Arrays.binarySearch(array, 5);
        if (index >= 0) {
            System.out.println("Elemento Encontrado no Índice: " + index);
        }

        // Inversão do Array
        ArrayUtils.reverse(array);
        System.out.println("Array Invertido: " + Arrays.toString(array));

        // Adicionando Elemento
        array = ArrayUtils.add(array, 6);
        System.out.println("Array com Novo Elemento: " + Arrays.toString(array));

        // Removendo Elemento
        array = ArrayUtils.removeElement(array, 3);
        System.out.println("Array Após Remoção: " + Arrays.toString(array));

        System.out.println("------------------------------------------");
    }
}
