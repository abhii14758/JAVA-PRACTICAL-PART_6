//Created By 21CE013 ABHI BHIMANI

// Write a program to create thread which display “Hello World” message.
// A. by extending Thread class
// B. by using Runnable interface.

//Github Link = https://github.com/abhii14758/JAVA-PRACTICAL-PART_6

class MyThread extends Thread{
    
    public void run()
    {
        try {
                System.out.println("Hello World");
        } catch (Exception e) {
            System.out.println("Exception Occured");
        }
    }
}

public class PR_6_1_1 {
    public static void main(String[] args) {
        MyThread t1= new MyThread();
        t1.start();
    }
}
