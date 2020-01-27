package com.miiesluvisi.java.main;

public class FirewallRule {
    String direction;
    String protocol;
    Port port;
    Ip ip;

    public FirewallRule(String direction, String protocol, String port, String ip) {
        this.direction = direction;
        this.protocol = protocol;
        this.port = new Port(port);
        this.ip = new Ip(ip);
    }

    FirewallRule ruleTest = Rule t;
    return (
        ruleTest(this.direction, this.protocol, this.port, this.ip)
    );
}