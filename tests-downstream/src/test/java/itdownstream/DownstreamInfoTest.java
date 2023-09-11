package itdownstream;

import base.BaseIntegrationTest;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DownstreamInfoTest extends BaseIntegrationTest {

    @Test
    public void testDownstream(){
        DownstreamInfo info = new DownstreamInfo();
        assertEquals("I am very basic.", info.getInfo());
    }
}
