package com.two.helloworld

import com.one.helloworld._

object Runner extends App {
  Greeting.sayHi("from module Two by dependecy")
}
