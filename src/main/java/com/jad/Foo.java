package com.jad;


import java.util.ArrayList;
import java.util.List;

public class Foo {

    private final Bar bar;
    private final List<Grault> graults = new ArrayList<>();
    private List<Baz> bazs;
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
        if (this.corge != null) this.corge.setFoo(this);
        this.corge = corge;
        if ((corge != null) && (corge.getFoo() != this)) corge.setFoo(this);
    }

    public void addBaz(Baz baz) {
        this.bazs.add(baz);
    }

    public void addGrault() {
        this.graults.add(new Grault(this));
    }

    public List<Grault> getGraults() {
        return this.graults;
    }
}

