
package Homework2;

/**
 *
 * @author AbdurrahmanDemiri
 */
public class Movies extends Watch{
        private String director,stars;
        
    public Movies(String name, int duration, String type,double rate,String director, String stars) {
        super(name, duration, type,rate);
        this.director=director;
        this.stars=stars;
       
    }
    
     public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getStars() {
        return stars;
    }

    public void setStars(String stars) {
        this.stars = stars;
    }

    @Override
    public void cast() 
    {
        System.out.println("Director       : "+getDirector());
        System.out.println("Actors/Actress : "+getStars());
     
    }
    
    @Override
    public void display()
    {
        System.out.println("***Movie***");
        super.display();
        
    }
    
}
