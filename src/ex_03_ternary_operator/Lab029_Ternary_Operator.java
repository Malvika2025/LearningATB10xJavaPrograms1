package ex_03_ternary_operator;

public class Lab029_Ternary_Operator {
    public static void main(String[] args){
        int age=10;
        String canIVote= age>=18? "Yes,you can vote" : "No,you can't vote";
        System.out.println(canIVote);

        int number=-5;
        String result = number > 0? "Positive" : "Negative";
        System.out.println(result);

    }
}
