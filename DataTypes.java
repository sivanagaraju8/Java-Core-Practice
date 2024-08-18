public class DataTypes {
    public static void main(String args[]){
        // Integer 4 Bytes -> (-2^31) -> (2^31 - 1)
        // Long 8 Bytes -> (-2^63) -> (2^63 - 1)
        // Short 2 Bytes -> (-2^15) -> (2^15 - 1)
        // Byte 1 Byte -> (-2^7) -> (2^7 - 1)  -128 to 127
        // Char 2 Bytes -> 16 bits UNICODE
        // Boolean

        // by default Java supports double for float


        int i =4;
        double d = 5.6;
        float f = 5.6f;
        char c = 'c';
        String s = "String";
        boolean b = true;
        byte by = 127; //max value

        System.out.println(c); // 104.6String

        //Literals

        int k = 0b101;
        int y = 100_00_00;
        int z = 0x7E;

        long l = 1_00_00_00_00;
        
        int intconv = (int) d;
        System.out.println(k); //5
        System.out.println(y);
        System.out.println(z); //126
        System.out.println(intconv); //5
        System.out.println(100/720); //0
        System.out.println(Math.ceil((double) 24521/720)); //1
        System.out.println((long) 100_00_0_0_0); //10000000
        System.out.println((int) l);
    }
}
