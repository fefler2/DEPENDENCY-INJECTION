package Spring5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AbTest {

    @Test
    void fizzBuzz() {
        Ab ab=new Ab();
        assertEquals("1",ab.fizzBuzz().get(0));
        assertEquals("Fizz",ab.fizzBuzz().get(2));
        assertEquals("Buzz",ab.fizzBuzz().get(4));
        assertEquals("FizzBuzz",ab.fizzBuzz().get(14));
    }
}