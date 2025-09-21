package com.jad;


import java.util.ArrayList;
import java.util.List;

public class Foo {

    private final Bar bar;
    private final List<Baz> bazs = new ArrayList<>();
    private final List<Grault> graults = new ArrayList<>();
    private Qux qux;
    private Corge corge;

    public Foo(Bar bar) {
        this.bar = bar;
    }

    public void addBaz(Baz baz) {
        this.bazs.add(baz);
    }

    public void addGrault(Grault grault) {
        this.graults.add(grault);
    }
}

