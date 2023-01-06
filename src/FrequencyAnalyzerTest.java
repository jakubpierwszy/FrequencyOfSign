import org.junit.jupiter.api.Test;

import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class FrequencyAnalyzerTest {

    FrequencyAnalyzerV2 frequencyAnalyzer = new FrequencyAnalyzerV2();

    @Test
    void should_return_1_for_single_character() {
        Map<Character, Double> result = frequencyAnalyzer.analyze("a");

        assertEquals(1.0, result.get('a'));
    }

    @Test
    void should_return_half_when_two_different_characters() {
        Map<Character, Double> result = frequencyAnalyzer.analyze("ab");

        assertEquals(0.5, result.get('a'));
        assertEquals(0.5, result.get('b'));
    }

    @Test
    void should_return_1_for_the_same_character() {
        Map<Character, Double> result = frequencyAnalyzer.analyze("aaa");

        assertEquals(1.0, result.get('a'));
    }

    @Test
    void should_return_even_half_when_two_different_characters() {
        Map<Character, Double> result = frequencyAnalyzer.analyze("aab");

        assertEquals(0.5, result.get('a'));
        assertEquals(0.5, result.get('b'));
    }

    @Test
    void should_return_even_half_when_different_characters() {
        Map<Character, Double> result = frequencyAnalyzer.analyze("abcd");

        assertEquals(0.25, result.get('a'));
        assertEquals(0.25, result.get('b'));
        assertEquals(0.25, result.get('c'));
        assertEquals(0.25, result.get('d'));
    }

    @Test
    void should_return_1_for_the_same_character_with_Upper_And_Lower_case() {
        Map<Character, Double> result = frequencyAnalyzer.analyze("AaA");

        assertEquals(1.0, result.get('a'));
    }

    @Test
    void should_return_even_half_when_different_characters_occurs_few_times() {
        Map<Character, Double> result = frequencyAnalyzer.analyze("aaaAbcdd");

        assertEquals(0.25, result.get('a'));
        assertEquals(0.25, result.get('b'));
        assertEquals(0.25, result.get('c'));
        assertEquals(0.25, result.get('d'));
    }

    @Test
    void should_throw_exception_when_null_input() {
        assertThrows(IllegalArgumentException.class, () -> frequencyAnalyzer.analyze(null));
    }

    private Frequency getFrequency() {
        return null;
    }
}