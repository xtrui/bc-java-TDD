package junit5.tdd;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class FizzBuzzWhizzTest {
    @BeforeAll
    static void initTestEnv() {
    }

    @BeforeEach
    void initEveryMethod() {
    }

    @Test
    void should_return_1_when_play_given_1() {
        String result = new FiZZBuzzWhizz().play(1);
        assertEquals("1", result);
    }

    @Test
    void should_return_Fizz_when_play_given_3() {
        String result = new FiZZBuzzWhizz().play(3);
        assertEquals("Fizz", result);
    }

    @Test
    void should_return_Buzz_when_play_given_5() {
        String result = new FiZZBuzzWhizz().play(5);
        assertEquals("Buzz", result);
    }

    @Test
    void should_return_Whizz_when_play_given_7() {
        String result = new FiZZBuzzWhizz().play(7);
        assertEquals("Whizz", result);
    }

    @Test
    void should_return_FizzBuzz_when_play_given_15() {
        String result = new FiZZBuzzWhizz().play(15);
        assertEquals("FizzBuzz", result);
    }

    @Test
    void should_return_FizzWhizz_when_play_given_21() {
        String result = new FiZZBuzzWhizz().play(21);
        assertEquals("FizzWhizz", result);
    }

    @Test
    void should_return_BuzzWhizz_when_play_given_35() {
        String result = new FiZZBuzzWhizz().play(35);
        assertEquals("BuzzWhizz", result);
    }



}
