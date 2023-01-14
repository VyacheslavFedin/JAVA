package org.example.model;

import java.util.Objects;

public class Notebook {
    public Notebook(String name_nb, int mem, int hdd, String os, String color) {

        this.name_nb = name_nb;
        this.mem = mem;
        this.hdd = hdd;
        this.os = os;
        this.color = color;
    }
    public Notebook() {
    }
    public String getName_nb() {
        return name_nb;
    }
    public void setName_nb(String name_nb) {
        this.name_nb = name_nb;
    }
    private String name_nb;
    private int mem;
    private int hdd;
    private String os;
    private String color;
    public int getMem() {
        return mem;
    }
    public void setMem(int mem) {
        this.mem = mem;
    }
    public int getHdd() {
        return hdd;
    }
    public void setHdd(int hdd) {
        this.hdd = hdd;
    }
    public String getOs() {
        return os;
    }
    public void setOs(String os) {
        this.os = os;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Notebook notebook)) return false;
        return getMem() == notebook.getMem() && getHdd() == notebook.getHdd() && getName_nb().equals(notebook.getName_nb()) && getOs().equals(notebook.getOs()) && getColor().equals(notebook.getColor());
    }
    @Override
    public int hashCode() {
        return Objects.hash(getName_nb(), getMem(), getHdd(), getOs(), getColor());
    }
    @Override
    public String toString() {
        return "Notebook{" +
                "name_nb='" + name_nb + '\'' +
                ", mem=" + mem +
                ", hdd=" + hdd +
                ", os='" + os + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
