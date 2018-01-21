package com.facade.service;

import com.visitor.Visitable;
import com.visitor.client.model.Visitor;
import com.visitor.model.Barbershop;

public class BarbershopService implements Visitable {

    private Barbershop barbershop;

    public BarbershopService() {
        barbershop = new Barbershop();
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(barbershop);
    }
}
