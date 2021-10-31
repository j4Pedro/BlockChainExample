import java.util.Arrays;

public class Block {

	private String[] transactions;
	private int blockHash;
	private int previousBlockHash;
	
	
	
	

	@Override
	public String toString() {
		return "Block [transactions=" + Arrays.toString(transactions) + ", blockHash=" + blockHash
				+ ", previousBlockHash=" + previousBlockHash + "]";
	}

	protected Block(String[] transactions, int previousBlockHash) {
		super();
		this.transactions = transactions;
		this.previousBlockHash = previousBlockHash;
		this.blockHash = Arrays.hashCode(new int[] { Arrays.hashCode(transactions), this.previousBlockHash });
	}

	protected String[] getTransactions() {
		return transactions;
	}

	protected void setTransactions(String[] transactions) {
		this.transactions = transactions;
	}

	protected int getBlockHash() {
		return blockHash;
	}

	protected void setBlockHash(int blockHash) {
		this.blockHash = blockHash;
	}

	protected int getPreviousBlockHash() {
		return previousBlockHash;
	}

	protected void setPreviousBlockHash(int previousBlockHash) {
		this.previousBlockHash = previousBlockHash;
	}

}
