import java.io.*;
import java.util.*;
public class Buffer {
    public static void main(String[] args) throws Exception {
        BufferedWriter pen =new BufferedWriter(new FileWriter("Unknown.java"));
        pen.write("class Banana{");
        pen.newLine();
        pen.write("public static void main(String[]args){");
        pen.newLine();
        pen.write("System.out.println();");
        pen.newLine();
        pen.write("}}");
        pen.close();
    }
    
}
