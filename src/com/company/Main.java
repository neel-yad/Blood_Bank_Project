package com.company;
/* Assumption......
 * Printing request sent show that request has been sent to particular mobile
 * As i haven't use any type of database so once program is closed all data will be erased
 * user should enter only numerical value in phone aadhar column
 * single username is used for admin i.e every admin can login using same username "neel"
 * */

import java.util.ArrayList;
import java.util.Scanner;

//Class for user registration

class user_registration {
    String name;
    String Address;
    String Blood_Group;
    long Phone_no;
    long Adhaar_no;
}

//Class for adding Hospital

class hospital {
    String name;
    String Address;

    public hospital(String name_1, String Address_1) {
        this.name = name_1;
        this.Address = Address_1;
    }
}

//Class for Blood Donation Camp

class blood_donation_camp {
    String name;
    String Address;

    public blood_donation_camp(String name_1, String Address_1) {
        this.name = name_1;
        this.Address = Address_1;
    }
}

public class Main {
    static ArrayList<user_registration> normal_bloodgrp_list
            = new ArrayList<>(100);
    static ArrayList<user_registration> rare_bloodgrp_list
            = new ArrayList<>(100);
    static Scanner sc = new Scanner(System.in);
    static Scanner scanner = new Scanner(System.in);
    static ArrayList<blood_donation_camp> blood_camp_list
            = new ArrayList<>(100);
    static ArrayList<hospital> hospital_list
            = new ArrayList<>(100);
    public static void add_user() {
        user_registration user_registration_instance = new user_registration();
        System.out.println("----------Enter Yours Details--------");
        System.out.println("Enter Your Name: ");
        user_registration_instance.name = sc.nextLine();
        System.out.println("Enter Your Address: ");
        user_registration_instance.Address = sc.nextLine();
        System.out.println("Enter Your Blood Group: ");
        String Blood_grp = sc.nextLine();
        System.out.println("Enter Your Phone_No.: ");
        user_registration_instance.Phone_no = Long.parseLong(sc.nextLine());
        System.out.println("Enter Your Adhaar_no.: ");
        user_registration_instance.Adhaar_no = Long.parseLong(sc.nextLine());
        user_registration_instance.Blood_Group = Blood_grp;
        if (Blood_grp.equals("A-") || Blood_grp.equals("B-") || Blood_grp.equals("O-") || Blood_grp.equals("AB-")) {
            rare_bloodgrp_list.add(user_registration_instance);
        } else if(Blood_grp.equals("A+")||Blood_grp.equals("B+")||Blood_grp.equals("O+")){
            normal_bloodgrp_list.add(user_registration_instance);
        }
        else
        {
            System.out.println("Please Enter proper Blood Group");
        }
    }
    public static void view_users(){
        System.out.println("1.User with Normal Blood Group");
        System.out.println("2.User with Rare Blood Group");
        System.out.println("3.Both");
        int sele=Integer.parseInt(sc.nextLine());
        switch (sele)
        {
            case 1:
            {
                System.out.println("------USER HAVING NORMAL BLOOD GROUP---------");
                for (int i=0;i<normal_bloodgrp_list.size();i++)
                {
                    System.out.println("Name of User: "+normal_bloodgrp_list.get(i).name);
                    System.out.println("Address of User: "+normal_bloodgrp_list.get(i).Address);
                    System.out.println("Blood Group of User: "+normal_bloodgrp_list.get(i).Blood_Group);
                    System.out.println("Phone_No. of User: "+normal_bloodgrp_list.get(i).Phone_no);
                    System.out.println("Aadhaar_no. of User: "+normal_bloodgrp_list.get(i).Adhaar_no);
                    System.out.println("  ");
                }
                break;
            }
            case 2:
            {
                System.out.println("------USER HAVING RARE BLOOD GROUP---------");
                for (int i=0;i<rare_bloodgrp_list.size();i++)
                {
                    System.out.println("Name of User: "+rare_bloodgrp_list.get(i).name);
                    System.out.println("Address of User: "+rare_bloodgrp_list.get(i).Address);
                    System.out.println("Blood Group of User: "+rare_bloodgrp_list.get(i).Blood_Group);
                    System.out.println("Phone_No. of User: "+rare_bloodgrp_list.get(i).Phone_no);
                    System.out.println("Aadhaar_no. of User: "+rare_bloodgrp_list.get(i).Adhaar_no);
                    System.out.println("  ");
                }
                break;
            }

            case 3:
            {
                System.out.println("------USER HAVING NORMAL BLOOD GROUP---------");
                for (int i=0;i<normal_bloodgrp_list.size();i++)
                {
                    System.out.println("Name of User: "+normal_bloodgrp_list.get(i).name);
                    System.out.println("Address of User: "+normal_bloodgrp_list.get(i).Address);
                    System.out.println("Blood Group of User: "+normal_bloodgrp_list.get(i).Blood_Group);
                    System.out.println("Phone_No. of User: "+normal_bloodgrp_list.get(i).Phone_no);
                    System.out.println("Aadhaar_no. of User: "+normal_bloodgrp_list.get(i).Adhaar_no);
                    System.out.println("  ");
                }
                System.out.println("------USER HAVING RARE BLOOD GROUP---------");
                for (int i=0;i<rare_bloodgrp_list.size();i++)
                {
                    System.out.println("Name of User: "+rare_bloodgrp_list.get(i).name);
                    System.out.println("Address of User: "+rare_bloodgrp_list.get(i).Address);
                    System.out.println("Blood Group of User: "+rare_bloodgrp_list.get(i).Blood_Group);
                    System.out.println("Phone_No. of User: "+rare_bloodgrp_list.get(i).Phone_no);
                    System.out.println("Aadhaar_no. of User: "+rare_bloodgrp_list.get(i).Adhaar_no);
                    System.out.println("  ");
                }
                break;
            }
        }

    }
    public static void send_request()
    {
        System.out.println("Blood Group needed");
        String blood_grp=scanner.nextLine();
        if (blood_grp.equals("A-")||blood_grp.equals("B-")||blood_grp.equals("AB-")||blood_grp.equals("O-"))
        {
            for (int i=0;i<rare_bloodgrp_list.size();i++)
            {
                if (rare_bloodgrp_list.get(i).Blood_Group.equals(blood_grp))
                {
                    System.out.println("Request Send to"+rare_bloodgrp_list.get(i).name);
                    System.out.println("Aadhaar no. of user is"+rare_bloodgrp_list.get(i).Adhaar_no);
                }
            }
        }
        else
        {
            for (int i=0;i<normal_bloodgrp_list.size();i++)
            {
                if (normal_bloodgrp_list.get(i).Blood_Group.equals(blood_grp))
                {
                    System.out.println("Request Send to"+normal_bloodgrp_list.get(i).name);
                    System.out.println("Aadhaar no. of user is"+normal_bloodgrp_list.get(i).Adhaar_no);
                }
            }
        }
    }
    public static void add_donation_camp() {
        System.out.print("Enter Name of Blood Camp: ");
        String name = scanner.nextLine();
        System.out.print("Enter Address of Blood Camp: ");
        String Address = scanner.nextLine();
        blood_donation_camp blood_camp_instance = new blood_donation_camp(name, Address);
        blood_camp_list.add(blood_camp_instance);
    }

    public static void view_blood_camps() {
        if (blood_camp_list.isEmpty())
        {
            System.out.println("No Blood Camps Added...");
        }
        else {
            System.out.println("----------------LIST OF BLOOD CAMPS------------------");
            for (int i = 0; i < blood_camp_list.size(); i++) {
                System.out.println("Camp Name: " + blood_camp_list.get(i).name);
                System.out.println("Camp Address: " + blood_camp_list.get(i).Address);
                System.out.println("  ");
            }
        }
    }

    public static void add_hospital() {
        System.out.print("Enter Name of Hospital: ");
        String name = scanner.nextLine();
        System.out.print("Enter Address of hospital: ");
        String Address = scanner.nextLine();
        hospital hospital_instance = new hospital(name, Address);
        hospital_list.add(hospital_instance);
    }

    public static void view_hospital() {
        if (hospital_list.isEmpty())
        {
            System.out.println("No Hospital is added..");
        }

        else {
            System.out.println("-----------LIST OF HOSPITALS ------------------");
            for (int i = 0; i < hospital_list.size(); i++) {
                System.out.println("Hospital Name: " + hospital_list.get(i).name);
                System.out.println("Hospital Address: " + hospital_list.get(i).Address);
                System.out.println("  ");
            }
        }
    }

    public static void main(String[] args) {
	// write your code here
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1.User Registration");
            System.out.println("2.Admin Login");
            int select = Integer.parseInt(sc.nextLine());
            switch (select) {
                case 1: {
                    add_user();
                    break;
                }
                case 2: {
                    System.out.println("Enter Your username");
                    String username = scanner.nextLine();
                    if (username.equals("neel")) {
                        System.out.println("Congratulation You are signed in...Select among following");
                        System.out.println("1.View Users");
                        System.out.println("2.Add Hospital& View List ");
                        System.out.println("3.Add Blood Camp & View List ");
                        System.out.println("4.Send Request");
                        int choice = Integer.parseInt(sc.nextLine());
                        switch (choice) {
                            case 1: {
                                view_users();
                                break;
                            }
                            case 2: {
                                add_hospital();
                                view_hospital();
                                break;
                            }
                            case 3: {
                                add_donation_camp();
                                view_blood_camps();
                                break;
                            }
                            case 4:
                            {
                                send_request();
                            }
                        }
                    }

                }
            }
            System.out.println("Exist Or Continue");
            String resu=scanner.nextLine();
            if (resu.equals("Exist"))
            {
                break;
            }

        }
    }
}
