package day24;

public class Q2 {
    public static void main(String[] args) {
        String str = "aaabbcddd";
        StringBuilder res = new StringBuilder();
        int count = 1;
        
        for(int i = 0; i < str.length(); i++) {
            if(i + 1 < str.length() && str.charAt(i) == str.charAt(i + 1)) {
                count++;
            } else {
                res.append(str.charAt(i)).append(count);
                count = 1;
            }
        }
        System.out.println("Compressed: " + res);
    }
}