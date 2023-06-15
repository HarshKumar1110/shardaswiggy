package org.example;

public class Restro {
    int restroId;
    String restroName;
    public Restro(int restroId, String restroName) {
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
