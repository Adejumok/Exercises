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
            case SOUTH -> {
                for (int i = currentRow; i < currentRow+noOfSteps; i++){
                    floor[i][currentColumn]=1;
                }
            }

            case WEST -> {
                for (int i = currentColumn; i > currentColumn - noOfSteps ; i--) {
                    floor[currentRow][i]=1;
                }
            }

            case NORTH -> {
                for (int i = currentRow; i > currentRow -noOfSteps; i--) {
                    floor[i][currentColumn]=1;
                }
            }
        }
    }

    private void move(int noOfSteps){
        switch (currentDirection){
            case EAST -> increaseColumnBy(noOfSteps-1);
            case SOUTH -> increaseRowBy(noOfSteps-1);
            case WEST -> increaseColumnBy(1-noOfSteps);
            case NORTH -> increaseRowBy(1-noOfSteps);
        }

    }

    private void increaseColumnBy(int noOfSteps) {
        int currentColumn = currentPosition.getColumn();
        currentPosition.setColumn(noOfSteps+currentColumn);
    }

    private void increaseRowBy(int noOfSteps) {
        int currentRow = currentPosition.getRow();
        currentPosition.setRow(noOfSteps+currentRow);
    }

    public Position getCurrentPosition() {
        return  currentPosition;
    }
}
