import java.util.Scanner;
class TicketBooking{
    String Cinema_Ticket[][]=new String[5][5];
    String Bus_Ticket[][]=new String[5][5];
    String Restarent_Ticket [][]=new String[5][5];
    String Train_Ticket[][]=new String[5][5];
    TicketBooking(){
        for(int i=0;i<5;i++){
            for(int j=0;j<5;j++){
                Cinema_Ticket[i][j]="AVAILABLE";
            }
        }
        for(int i=0;i<5;i++){
            for(int j=0;j<5;j++){
                Bus_Ticket[i][j]="AVAILABLE";
            }
        }
        for(int i=0;i<5;i++){
            for(int j=0;j<5;j++){
                Restarent_Ticket[i][j]="AVAILABLE";
            }
        }
         for(int i=0;i<5;i++){
            for(int j=0;j<5;j++){
                Train_Ticket[i][j]="AVAILABLE";
            }
        }
    }
    void View_Cinema(){
         for(int i=0;i<5;i++){
            for(int j=0;j<5;j++){
                System.out.print(Cinema_Ticket[i][j]+"\t");
            }
            System.out.println("\n");
        }
    }
     void View_Bus(){
         for(int i=0;i<5;i++){
            for(int j=0;j<5;j++){
                System.out.print(Bus_Ticket[i][j]+"\t");
            }
            System.out.println("\n");
        }
    }
     void View_Restarent(){
         for(int i=0;i<5;i++){
            for(int j=0;j<5;j++){
                System.out.print(Restarent_Ticket[i][j]+"\t");
            }
            System.out.println("\n");
        }
    }
     void View_Train(){
         for(int i=0;i<5;i++){
            for(int j=0;j<5;j++){
                System.out.print(Train_Ticket[i][j]+"\t");
            }
            System.out.println("\n");
        }
    }
}
class Cinema extends TicketBooking{
    Scanner data=new Scanner(System.in);
    void Cinema_Ticket_Booking(){
        System.out.println("Enter the row(0-4)");
        int row=data.nextInt();
        System.out.println("Enter a column(0-4) ");
        int column=data.nextInt();
        if(Cinema_Ticket[row][column].equals("AVAILABLE")){
            Cinema_Ticket[row][column]="BOKKED  ";
        }
        else{
            System.out.println("seat occupied");
        }
    
        View_Cinema();
    }
}
class Bus extends TicketBooking{
    Scanner data=new Scanner(System.in);
    void Cinema_Ticket_Booking(){
        System.out.println("Enter the row(0-4)");
        int row=data.nextInt();
        System.out.println("Enter a column(0-4) ");
        int column=data.nextInt();
        if(Bus_Ticket[row][column].equals("AVAILABLE")){
            Bus_Ticket[row][column]="BOKKED  ";
        }
        else{
            System.out.println("seat occupied");
        }
    
        View_Bus();
    }
}
class Restarent extends TicketBooking{
    Scanner data=new Scanner(System.in);
    void Cinema_Ticket_Booking(){
        System.out.println("Enter the row(0-4)");
        int row=data.nextInt();
        System.out.println("Enter a column(0-4) ");
        int column=data.nextInt();
        if(Restarent_Ticket[row][column].equals("AVAILABLE")){
            Restarent_Ticket[row][column]="BOKKED ";
        }
        else{
            System.out.println("seat occupied");
        }
    
        View_Restarent();
    }
}
class Train extends TicketBooking{
    Scanner data=new Scanner(System.in);
    void Train_Ticket_Booking(){
        System.out.println("Enter the row(0`-4)");
        int row=data.nextInt();
        System.out.println("Enter a column(0-4) ");
        int column=data.nextInt();
        if(Train_Ticket[row][column].equals("AVAILABLE")){
            Train_Ticket[row][column]="  BOKKED ";
        }
        else{
            System.out.println("seat occupied");
        }
    
        View_Train();
    }
}
public class Ticket {
    public static void main(String[]args){
        Cinema ci=new Cinema();
        Bus bu=new Bus();
        Restarent re=new Restarent();
        Train tr=new Train();
        Scanner data = new Scanner(System.in);
        System.out.println("select 1 for cinema ticket");
        System.out.println("select 2 for Bus ticket");
        System.out.println("select 3 for cinema ticket");
        System.out.println("select 4 for Bus ticket");
        int a=data.nextInt();
      
        
        if(a==1) ci.Cinema_Ticket_Booking();
        if(a==2) bu.Cinema_Ticket_Booking();
        if(a==3) re.Cinema_Ticket_Booking();
        if(a==4) tr.Train_Ticket_Booking();

    }  
}