package com.company;
//import com.company.*;
//import java.util.Scanner;

public class NumberOfLocalMin {
    public static void findNumberOfLocalMin(int n,int m){
        int localMin = 0;

        Matrix a= MatrixFactory.createRandomized(n,m);
        System.out.println(a);

        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                int search = a.getElement(i,j);

                if((i==0 && j==0)
                        && search<a.getElement(i,j+1)
                        && search<a.getElement(i+1,j)
                        && search<a.getElement(i+1,j+1)){ System.out.println("Лок. минимум:  "+a.getElement(i,j)); localMin++; }
                else if ((i==0 && j!=0 && j!=m-1)
                        && search<a.getElement(i,j-1)
                        && search<a.getElement(i,j+1)
                        && search<a.getElement(i+1,j-1)
                        && search<a.getElement(i+1,j)
                        && search<a.getElement(i+1,j+1)) {System.out.println("Лок. минимум:  "+a.getElement(i,j)); localMin++;}
                else if ((i==0 && j==m-1)
                        && search<a.getElement(i,j-1)
                        && search<a.getElement(i+1,j-1)
                        && search<a.getElement(i+1,j)) { System.out.println("Лок. минимум:  "+a.getElement(i,j)); localMin++;}
                else if ((i!=0 && i!=n-1 && j == 0)
                            && search < a.getElement(i - 1, j)
                            && search < a.getElement(i - 1, j + 1)
                            && search < a.getElement(i, j + 1)
                            && search < a.getElement(i + 1, j)
                            && search<a.getElement(i+1,j+1)) { System.out.println("Лок. минимум:  "+a.getElement(i,j)); localMin++; }
                else if ((i!=n-1 && i!=0 && j!=0 && j!=m-1)
                        && search<a.getElement(i-1,j-1)
                        && search<a.getElement(i-1,j)
                        && search<a.getElement(i-1,j+1)
                        && search<a.getElement(i,j-1)
                        && search<a.getElement(i,j+1)
                        && search<a.getElement(i+1,j-1)
                        && search<a.getElement(i+1,j)
                        && search<a.getElement(i+1,j+1)) { System.out.println("Лок. минимум:  "+a.getElement(i,j)); localMin++; }
                else if ((i!=0 && i!=n-1 && j==m-1)
                            && search<a.getElement(i-1,j-1)
                            && search<a.getElement(i-1,j)
                            && search<a.getElement(i,j-1)
                            && search<a.getElement(i+1,j-1)
                            && search<a.getElement(i+1,j)) { System.out.println("Лок. минимум:  "+a.getElement(i,j)); localMin++; }
                else if ((i==m-1 && j==0)
                            && search<a.getElement(i-1,j)
                            && search<a.getElement(i-1,j+1)
                            && search<a.getElement(i,j+1)) {System.out.println("Лок. минимум:  "+a.getElement(i,j)); localMin++; }
                else if ((i==m-1 && j!=0 && j!=n-1)
                            && search<a.getElement(i-1,j-1)
                        && search<a.getElement(i-1,j)
                        && search<a.getElement(i-1,j+1)
                        && search<a.getElement(i,j-1)
                        && search<a.getElement(i,j+1)) { System.out.println("Лок. минимум:  "+a.getElement(i,j)); localMin++; }
                else if ((i==m-1 && j==n-1)
                            && search<a.getElement(i-1,j)
                            && search<a.getElement(i-1,j-1)
                            && search<a.getElement(i,j-1))
                { System.out.println("Лок. минимум:  "+a.getElement(i,j)); localMin++; }

            }
        }

        System.out.println("Число локальных минимумов: "+localMin);
    }

}
