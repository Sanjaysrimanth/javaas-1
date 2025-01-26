public class Utility {
    public static void compare(int num1, int num2) {
        if (num1 > num2) {
            System.out.println(num1 + " is greater.");
        } else if (num2 > num1) {
            System.out.println(num2 + " is greater.");
        } else {
            System.out.println("Both are equal.");
        }
    }

    public static void compare(char char1, char char2) {
        if (char1 > char2) {
            System.out.println("'" + char1 + "' is greater.");
        } else if (char2 > char1) {
            System.out.println("'" + char2 + "' is greater.");
        } else {
            System.out.println("Both are equal.");
        }
    }

    public static void compare(String str1, String str2) {
        if (str1.length() > str2.length()) {
            System.out.println("\"" + str1 + "\" is greater.");
        } else if (str2.length() > str1.length()) {
            System.out.println("\"" + str2 + "\" is greater.");
        } else {
            System.out.println("Both are equal.");
        }
    }

    public static void main(String[] args) {
        System.out.println("1. Performance Scores Comparison");
        compare(85, 90); 

        System.out.println("\n2. Team Letters Comparison");
        compare('A', 'C'); 

        System.out.println("\n3. Motto Length Comparison");
        compare("Think Big", "Dream Bigger"); 
    }
}
