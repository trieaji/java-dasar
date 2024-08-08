public class TipeDataBukanPrimitif {
    public static void main(String[] args) {
        //Perbedaan yang tidak terlalu jauh ketika menggunakan tipe data bukan primitif ialah penulisan nya menggunkan huruf besar di depannya

        //Tipe dta bukan primitif
        Integer iniInteger = 10;
        Long iniLong = 20L;
        Boolean iniBoolean = true;

        System.out.println(iniInteger);
        System.out.println(iniLong);
        System.out.println(iniBoolean);

        //Cara konversi dari primitif ke tidak primitif
        int iniInt = 100;
        Integer iniInteger2 = iniInt;

        System.out.println(iniInteger2);

        //Cara konversi dari bukan primitif ke primitif
        short iniShort = iniInteger2.shortValue();
        System.out.println(iniShort);
    }
}
