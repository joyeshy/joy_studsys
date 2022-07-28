package org.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.*;


public class StudMain {


    public static void main(String[] args) {

        System.out.println("welcome to the student management app");
        Scanner sc = new Scanner(System.in);

        while(true) {

            System.out.println("PRESS 1 TO ADD STUDENT");
            System.out.println("PRESS 2 TO DELETE STUDENT");
            System.out.println("PRESS 1 TO DISPLAY STUDENT");
            System.out.println("PRESS 1 TO EXIT APP");

            sc.nextLine();

            System.out.println("Dear user, please enter your choice : ");

            int c = sc.nextInt();

            if(c==1){

                System.out.println("Dear user, please enter your id : ");

                int id = sc.nextInt();


                System.out.println("Dear user, please enter your name : ");

                String name = sc.nextLine();


                System.out.println("Dear user, please enter your city : ");

                String city = sc.nextLine();


                System.out.println("Dear user, please enter your phone number : ");

                String phone = sc.nextLine();







            }
            else if(c==2){


            }
            else if(c==3){


            }
            else if(c==4){

                break;


            }
            else{

            }

        }





    }


}
