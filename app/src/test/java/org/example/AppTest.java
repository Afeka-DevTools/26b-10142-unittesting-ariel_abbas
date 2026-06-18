package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

class AppTest {

    // ── add ──────────────────────────────────────────────────────────────────

    @Test
    void add_twoPositiveNumbers_returnsSum() {
        assertEquals(7, App.add(3, 4));
    }

    @Test
    void add_positiveAndNegative_returnsSum() {
        assertEquals(-1, App.add(3, -4));
    }

    @Test
    void add_bothZero_returnsZero() {
        assertEquals(0, App.add(0, 0));
    }

    // ── isPrime ───────────────────────────────────────────────────────────────

    @Test
    void isPrime_primeNumber_returnsTrue() {
        assertTrue(App.isPrime(7));
    }

    @Test
    void isPrime_smallestPrime_returnsTrue() {
        assertTrue(App.isPrime(2));
    }

    @Test
    void isPrime_compositeNumber_returnsFalse() {
        assertFalse(App.isPrime(9));
    }

    @Test
    void isPrime_one_returnsFalse() {
        assertFalse(App.isPrime(1));
    }

    @Test
    void isPrime_negativeNumber_returnsFalse() {
        assertFalse(App.isPrime(-5));
    }

    @Test
    void isPrime_zero_returnsFalse() {
        assertFalse(App.isPrime(0));
    }

    // ── reverse ───────────────────────────────────────────────────────────────

    @Test
    void reverse_normalString_returnsReversed() {
        assertEquals("olleh", App.reverse("hello"));
    }

    @Test
    void reverse_emptyString_returnsEmpty() {
        assertEquals("", App.reverse(""));
    }

    @Test
    void reverse_singleChar_returnsSameChar() {
        assertEquals("a", App.reverse("a"));
    }

    // ── factorial ─────────────────────────────────────────────────────────────

    @Test
    void factorial_zero_returnsOne() {
        assertEquals(1, App.factorial(0));
    }

    @Test
    void factorial_positiveNumber_returnsFactorial() {
        assertEquals(120, App.factorial(5));
    }

    @Test
    void factorial_one_returnsOne() {
        assertEquals(1, App.factorial(1));
    }

    @Test
    void factorial_negativeNumber_throwsException() {
        assertThrows(IllegalArgumentException.class, () -> App.factorial(-1));
    }

    // ── isPalindrome ──────────────────────────────────────────────────────────

    @Test
    void isPalindrome_palindromeWord_returnsTrue() {
        assertTrue(App.isPalindrome("racecar"));
    }

    @Test
    void isPalindrome_palindromeWithSpacesAndPunctuation_returnsTrue() {
        assertTrue(App.isPalindrome("A man, a plan, a canal: Panama"));
    }

    @Test
    void isPalindrome_nonPalindrome_returnsFalse() {
        assertFalse(App.isPalindrome("hello"));
    }

    @Test
    void isPalindrome_singleChar_returnsTrue() {
        assertTrue(App.isPalindrome("a"));
    }

    @Test
    void isPalindrome_emptyString_returnsTrue() {
        assertTrue(App.isPalindrome(""));
    }

    // ── fibonacciUpTo ─────────────────────────────────────────────────────────

    @Test
    void fibonacciUpTo_zero_returnsListWithZero() {
        assertEquals(Arrays.asList(0), App.fibonacciUpTo(0));
    }

    @Test
    void fibonacciUpTo_ten_returnsCorrectSequence() {
        assertEquals(Arrays.asList(0, 1, 1, 2, 3, 5, 8), App.fibonacciUpTo(10));
    }

    @Test
    void fibonacciUpTo_negative_throwsException() {
        assertThrows(IllegalArgumentException.class, () -> App.fibonacciUpTo(-1));
    }

    @Test
    void fibonacciUpTo_one_returnsZeroOneOne() {
        assertEquals(Arrays.asList(0, 1, 1), App.fibonacciUpTo(1));
    }

    // ── charFrequency ─────────────────────────────────────────────────────────

    @Test
    void charFrequency_normalString_returnsCorrectCounts() {
        Map<Character, Integer> freq = App.charFrequency("aab");
        assertEquals(2, freq.get('a'));
        assertEquals(1, freq.get('b'));
    }

    @Test
    void charFrequency_emptyString_returnsEmptyMap() {
        assertTrue(App.charFrequency("").isEmpty());
    }

    @Test
    void charFrequency_singleChar_returnsCountOfOne() {
        Map<Character, Integer> freq = App.charFrequency("z");
        assertEquals(1, freq.get('z'));
    }

    // ── isAnagram ─────────────────────────────────────────────────────────────

    @Test
    void isAnagram_anagramStrings_returnsTrue() {
        assertTrue(App.isAnagram("listen", "silent"));
    }

    @Test
    void isAnagram_anagramsWithSpaces_returnsTrue() {
        assertTrue(App.isAnagram("astronomer", "moon starer"));
    }

    @Test
    void isAnagram_nonAnagramStrings_returnsFalse() {
        assertFalse(App.isAnagram("hello", "world"));
    }

    @Test
    void isAnagram_sameString_returnsTrue() {
        assertTrue(App.isAnagram("hello", "hello"));
    }

    // ── average ───────────────────────────────────────────────────────────────

    @Test
    void average_normalArray_returnsCorrectAverage() {
        assertEquals(3.0, App.average(new int[]{1, 2, 3, 4, 5}));
    }

    @Test
    void average_singleElement_returnsElement() {
        assertEquals(42.0, App.average(new int[]{42}));
    }

    @Test
    void average_emptyArray_throwsException() {
        assertThrows(IllegalArgumentException.class, () -> App.average(new int[]{}));
    }

    @Test
    void average_negativeNumbers_returnsCorrectAverage() {
        assertEquals(-2.0, App.average(new int[]{-3, -1, -2}));
    }

    // ── filterEvens ───────────────────────────────────────────────────────────

    @Test
    void filterEvens_mixedList_returnsOnlyEvens() {
        List<Integer> result = App.filterEvens(Arrays.asList(1, 2, 3, 4, 5, 6));
        assertEquals(Arrays.asList(2, 4, 6), result);
    }

    @Test
    void filterEvens_noEvens_returnsEmptyList() {
        List<Integer> result = App.filterEvens(Arrays.asList(1, 3, 5));
        assertTrue(result.isEmpty());
    }

    @Test
    void filterEvens_emptyList_returnsEmptyList() {
        assertTrue(App.filterEvens(Arrays.asList()).isEmpty());
    }

    @Test
    void filterEvens_allEvenList_returnsFullList() {
        List<Integer> result = App.filterEvens(Arrays.asList(2, 4, 6));
        assertEquals(Arrays.asList(2, 4, 6), result);
    }

    // ── mostCommonWord ────────────────────────────────────────────────────────

    @Test
    void mostCommonWord_textWithClearWinner_returnsMostFrequentWord() {
        assertEquals("the", App.mostCommonWord("the cat sat on the mat and the cat"));
    }

    @Test
    void mostCommonWord_singleWord_returnsThatWord() {
        assertNotNull(App.mostCommonWord("hello"));
        assertEquals("hello", App.mostCommonWord("hello"));
    }

    @Test
    void mostCommonWord_tiedWords_returnsNotNull() {
        assertNotNull(App.mostCommonWord("cat dog cat dog"));
    }
}
