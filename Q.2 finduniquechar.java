package in.ineuron.main;

public class Practice {
    public static int firstUniqChar(String s) {
        int n = s.length();
        
        for (int i = 0; i < n; i++) {
            boolean isRepeated = false;
            
            for (int j = i + 1; j < n; j++) {
                if (s.charAt(i) == s.charAt(j)) {
                    isRepeated = true;
                    break;
                }
            }
            
            if (!isRepeated) {
                return i;
            }
        }
        
        return -1; 
    }


    
    public static void main(String args[]) {
    	System.out.println(firstUniqChar("aacbc"));
    }
}


