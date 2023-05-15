package Customer;

import java.util.Scanner;


public class MainApp {
    static Scanner sc = new Scanner(System.in);
    static Customer c1 = new Customer();

    public static void main(String[] args) {
        boolean flag = true;
        while (flag) {
            System.out.println("1.ADD CUSTOMER \t\t2.DISPLAY CUSTOMER \t\t3.DELETE CUSTOMER\t\t4.UPDATE CUSTOMER NAME \t\t5.EXIT");
            Scanner sc = new Scanner(System.in);
            System.out.print("enter your choice : ");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    add_Customer();
                    break;
                case 2:
                    display_Customer();
                    break;
                case 3:
                    remove_Customer();
                    break;
                case 4:
                    update_Customer_Name_By_Id();
                    break;
                case 5:
                    System.out.println("Exited");
                    flag = false;
                    break;
                default:
                    System.out.println("enter valid choice");
            }
        }
    }

    private static void update_Customer_Name_By_Id() {
        System.out.print("enter customer id : ");
        int id = sc.nextInt();
        System.out.print("enter customer name : ");
        String name = sc.next();
        c1.update_Customer_Name_By_Id(id, name);
    }

    private static void remove_Customer() {
        System.out.print("enter customer id : ");
        int id = sc.nextInt();
        c1.remove_Customer(id);
    }

    private static void display_Customer() {
        c1.display_Customer();
    }

    private static void add_Customer() {
        System.out.print("enter customer id : ");
        int id = sc.nextInt();
        System.out.print("enter customer name : ");
        String name = sc.next();
        System.out.print("enter customer salary : ");
        double salary = sc.nextDouble();
        c1.add_Customer(id, name, salary);
    }
}
