public class D3 {
    public static void main(String[] args) {
        String name = "character";

        for (int i = 0; i < name.length(); i++) {
            char currentChar = name.charAt(i);
            int firstIndex = name.indexOf(currentChar);
            int lastIndex = name.lastIndexOf(currentChar);
            if (firstIndex == lastIndex) {
                System.out.println("Non-duplicate character: " + currentChar);
            }
        }
    }
}
