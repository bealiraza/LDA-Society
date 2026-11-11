abstract class Plot {

    protected int plotNo;
    protected double length;
    protected double width;
    protected Owner owner;
    protected double ratePerSqFt;
    protected Resident[] residents;
    protected int residentCount = 0;

    public Plot(int no, double l, double w,
                Owner owner, double rate, int size) {

        plotNo = no;
        length = l;
        width = w;
        this.owner = owner;
        ratePerSqFt = rate;

        residents = new Resident[size];
    }

    // Calculate Area
    public double getArea() {
        return length * width;
    }

    // Calculate Price
    public double calculatePrice() {
        return getArea() * ratePerSqFt;
    }

    // Determine Shape
    public Shape getShape() {
        if (Double.compare(length, width) == 0) {
            return Shape.SQUARE;
        }
        return Shape.RECTANGLE;
    }

    // Add Resident
    public void addResident(Resident r) {
        if (residentCount < residents.length) {
            residents[residentCount] = r;
            residentCount++;
        }
    }

    // Display Owner
    public void displayOwner() {
        System.out.println("\n--- Owner Details ---");
        owner.displayOwnerInfo();
    }

    // Display Residents
    public void displayResidents() {
        System.out.println("\n--- Residents Details ---");

        if (residentCount == 0) {
            System.out.println("No residents recorded.");
        }

        for (int i = 0; i < residentCount; i++) {
            residents[i].displayResidentInfo();
            System.out.println("----------------");
        }
    }

    // Common Plot Information
    public void displayCommonDetails() {

        System.out.println("\nPlot Number: " + plotNo);
        System.out.println("Length: " + length);
        System.out.println("Width: " + width);
        System.out.println("Area: " + getArea() + " sq.ft.");
        System.out.println("Shape: " + getShape());

        System.out.println("Rate per Sq.Ft: Rs. "
                           + ratePerSqFt);

        System.out.println("Total Price: Rs. "
                           + calculatePrice());

        displayOwner();
        displayResidents();
    }

    public abstract void displayDetails();
}
