import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int size1 = 6;
        String[] myList1 = new String[size1];
        myList1[1] = "unreadable";
        myList1[2] = "barely readable,occasional words distinguishable";
        myList1[3] = "readable with considerable difficulty";
        myList1[4] = "readable with practically no difficulty";
        myList1[5] = "perfectly readable";
        int size2 = 10;
        String[] myList2 = new String[size2];
        myList2[1] = "Faint signals,barely perceptible";
        myList2[2] = "Very weak signals";
        myList2[3] = "Weak signals";
        myList2[4] = "Fair signals";
        myList2[5] = "Fairly good signals";
        myList2[6] = "Good signals";
        myList2[7] = "Moderately strong signals";
        myList2[8] = "Strong signals";
        myList2[9] = "Extremly strong signals";
        Scanner in = new Scanner(System.in);
        int RS = in.nextInt();
        int R = RS/10;
        int S = RS%10;
        while (11>=RS || RS>=59) {
            System.out.println("Please enter valid data.");
            RS = in.nextInt();
        }
                System.out.print(myList2[S] + ",");
                System.out.println(myList1[R] + ".");
    }
}