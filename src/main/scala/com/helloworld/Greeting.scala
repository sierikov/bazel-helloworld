package com.helloworld

case object Greeting {
  def sayHi(add: String = "") = println(s"Hi, this is Bazel! ${add}")
}
