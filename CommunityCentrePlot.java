
public class CommunityCentrePlot extends Plot {

    private String centreName;
    private int capacity;

    public CommunityCentrePlot(int no, double l, double w,
                               Owner owner, String name,
                               int capacity) {

        super(no, l, w, owner, 3000, 0);

        centreName = name;
        this.capacity = capacity;
    }

    @Override
    public void displayDetails() {

        System.out.println("\n===== COMMUNITY CENTRE =====");

        displayCommonDetails();

        System.out.println("Centre Name: " + centreName);
        System.out.println("Capacity: " + capacity);
    }
}