public class Switch {

    // improvised Switch Version from latest Java V14+
    public static void main(String[] args) {
        int k = 1;
        switch (k) {
            case 1 -> {
                System.out.println("One");
            }
            case 2 -> System.out.println("Two");
            default -> throw new IllegalArgumentException();
        }
    }

}
