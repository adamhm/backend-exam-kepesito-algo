package hu.nive.ujratervezes.adddigits;

public class AddDigits {
    private final static int ASCII_CODE_OF_0 = 48;
    
    public int addDigits(String input) {
        if (input == null || input.trim().equals("")) {
            return -1;
        }
        
        int sum = 0;
        
        for (int i = 0; i < input.length(); i++) {
            char currentChar = input.charAt(i);
            
            if (currentChar >= '0' && currentChar <= '9') {
                sum += currentChar - ASCII_CODE_OF_0;
            }
        }
        
        return sum;
    }
}
