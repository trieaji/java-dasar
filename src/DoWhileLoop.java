public class DoWhileLoop {
    public static void main(String[] args) {
        var counter = 100;

        do{
            System.out.println("Perulangan " + counter);
            counter++;
        } while (counter <= 10);

        // Pengecekan kondisi di while loop dilakukan di awal sebelum perulangan dilakukan, sedangkan di do while loop dilakukan setelah perulangan dilakukan
        // Oleh karena itu dalam do while loop, minimal pasti sekali perulangan dilakukan walaupun kondisi tidak bernilai true
    }
}
