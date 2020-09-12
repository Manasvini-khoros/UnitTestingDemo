package unittesting;

import org.junit.Test;

import static org.junit.Assert.*;

public class DemoTest {

    @Test
    public void getS() {
        Demo d=new Demo("hii");
        assertEquals("hii",d.getS());
    }
}