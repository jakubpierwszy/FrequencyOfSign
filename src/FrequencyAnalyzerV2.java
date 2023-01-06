import java.util.HashMap;
import java.util.Map;
import java.util.stream.Stream;

public class FrequencyAnalyzerV2 implements Frequency {
    public static void main(String[] args) {
        FrequencyAnalyzerV2 frequencyAnalyzerV2 = new FrequencyAnalyzerV2();

        frequencyAnalyzerV2.analyze("aabbccde");
    }

    @Override
    public Map<Character, Double> analyze(String str) {
        if (str == null) throw new IllegalArgumentException();
        str = str.toLowerCase();
        Map<Character, Double> map = new HashMap<>();
        long count = str.chars().distinct().count();
        for (Character character : str.toCharArray()) {
            map.putIfAbsent(character, 1 / (double) count);
        }
        return map;
    }
}
