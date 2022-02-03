public class duvidas {
    public static float testFunction() {
        /* Porque o Java não enxerga o número como um float e sim como um double? */
        return 72.7*4;
    }

    public static void main(String[] args) {
        System.out.println(testFunction());
    }
}