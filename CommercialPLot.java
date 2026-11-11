class CommercialPlot extends Plot {

    private String businessName;
    private String shopType;

    public CommercialPlot(int no, double l, double w,
                          Owner owner, String business,
                          String type) {

        super(no, l, w, owner, 8000, 0);

        businessName = business;
        shopType = type;
    }

    @Override
    public void displayDetails() {

        System.out.println("\n===== COMMERCIAL PLOT =====");

        displayCommonDetails();

        System.out.println("Business Name: " + businessName);
        System.out.println("Shop Type: " + shopType);
    }
}