package itdownstream;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DownstreamInfoTest {

    @Test
    public void testBase(){
        DownstreamInfo info = new DownstreamInfo();
        assertEquals("I am very basic.", info.getInfo());
    }
}
