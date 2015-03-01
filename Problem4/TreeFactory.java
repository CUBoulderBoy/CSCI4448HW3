import java.util.*;

public class TreeFactory {
	private static Map<String, Tree> treeList = new HashMap<String, Tree>();
	
	public static Terrain getTree(String type)
	{
		Tree tree = treeList.get(type);
		
		if (tree == null){
			tree = new Tree(type);
			treeList.put(type, tree);
		}

		return tree;
   }
}
