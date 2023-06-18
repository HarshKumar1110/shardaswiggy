package org.example;

public class Restro {
    String restroId;
    String restroName;
    public Restro(String restroId, String restroName) {
        this.restroId=restroId;
        this.restroName=restroName;
    }

    @Override
    public String toString() {
        return "Restro{" +
                "restroId=" + restroId +
                ", restroName='" + restroName + '\'' +
                '}';
    }
}
