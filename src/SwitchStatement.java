public class SwitchStatement {
    public static void main(String[] args) {
        // Kondisi di switch statement hanya untuk perbandingan ==

        var nilai = "A";

        switch (nilai) {
            case "A":
                System.out.println("Wow, Anda Lulus Dengan Baik");
                break;
            case "B":
            case "C":
                System.out.println("Nilai Anda Cukup Baik");
                break;
            case "D":
                System.out.println("Anda tidak lulus");
                break;
            default: //jika kondisi tidak terpenuhi
                System.out.println("Mungkin Anda salah jurusan");
        }

        //switch lamda -> tanpa menggunakan break tapi menggunakan tanda  " -> "
        switch (nilai) {
            case "A" -> System.out.println("Wow, Anda Lulus Dengan Baik");
            case "B", "C" -> System.out.println("Nilai Anda Cukup Baik");
            case "D" -> System.out.println("Anda Tidak Lulus");
            default -> {
                System.out.println("Muungkin Anda Salah Jurusan");
            }
        }
        ///// ##### /////

        // yield -> Untuk mengembalikan nilai pad switch statement, berguna ketika butuh membuat data berdasarkan kondisi switch statement

        // switch tanpa yield
        String ucapan;
        switch (nilai) {
            case "A" -> ucapan = "Wow, Anda Lulus Dengan Baik";
            case "B", "C" -> ucapan = "Nilai Anda Cukup Baik";
            case "D" -> ucapan = "Anda Tidak Lulus";
            default -> {
                ucapan = "Muungkin Anda Salah Jurusan";
            }
        }

        System.out.println(ucapan);
        ///// ##### /////

        ucapan = switch (nilai) {
            case "A":
                yield "Wow, Anda Lulus Dengan Baik";
            case "B", "C":
                yield "Nilai Anda Cukup Baik";
            case "D":
                yield "Anda Tidak Lulus";
            default:
                yield "Muungkin Anda Salah Jurusan";
        };

        System.out.println(ucapan);
        ///// ###### /////
    }
}
