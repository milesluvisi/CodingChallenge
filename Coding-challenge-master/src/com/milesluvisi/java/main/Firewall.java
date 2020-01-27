package com.milesluvisi.java.main;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Firewall (

    Set<FirewallRule> firewallRules = new HashSet<FirewallRule>();
    
    public static void main(String[] args) {
        Firewall fw = new Firewall("testablerules.csv");
    }
    
    public Firewall(String file) {
        try(BufferedReader bufferedReader = new BufferedReader(new FileReader(file))) {
            String l;
            while((line = bufferedReader.readLine()) != null) {
                String[] rule = line.split(",");
                firewallRules.add(new Rule(rule[0], rule[1], rule[2], rule[3]));
            }
        } catch(IOException e) {
            System.out.println("IOException caught")
        }
    }

    public boolean acceptPacket(String direction, String protocol, int port, String ipAddress) {
        FirewallRule rule = new Rule(direction, protocol, String.valueOf(port), ipAddress);
        if(firewallRules.contains(rule)) {
            return true;
        } else {
            return false;
        }
    }
)