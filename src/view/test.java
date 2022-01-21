package view;//package view;
//
import java.util.Scanner;
public class test {
        public static void main(String [ ] args){
                Scanner sc= new Scanner(System.in);
                int first_num;
                int second_num;

                System.out.println("Enter First Number:");
                first_num= sc.nextInt();

                System.out.println("Enter Second Number:");
                second_num= sc.nextInt();

                if (first_num>second_num) {
                        System.out.println(first_num + " Is greater!!!");
                        System.out.println("THE BOTH NUMBER EQUAL");
                }

                else if (second_num>first_num) {
                        System.out.println(second_num + " Is greater!!!");
                        System.out.println("THE BOTH NUMBER EQUAL");
                }

                else {
                        System.out.println("THE BOTH NUMBER EQUAL");
                }

        }

}

