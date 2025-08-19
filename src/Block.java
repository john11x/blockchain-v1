import java.util.Arrays;

public class Block {
    private Integer previoushash;
    private String [] transactions;
    private Integer blockhash;

    public Block(Integer previoushash, String[] transactions) {
        this.previoushash = previoushash;
        this.transactions = transactions;

        Object [] contents = {Arrays.hashCode(transactions), previoushash };
        this. blockhash = Arrays.hashCode(contents);
    }

    public String[] getTransactions()  {
        return transactions;
    }

    public void setTransactions(String[] transactions) {
        this.transactions = transactions;
    }

    public Integer getPrevioushash() {
        return previoushash;
    }

    public void setPrevioushash(Integer previoushash) {
        this.previoushash = previoushash;
    }

    public Integer getBlockhash() {
        return blockhash;
    }
}
