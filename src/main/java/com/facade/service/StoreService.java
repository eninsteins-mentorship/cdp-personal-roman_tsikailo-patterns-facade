package com.facade.service;

import com.visitor.Visitable;
import com.visitor.client.model.Visitor;
import com.visitor.model.Store;

public class StoreService implements Visitable {

    private Store store;

    public StoreService() {
        store = new Store();
    }

    @Override
    public void accept(Visitor visitor) {
        store.accept(visitor);
    }
}
