package operator;

public class Operator2 {
    public static void main(String[] args) {
        //문자열 + 문자열
        String result1 = "hello " + "world";
        System.out.println(result1);

        String s1 = "hello ";
        String s2 = "world";
        String result2 = s1 + s2;
        System.out.println(result2);

        //문자열 + 숫자
        String result3 = "a + b = " + 10;
        System.out.println(result3);

        int num = 20;
        String str = "a + b = ";
        String result4 = str + num;
        System.out.println(result4);

    }
}
