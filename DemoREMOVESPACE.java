import java.util.Scanner;

class RemoveSpace {
    public static String removeSpaces(String str) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != ' ') {
                sb.append(str.charAt(i));
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = scanner.nextLine();

        String stringWithoutSpaces = removeSpaces(str);
        System.out.println("String without spaces: " + stringWithoutSpaces);

        scanner.close();
    }
}
