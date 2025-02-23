package ex_03_ternary_operator;

public class Lab032_Ternary_Nested_Ternary {
    public static void main(String[] args){
        int num =15;
        String result = (num > 10) ? (num > 20? "G > 20" : "B 10  to 20") : "B";
        System.out.println(result);
        int n1=9,n2=11,n3=15;
        int largest= (n1>=n2) ? ( (n1>=n3) ? n1 : n3): ((n2>=n3)? n2 :n3);
        System.out.println(largest);



    }
}
