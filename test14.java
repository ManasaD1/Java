//reverse string
public class test14 {
    public static void main(String[] args) {
        String original = "Java Programming";
        char[] characters = original.toCharArray();

        int left = 0;
        int right = characters.length - 1;
        while (left < right) {
            char temp = characters[left];
            characters[left] = characters[right];
            characters[right] = temp;

            left++;
            right--;
        }

        String reversed = new String(characters);
        System.out.println("Reversed: " + reversed);
    }
}
