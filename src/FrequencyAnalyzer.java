import java.util.HashMap;
import java.util.Map;

public class FrequencyAnalyzer implements Frequency{

    public FrequencyAnalyzer() {
    }

    public Frequency getFrequency(){
        return new FrequencyAnalyzer();
    }


    @Override
    public Map<Character, Double> analyze(String analyze) {
        return null;
    }
}
