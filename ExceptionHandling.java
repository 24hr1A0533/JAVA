import java.io.FileNotFoundException;
import java.io.FileReader;

class File{
    void text() throws FileNotFoundException{ 
        FileReader text = new FileReader("Pattern.java");
    }
}
 public class ExceptionHandling {
    public static void main(String[] args) {
        
    
    File obj = new File();
    try{
        obj.text();
    }catch (FileNotFoundException e){
        System.out.println("something went wrong");
    }
}
    
}
r