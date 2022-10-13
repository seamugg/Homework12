import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {

        Set<String> cohort1 = new TreeSet<>();

        cohort1.add("United States");
        cohort1.add("United States");
        cohort1.add("Ukraine");
        cohort1.add("Mexico");

        System.out.println(cohort1);

        Set<String>  cohort2 = new TreeSet<>();

        cohort2.add("United States");
        cohort2.add("Canada");
        cohort2.add("United States");
        cohort2.add("Mexico");


        System.out.println(cohort2);


        Set<String>  cohort3 = new TreeSet<>(cohort1);
        cohort3.addAll(cohort2);
        System.out.println(cohort3);

        Set<String> allcohort = new HashSet<>(cohort3);
        System.out.println(allcohort);



    }
}