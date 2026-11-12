class Resident {

    private int residentId;
    private String residentName;
    
    public Resident(int id, String name) {

        residentId = id;
        residentName = name;
    }

    public void displayResidentInfo() {
        System.out.println("Resident ID: " + residentId);
        System.out.println("Name: " + residentName);
        
    }
}