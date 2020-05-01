package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class FindDup {

        void printRepeating(ArrayList<Integer> arr, int size)
        {



            int dup[] = new int [size];
            int i;

            System.out.println("Repeated elements are: ");
            for (i = 0; i < size; i++)
            {
                if (dup[arr.get(i)] == 0)
                    System.out.print(" " + arr.get(i) + " ");
                else
                    System.out.println(" None " + dup[arr.get(i)]++);
            }
        }

        public static void main(String[] args)
        {
            FindDup repeat = new FindDup();
            ArrayList<Integer> arr = new ArrayList<>();
//            int[] arr = {4, 2, 4, 5, 2, 3, 1};

            Scanner in = new Scanner(System.in);

//            int size = 50;

            //Original "arr"
//            for (int i = 0; i < size; i++){
//
//                int num = in.nextInt();{
//                    arr.add(num);
//                }
//            }
            for (int i = 0; i < 50; i++){

                arr.add(i, (int) (Math.random()*50));

            }

            int arr_size = arr.size();
            repeat.printRepeating(arr, arr_size);

            System.out.println(arr);
            arr.sort(null);
            System.out.println(arr);

        }
    }
