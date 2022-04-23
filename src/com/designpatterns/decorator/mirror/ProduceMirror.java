package com.designpatterns.decorator.mirror;

public class ProduceMirror {
    public static void main(String[] args) {
      HomeThings mirror =   new FramedMirror();
      mirror.produce();
    }
}
