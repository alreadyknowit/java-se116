
package Homework2;

import java.util.ArrayList;

/**
 *
 * @author AbdurrahmanDemiri
 */
public class Test {
    public static void main(String[] args) {
        
        ArrayList<Watch> arrayList = new ArrayList<Watch>();
        
        Watch m1 = new Movies("Shutter Island",138,"Mystery, Thriller", 8.1,"Martin Scorses","Leonardo DiCaprio, Ellen Page");
        Watch m2 = new Movies("The Pianist",150,"Biography, Drama, Music", 8.5,"Roman Polanski","Adrien Brody, Emilia Fox");
        Watch m3 = new Movies("Memento",113,"Mystery, Thriller", 8.5,"Christopher Nolan", "Guy Pearce, Carrie-Anne Moss");
        Watch m4 = new Movies("The Wolf of Wall Street",180,"Biography, Crime, Drama", 8.2,"Martin Scorsese","Leonardo DiCaprio, Jonah Hill");
        Watch s1 = new TvSeries("Friends",22,"Comedy", 10, 8.9,"David Crane, Marta Kauffman","Matt LeBlanc, Lisa Kundrow, Courteney Cox");
        Watch s2 = new TvSeries("Black Mirror",60,"Drama, Sci-Fi, Thriller", 5, 8.9, "Charlie Brooker","Daniel Lapaine, Michaela Coel");
        Watch s3 = new TvSeries("Lost",44,"Adventure, Drama, Fantasy", 6, 8.4,"J.J Abrams,Jeffrey Leiber","Josh Holloway, Matthew Fox, Michael Emerson");
        Watch s4 = new TvSeries("Mr.Robot",49,"Crime, Drama, Thriller", 3, 8.5,"Sam Esmail","Rami Malek, Christian Salter, Martin Wallström ");
        arrayList.add(m1);
        arrayList.add(m2);
        arrayList.add(m3);
        arrayList.add(m4);
        arrayList.add(s1);
        arrayList.add(s2);
        arrayList.add(s3);
        arrayList.add(s4);
        
        
        for(int i=0;i<arrayList.size();i++)
        {
            System.out.println("##"+(i+1)+"##");
            arrayList.get(i).display();
            arrayList.get(i).cast();
            System.out.println();
        }
       
        
    }
    
}
