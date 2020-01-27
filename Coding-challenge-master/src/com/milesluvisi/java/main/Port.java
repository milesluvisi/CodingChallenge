package com.milesluvisi.java.main;

public class Port {
    int start;
    int end;

    public Port(String p) {
        if(p.indexOf('-') != 1) {
            start = Integer.parseInt(p.split("-"[0]));
            end = Integer.parseInt(p.split("-"[1]));
        } else {
            start = Integer.parseInt(p);
            end = Integer.parseInt(p);
        }
    }

    public boolean acceptablePort(Port port) {
        return port.start >= this.start && port.end <= this.end;
    }
}

