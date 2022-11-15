package labterminal;




   import java.util.Scanner;  

public class ATMMachine {

  

    public static void main(String args[] )  
    {  
       
        int balance = 100000, withdraw, deposit;  
          
        
        Scanner sc = new Scanner(System.in);  
          
        while(true)  
        {  
            System.out.println("Automated Teller Machine");  
            System.out.println("1.Withdraw");  
            System.out.println("2. Deposit");  
            System.out.println("3. Check Balance");  
            System.out.println("4. EXIT");  
            System.out.print("Choose the operation you want to perform:");  
              
            
            int choice = sc.nextInt();  
            switch(choice)  
            {  
                case 1:  
        System.out.print("Enter money to be withdrawn:");  
                      
 
        withdraw = sc.nextInt();  
                      
        
        if(balance >= withdraw)  
        {  
             
            balance = balance - withdraw;  
            System.out.println("Please collect your money");  
        }  
        else  
        {  
            
                   
            System.out.println("Insufficient Balance");  
        }  
        System.out.println("");  
        break;  
   
                case 2:  
                      
        System.out.print("Enter money to be deposited:");  
                      
        //get deposite amount from te user  
        deposit = sc.nextInt();  
                      
        //add the deposit amount to the total balanace  
        balance = balance + deposit;  
        System.out.println("Your Money has been successfully depsited");  
        System.out.println("");  
        break;  
   
                case 3:  
        //displaying the total balance of the user  
        System.out.println("Balance : "+balance);  
        System.out.println("");  
        break;  
   
                case 4:  
        //exit from the menu  
        System.exit(0);  
            }  
        }  
    }  
}  
