import java.util.ArrayList;
import java.util.Arrays;

public class BlockChainProgram {

	public static void main(String[] args) {

		// demonstrate a hash function
		String statement1 = "My world is perfect";
		int hashvalue = statement1.hashCode();
		System.out.println("Statement = " + statement1 + " Hash value = " + hashvalue);
		// 相同字串具有相同的 hash value

		// hash an array
		String[] list1 = { "alex", "becky", "candy" };
		String[] list2 = { "alex", "becky", "candy" };

		int hash1 = Arrays.hashCode(list1);
		int hash2 = Arrays.hashCode(list2);
		System.out.println("hash1 = " + hash1 + " hash2 = " + hash2);
		// 相同 array 具有相同的 hash value ， 大小寫會不同

		// demonstrate a series of blocks in a chain
		ArrayList<Block> blockChain = new ArrayList<Block>();

		String[] initialValues = { "Shad has $700", "Miguel has $550" };
		Block firstBlock = new Block(initialValues, 0);
		blockChain.add(firstBlock);
		System.out.println("first block is " + firstBlock.toString());
		System.out.println("The block chain is " + blockChain.toString());
		// blockHash=1645480768

		// block two
		String[] shadGivesItAway = { "Shad gives Tim $40", "Shad gives Tany $60", "Shad gives Terry $100" };
		Block secondBlock = new Block(shadGivesItAway, firstBlock.getBlockHash());
		blockChain.add(secondBlock);
		System.out.println("Second block is " + secondBlock.toString());
		System.out.println("The block chain is " + blockChain.toString());
		// blockHash=630749953

		// block three
		String[] shadGetsSomeBack = { "Tim gives Shad $10", "Terry gives $50 to Shad" };
		Block threeBlock = new Block(shadGetsSomeBack, secondBlock.getBlockHash());
		blockChain.add(threeBlock);
		System.out.println("Three block is " + threeBlock.toString());
		System.out.println("The block chain is " + blockChain.toString());
		// blockHash=-502240548

	}

}
