package com.milesluvisi.java.main;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Ip {
    List<Integer> start;
    List<Integer> end;

    public Ip(String ip) {
        if(ip.indexOf("-") != -1) {
            String[] range = ip.split("-");
            this.start = Arrays.stream(range[0].split("\\.").map(i -> Integer.parseInt(i)).collect(Collectors.toList());
            this.end = Arrays.stream(range[1].split("\\.").map(i -> Integer.parseInt(i)).collect(Collectors.toList());
        } else {
            this.start = this.end = Arrays.stream(ip.split("\\.")).map(i -> Integer.parseInt(i)).collect(Collectors.toList());
        }
    }

    public boolean isValid(Ip testIp) {
        for(int i = 0; i < 4; i++)
        result = testIp.start.get(i) < this.start.get(i) || testIp.end.get(i) > this.end.get(i) ? false : true;
        return result;
    }
}