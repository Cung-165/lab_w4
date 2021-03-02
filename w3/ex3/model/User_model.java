package model;

import java.io.Serializable;

public class User_model implements Serializable {
    private String name;

    private int count;

    private double pctblack;
    private double pctwhite;

    public User_model() {
    };

    // set
    public void setCount(int count) {
        this.count = count;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPctblack(double pctblack) {
        this.pctblack = pctblack;
    }

    public void setPctwhite(double pctwhite) {
        this.pctwhite = pctwhite;
    }

    // get
    public int getCount() {
        return count;
    }

    public String getName() {
        return name;
    }

    public double getPctblack() {
        return pctblack;
    }

    public double getPctwhite() {
        return pctwhite;
    }

    @Override
    public String toString() {
        return "User[name=" + this.name + ",count=" + this.count + ",pctwhite=" + this.pctwhite + ",pctblack="
                + this.pctblack + "]";
    }
}
