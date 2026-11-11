class Owner {

    private int ownerId;
    private String ownerName;

    public Owner(int id, String name) {
        ownerId = id;
        ownerName = name;
    }

    public void displayOwnerInfo() {
        System.out.println("Owner ID: " + ownerId);
        System.out.println("Owner Name: " + ownerName);
    }
}