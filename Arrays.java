class Arrays{
    public static void main(String[]args){
        int []arr={1,2,3,4,5,6,7,8,9,10};
        int even[]=new int[6];
        int odd[]=new int[6];
        int count=0;
        int count1=0;
        for (int i=0;i<arr.length;i++){
            if (arr[i]%2==0){
                even[count]=arr[i];
                count++;
            }
            else {
                odd[count1]=arr[i];
                count1++;
            }
        }
        System.out.println("even numbers");
        for(int i:even){
            System.out.print(i+"\t");
        }
        System.out.println();
        System.out.println("odd numbes");
        for(int j:odd){
            System.out.print(j+"\t");
        }
        int age=18;
        String  name="kishore";
        System.out.println();
        System.out.println("i am "+name+"and i am "+age+"years old");
        
    }
}