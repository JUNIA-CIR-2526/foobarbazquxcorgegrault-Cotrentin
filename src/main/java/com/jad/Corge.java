package com.jad;

public record Corge(Foo foo) {
    @Override
    public Foo foo() {
        return this.foo;
    }
}
