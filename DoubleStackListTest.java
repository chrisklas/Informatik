import AlgoTools.IO;
/**
* Diese Klasse dient zum Testen der Klasse DoubleStackList.
*/
public class DoubleStackListTest {
  public static void main(String[] args) {
    IO.println();

    DoubleStackList list = new DoubleStackList();
    Object obj1 = new Object();
    Object obj2 = new Object();
    Object obj3 = new Object();
    Object obj4 = new Object();
    Object obj5 = new Object();

    IO.println("Die neu konstruierte Liste ist leer: " + list.isEmpty());

    IO.print("Die getCurrent-Operation auf der leeren Liste liefert null: ");
    IO.println(list.getCurrent() == null);

    list.insertAfter(obj1);
    IO.print("Nach einer insertAfter-Operation ist die Liste nicht leer: ");
    IO.println(!list.isEmpty());

    list.delete();
    IO.print("Nach einer insertAfter-delete-Operation ist die Liste ");
    IO.print("unverändert, also wieder leer: ");
    IO.println(list.isEmpty());

    list.insertBefore(obj1);
    IO.print("Nach der insertBefore-Operation mit dem Objekt obj1, ");
    IO.print("liefert die getCurrent-Operation das Objekt obj1: ");
    IO.println(obj1.equals(list.getCurrent()));

    list.insertAfter(obj2);
    IO.print("Nach der insertAfter-Operation mit dem Objekt obj2, ");
    IO.print("liefert die getCurrent-Operation nicht das Objekt obj1: ");
    IO.println(!obj1.equals(list.getCurrent()));

    list.insertAfter(obj3);
    list.insertAfter(obj4);
    list.insertAfter(obj5);

    IO.print("Die hasNext-Operation liefert auf dem letzten Objekt false: ");
    IO.println(!list.hasNext());

    list.toFirst();
    IO.print("Die hasPrev-Operation liefert auf dem ersten Objekt false: ");
    IO.println(!list.hasPrev());

    list.toNext();
    list.toNext();

    IO.print("Die hasNext-Operation liefert auf dem mittleren Objekt true: ");
    IO.println(list.hasNext());

    IO.print("Die hasPrev-Operation liefert auf dem mittleren Objekt true: ");
    IO.println(list.hasPrev());

    list.delete();
    IO.print("Nach der delete-Operation liefert die getCurrent-Operation ");
    IO.print("obj4: ");
    IO.println(obj4.equals(list.getCurrent()));

    list.toPrev();
    IO.print("Nach dem Loeschen von obj3 befindet sich vor obj4 das obj2: ");
    IO.println(obj2.equals(list.getCurrent()));

    IO.print("Vor dem obj2 befindet sich noch ein weiteres Objekt: ");
    IO.println(list.hasPrev());

    list.toLast();
    IO.print("Die getCurrent-Operation liefert das letzte Element: ");
    IO.println(obj5.equals(list.getCurrent()));

    list.insertBefore(obj3);
    list.toLast();
    list.toPrev();
    IO.print("Die insertBefore-Operation setzt vor das letzte Element das: ");
    IO.print("neue Element, nach der toLast-Opertion und der: ");
    IO.print("toPrev-Operation wird mit der getCurrent-Operation genau ");
    IO.print("dieses geliefert: ");
    IO.println(obj3.equals(list.getCurrent()));

    IO.println();

  }
}
