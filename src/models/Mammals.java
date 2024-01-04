package models;

public class Mammals {
    int heart_chamber = 4;
    Boolean warm_blooded = true;

    public int getHeart_chamber() {
        return heart_chamber;
    }

    public void setHeart_chamber(int heart_chamber) {
        this.heart_chamber = heart_chamber;
    }

    public Boolean getWarm_blooded() {
        return warm_blooded;
    }

    public void setWarm_blooded(Boolean warm_blooded) {
        this.warm_blooded = warm_blooded;
    }
}