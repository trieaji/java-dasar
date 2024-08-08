public class ForEach {
    public static void main(String[] args) {
        // Jika melakukan looping tanpa forEach
        String[] names = {
                "Laksa", "Bayu", "Trie"
        };

        for (var i = 0; i < names.length; i++){
            System.out.println(names[i]);
        }
        ///// ##### /////

        // Kode program forEach
        System.out.println("FOR EACH");

        for(String name: names){
            System.out.println(name);
        }
        ///// ##### /////

    }
}
