package variable;

public class Var8 {
    public static void main(String[] args) {
        //정수
        byte b = 127; //-128 ~ 127 (1byte,2^8)
        short s = 32767; //-32768 ~ 32767 (2byte, 2^16)
        int i = 2147483647; //-2147483648 ~ 2147483647 (4byte, 2^32)
        long l = 9223372036854775807L;
        //-9223372036854775807 ~ 9223372036854775807 (8byte, 2^64)
        //실수
        float f = 10.0f;
        double d = 10.0;

        //표현 범위에 따라 메모리 공간을 차지함.
    }
}
