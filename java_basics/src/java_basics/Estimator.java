package java_basics;
import java.util.Scanner;
public class Estimator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner sc = new Scanner(System.in);
       int income;
       double alcohol;
       String drinkAlcohol;
       double alcohol1;
       double cost;
       double bankBalance;
       int monthlyPayment;
       
       // Taking inputs from user.
       System.out.println("We would like to get an estimate of your income and expenses. You can enter approximate values if you do not have the exact figures.");
       System.out.print("Enter the tootal amount of your annual income : $");
       income = sc.nextInt();
       
       System.out.print("Annual expenditure on Housing : $");
       double housing = sc.nextDouble();
       
       System.out.print("Annual expenditure on Transportation : $");
       double transportation = sc.nextDouble();
       
       System.out.print("Annual taxes payed : $");
       double taxes = sc.nextDouble();
       
       System.out.print("Utilities and other household costs : $");
       double util = sc.nextDouble();
       
       System.out.print("Annual expenditure on Food : $");
       double food = sc.nextDouble();
       
       System.out.print("Annual expenditure for Socail Security contributions, personal insurance and contributions : $");
       double contri = sc.nextDouble();
       
       System.out.print("Annual expenditure on Health Care : $");
       double healthCare = sc.nextDouble();
       
       System.out.print("Annual expenditure on Entertainment : $");
       double entertainment = sc.nextDouble();
       
       System.out.print("Annual expenditure on cash contributions(Cash contributions include child support or alimony payments, support for college students and donations to nonprofit organizations). : $");
       double cashContri = sc.nextDouble();
       
       System.out.print("Annual expenditure on Clothing Services : $");
       double clothing = sc.nextDouble();
       
       System.out.print("Annual expenditure on Education : $");
       double education = sc.nextDouble();
       
       System.out.print("Annual expenditure on Personal Care : $");
       double personalCare = sc.nextDouble();
       
              
       System.out.print("Do You consume Alcohol or Tobacoo? (Yes/No) : ");
	   drinkAlcohol = sc.next();
	   
	   if(drinkAlcohol.equals("Yes") || drinkAlcohol.equals("yes"))
	   {
		   System.out.print("How much do you spend on Alcohol and Tobacoo : $");
		   alcohol = sc.nextDouble();
		   
	   }
	 
	   else
	   {
		   
		   alcohol = 0;
	   }
	  
	   System.out.print("Do you own any other side source of income.(Yes/No)");
	   String sideSource = sc.next();
	   
	   double sideSourceProfit;
	   
	   if(sideSource.equals("Yes")||sideSource.equals("yes"))
	   {
		   System.out.print("What is the net profit you make from this side source of income annually : $");
		  sideSourceProfit = sc.nextDouble();
		 
	   }
	   else
	   {
		   sideSourceProfit = 0;
	   }
	   
	   
	   // making some calculations
       double expenses = housing + transportation + taxes + util + food + contri + healthCare + entertainment + cashContri + clothing + education + personalCare + alcohol;
       double tincome = income + sideSourceProfit;
       double netSaving = tincome - expenses;
       
       
       
       // Printing the calculations 
       
       System.out.println("Your total expenses are : $" + expenses);
       System.out.println("Your total income is : $" + tincome);
       System.out.println("Your net saving after basic expenses is : $" + netSaving);
       System.out.println();
       System.out.println("--------After looking at your income, we suggest your basic expenses should not cross the limits listed below--------");
       System.out.println();
       
       double housing1 = (25.0/100.0) * (income + sideSourceProfit);
	   System.out.println("Housing : $"+ housing1);
       
	   double transportation1 = (12.0/100.0  ) *  (income + sideSourceProfit);
       System.out.println("Transportation : $"+transportation1);
	   
       double taxes1 = (11.0/100.0) * (income + sideSourceProfit);
	   System.out.println("Taxes : $" + taxes1);
	   
	   double util1 = (10.0/100.0) * (income + sideSourceProfit);
	   System.out.println("Utilities and other household costs : $" + util1);
	   
	   double food1 = (9.0/100.0) * (income + sideSourceProfit);
	   System.out.println("Food : $" + food1);
	   
	   double contri1 = (9.0/100.0) * (income + sideSourceProfit);
	   System.out.println("Socail Security contributions, personal insurance and contributions  : $" + contri1);
	   
	   double healthCare1 = (6.0/100.0) * (income + sideSourceProfit);
	   System.out.println("Health Care : $" + healthCare1);

	   double entertainment1 = (3.0/100.0) * (income + sideSourceProfit);
	   System.out.println("Entertainment : $" + entertainment1);

	   double cashContri1 = (3.0/100.0) * (income + sideSourceProfit);
	   System.out.println("Cash contributions :" + cashContri1);

	   double clothing1 = (2.0/100.0) * (income + sideSourceProfit);
	   System.out.println("Clothing and services : $" + clothing1);

	   double education1 = (2.0/100.0) * (income + sideSourceProfit);
	   System.out.println("Education : $" + education1);

	   double personalCare1 = (1.0/100.0) * (income + sideSourceProfit);
	   System.out.println("Personal care : $" + personalCare1);


	     if(drinkAlcohol.equals("Yes"))
	   {
	    alcohol1 = (1.0/100.0) * (income + sideSourceProfit);
	   System.out.println("Alcohol and tobacoo : $" + alcohol1);
	   }
	   else        
	   {
		    alcohol1 = 0;
		   System.out.println("Very Good. We appreciate you not consuming alchol or tobacoo");
	   }
	   
	   double  totalExpensesExpected = housing1 + transportation1 + taxes1 + util1 + food1 + contri1 + healthCare1 + entertainment1 + cashContri1 + clothing1 + education1 + alcohol1 + personalCare1;

	   double totalSavingsExpected = tincome  - totalExpensesExpected ;
	  
	   
	   System.out.println("Total expenses expected this yead : $" + totalExpensesExpected);
       System.out.println("Total savings expected this year : $" + totalSavingsExpected);

       
	   // asking user if they are saving above or lower than the suggested amount and giving them suggestions on how can they save money
	 System.out.print("This is what we suggest your yearly savings should be.");
	
	 
	 
	 if(netSaving < totalSavingsExpected)
	 {
		 System.out.println("We suggest you cut down on your expenses. Saving on un-necessay expenses can help you stay prepared in case any uncertain expenses arise in future");
	     System.out.print("Do You want us help you decide what expenses you should cut-down.(Yes/No) ");
	     String help = sc.next();
	     
	     if(help.equals("Yes"))
	     {
	    	 if(housing > housing1)
	    	 {
	    		 System.out.println("You are overspending on your housing. You need to calm down a bit");
	    		 
	    	 }
	    	 else
	    	 {
	    		 System.out.println("You are spending the righ amount on your housing");
	    	 }
	    	 
	    	 if(transportation > transportation1)
	    	 {
	    		 System.out.println("You are spending way too much on transportation. We suggest adopting public transport to commute.");
	    	 }
	    	 else
	    	 {
	    		 System.out.println("You are spending the right amount on your transportation");
	    	 }
	        if(food>food1)
	        {
	        	System.out.println("You are spending way too much on food items");
	        }
	        else
	        {
	        	System.out.println("You are spending the righ amount of money on food items");
	        }
	        if(entertainment > entertainment1)
	        {
	        	System.out.println("We feel you are spending a lot of money on your entertainment.You need to tune down a bit");
	        }
	        else
	        {
	        	System.out.println("You are spending the right amount of money on your entertainment");
	        }
	        if(clothing > clothing1)
	        {
	        	System.out.println("You are spending too much money on clothing");
	        }
	        else
	        {
	        	System.out.println("You are spending the right amount on clothes");
	        }
	       if(personalCare > personalCare1)
	       {
	    	   System.out.println("You are spending too much money on personal care");
	       }
	       else
	       {
	    	   System.out.println("You are spending the right amount on personal care");
	       }
	        if(drinkAlcohol.equals("Yes"))
	        	
	        {
	        	if(alcohol > alcohol1)
	        	{
	        		System.out.println("You are spending a lot of money on alcohol and tobacoo");
	        	}
	        	else
	        	{
	        		System.out.println("You are spending right amount of money on alcohol and tobcoo. We would appreciate if you could stop consuming such products as they are not good for your health");
	        	}
	        
	        }
	        else
	        {
	        	System.out.println("We are proud of you that you dont consume such products. Not only are they a waste of money, but also are really bad for your health");
	        }
	        
	     }
	    		 
	 }
	 else
	 {
		 System.out.println("Well Done. Saving money is really important. Instead of spending on luxuries, its better if you save it now and later invest on something that is more of an asset rather than a liability.");
	 }
	     // helping user determine if they should spend the money if they plan to buy any expensive item like a vehicle,etc
	 System.out.println("Do you plan to spend a large sum of money anytime soon?(example - buying a vehicle) ");
	 String futureInvestment = sc.next();
	 
	 if(futureInvestment.equals("Yes"))   	  
	 {
		 System.out.print("Will you take a loan or will you pay in cash for it.(Cash/Loan)");
		 String cashORloan = sc.next();
		 
		 if(cashORloan.equals("Cash")) 
		 {
		 System.out.print("Enter your current Bank Balance : $");
		  bankBalance = sc.nextDouble();
		 System.out.print("How much do you plan to spend on this? $");
		  cost = sc.nextDouble();
		 System.out.println("Do you really need it? (Answer Yes for need it/No for Can wait longer)");
		 String urgency = sc.next();
		 
		 // asking user about the urgency of buying the item and then setting the percentages on the basis of their input.
		
		 if(urgency.equals("Yes")) 
		 {
			 if(cost <= (25.0/100.0)*bankBalance)
			 {
				 System.out.println("You can affoard the product");
			 }
			 
			 else 

			 {
				 System.out.println("Your bank balance does not allows you to invest in this product");
			 }
		}
		   else 
		 {
			 if(cost <= (12.5/100/0)* bankBalance) 
			 {
				 System.out.println("You can affoard the product");
			 }
			 else 			 {
				 System.out.println("Your bank balance does not allow you to invest in this product");
			 }
		 }
		 
		 }
		 
		 else // helping user calculate the monthly payment if they opt to pay by loan
		 {
			 int loan;
				int loanLength;
				int interestRate;
				int downPayement;
				System.out.print("Enter the amount of Car Loan : $");
				loan = sc.nextInt();
				System.out.print("Enter the time period of loan(in years"); 
				loanLength = sc.nextInt();
				System.out.print("Enter the interest % : ");
				interestRate = sc.nextInt();
				System.out.print("Enter the down payement made");
				downPayement = sc.nextInt();
				
				if(loanLength<=0 || interestRate<=0)
				{
			        System.out.println("Error! You must take out a valid loan.");
				}
			      else if(downPayement>=loan)
			      {
			 System.out.println("The car can be paid in full.");
			      }
			      else
			      {
			 int remainingBalance = loan - downPayement; 
			     int months = loanLength *12;
			       int monthlyBalance = remainingBalance / months; 
			    int interest = monthlyBalance * interestRate / 100;
			       monthlyPayment = monthlyBalance + interest;
				  System.out.println("Your monthly payment is : $" + monthlyPayment);
				  {

			 if( monthlyPayment >= (15.0/100.0)*((income + sideSourceProfit)/12)) 			 {
				 System.out.println("We dont suggest you buying this product");
			 }
		 else 
			 {
				 System.out.println("You can affoard this product");
			 }
		 }
			      }
	 }
	 }
	 else 
	    {
	    	 System.out.println("");
	 }                                                                                                                     
	 System.out.println("THANK YOU FOR USING OUR APPLICATION");

	
	}

}
	
