package com.abolfazl_sadeghian.MatricesDemo;

public class MatricesDemo {

    public static void main(String[] args) {
        //bi-dimensional array: 2rows , 2 columns

        int [][] intMatrix = {{1,0},{0,1}};

        int [] [] intMatrix2= new int [2][2];

        for (int i = 0; i < intMatrix2.length;i++){
            for (int j = 0; j < intMatrix2[i].length; j++){
                intMatrix2[i][j]= i + j;
                System.out.println(intMatrix[i][j]+" ");

            }
            System.out.println();
        }


        //cubical matrix , with three coordinates

        int [][][] intMatrix3 = new int [2][2][2];
        for (int i = 0; i < intMatrix3.length;i++){
            for (int j= 0; j < intMatrix3[i].length; j++){
                for (int k=0; k<intMatrix3[i][j].length; k++){
                    intMatrix3[i][j][k] = i + j + k;
                    System.out.println("["+i+", "+ j+", "+k+"]");
                }
                System.out.println("++++++++++++");
            }
            System.out.println("==============");
        }
    }
}
