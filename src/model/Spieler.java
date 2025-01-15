package model;

import java.util.List;

public class Spieler {
    int alter;
    String name;
    String position;
    int marktwert;

    public Spieler(int alter, String name, String position, int marktwert) {
        this.alter = alter;
        this.name = name;
        this.position = position;
        this.marktwert = marktwert;
    }

    public Spieler() {}

    public int getAlter() {
        return alter;
    }

    public void setAlter(int alter) {
        this.alter = alter;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public int getMarktwert() {
        return marktwert;
    }

    public void setMarktwert(int marktwert) {
        this.marktwert = marktwert;
    }

    @Override
    public String toString() {
        return "Spieler{" +
                "alter=" + alter +
                ", name='" + name + '\'' +
                ", position='" + position + '\'' +
                ", marktwert=" + marktwert +
                '}';
    }

}
