/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Quiz;

/**
 *
 * @author Godless Chicken
 */
public class BasketballPalyer {
    private String name;
    private int backNumber,age,tall;
    private static int numberOfPlayer;
    
    public BasketballPalyer(String name, int backNumber,int age,int tall) {
        this.name = name;
        this.backNumber = backNumber;
        this.age=age;
        this.tall=tall;
        numberOfPlayer++;
    }

    public static int getNumberOfPlayer() {
        return numberOfPlayer;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBackNumber() {
        return backNumber;
    }

    public void setBackNumber(int backNumber) { 
        if(backNumber<0 || backNumber>=100)
            throw new IllegalArgumentException("Back Number must be in the range [1,99]");
        else
            this.backNumber=backNumber;
    }
        public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getTall() {
        return tall;
    }

    public void setTall(int tall) {
        this.tall = tall;
    }
    public void printInfo()
    {
        System.out.println("Name: " +name);
        System.out.println("Age: " +age);
        System.out.println("Back Number: " +getBackNumber());
        System.out.println("Tall: " +getTall()+"cm");
        System.out.println("Number of player: " +getNumberOfPlayer());
    }
  
}
