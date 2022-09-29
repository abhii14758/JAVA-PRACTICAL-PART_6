//Creatd By 21CE013 ABHI BHIMANI

// Write a program to increment the value of one variable by one and display it after one second using thread 
// using sleep() method.

//Github Link = https://github.com/abhii14758/JAVA-PRACTICAL-PART_6


import javax.swing.plaf.synth.SynthOptionPaneUI;

class Thread1 implements Runnable{

    public int a = 10;
    @Override
    public void run() {
        // TODO Auto-generated method stub

        // public int a = 10;
        try{
                a++;
                Thread.sleep(1000);
        }
        catch(Exception e){
                System.out.println("Exception Occured " + e);
        }
    }

}

class Thread2 extends Thread1{

   @Override
   public void run() {
       // TODO Auto-generated method stub
       super.run();
       System.out.println("Value After Incrementing a = " + a);   
    }
    
}

public class PR_6_3 {
    public static void main(String[] args) {
        Thread1 t1 = new Thread1();
        Thread2 t2 = new Thread2();
        t1.run();
        t2.run();
    }
}
