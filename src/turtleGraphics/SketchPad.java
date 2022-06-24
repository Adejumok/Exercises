package turtleGraphics;

public class SketchPad {
    public int[][] floor;

    public SketchPad(int length, int breadth){
        floor = new int[length][breadth];

    }

    public int[][] getFloor() {
        return floor;
    }
}
