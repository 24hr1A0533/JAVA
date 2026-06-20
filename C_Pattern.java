public class C_Pattern {
    public static void main(String[] args) {
        for(int i=1;i<8;i++){
            for(int j=1;j<8;j++){
                if(i==1 && j>=2||
                j==1&&i>1&&i<7||
                i==7&&j>=2)
                    
             {
                    System.out.print("* ");
                }
            else {
                System.out.print("  ");
            }
            }
            System.out.println();
        }
        
    }
    
}
