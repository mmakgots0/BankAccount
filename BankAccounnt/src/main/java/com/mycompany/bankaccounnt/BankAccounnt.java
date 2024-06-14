package com.mycompany.bankaccounnt;

import java.util.Scanner;

public class BankAccounnt {
     static float MainAcc,SavingsAcc;
     static int PIN,phoneNum,DOB,choice,AccountNum=  225556644;
     static String name,surname,gender,choices,Option,AccountHol= "Ms. M.Thejane";
     static float amount,InitialBal= 20056;
     static float InitialBal2= 2056;
     
     private static int Security(){
         Scanner k= new Scanner (System.in);
            do{
                
               PIN=k.nextInt();
               if(PIN!= 4565){
                   System.out.println("Please try again");
                   
               }
            }
            while(PIN!=4565);
               System.out.println("Welcome "+ AccountHol);
               System.out.println("Account number: "+ AccountNum);
               return 0;
     }
     
    public static String SignOut(){
           System.out.println("*******Signed out*******"); 
           return null;
     } 
    public static void Options(){
        System.out.println("*******MENU*******");
        System.out.println("1. Create New Account");
        System.out.println("2. Check Balance.");
        System.out.println("3. Deposit money");
        System.out.println("4. Withdraw money");
        System.out.println("5. Tranfer money");
        System.out.println("6. Exit" );
    }
    public static void Details(){
        Scanner s=new Scanner (System.in);
        System.out.println("Would you like to open a cheque account,Savings account,credit or debit account?");
        choices=s.next();
        System.out.println("Enter your Name");
        name=s.next();
        System.out.println("Enter your Surname");
        surname=s.next();
        System.out.println("Enter your Gender");
        gender=s.next();
        System.out.println("Enter your Phonenumber");
        phoneNum=s.nextInt();
        System.out.println("one last thing, enter your ID number");
        DOB=s.nextInt();
        System.out.println("*****************************************");
        System.out.println("Your "+ choice+ " Account detatils:");
        System.out.println("Acount Holder: "+ gender+" "+name+" "+ surname);
        System.out.println("Account Number: "+ AccountNum);
        System.out.println("Phone number: "+phoneNum);
        System.out.println("Date of Birth: "+DOB);
           

    
    }
    public static void setDeposit(){
         Scanner t=new Scanner(System.in);
         System.out.println("how much would you like to deposit?");
         amount=t.nextFloat();
         MainAcc = InitialBal + amount;
         System.out.println("Account Balance: R "+ MainAcc);
         InitialBal=MainAcc;     
     }
    public static  void setWithdrawals(){
        Scanner s=new Scanner(System.in);
        System.out.println("How much would you like to withdraw?");
        amount=s.nextFloat();
        if(amount<= InitialBal){
            MainAcc= InitialBal - amount;
            System.out.println("Account Balance: R "+ MainAcc);
            InitialBal=MainAcc;
        }
        else{
            System.out.println("Your balance is insufficient");} 
     }
    public static void Transfers(){
       //tranfer money to BankAccount2
       Scanner v=new Scanner (System.in);
        System.out.println("How much do you want to tranfer to your 2nd account?");
        amount= v.nextFloat();
        SavingsAcc= InitialBal2 + amount;        
        System.out.println("Account2 Balance : R" + SavingsAcc);
    }

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("**Enter Account Pin**");
        System.out.println(+Security());
        Options();
        do{
            if(choice!= 6){
              choice=s.nextInt();
                 switch(choice){
                    case 1 -> Details();
                    case 2 -> System.out.println("Your Current Balance: R"+InitialBal);
                    case 3 -> setDeposit();
                    case 4 -> setWithdrawals();
                    case 5 -> {
                        Transfers();
                        System.out.println("****************************************");
                        MainAcc=InitialBal-amount;
                        System.out.println("Main account Balance : R"+ MainAcc);
                    }
                    case 6 -> Option=SignOut();
                    default -> System.out.println("Selected option is invalid");
}  
           }
        }
        while(choice!=6);
        System.out.println("Thank you for banking with us!");       
       }
}
   
    

