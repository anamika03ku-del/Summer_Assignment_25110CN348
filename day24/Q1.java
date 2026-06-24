package day24;

public class Q1 {
    public static void main(String[] args) {
        String s1 = "waterbottle";
        String s2 = "erbottlewat";
        
        if(s1.length() == s2.length() && (s1 + s1).contains(s2)) {
            System.out.println("Yes, rotation"); 
        } else {
            System.out.println("Not a rotation");
        }
    }
}
