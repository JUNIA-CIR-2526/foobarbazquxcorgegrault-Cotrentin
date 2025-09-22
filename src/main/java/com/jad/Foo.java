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

    public Bar getBar() {
        return this.bar;
    }

    public List<Baz> getBazs() {
        return this.bazs;
    }

    public Qux getQux() {
        return this.qux;
    }

    public Corge getCorge() {
        return this.corge;
    }

    public void setCorge(Corge corge) {
        this.corge = corge;
    }

    public void addBaz(Baz baz) {
        this.bazs.add(baz);
    }

    public void addGrault(Grault grault) {
        this.graults.add(grault);
    }

    public List<Grault> getGraults() {
        return this.graults;
    }
}

