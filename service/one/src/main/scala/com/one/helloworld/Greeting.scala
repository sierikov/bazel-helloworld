package com.one.helloworld

case object Greeting {
  def sayHi(add: String) = add match {
    case _ => println(s"Hi, ${add} Bazel!")
  }
}
