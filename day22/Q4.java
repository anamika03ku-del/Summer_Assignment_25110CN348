package day22;

public class Q4 {
    public static String removeSpaces(String str) {
        return str.replaceAll("\\s", "");
    }
    public static String removeSpacesManual(String str) {
        StringBuilder sb = new StringBuilder();
        for (char ch : str.toCharArray()) {
            if (ch != ' ' && ch != '\t' && ch != '\n') {
                sb.append(ch);
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String s = "Java   is  awesome";
        System.out.println(removeSpaces(s));
    }
}