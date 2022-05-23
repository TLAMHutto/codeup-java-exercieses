public class ServerNameGenerator {
    public static String first10Adjectives(){
        String[] adjectives = {"Abandoned", "Abashed", "slimy", "greasy", "fuzzy", "furry", "fizzy", "radioactive", "flaming", "frozen"};
        int randomIndex = (int)(Math.random() * adjectives.length);
        return adjectives[randomIndex];
    }
    public static String first10Nouns(){
        String[] nouns = {"Cracker", "Carpet", "Apple", "Boat", "Ocean", "Coffee", "Caravan", "Tree", "Fallout", "House"};
        int randomIndex = (int)(Math.random() * nouns.length);
        return nouns[randomIndex];
    }
    public static void main(String[] args) {
        System.out.println("Here is your server name: ");
        System.out.println(first10Adjectives() + "-" + first10Nouns());
    }
}
