
package Homework2;

/**
 *
 * @author AbdurrahmanDemiri
 */
public class TvSeries extends Watch{
    private int numberOfSeasons;
    private String producer,cast;
   
    public TvSeries(String name, int duration, String type, int numberOfSeasons,double rate,String producer,String cast) 
    {
        super(name, duration, type,rate);
        this.numberOfSeasons=numberOfSeasons;
        this.producer=producer;
        this.cast=cast;
      
    }
    
     public int getNumberOfSeasons() {
        return numberOfSeasons;
    }

    public void setNumberOfSeasons(int numberOfSeasons) {
        this.numberOfSeasons = numberOfSeasons;
    }
    
    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public String getCast() {
        return cast;
    }

    public void setCast(String cast) {
        this.cast = cast;
    }

    
    @Override
    public void cast() {
        System.out.println("Producer : " +getProducer());
        System.out.println("Cast     : "+cast);
     
    }
    
    @Override
    public void display()
    {
        System.out.println("**Tv Series");
        super.display();
     System.out.println("Number Of Seasons :" +numberOfSeasons);
    }
    
}
