package sample.model;

import java.awt.geom.Point2D;

public class MapComponent {
    private String name;
    private Point2D location;
    private double width, height;
    private boolean isForOpp;

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Point2D getLocation() {
        return location;
    }

    public void setLocation(Point2D location) {
        this.location = location;
    }

    public boolean isForOpp() {
        return isForOpp;
    }

    public void setForOpp(boolean forOpp) {
        isForOpp = forOpp;
    }
}
