import AlgoTools.IO;

/**
*  Ein LinkedTree enthaelt einen Verweis auf die Wurzel, die auf weitere
*  Nodes verweisen kann, die den linken und rechten Teilbaum repraesentieren.
*/
public class LinkedTree {

  // Wurzel des Baums.
  private Node root;

  // konstruiert einen leeren Baum
  public LinkedTree() {

    // Wurzel verweist auf nichts
    root = null;
  }

  // konstruiert ein Blatt
  public LinkedTree(Object obj) {

    // lege Knoten mit Inhalt obj an
    root = new Node(obj);
  }

  // konstruiert Baum
  public LinkedTree(LinkedTree leftTree, Object obj, LinkedTree rightTree) {

    // lege Knoten mit Inhalt obj an
    root = new Node(obj);

    // wenn der linke Teilbaum nicht null, setze
    if (!leftTree.isEmpty()) {

      // wurzel des linken Teilbaums als linkes Kind
      root.setLeftChild(leftTree.getRoot());
    }

    // wenn der rechte Teilbaum nicht null, setze
    if (!rightTree.isEmpty()) {

      // wurzel des rechten Teilbaums als rechtes Kind
      root.setRightChild(rightTree.getRoot());
    }
  }

  // konstruiert einen Baum, aus ubergebenem Knoten
  // (nur fuer internen Gebrauch)
  private LinkedTree(Node root) {
    this.root = root;
  }

  // liefert true, falls der Baum leer ist
  public boolean isEmpty() {
    return root == null;
  }

  // liefert die Wurzel
  public Node getRoot() {
    return this.root;
  }

  // liefert Daten in der Wurzel
  public Object getRootData() {
    if (isEmpty()) {
      throw new RuntimeException(" Baum ist leer ");
    }
    return root.getData();
  }

  // liefert linken Teilbaum
  public LinkedTree getLeftTree() {
    if (isEmpty()) {
      throw new RuntimeException(" Baum ist leer ");
    }

    // Erzeuge Baum, der linken Sohn als Wurzelknoten enthaelt
    return new LinkedTree(root.getLeftChild());
  }

  // liefert rechten Teilbaum
  public LinkedTree getRightTree() {
    if (isEmpty()) {
      throw new RuntimeException(" Baum ist leer ");
    }

    // Erzeuge Baum, der rechten Sohn als Wurzelknoten enthaelt
    return new LinkedTree(root.getRightChild());
  }

}
