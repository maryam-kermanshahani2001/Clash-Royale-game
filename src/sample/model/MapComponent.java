package sample.model;

import java.awt.geom.Point2D;

/**
 * The type Map component.
 */
public class MapComponent {
    private Point2D location;
    private Point2D nextLocation;
    private boolean moved;
    private double width, height;
    private boolean isForOpp;
    private int teamNum; // is  1 or 2 for players and 0 for everyone
    private boolean isDestroyed;

    /**
     * Instantiates a new Map component.
     */
    public MapComponent() {
    }

    /**
     * Gets team num.
     *
     * @return the team num
     */
    public int getTeamNum() {
        return teamNum;
    }

    /**
     * Sets team num.
     *
     * @param teamNum the team num
     */
    public void setTeamNum(int teamNum) {
        this.teamNum = teamNum;
    }

    /**
     * Gets width.
     *
     * @return the width
     */
    public double getWidth() {
        return width;
    }

    /**
     * Sets width.
     *
     * @param width the width
     */
    public void setWidth(double width) {
        this.width = width;
    }

    /**
     * Gets height.
     *
     * @return the height
     */
    public double getHeight() {
        return height;
    }

    /**
     * Sets height.
     *
     * @param height the height
     */
    public void setHeight(double height) {
        this.height = height;
    }

    /**
     * Gets location.
     *
     * @return the location
     */
    public Point2D getLocation() {
        return location;
    }

    /**
     * Sets location.
     *
     * @param location the location
     */
    public void setLocation(Point2D location) {
        this.location = location;
    }

    /**
     * Is for opp boolean.
     *
     * @return the boolean
     */
    public boolean isForOpp() {
        return isForOpp;
    }

    /**
     * Sets for opp.
     *
     * @param forOpp the for opp
     */
    public void setForOpp(boolean forOpp) {
        isForOpp = forOpp;
    }
}
