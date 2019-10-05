package com.example;

public final class Greeter {

  Greeter() {

  }
  public final String greet( final String someone) {
    return String.format("Hello, %s!", someone);
  }
}
