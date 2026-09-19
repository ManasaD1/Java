//performing with text, such as joining, splitting, checking lengths
public class test12 {
    public static void main(String[] args) {
        String greeting = "Hello";
        String target = "World";

        String message = greeting + ", " + target + "!";
        System.out.println(message);

        int textLength = message.length();
        System.out.println(textLength);

        char firstLetter = message.charAt(0);
        System.out.println(firstLetter);

        String worldPart = message.substring(7, 12);
        System.out.println(worldPart);

        String newWord = message.replace("World", "Java");
        System.out.println(newWord);

        System.out.println(message.toUpperCase());
        System.out.println(message.toLowerCase());

        boolean hasJava = message.contains("Java");
        System.out.println(hasJava);
    }
}
