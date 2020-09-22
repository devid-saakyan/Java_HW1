package com.company;
import java.util.Scanner;
public class matrix {
    public static void main(String[] args) {
        int a, b, c, d;
        Scanner s = new Scanner(System.in);
        int choice = 0;
        while (choice != 6) {
            System.out.println("Выберите действие: ");
            System.out.println("1 - Сложение матриц");
            System.out.println("2 - умножение матрицы на число");
            System.out.println("3 - произведение двух матриц");
            System.out.println("4 - Транспонирование матрицы");
            System.out.println("5 - возведение матрицы в степень");
            System.out.println("6 - выйти из программы");
            System.out.println("Введите число выбранного действия: ");
            choice = s.nextInt();
            switch (choice) {
                case 1:                                                             /////сложение матриц
                    System.out.println("Вы выбрали сложение двух матриц");
                    System.out.println("Введите количество столбцов первой матрицы: ");
                    a = s.nextInt();
                    System.out.println("Введите количество строк для первой матрицы: ");
                    b = s.nextInt();
                    System.out.println("Введите количество столбцов второй матрицы: ");
                    c = s.nextInt();
                    System.out.println("Введите количество строк для второй матрицы: ");
                    d = s.nextInt();
                    if (a == c && b == d) {
                        int first_matrix[][] = new int[a][b];
                        int second_matrix[][] = new int[c][d];
                        int output_matrix[][] = new int[a][d];
                        System.out.println("Введём значения первой матрицы: ");
                        for (int i = 0; i < a; i++) {
                            for (int j = 0; j < b; j++) {
                                first_matrix[i][j] = s.nextInt();
                            }
                        }
                        System.out.println("Введём значения второй матрицы: ");
                        for (int i = 0; i < a; i++) {
                            for (int j = 0; j < b; j++) {
                                second_matrix[i][j] = s.nextInt();
                            }
                        }
                        for (int i = 0; i < a; i++) {
                            for (int j = 0; j < b; j++) {
                                output_matrix[i][j] = first_matrix[i][j] + second_matrix[i][j];
                            }
                        }
                        System.out.println("Первая матрица: ");
                        for (int i = 0; i < a; i++) {
                            for (int j = 0; j < b; j++) {

                                System.out.print(first_matrix[i][j] + " | ");
                            }
                            System.out.println("");
                        }
                        System.out.println("Вторая матрица: ");
                        for (int i = 0; i < a; i++) {
                            for (int j = 0; j < b; j++) {

                                System.out.print(second_matrix[i][j] + " | ");
                            }
                            System.out.println("");
                        }
                        System.out.println("Сумма : ");
                        for (int i = 0; i < a; i++) {
                            for (int j = 0; j < b; j++) {

                                System.out.print(output_matrix[i][j] + " | ");
                            }
                            System.out.println("");
                        }
                    } else
                        System.out.printf("Сложение невозможно!");
                    break;

                case 2:                                                     ////умножение на число
                    System.out.println("Вы выбрали умножение матрицы на число: ");
                    System.out.println("Введите количество столбцов матрицы: ");
                    a = s.nextInt();
                    System.out.println("Введите количество строк матрицы: ");
                    b = s.nextInt();
                    System.out.println("Введите значения матрицы: ");
                    int number;
                    int matrix[][] = new int[a][b];
                    int output_matrix[][] = new int[a][b];
                    for (int i = 0; i < a; i++)
                    {
                        for (int j = 0; j < b; j++)
                        {
                            matrix[i][j] = s.nextInt();
                        }
                    }
                    System.out.println("Введите число для умножения: ");
                    number = s.nextInt();
                    System.out.println("Ваша матрица: ");
                    for (int i = 0; i < a; i++)
                    {
                        for (int j = 0; j < b; j++)
                        {
                            System.out.print(matrix[i][j] + " | ");
                        }
                        System.out.println(" ");
                    }
                    System.out.println(" * " + number);
                    for (int i = 0; i < a; i++) {
                        for (int j = 0; j < b; j++) {
                            output_matrix[i][j] = matrix[i][j] * number;
                            System.out.print(output_matrix[i][j] + " | ");
                        }
                        System.out.println(" ");
                    }
                    break;
                case 3:                                                         ///умножение двух матриц
                    System.out.println("Вы выбрали умножение матриц :");
                    System.out.println("Введите количество столбцов первой матрицы: ");
                    int m = s.nextInt();
                    System.out.println("Введите количество строк для первой матрицы: ");
                    int n = s.nextInt();
                    System.out.println("Введите количество столбцов второй матрицы: ");
                    int p = s.nextInt();
                    System.out.println("Введите количество строк для второй матрицы: ");
                    int q = s.nextInt();

                    if (n == p){
                        int first_matrix[][] = new int[m][n];
                        int second_matrix[][] = new int[p][q];
                        int multiple_matrix[][] = new int[m][q];
                        System.out.println("Введём значения первой матрицы: ");
                        for (int i = 0; i < m; i++) {
                            for (int j = 0; j < n; j++) {
                                first_matrix[i][j] = s.nextInt();
                            }
                        }
                        System.out.println("Введём значения второй матрицы: ");
                        for (int i = 0; i < p; i++) {
                            for (int j = 0; j < q; j++) {
                                second_matrix[i][j] = s.nextInt();
                            }
                        }
                        int sum = 0;
                        for (int i = 0; i < m; i++) {
                            for (int j = 0; j < q; j++) {
                                for (int k = 0; k < p; k++)
                                    sum = sum + first_matrix[i][k]*second_matrix[k][j];
                                multiple_matrix[i][j] = sum;
                                sum = 0;
                            }
                        }
                        System.out.println("Результат умножения: ");
                        for (int i =0; i<m; i++){
                            for (int j =0; j<q; j++){
                                System.out.print(multiple_matrix[i][j]+" ");
                            }
                            System.out.println(" ");
                        }
                    }
                    else
                        System.out.println("Умножение невозможно");
                    break;
                case 4:
                    System.out.println("Вы выбрали транспонирование матрицы :");
                    System.out.println("Введите количество столбцов матрицы: ");
                    a = s.nextInt();
                    System.out.println("Введите количество строк для матрицы: ");
                    b = s.nextInt();
                    matrix = new int[a][b];
                    int trans_matrix[][] = new int[Math.max(a,b)][Math.max(a,b)];
                    System.out.println("Введите значения матрциы: ");
                    for (int i=0; i<a; i++){
                        for(int j =0; j<b; j++){
                            matrix[i][j] = s.nextInt();
                        }
                    }
                    System.out.println("изначальная матрица :");
                    for (int i=0; i<a; i++){
                        for(int j =0; j<b; j++){
                            System.out.print(matrix[i][j]+ " ");
                        }
                        System.out.println(" ");
                    }
                    System.out.println("Транспонированная матрица:");
                    for (int i = 0; i < b; i++) {
                        for (int j = 0; j < a; j++) {
                            trans_matrix[i][j] = matrix[j][i];
                        }
                    }
                    for (int i = 0; i < b; i++) {
                        for (int j =0; j < a; j++) {
                            System.out.print(trans_matrix[i][j]+ " ");
                        }
                        System.out.println(" ");
                    }
                    break;
                case 5:
                    System.out.println("Вы выбрали возведение матрицы в степень: ");
                    System.out.println("Введите количество столбцов матрицы: ");
                    a = s.nextInt();
                    System.out.println("Введите количество строк для матрицы: ");
                    b = s.nextInt();
                    int st_matrix[][] = new int[a][b];
                    int out_matrix[][] = new int[a][b];
                    System.out.println("Введите значения матрциы: ");
                    for (int i=0; i<a; i++){
                        for(int j =0; j<b; j++){
                            st_matrix[i][j] = s.nextInt();
                        }
                    }
                    System.out.println("Введите степень для возведения: ");
                    int st = s.nextInt();
                    int sum = 0;
                    for(int y = 0; y<st-1; y++) {
                        for (int i = 0; i < a; i++) {
                            for (int j = 0; j < b; j++) {
                                for (int k = 0; k < b; k++)
                                    sum = sum + st_matrix[i][k] * st_matrix[k][j];
                                out_matrix[i][j] = sum;
                                sum = 0;
                            }
                        }
                    }
                    for(int i = 0; i<a; i++){
                        for(int j = 0; j<b; j++){
                            System.out.print(out_matrix[i][j]+" ");
                        }
                        System.out.println(" ");
                    }
            }
        }
    }
}
