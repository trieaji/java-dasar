public class TernaryOperator {
    public static void main(String[] args) {
        // Ternary operator adalah operator sederhana dari if statemet
        // Ternary opearator terdiri dari kondisi yang dievaluasi, jika menghasilkan true maka nilai pertama diambil, jika false, maka nilai kedua diambil

        // Tanpa menggunakan ternary operator
        var nilai = 80;
        String ucapan;

        if (nilai >= 75) {
            ucapan = "Walah kowe lulus";
        } else {
            ucapan = "Walah kowe ga lulus";
        }

        System.out.println(ucapan);
        ///// ##### /////

        //Menggunakan ternary operator
        var absen = 90;
        String ngomong = absen >= 75 ? "Selamat Anda Lulus" : "Silahkan Coba lagi";

        System.out.println(ngomong);
        ///// ##### /////
    }
}
