package models;

public class Room {
    private long roomNumber;
    private String status;
    private long numberOfTable;

    public Room(){

    }

    public Room(long roomNumber, String status, long numberOfTable) {
        this.roomNumber = roomNumber;
        this.status = status;
        this.numberOfTable = numberOfTable;
    }

    public long getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(long roomNumber) {
        this.roomNumber = roomNumber;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public long getNumberOfTable() {
        return numberOfTable;
    }

    public void setNumberOfTable(long numberOfTable) {
        this.numberOfTable = numberOfTable;
    }

    @Override
    public String toString() {
        return String.format("%-16s%-26s%-26s%n", getRoomNumber(), getStatus(),getNumberOfTable() );
    }
}
