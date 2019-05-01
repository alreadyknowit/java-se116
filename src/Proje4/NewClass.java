
package proje4;

public class NewClass {

    private String userName ="admin";  // In order to reach admin launch, username must be entered by user.

    private String password = "123"; // In order to reach admin launch, password must be entered by user.

    private double priceOfGas = 6.21; // Price of oil.We arange it as 6.21 for .Only admin can change the price.

    private double amountOfGas; // Integer for customers to indicate how many liters they want to buy.

    private double price;  // This integer substitutes for price that entered by customers.

    private double storedGas = 14569.28; //indicates how many liters oil there are in the oil tanker.

    private double casee;//case info

    private double sold;

    private double sold2;

 
    public void setUserName(String userName) //to set username to get it in project class.

    {

        this.userName = userName;

    }

    public String getUserName() //to get username to be able to return username.

    {

        return this.userName;      

    }

    public void setPassword(String password)//to set password to get it in project class.

    {

        this.password = password;  

    }

    public String getPassword() //to get password to be able to return password.

    {

        return this.password;      

    }

    public void setPriceOfGas(double enteredPriceOfGas)

    {

        this.priceOfGas = enteredPriceOfGas; 

    }

    public double getPriceOfGas()

    {

     return this.priceOfGas;      

    }

    public void setAmountOfGas(double enteredAmountOfGas)

    {

        this.amountOfGas =enteredAmountOfGas;  

    }

    public double getAmountOfGas()

    {

     return this.amountOfGas;      

    }

 
     public void setPrice(double price)

    {

        this.price = price;    

    }

    public double getPrice()

    {

     return price;      

    }

 
    public void  setStoredGas(double storedGas)

    {

     this.storedGas = storedGas;

    }

    public double getStoredGas()

    {

     return storedGas;

    }

    public void setCase(double myCase)

    {

        this.casee =myCase;  

    }

   

    public double getCase()

    {

     return casee;      

    }

    public void setSold(double sold){

            this.sold=sold;

}

    public double getSold(){

        return sold;

       
    }

     public void setSold2(double sold2){

            this.sold2=sold2;

}

    public double getSold2(){

        return sold2;

    }

    public void EndOfDay(){ // pressing 5 will get you this menu.

        System.out.println("Daily Sold Oil:" + (getSold()+getSold2()));

        System.out.println("Daily Case: " + getCase());

        System.out.println("Remain Stored Oil: " + getStoredGas());

    }

}


