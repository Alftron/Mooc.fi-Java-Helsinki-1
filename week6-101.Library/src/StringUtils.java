
public class StringUtils {
    
    public static boolean included(String word, String searched) {
        String searchTerm = searched.trim().toUpperCase();
        String entry = word.trim().toUpperCase();
        
        return entry.contains(searchTerm);
    }
    
}
