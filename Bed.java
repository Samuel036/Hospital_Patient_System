public class Bed {
    private int bedId;
    private String patientName;
    private boolean occupied;
    public Bed(int bedId) { this.bedId = bedId; }
    public int getBedId() { return bedId; }
    public String getPatientName() { return patientName; }
    public boolean isOccupied() { return occupied; }
    public void assign(String patientName) {
      this.patientName = patientName;
      occupied = true;
    }
    public void remove() {
      patientName = "";
      occupied = false;
    }
    public String toString() { return bedId + ", " + patientName + ", " + occupied; }
}