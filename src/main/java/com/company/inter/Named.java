package com.company.inter;

public interface Named {

    default String name() {
        return this.getClass().getSimpleName();
    }

}
