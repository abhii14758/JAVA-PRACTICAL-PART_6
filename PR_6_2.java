// Created By 21CE013 ABHI BHIMANI

// Generate 15 random numbers from 1 to 100 and store it in an int array. Write a program to display the numbers 
// stored at odd indexes by thread1 and display numbers stored at even indexes by thread2.

//Github Link = https://github.com/abhii14758/JAVA-PRACTICAL-PART_6


import java.util.*;
import java.util.stream.IntStream;

        class TestEven extends Thread//TestEven class extends Thread class
        {
            int arr[]=new int[15];//Intializing an array arr
            TestEven(int arr1[])
            {
                this.arr=arr1;
            }
            public void run()//Creating a Thread t1
            {
                for(int i=0;i<15;i=i+1)//Determining if the element is even
                {
                    if(arr[i]%2==0)
                    {
                        System.out.println("This is an Even Element: "+arr[i]);
                    }
                }
            }
        }
        class TestOdd extends Thread//TestOdd class extends Thread class
        {
            int arr[]=new int[15];//Intializing an array arr
            TestOdd(int arr1[])
            {
                this.arr=arr1;
            }
            public void run()//Creating a Thread t1
            {
                for (int i = 0; i < 15; i = i + 1)//Determining if the element is odd
                {
                    if(arr[i]%2!=0)
                    {
                        System.out.println("This is an Odd Element: "+arr[i]);
                    }
                }


            }
        }
        public class PR_6_2
        {
            public static void main(String[] args)
            {
                int[]  randomIntsArray = IntStream.generate(() -> new Random().nextInt(15)).limit(100).toArray();//Generating a random Integer Array of size 15 and limiit 100
                TestEven t1=new TestEven(randomIntsArray);//Creating a Thread t1
                TestOdd t2=new TestOdd(randomIntsArray);//Creating a Thread t2
                t1.start();//Executing Thread t1
                t2.start();//Executing Thread t2



            }
        }


