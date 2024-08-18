public class TypeConversion {
    public static void main(String[] args) {
        byte by = 127; //-127 to 128
        int in = 10;
        int k = 257;
        byte b = (byte) in;
        byte br = (byte) k;
        in = by;
        System.out.println(b); //10
        System.out.println(in); //127
        System.out.println(br); //1  -> 257 %256 (rang of byte)

        float f = 10.56f;
        int fl = (int) f;
        System.out.println(fl); //10

    }
}
