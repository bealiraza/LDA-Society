class ResidentialPlot extends Plot {

    private int noOfRooms;

    public ResidentialPlot(int no, double l, double w,
                           Owner owner, int rooms,
                           int residentsSize) {

        super(no, l, w, owner, 5000, residentsSize);

        noOfRooms = rooms;
    }

    @Override
    public void displayDetails() {

        System.out.println("\n===== RESIDENTIAL PLOT =====");

        displayCommonDetails();

        System.out.println("Number of Rooms: " + noOfRooms);
    }
}