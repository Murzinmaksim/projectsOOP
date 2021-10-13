package edu.csf.oop.java.shedule;

import edu.csf.oop.java.shedule.faculties.Subject;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String action  = null;
        while (!Objects.equals(action, "exit")){
            System.out.println("Select an action:");
            System.out.println("add");
            System.out.println("exit");
             action = console.nextLine();
             if(Objects.equals(action, "add")){
                 ArrayList<Subject> subj = new ArrayList<Subject>();
             }
            if(Objects.equals(action, "print")){

            }
        }
    }
}
