public class Main {
public static void main(String[]args){
    int a = 11;
    int b=4;
    int c=15;
    int d=10;
    int sum1 = a+b;
    int sum2 = d+c;
    String sumOut= sum1 >sum2 ? "true" : "false";
    System.out.println(sumOut);
    sum1++;
    sum2--;
    sum2--;
    String sumOut2 = sum1 > sum2 ? "true" : "false";
    System.out.println(sumOut2);
    String sumOut3 = sum1%2 == 0 ? "true" : "false";
    String sumOut4 = sum2%2 == 0 ? "true" : "false";
    String sumOut5 = sumOut3=="true" ^ sumOut4=="true" ? "true" : "false";
    System.out.println(sumOut5);
        }
}