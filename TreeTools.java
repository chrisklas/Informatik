import AlgoTools.IO;

/**
* Dies Klasse stellt Operationen zur Verfuegung um einen Binärbaum der Klasse
* LinkedTree auf der Konsole auszugeben und dessen Tiefe zu ermitteln.
*/
public class TreeTools {

  private int depth = 0;
  private LinkedTree linkerBaum = null;
  private LinkedTree rechterBaum = null;
  private Node wurzel = null;



  public static int determineDepth(LinkedTree tree) {
    if (tree.isEmpty()){
      return 0;
    }

    wurzel = tree.getRoot()
    linkerBaum = tree.getLeftTree();
    if (linkerBaum)
    rechterBaum = tree.getRightTree();




  }

  public static void printLevel(LinkedTree tree, int level, int spaces) {

  }

  /**
   * Druckt einen LinkedTree auf der Konsole ebenenweise aus.
   * Nutzt detemineDepth(LinkedTree), printLevel(LinkedTree,int,int) und
   * spaces(int).
   */
  public static void printTree(LinkedTree tree) {

    // Berechne die Tiefe des Baumes.
    int remainingDepth = determineDepth(tree);

    // Gehe die Ebenen des Baumes durch.
    for(int i = 0; i < remainingDepth; i++) {
      // Drucke die Ebene, beruecksichtige Anzahl der Leerzeichen
      // fuer korrekte Einrueckung.
      printLevel(tree, i, spaces(remainingDepth - i));
      IO.println();
      IO.println();
    }
  }

  /**
   * Berechnet die Anzahl an benoetigten Leerzeichen fuer
   * eine korrekte Einrueckung, also 0.5 * (2^(level) - 2).
   */
  private static int spaces(int level) {

    if(level == 1) {
      return 0;
    }
    else {
      //verdoppele die Leerzeichen gegenueber der Ebene darunter
      //und fuege ein weiteres Leerzeichen hinzu
      return 2 * spaces(level - 1) + 1;
    }
  }

}
