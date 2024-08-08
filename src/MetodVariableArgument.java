public class MetodVariableArgument {
    public static void main(String[] args) {
        int[] values = {80, 50, 50, 50, 80};
        sayCongrats("Sanemi", values);

        sayCongrats("Shinazugawa", 80, 90, 76, 80);
    }

    static void sayCongrats(String name, int... values) {
        var total = 0;
        for (var value : values) {
            total += value;
            System.out.println("=== total ===");
            System.out.println(total);
        }
        var finalValue = total / values.length;
        System.out.println("=== finalValue ===");
        System.out.println(finalValue);

        if (finalValue >= 75) {
            System.out.println("Selamat " + name + ", Anda Lulus");
        } else {
            System.out.println("Maaf " + name + ", Anda Tidak Lulus");
        }
    }
}
