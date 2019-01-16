import AlgoTools.IO;

/**
 * Diese Klasse dient zum Testen der Klasse TreeTools.
 * Benoetigt die Klasse Node und LinkedTree.
 */
public class TreeToolsTest {

  public static void main(String[] args) {

    IO.println();

    LinkedTree a = new LinkedTree(new Character('A'));
    LinkedTree b = new LinkedTree(new Character('B'));
    LinkedTree c = new LinkedTree(a, new Character('C'), b);
    LinkedTree d = new LinkedTree(new Character('D'));
    LinkedTree e = new LinkedTree(c, new Character('E'), d);
    LinkedTree f = new LinkedTree(new Character('F'));
    LinkedTree g = new LinkedTree(new Character('G'));
    LinkedTree h = new LinkedTree(f, new Character('H'), g);
    LinkedTree i = new LinkedTree(e, new Character('I'), h);
    LinkedTree j = new LinkedTree(new Character('J'));
    LinkedTree k = new LinkedTree(i, new Character('K'), j);
    LinkedTree l = new LinkedTree(new Character('L'));
    LinkedTree m = new LinkedTree(new Character('M'));
    LinkedTree n = new LinkedTree(l, new Character('N'), m);
    LinkedTree o = new LinkedTree(k, new Character('O'), n);

    IO.println("Baumtiefe laut Methode (sollte 6 sein): " +
    TreeTools.determineDepth(o));

    TreeTools.printTree(o);

    IO.println();
  }
}
