package com.company;

import org.jetbrains.annotations.NotNull;

public class exercise2 {
    public static void main(String[] args){
        vector vector_1 = new vector(1,2,3);
        vector_1.getLenght(1,2,3);

    }
}
class vector{
    public static Integer rand[];
    double x, y, z, x2, y2, z2;
    public vector(double x, double y, double z){
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public double getLenght(int x, int y, int z){
        double lenght = Math.sqrt(Math.pow(x,2) + Math.pow(y,2) + Math.pow(z,2));
        System.out.println(lenght);
        return lenght;
    }

    public double scale_multiple(int x, int y, int z, int x2, int y2, int z2) {
        double scale_answer = x*x2 + y*y2 + z*z2;
        System.out.println(scale_answer);
        return scale_answer;
    }
    public vector vector_multiple(int x, int y, int z, int x2, int y2, int z2){
        return new vector(
                y*z2- z*y2,
                z*x2 - x*z2,
                x*y2 - y*x2);
    }
    public double vectors_angel(int x, int y, int z, int x2, int y2, int z2){
        double cos = scale_multiple(x,y,z,x2,y2,z2)/(getLenght(x,y,z)*getLenght(x2,y2,z2));
        return cos;
    }

    public vector summ_matrix(int x, int y, int z, int x2, int y2, int z2){
        return new vector(
                x+x2,
                y+y2,
                z+z2
        );
    }
    public vector minus_matrix(int x, int y, int z, int x2, int y2, int z2){
        return new vector(
                x-x2,
                y-y2,
                z-z2
        );
    }

    public static vector[] random_matrix(int n){
        vector[] vectors = new vector[n];
        for(int i =0; i < n; i++){
            vectors[i] = new vector(Math.random(), Math.random(), Math.random());
        }
        return vectors;
    }
}
