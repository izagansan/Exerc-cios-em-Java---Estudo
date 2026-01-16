import java.util.ArrayList;
import java.util.List;

public class LanguageList {
    private final List<String> languages = new ArrayList<>();

    public boolean isEmpty() {
        return languages.isEmpty();
    }

    public void addLanguage(String language) {
        languages.add(language);
    }

    public void removeLanguage(String language) {
        languages.remove(language);
    }

    public String firstLanguage() {
        return languages.get(0);
    }

    public int count() {
        return languages.size();
    }

    public boolean containsLanguage(String language) {
        return languages.contains(language);
    }

    public boolean isExciting() {
        return languages.contains("Java") || languages.contains("Kotlin");
    }
    
    public static void main(String[] args) {
        LanguageList list = new LanguageList();

        System.out.println(list.isEmpty()); // true

        list.addLanguage("Python");
        list.addLanguage("Java");

        System.out.println(list.count());          // 2
        System.out.println(list.firstLanguage());  // Python
        System.out.println(list.containsLanguage("Java")); // true
        System.out.println(list.isExciting());     // true
    }
}

