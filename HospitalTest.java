import java.util.Scanner;

public class HospitalTest {
  public static void main(String[] args) {
    Hospital hospital = new Hospital("UST Hospital");
    int option;
    Scanner sc = new Scanner(System.in);
    do {
      System.out.println("Command:");
      System.out.println("(1) Display the number of empty beds");
      System.out.println("(2) Display the list of empty beds");
      System.out.println("(3) Display the list of occupied beds");
      System.out.println("(4) Assign a patient to a bed");
      System.out.println("(5) Remove a bed assignment");
      System.out.println("(6) Print hospital");
      System.out.println("(7) Quit");
      System.out.print("\nOption: ");
      option = sc.nextInt();
      switch(option) {
         case 1: hospital.showNumEmptyBeds(); break;
         case 2: hospital.showEmptyBeds();    break;
         case 3: hospital.showOccupiedBeds(); break;
         case 4: System.out.print("Enter the patient's name: ");
                 String name = sc.next();
                 hospital.assignBed(name);
                 break;
         case 5: System.out.print("Enter the bed ID: ");
                 int bedId = sc.nextInt();
                 hospital.removeBed(bedId);
                 break;
         case 6: System.out.print(hospital);
      }
      System.out.println();
    }while(option != 7);
   } 
}