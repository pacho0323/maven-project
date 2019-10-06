package com.example;

public final class Greeter {

  Greeter() {

  }
  public final String greet( final String someone) {
    return String.format("Hola, %s!", someone);
  }
}
