package com.two.helloworld

case object Greeting {
  def sayHi(add: String = "") = println(s"Hi, from module Two, Bazel! ${add}")
}
