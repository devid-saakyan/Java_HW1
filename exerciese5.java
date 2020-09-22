package com.company;

public class exerciese5 {
    public static void main(String[] args) {
        int number_vector[] = {1, 2, 3};
        int weight_vector[] = {1, 2, 10};
        generator generator = new generator(number_vector, weight_vector);
        int answer = generator.random_number();
        System.out.println(answer);
    }
}
class generator{
    public int[] values;
    public generator(int arguments[], int weights[]){
        int sum = 0;
        for (int i : arguments){
            sum += i;
        }
        int temp = 0;
        values = new int[sum];
        for(int i = 0; i < weights.length-1; i++){
            for(int j = 0; j < weights[i]; j++){
                values[temp++] = arguments[i];
            }
        }
    }
    public int random_number(){
        int number = (int) (Math.random() * (values.length -1));
        return values[number];
    }
}