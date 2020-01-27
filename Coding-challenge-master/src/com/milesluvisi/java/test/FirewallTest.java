package com.milesluvisi.java.test;

import com.milesluvisi.java.main.Firewall;
import org.junit.Before;
import org.junit.Test;
import java.io.IOException;
import org.junit.Assert.assertEquals;

public class Test (
    Firewall f;

    @Before
    public void setup() {
        try {
            f = new Firewall("test.csv");
        } catch(IOException e) {
            System.out.println("IOException caught");        }
    }

    @Test 
    public void shouldAcceptPackets() {
        assertEquals(true, f.acceptPacket("outbound", "tcp", 10000, "192.168.10.11");
        assertEquals(true, f.acceptPacket("inbound", "udp", 53, "192.168.1.1"));
    }

    // Changed values slightly to make the packets incorrect
    public void shouldDeclinePackets() {
        assertEquals(false, f.acceptPacket("outbound", "tcp", 9999, "192.168.10.11");
        assertEquals(true, f.acceptPacket("inbound", "udp", 52, "192.168.1.1"));
    }
)