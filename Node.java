import AlgoTools.IO;

/**
* Diese Klasse repraesentiert einen Knoten in einem binaeren Baum.
*/
public class Node {

  // Attribute der Klasse Node.
  private Node leftChild;
  private Node rightChild;
  private Object data;

  /**
  * Konstruktor der Klasse Node.
  */
  public Node(Object obj) {
    this.data = obj;
    this.leftChild = null;
    this.rightChild = null;
  }

  /**
  * Diese Operation gibt diesem Knoten ein linkes Kind.
  */
  public void setLeftChild(Node leftChild){
    this.leftChild = leftChild;
  }

  /**
  * Diese Operation gibt diesem Knoten ein rechtes Kind.
  */
  public void setRightChild(Node rightChild){
    this.rightChild = rightChild;
  }

  /**
  * Diese Operation liefert das linke Kind dieses Knotens.
  */
  public Node getLeftChild(){
    return this.leftChild;
  }

  /**
  * Diese Operation liefert das rechte Kind dieses Knotens.
  */
  public Node getRightChild(){
    return this.rightChild;
  }

  /**
  * Diese Operation liefert die Daten dieses Knotens.
  */
  public Object getData(){
    return this.data;
  }
}
