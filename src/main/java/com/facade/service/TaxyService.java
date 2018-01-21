package com.facade.service;

import com.visitor.Visitable;
import com.visitor.client.model.Visitor;
import com.visitor.model.Taxy;

import java.util.*;
import java.util.stream.IntStream;

public class TaxyService implements Visitable {

    private Map<Taxy, Boolean> taxPark;

    public TaxyService(int taxParkAmount) {
       taxPark = new HashMap<>();
       init(taxParkAmount);
    }

    @Override
    public void accept(Visitor visitor) {
        Taxy taxy = getAvailableTaxy();
        visitor.visit(taxy);
        taxPark.put(taxy, true);
    }

    private void init(int taxParkAmount){
        IntStream.range(0, taxParkAmount).forEach(car -> taxPark.put(new Taxy(), true));
    }

    private Taxy getAvailableTaxy() {
        if (!hasAvailableCars())
            taxPark.put(new Taxy(), true);

        Taxy target = taxPark.entrySet().stream().filter(Map.Entry::getValue).findFirst()
                .orElseThrow(() -> new RuntimeException("There are no available cars")).getKey();
        taxPark.put(target, false);
        return target;
    }

    private boolean hasAvailableCars() {
        return taxPark.entrySet().stream().anyMatch(Map.Entry::getValue);
    }
}
