package turtleGraphics;

public class Position {
    private int row;
    private int column;
    public Position(int row, int column) {
        this.row =row;
        this.column=column;
    }

    public void setPosition(int row, int column) {
        this.row =row;
        this.column=column;
    }

    int getRow() {
        return row;
    }

    int getColumn() {
        return column;
    }


    @Override
    public boolean equals(Object o){
        Position compared = (Position) o;
        if (row==compared.getRow()&& column == compared.getColumn())return true;
        return false;
    }


    @Override
    public String toString(){
        return "Position{"+
                "row="+row+
                ", column="+column+
                "}";
    }

    public void setColumn(int column) {
        this.column=column;
    }
}
