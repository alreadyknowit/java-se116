
package Homework;

public class Player {
    
    private String name;
    private int shirtNumber;
    private String position;
    private double value;

    public  Player()
    {
        this.name="No name";
        this.shirtNumber=0;
        this.position="No position";
        this.value=0.0;
    }
    public Player(int shirtNumber,String name,String position, double value)
    {
        this.name=name;
        this.position=position;
        this.shirtNumber=shirtNumber;
        this.value=value;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        
        this.name = name;
    }

    public int getShirtNumber() {
        return shirtNumber;
    }

    public void setShirtNumber(int shirtNumber) {
        if(shirtNumber<0 || shirtNumber>100){
            System.out.println("Shirt number shoulde in the range [0,100]");
             shirtNumber=-1;
        }
        this.shirtNumber = shirtNumber;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }
     public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }
   
    public void displayPlayer()
    {
       
        System.out.println("Name         : " +name);
        System.out.println("Shirt Number : " +shirtNumber);
        System.out.println("Position     : " +position);
        System.out.println("Player Value : " +getValue());
        System.out.println("");
    }

    
}
