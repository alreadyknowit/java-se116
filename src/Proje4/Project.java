package proje4;

 

 

 

import java.util.Scanner; //To be able to get integer, string etc. from the user.

 

import java.util.concurrent.TimeUnit;  //to be able to retard process.

import java.util.ArrayList;

public class Project {

 

    public static void print (ArrayList<String> a ){            //to print arraylist

        for (int g =0 ; g< a.size();g++){

                        System.out.println(a.get(g) +" press " + (g+1));

                    }

    }


    public static void main(String[] args) throws InterruptedException { //to be able to retard process.

     Scanner input = new Scanner(System.in);

    ArrayList<String> arraylist = new ArrayList<>(); // for admin and costumer menu

    NewClass display = new NewClass(); // in order to get method from newclass.

    arraylist.add ("To change oil price ");

    arraylist.add ("To display to case information ");

    arraylist.add ("To view information so far ");

    arraylist.add ("To add gas");


    int carCounter=0;

    int CaseMoney=0;

    int sold1=0;

    int sold3=0;
 

    while(true)

    {

        System.out.println("Please press one(1) to display admin menu or press two(2) to market."

                + "\nPress five(5) in order to end the day and display result.");

        int clicked= input.nextInt(); //to get integer that will direct you to choosen menu.

        double newPrice=0; //price of oil.

        if (clicked==5) { //entering end of day.

 

            break;
        }

        switch(clicked)
        {

         case 1: //admin panel.

             for(int i =3;i>0;i--) //after 3 wrong trials, system will shut down in order to provide the security.
             {

                System.out.print("Enter username: ");
                String user = input.next();

     
               System.out.print("Enter password: ");
               String passw=input.next();                   

            
                 if( user.equals(display.getUserName()) &&  passw.equals(display.getPassword()))

                    //if password and username be entered correct then user be allowed to enter to admin launch.

                 {

                    System.out.println("Welcome to admin lunch");

                    System.out.println("Here is your menu.");

                    print(arraylist); // to ge arraylist from above.               

                    int choosenMenu =input.nextInt();

                    switch(choosenMenu) //  for admin panel features

                    {

                           case 1: // changing oil price

                               System.out.println("Oil price: " + display.getPriceOfGas());

                               System.out.println("Enter new oil price.");

                               newPrice = input.nextDouble(); // getting value from the admin.

                               display.setPriceOfGas(newPrice); // to change value with new price that got from admin.

                               System.out.println("New oil price is " + display.getPriceOfGas()); // display new oil price.


                               break;

 
                           case 2 :  // to display case and amount of stored gas.

                               System.out.println("Case: " + display.getCase());

                               System.out.println("Stored Gas: " + display.getStoredGas());

                              
                               break;

                           case 3 : // daily information.(pressing )

                               System.out.println("Daily sold amount of oil: " +(display.getSold()+display.getSold2()));

                               System.out.println("The number of cars: " + carCounter);

                               System.out.println("Daily case information: " + display.getCase());

 

                           break;

                           case 4 : // to add gas
                               
                               System.out.println("Stored Gas: " + display.getStoredGas());

                               System.out.println("Enter the amount of adding gases: ");

                               double miktar=input.nextInt();

                               double yeni= display.getStoredGas()+ miktar;

                               display.setStoredGas(yeni);

                               System.out.println("New amount of gas: " + display.getStoredGas() );

                               break;

                    }

                   break;
                   }
 
                 else
                 {

                    if(i !=1) // after 3 wrong trials.

                    {

                        System.out.println("Username or password might be wrong.Try agian.You have "+ (i-1)+ " trials.");

                    }

                 }          
                  if(i==1) //to shut down system when i equals 1.

                  {

                   System.err.println("System is shutting down.");
                    break; // to shut down system.

                  }

 

                }
          break; // to end case 1.

 

          case 2:

                    System.out.println("Welcome to costumer menu.");

                   System.out.println("******************************");

                   System.out.println("Please enter selling type.");

                   System.out.println("Press one(1):Currency" + "\nPress two(2):Liter");

                   System.out.println("*******************************");


                    int type = input.nextInt(); // to indicate type you want to buy in terms of liter or currency.

                    double termPrice; //will be used to substitute for price that entered by costumer.

                
                    switch(type)

                    {

 

                        case 1:

                            System.out.println("Enter Price.");
                            termPrice = input.nextDouble();

 
                            if  (termPrice/ display.getPriceOfGas()< display.getStoredGas()){


                            System.out.println("Process will be started soon.Please wait...");
                            TimeUnit.SECONDS.sleep(5); // to delay process in order to  make it more realistic.

                         
                           double result = termPrice / display.getPriceOfGas();             //to find how many liter wanted to buy.

                            System.out.println(result + " liters fuel up.");   

                            System.out.println("Process has started.Please wait.");
                             TimeUnit.SECONDS.sleep(5);

                            System.out.println("Process accomplished.");
                             TimeUnit.SECONDS.sleep(3);

                             double  termCase= display.getCase(); //in order to calculate the equation following.

                            double  termStoredGas=display.getStoredGas(); //in order to calculate the equation following.

                            termStoredGas -=result; // to update amount of gas in the oil tank.
 
                            termCase+=termPrice;//to updet case.

                            display.setCase(termCase); // to save case info.

                            display.setStoredGas(termStoredGas); //to save new amount of stored gas.

                            sold1 +=result; // for sold oil

                            display.setSold(sold1); // to view the oil that sold

                           carCounter++; // to determine how many cars visit daily.

                      
                                System.out.println("================================================");

                            }

                            else {

                                System.out.println("Warnning.There is no more fuel oil!");

                            }

                          break;


                        case 2:

                            System.out.println("Enter liter amount you want to buy.");
                            double tempLiter = input.nextDouble(); //to get value from costumer.

                            if ( tempLiter<display.getStoredGas()) { // to prevent selling if stored gass less than stored gas.

 
                             termPrice = tempLiter * display.getPriceOfGas(); //to calculate liter as currency.

 
                            double resuld= display.getCase()  + termPrice;  // to add taken money to case.


                            display.setCase(resuld); //saving case.

 
                            double tempStoredGas=display.getStoredGas() - tempLiter; // to diminish amount of stored gas.

                            display.setStoredGas(tempStoredGas); //save stored gas.

                          
                            System.out.println("Price: "+ termPrice); // to show costumers howw much they should pay.

 
                            System.out.println("Please put the money in cash machine."); // make it more realistic.
                            TimeUnit.SECONDS.sleep(5);


                            System.out.println("Please wait.Checking process.");
                             TimeUnit.SECONDS.sleep(5);


                            System.out.println("Process has started.Do not pull petrol pump.");
                            TimeUnit.SECONDS.sleep(5);
 

                            carCounter++; //increasing number of cars

                            sold3 +=tempLiter; //for sold amount of oil.

                            display.setSold2(sold3); //to view the oil that sold

                             System.out.println("=================================================");

                            }

                            else {

                                System.out.println("Stored amount of gas:" +display.getStoredGas());

                                System.out.println("Please enter less amount of gas because there is no enough oil.");

                            }

                            break;
                    }

                   break;


           default:

                   System.out.println("Enter valid number.");

        }

    }

                   //This menu will display daily information.

                   System.out.print("Enter username: ");
                  String user = input.next();

 
                  System.out.print("Enter password: ");
                  String passw=input.next();

 
                  if( user.equals(display.getUserName()) &&  passw.equals(display.getPassword())){

                   System.out.println("Daily Visiters: " + carCounter);

                   display.EndOfDay();

 
                  }

 

        }

}

 

 