
package Homework2;

/**
 *
 * @author AbdurrahmanDemiri
 */
public abstract class Watch {
    private String name,type;
    private int duration;
    private double rate;

   
    public Watch(String name, int duration,String type,double rate) {
        this.name = name;
        this.duration = duration;
        this.type=type;
        this.rate=rate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
    
     public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }
   
     
    public abstract void cast();
      
    public void display()
    {
        System.out.println("NAME        : "+name);
        System.out.println("Type        : "+type);
        System.out.println("Duraiton    : "+getDuration()+" minutes");
        System.out.println("IMDB Rating : "+getRate());
        
    }
  
    
    
}
