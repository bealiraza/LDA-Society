public class Main {

    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("===== LDA SOCIETY MANAGEMENT SYSTEM =====");

        System.out.print("Enter Society Name: ");
        String societyName = input.nextLine();

        System.out.print("Enter Number of Blocks: ");
        int totalBlocks = Integer.parseInt(input.nextLine());

        LDASociety society =
                new LDASociety(societyName, totalBlocks);

        // Loop for Blocks
        for (int i = 0; i < totalBlocks; i++) {

            System.out.println("\nEnter Block Details");

            System.out.print("Block Name: ");
            String blockName = input.nextLine();

            System.out.print("Block Number: ");
            int blockNo = Integer.parseInt(input.nextLine());

            System.out.print("Number of Plots: ");
            int totalPlots = Integer.parseInt(input.nextLine());

            Block block =
                    new Block(blockName, blockNo, totalPlots);

            // Loop for Plots
            for (int j = 0; j < totalPlots; j++) {

                System.out.println("\nSelect Plot Type:");
                System.out.println("1. Residential");
                System.out.println("2. Commercial");
                System.out.println("3. Community Centre");

                System.out.print("Enter Choice: ");
                int choice = Integer.parseInt(input.nextLine());

                System.out.print("Plot Number: ");
                int plotNo = Integer.parseInt(input.nextLine());

                System.out.print("Enter Length: ");
                double length = Double.parseDouble(input.nextLine());

                System.out.print("Enter Width: ");
                double width = Double.parseDouble(input.nextLine());

                // Owner Information
                System.out.println("\nEnter Owner Details");

                System.out.print("Owner ID: ");
                int ownerId = Integer.parseInt(input.nextLine());

                System.out.print("Owner Name: ");
                String ownerName = input.nextLine();

                Owner owner =
                        new Owner(ownerId, ownerName);

                Plot plot;

                // Residential Plot
                if (choice == 1) {

                    System.out.print("Number of Rooms: ");
                    int rooms = Integer.parseInt(input.nextLine());

                    System.out.print("Number of Residents: ");
                    int count = Integer.parseInt(input.nextLine());

                    ResidentialPlot rp =
                            new ResidentialPlot(
                                    plotNo, length, width,
                                    owner, rooms, count
                            );

                    // Input Residents
                    for (int k = 0; k < count; k++) {

                        System.out.println("\nResident " + (k + 1));

                        System.out.print("Resident ID: ");
                        int id = Integer.parseInt(input.nextLine());

                        System.out.print("Resident Name: ");
                        String name = input.nextLine();

                        Resident r =
                                new Resident(id, name);

                        rp.addResident(r);
                    }

                    plot = rp;
                }

                // Commercial Plot
                else if (choice == 2) {

                    System.out.print("Business Name: ");
                    String business = input.nextLine();

                    System.out.print("Shop Type: ");
                    String type = input.nextLine();

                    plot = new CommercialPlot(
                            plotNo, length, width,
                            owner, business, type
                    );
                }

                // Community Centre
                else if (choice == 3) {

                    System.out.print("Centre Name: ");
                    String centre = input.nextLine();

                    System.out.print("Capacity: ");
                    int capacity = Integer.parseInt(input.nextLine());

                    plot = new CommunityCentrePlot(
                            plotNo, length, width,
                            owner, centre, capacity
                    );
                }

                else {
                    System.out.println("Invalid Choice!");
                    j--;
                    continue;
                }

                // Add Plot to Block
                block.addPlot(plot);
            }

            // Add Block to Society
            society.addBlock(block);
        }

        // Display Complete Society Information
        society.displaySociety();

        input.close();
    }
}