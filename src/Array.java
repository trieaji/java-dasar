public class Array {
    public static void main(String[] args) {

        //Membuat array
        String[] stringArray;
        stringArray = new String[3];

        String[] stringArray2 = new String[3];

        stringArray[0] = "Laksa";
        stringArray[1] = "Bayu";
        stringArray[2] = "Trie";

        System.out.println(stringArray[0]);
        System.out.println(stringArray[1]);
        System.out.println(stringArray[2]);

        //Mengganti data array
        stringArray[0] = "Sanemi";
        //Mengambil data array
        System.out.println(stringArray[0]);

        //Model cara membuat array
        String[] namaNama = {
                "Laksa", "Bayu", "Trie"
        };

        namaNama[0] = null;

        int[] arrayInt = new int[]{
                1, 2, 3, 4, 5, 6, 7, 8, 9, 10
        };

        long[] arrayLong = {
                10L, 20L, 30L
        };

        arrayLong[0] = 0; //Mengubah data di array nya

        System.out.println(arrayLong.length);

        //Membuat array dalam array
        String[][] members = {
                {"Laksa", "Trie"},
                {"Taka", "Shika"},
                {"Red"}
        };

        System.out.println(members[0][1]);
        System.out.println(members[1][0]);
    }
}
