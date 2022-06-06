package turtleGraphics;

import static turtleGraphics.Direction.*;

public class Turtle {
    private boolean isPenUp=true;
    private int row;
    private int column;
    private Position currentPosition = new Position(row= 0, column=0);
    private Direction currentDirection = EAST;
    public boolean isPenUp() {
        return isPenUp;
    }

    public void penDown() {
        this.isPenUp = false;
    }

    public void penUp(){
        this.isPenUp = true;
    }

    public Direction getCurrentDirection() {
        return currentDirection;
    }

    public void turnRight() {
        switch (currentDirection){
            case EAST -> face(SOUTH);
            case WEST -> face(NORTH);
            case NORTH -> face(EAST);
            case SOUTH -> face(WEST);
        }

    }

    public void turnLeft() {
        switch (currentDirection){
            case EAST -> face(NORTH);
            case WEST -> face(SOUTH);
            case NORTH -> face(WEST);
            case SOUTH -> face(EAST);
        }

    }

    private void face(Direction direction){
        currentDirection = direction;
    }

    public void move(int noOfSteps, SketchPad sketchPad) {
        if (!isPenUp) writeOn(sketchPad,noOfSteps);
        move(noOfSteps);
    }

    private void writeOn(SketchPad sketchPad, int noOfSteps) {
        int[][] floor = sketchPad.getFloor();
        int currentRow = currentPosition.getRow();
        int currentColumn = currentPosition.getColumn();
        switch (currentDirection){
            case EAST -> {
                for (int i = currentColumn; i < currentColumn+noOfSteps; i++){
                    floor[currentRow][i]=1;
                }
            }
            case WEST -> {

            }
        }
    }

    private void move(int noOfSteps){
        if (currentDirection==EAST)increaseColumnBy(noOfSteps);
    }

    private void increaseColumnBy(int noOfSteps) {
        int currentColumn = currentPosition.getColumn();
        currentPosition.setColumn(noOfSteps+currentColumn);
    }

    public Position getCurrentPosition() {
        return  currentPosition;
    }
}
