public class Hospital {
    private String hospitalName;
    private Bed[] bedList;
    private int numEmptyBeds;
    private final int totalBeds = 20;

    public Hospital(String hospitalName) {
        this.hospitalName = hospitalName;
        bedList = new Bed[totalBeds];
        for(int i=0; i<totalBeds; i++)
            bedList[i] = new Bed(i);
        numEmptyBeds = totalBeds;
    }

    public void showNumEmptyBeds() {
    System.out.println("There are " + numEmptyBeds + " empty beds");
    }

    public void showEmptyBeds() {
        if(numEmptyBeds != 0) {
            System.out.println("The following beds are empty");
            for(int i=0; i<totalBeds; i++) {
                if(!(bedList[i].isOccupied()))
                System.out.print(i + ", ");
            } 
        }
        else
            System.out.println("The hospital is full");
    }
  
    public void showOccupiedBeds() {
        if(numEmptyBeds != totalBeds) {
            System.out.println("The bed assignments are as follows");
            for(int i=0; i<totalBeds; i++) {
                if(bedList[i].isOccupied())
                System.out.println("BedID " + i + " assigned to Patient " +
                                bedList[i].getPatientName());
            } 
        }
        else
            System.out.println("No patient");
    }

    public void assignBed(String patientName) {
        int i;
        for(i=0; i<totalBeds; i++) {
            if(!bedList[i].isOccupied()) {
                bedList[i].assign(patientName);
                numEmptyBeds--;
                break;
            }   
        }
        if(i == totalBeds)
            System.out.println("Full");
    }

    public void removeBed(int bedId) {
        if(bedList[bedId].isOccupied()) {
            bedList[bedId].remove();
            numEmptyBeds++;
        }
        else
            System.out.println("Bed " + bedId + " is not occupied");
    }

    public String toString() {
        String str = hospitalName + "\n";
        for(int i=0; i<bedList.length; i++)
            str += (bedList[i].toString() + "\n");
        return str + numEmptyBeds;
    }
}
