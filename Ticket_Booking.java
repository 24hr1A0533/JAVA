import java.util.Scanner;

public class Ticket_Booking {
    static String seats[][] = new String[9][6];

   
    static void Booking(int T_row, int T_col) {
        if (seats[T_row][T_col].equals("available")) {
            seats[T_row][T_col] = "booked     ";
        } else {
            System.out.println("Seat already occupied");
        }
    }


    Ticket_Booking() {
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 6; j++) {
                seats[i][j] = "available";
                System.out.print(seats[i][j] + "\t");
            }
            System.out.println();
        }
    }

    static void View() {
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 6; j++) {
                System.out.print(seats[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Ticket_Booking Lakshmi = new Ticket_Booking();
        Scanner data = new Scanner(System.in);

        System.out.println("Select your row (1-9):");
        int row = data.nextInt();

        System.out.println("Enter your column (1-6):");
        int column = data.nextInt();

        Booking(row - 1, column - 1); 
        View();

    }
}
