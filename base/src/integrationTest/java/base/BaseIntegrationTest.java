package base;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BaseIntegrationTest {

    @Test
    public void testBase(){
        BaseInfo info = new BaseInfo();
        assertEquals("I am very basic.", info.getInfo());
    }
}
