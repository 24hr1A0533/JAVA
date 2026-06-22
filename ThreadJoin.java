
public class ThreadJoin {
   static  int count=0;
    static synchronized void countt(){
      count++;
    }
    public static void main(String[] args) {
        Runnable obj =() -> {
            for(int i=0;i<=10000;i++){
               countt();
            }
        };
         Runnable obj1 =() -> {
            for(int i=0;i<=10000;i++){
                countt();
            }
        };
        Thread t1=new Thread(obj);
        Thread t2=new Thread(obj1);
        t1.start();
        t2.start();
        try{
        t1.join();
        t2.join();
        }
        catch(Exception e){
            System.out.println(e);
            
        }
        System.out.println(count);
        System.out.println("byeeeeee");
    }
    
}
