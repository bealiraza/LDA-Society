
public class LDASociety {

    private String societyName;

    private Block[] blocks;
    private int blockCount = 0;

    public LDASociety(String name, int size) {

        societyName = name;
        blocks = new Block[size];
    }

    public void addBlock(Block b) {

        if (blockCount < blocks.length) {
            blocks[blockCount] = b;
            blockCount++;
        }
    }

    public void displaySociety() {

        System.out.println("\n================================");
        System.out.println("       " + societyName);
        System.out.println("================================");

        for (int i = 0; i < blockCount; i++) {
            blocks[i].displayPlots();
        }
    }
}