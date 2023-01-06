import java.util.HashMap;
import java.util.Map;

public class FrequencyAnalyzer implements Frequency {

    @Override
    public Map<Character, Double> analyze(String str) {
        if (str == null) {
            throw new IllegalArgumentException("String must not be null!");
        }
        Map<Character, Double> map = new HashMap<>();
        str = str.toLowerCase();
        String strWithoutRepeat = "";
        int strLeng = str.length();
        for (int i = 0; i < strLeng; i++) {
            if (str.isEmpty()) {
                break;
            }
            String letter = str.substring(0, 1);
            strWithoutRepeat += letter;
            str = str.replaceAll(letter, "");
        }
        double leng = strWithoutRepeat.length();
        for (int i = 0; i < strWithoutRepeat.length(); i++) {
            map.put(strWithoutRepeat.charAt(i), 1 / leng);
        }

        return map;
    }

}


