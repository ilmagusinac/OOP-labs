package lab6.LibraryInformationSystem;

public class StringUtils {
    public static boolean included(String word, String searched) {
        if (word == null || searched == null) {
            return false;
        }
        String copyOfWord = word;

        copyOfWord = copyOfWord.trim();
        searched = searched.trim();

        copyOfWord = copyOfWord.toUpperCase();
        searched = searched.toUpperCase();

        return copyOfWord.contains(searched);
    }
}
