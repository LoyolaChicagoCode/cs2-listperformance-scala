object timeThis:

  def apply[A](s: String)(block: => A): A =
    val time0 = System.currentTimeMillis
    val b = block
    val time1 = System.currentTimeMillis - time0
    println(s"$s = $time1 ms")
    b

end timeThis
