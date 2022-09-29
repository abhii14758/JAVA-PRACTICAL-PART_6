//Created By 21CE013 ABHI BHIMANI

// Write a program to create three threads ‘FIRST’, ‘SECOND’, ‘THIRD’. 
// Set the priority of the ‘FIRST’ thread to 3, the ‘SECOND’ thread to 5(default) and the ‘THIRD’ thread to 7.

//Github Link = https://github.com/abhii14758/JAVA-PRACTICAL-PART_6

class TestPriority extends Thread//TestPriority class extends Thread class
{
    public void run()
    {
        System.out.println("Running Thread is: "+Thread.currentThread().getName());//Printing Current Thread Name
        System.out.println("Priority of  "+Thread.currentThread().getName()+" is: "+Thread.currentThread().getPriority());//Printing the Priority of the current Thread
    }

}


public class PR_6_4
{
    public static void main(String[] args)
    {
        TestPriority t1=new TestPriority();//Creating a Thread t1
        TestPriority t2=new TestPriority();//Creating a Thread t2
        TestPriority t3=new TestPriority();//Creating a Thread t3
        t1.setName("FIRST");
        t2.setName("SECOND");
        t3.setName("THIRD");
        t1.setPriority(3);//Setting Priority for all the Threads
        t2.setPriority(Thread.NORM_PRIORITY);
        t3.setPriority(7);
        t1.start();//Executing Thread t1
        t2.start();//Executing Thread t2
        t3.start();//Executing Thread t2
       


    }
}


