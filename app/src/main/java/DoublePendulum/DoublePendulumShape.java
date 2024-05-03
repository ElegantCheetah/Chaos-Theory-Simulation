package DoublePendulum;

import java.awt.Graphics;

/**
 * This class is responsible for dealing with the individual arms on the double
 * pendulum. It is responsible for drawing itself too.
 *
 * @author Zain Kergaye
 * @version May 1, 2024
 */
public class DoublePendulumShape {
    private int mass, length, xStartPosition, yStartPosition;
    private double angleRadians;

    /**
     * This method is the constructor for the double pendulum. It only should be
     * called once.
     * 
     * @param xPosition - Initial X position of pendulum
     * @param yPosition - Initial Y position of pendulum
     */
    public DoublePendulumShape() {
        this.xStartPosition = 0;
        this.yStartPosition = 0;
        this.mass = 0;
        this.length = 500;
        this.angleRadians = 0;
    }

    public DoublePendulumShape(DoublePendulumShape pendulum) {
        this.xStartPosition = pendulum.getEndX();
        this.yStartPosition = pendulum.getEndY();
        this.mass = 0;
        this.length = 500;
        this.angleRadians = 0;
    }

    /**
     * This method sets the angle of the arm in radians.
     *
     * @param angle - Angle of arm in radians
     */
    public void setAngleRadians(double angle) {
        this.angleRadians = angle;
    }

    /**
     * This method sets the X position.
     *
     * @param x
     */
    public void setStartingPointX(int x) {
        this.xStartPosition = x;
    }

    /**
     * This method sets the Y position.
     *
     * @param y
     */
    public void setStartingPointY(int y) {
        this.yStartPosition = y;
    }

    /**
     * This method returns the mass in KG.
     *
     * @return int of mass
     */
    public int getMass() {
        return this.mass;
    }

    /**
     * This method returns the length of the pendulum in meters
     *
     * @return - int of length
     */
    public int getLength() {
        return this.length;
    }

    /**
     * This method calculates and returns the end affector x position. This is in meters. 
     *
     * @return - int of ending affector x coordinate
     */
    public int getEndX() {
        return this.length * (int) Math.cos(this.angleRadians);
    }

    /**
     * This method calculates and returns the end affector y position. This is in meters. 
     *
     * @return - int of ending affector y coordinate
     */
    public int getEndY() {
        return this.length * (int) Math.sin(this.angleRadians);
    }

    /**
     * This method draws the DoublePendulumShape. 
     *
     * @param g - Graphics object
     */
    public void draw(Graphics g) {
        g.drawLine(this.xStartPosition, this.yStartPosition, getEndX(), getEndY());
    }

}
