import java.util.ArrayList;

public class TreeFactory {
	private static final ArrayList<Tree> mylist = new ArrayList<Tree>();
	public static Terrain getTree(String type)
	{
		Tree tree = new Tree(type);
		mylist.add(tree);
		return tree;
   }
}
