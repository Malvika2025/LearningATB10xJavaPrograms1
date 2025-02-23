package ex_03_ternary_operator;

public class Lab033_AgeClassification {
    public static void main(String[] args)
    {
        int age= 25;
        String result= (age < 18) ? "Minor" : (age < 65) ? "Adult" : "Senior";
        System.out.println(result);

        


    }

}
