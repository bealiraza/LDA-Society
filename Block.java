class Block {

    private String blockName;
    private int blockNo;

    private Plot[] plots;
    private int plotCount = 0;

    public Block(String name, int no, int size) {

        blockName = name;
        blockNo = no;

        plots = new Plot[size];
    }

    public void addPlot(Plot p) {

        if (plotCount < plots.length) {
            plots[plotCount] = p;
            plotCount++;
        }
    }

    public void displayPlots() {

        System.out.println("\n************");
        System.out.println("BLOCK: " + blockName);
        System.out.println("Block Number: " + blockNo);
        System.out.println("************");

        for (int i = 0; i < plotCount; i++) {

            plots[i].displayDetails();

            System.out.println("-------------------------------");
        }
    }
}