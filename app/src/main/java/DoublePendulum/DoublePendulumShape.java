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
    private int mass, length, xPosition, yPosition;
    private double angleDegrees = 0;

    /**
     * This method is the constructor for the double pendulum. It only should be
     * called once.
     * 
     * @param xPosition - Initial X position of pendulum
     * @param yPosition - Initial Y position of pendulum
     */
    public DoublePendulumShape(int xPosition, int yPosition) {
        this.xPosition = xPosition;
        this.yPosition = yPosition;
        this.mass = 1;
        this.length = 1;
    }

    /**
     * This method sets the angle of the arm in degrees.
     *
     * @param angle - Angle of arm in degrees
     * @throws IllegalArgumentException - Thrown if input is negative
     */
    public void setAngleDegrees(double angle) {
        if (angle < 0)
            throw new IllegalArgumentException("angle must be greater or equal to 0 degrees.");
        this.angleDegrees = angle;
    }

    /**
     * This method sets the X position.
     *
     * @param x 
     */
    public void setX(int x) {
        this.xPosition = x;
    }

    /**
     * This method sets the Y position.
     *
     * @param y 
     */
    public void setY(int y) {
        this.yPosition = y;
    }


    public int getMass() {
        return this.mass;
    }

    public int getLength() {
        return this.length;
    }

    public void draw(Graphics g) {

    }

}
