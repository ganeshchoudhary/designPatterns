package com.gschoudhary.design.patterns.bahavioral.ChainOfResponsibility;

public class Request {
    public String ip;

    public String token;

    public String body;

    @Override
    public String toString() {
        return "Request{" +
                "ip='" + ip + '\'' +
                ", token='" + token + '\'' +
                ", body='" + body + '\'' +
                '}';
    }
}
