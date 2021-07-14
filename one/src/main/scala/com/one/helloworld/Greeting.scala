package com.one.helloworld

case object Greeting {
  def sayHi(add: String = "") = println(s"Hi, from module One, Bazel! ${add}")
}
