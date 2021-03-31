package com.aor.refactoring.example5;

import org.junit.Test;

import static org.junit.Assert.*;

public class TurtleTest {

    @Test
    public void testRotateLeft() {
        Turtle turtle = new Turtle(5, 5, 'N');
        turtle.turnLeft(); assertEquals('W', turtle.getDirection());
        turtle.turnLeft(); assertEquals('S', turtle.getDirection());
        turtle.turnLeft(); assertEquals('E', turtle.getDirection());
        turtle.turnLeft(); assertEquals('N', turtle.getDirection());
        assertEquals(5, turtle.getRow());
        assertEquals(5, turtle.getColumn());
    }

    @Test
    public void testRotateRight() {
        Turtle turtle = new Turtle(5, 5, 'N');
        turtle.turnRight(); assertEquals('E', turtle.getDirection());
        turtle.turnRight(); assertEquals('S', turtle.getDirection());
        turtle.turnRight(); assertEquals('W', turtle.getDirection());
        turtle.turnRight(); assertEquals('N', turtle.getDirection());
        assertEquals(5, turtle.getRow());
        assertEquals(5, turtle.getColumn());
    }

    @Test
    public void testForward() {
        Turtle turtleN = new Turtle(5, 5, 'N');

        turtleN.move();
        assertEquals(4, turtleN.getRow());
        assertEquals(5, turtleN.getColumn());

        Turtle turtleW = new Turtle(5, 5, 'W');

        turtleW.move();
        assertEquals(5, turtleW.getRow());
        assertEquals(4, turtleW.getColumn());

        Turtle turtleS = new Turtle(5, 5, 'S');

        turtleS.move();
        assertEquals(6, turtleS.getRow());
        assertEquals(5, turtleS.getColumn());

        Turtle turtleE = new Turtle(5, 5, 'E');

        turtleE.move();
        assertEquals(5, turtleE.getRow());
        assertEquals(6, turtleE.getColumn());
    }

}