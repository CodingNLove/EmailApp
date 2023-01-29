package EmailApp;

import java.util.Scanner;

public class email {
    //created a class, email. Created variables
    private String firstname;
    private String lastname;
    private String password;
    private String department;
    private int mailboxCapacity;
    private int defaultPasswordLength=10;
    private String alternateEmail;

    //constructor to receive first and last name, first name & last are the parameters
    public email(String firstname, String lastname) {
        this.firstname = firstname; //this refers to class variable. firstname refers to the local variable
        this.lastname = lastname;
        System.out.println("EMAIL CREATED:" + this.firstname + " " + this.lastname);


        //Call a method asking for the department then return the department
        // the class variable department is being set to the (set department) that the user inputs below
        this.department = setDepartment();
        System.out.println("Department: " + this.department);


        // Call a method that generates a random password
        // the class variable password is being set to the random password generated below
        this.password = randomPassword(defaultPasswordLength);
        System.out.println("Your Password is:" + this.password);

        // Combine elements to generate email
    }

    //Method1: Ask for the department, import scanner utility to allow input,
    private String setDepartment() {
        System.out.print("Department Codes\n1 for Sales\n2 for Development\n3 for Accounting\n0 for None\nEnter Department Code:");
        Scanner in = new Scanner(System.in);
        int deptChoice = in.nextInt();
        if (deptChoice == 1) {return "Sales";}
        else if (deptChoice == 2) { return "Development";}
        else if (deptChoice == 3) {return "Accounting";}
        else {return "";}
    }

        //Method2: Define the possibilities password can be set to
        private String randomPassword ( int length){
            String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$%&*";
            // create an array of characters to generate a password
            char[] password = new char[length];
            //iterate through the value of the length to grab a value inside the array
            // take the character at that random num and pass through the array one at a time
            for (int i = 0; i < length; i++) {
                int rand = (int)(Math.random() * passwordSet.length());
                password[i] = passwordSet.charAt(rand);

            }
            //return a random password within the scope of the passwordset
            return new String(password);

        }
    }








    //set methods
    //ask for the dept

    //set the mailbox capacity
    //set the alternate email
    //change the password
