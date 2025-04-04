package entities;

public class Room {
    private final int number;
    private boolean occupied = false;
    private String owner = "";

    public Room(int number, boolean occupied, String owner) {
        this.number = number;
        this.occupied = occupied;
        this.owner = owner;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public boolean isOccupied() {
        return occupied;
    }

    public void setOccupied(boolean occupied) {
        this.occupied = occupied;
    }

    public int getNumber() {
        return number;
    }

    public String toString() {
        return this.number + ": " + this.owner + "\n";
    }
}
