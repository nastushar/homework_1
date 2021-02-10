package com.company.impl;

import com.company.inter.Participant;
import com.company.inter.Overcomable;
import com.company.inter.Runnable;

public class Treadmill implements Overcomable {

    private final int length;

    public Treadmill(int length) {
        this.length = length;
    }

    @Override
    public void overcome(Participant o) {
        if (!(o instanceof Runnable)) {
            System.out.println("Can't overcome let");
        }
        if (((Runnable) o).maxRun() > length) {
            ((Runnable) o).run();
        } else {
            o.inactive();
        }
    }

}
