

class Process extends Thread{
    public void run(){
        for(int i=1;i<=100;i++){
        System.out.println("open file");
        try{Thread.sleep(1000);}
        catch(InterruptedException e){System.out.println("something wrong");}
        
        }
    }
}
class Process1 extends Thread{
    public void run(){
        for(int i=1;i<=100;i++){
        System.out.println("open folder");
         try{Thread.sleep(1000);}
        catch(InterruptedException e){System.out.println("something wrong");}
        
        
        }
    }
}


public class MultiThriding {
    public static void main(String[] args) {
        Thread obj = new Process();
        obj.start();
         Thread obj1 = new Process1();
        obj1.start();
    }
    
}
