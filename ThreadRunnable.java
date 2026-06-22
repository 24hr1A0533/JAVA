public class ThreadRunnable {
public static void main(String[] args) {
    Runnable obj =() -> {
        for(int i=1;i<=10;i++){
        System.out.println("kishore");
        try{Thread.sleep(1000);}
        catch(InterruptedException e){System.out.println("something wrong");}
        }
    };
     Runnable obj1=() -> {
        for(int i=1;i<=10;i++){
        System.out.println("Anil");
        try{Thread.sleep(1000);}
        catch(InterruptedException e){System.out.println("something wrong");}
        }
    };
    Thread t1 = new Thread(obj);
    Thread t2 = new Thread(obj1);
    t1.start();
    t2.start();
}    
}
