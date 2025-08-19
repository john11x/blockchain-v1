import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Block> blockchain = new ArrayList<>();
        String [] gentransaction = {"Jeff sent 10 bitcoin to John, Gavi sent 2 bitcoin to Ivan "};
        Block genesis = new Block(null, gentransaction );

        String [] block1transact = {"Joseph sent 40 bitcoin to Juliet, lamine  sent 2 bitcoin to Toney "};
        Block block1 = new Block(genesis.getBlockhash(), block1transact );

        String [] block2transact = {"Japet sent 20 bitcoin to Luhn, Gavi sent 25 bitcoin to Kan "};
        Block block2 = new Block(block1.getBlockhash(), block2transact );

        System.out.println("genesis block hash");
        System.out.println(genesis.getBlockhash());
        System.out.println("block 1 hash");
        System.out.println(block1.getBlockhash());
        System.out.println("block 2 hash");
        System.out.println(block2.getBlockhash());




    }
}