import java.util.*;

class Students implements Comparator<Students> {

    public String name;
    public double score;
    public double age;

    public Students(String name, double score, double age) {
        this.name = name;
        this.score = score;
        this.age = age;
    }

    @Override
    public int compare(Students e1, Students e2) {
        if(e2.score==e1.score) {
            return e2.name.compareTo(e1.name);
        }
        else
        {
            return (int) (e2.score - e1.score);
        }
    }


}

class Scorecomparator implements Comparator<Students>
{
    public int compare(Students e1,Students e2){

        if(e2.score==e1.score) {
            return e2.name.compareTo(e1.name);
        }
        else
            {
            return (int) (e2.score - e1.score);
        }
        }

}

public class Java4_5 {
    public static void main(String[] args) {

        ArrayList<Students> list = new ArrayList<Students>();

        list.add(new Students("Jatin",97, 21));
        list.add(new Students("Naman", 97, 23));
        list.add(new Students("Manish", 97, 22));

        Collections.sort(list,new Scorecomparator());

        Iterator itr=list.iterator();
        while(itr.hasNext())
        {
            Students e=(Students) itr.next();
            System.out.println(e.name+" "+e.score+" "+e.age);
        }
    }
}