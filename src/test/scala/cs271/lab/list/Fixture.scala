package cs271.lab.list

import scala.collection.mutable.ArrayBuffer

object Fixture {
  // TODO also try with a LinkedList - does it make any difference?
  def fixture() = new ArrayBuffer[Int]

  def populate(list: ArrayBuffer[Int]): Unit = {
    list += 33
    list += 77
    list += 44
    list += 77
    list += 55
    list += 77
    list += 66
  }
}
