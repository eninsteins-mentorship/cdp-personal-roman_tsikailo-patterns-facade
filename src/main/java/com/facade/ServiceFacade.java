package com.facade;

import com.visitor.client.model.Visitor;

public interface ServiceFacade {
    void visitBarbershopViaTaxy(Visitor visitor);
    void visitStoreViaTaxy(Visitor visitor);
}
