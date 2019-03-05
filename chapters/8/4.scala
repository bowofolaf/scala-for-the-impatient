// define abstract class Item with methods price and description

abstract class Item {
    def description: String
    def price: Double
}

// define a class SimpleItem whose price and description are in the constructor

class SimpleItem(override val price: Double, override val description: String) extends Item


class Bundle(override val description: String) extends Item {

    import scala.collection.mutable.ListBuffer
    var items: ListBuffer[Item] = ListBuffer.empty[Item]

    def addItem(item: Item) {
        items += item
    }

    override def price: Double = items.map(_.price).sum
}
