package tek.bdd.utilities;

public class RandomGenerator {

    public String randomEmail(String firstName, String lastName){
        int random = (int) (Math.random() * 1000);
       return firstName + lastName + random + "@gmail.com";
    }
}
