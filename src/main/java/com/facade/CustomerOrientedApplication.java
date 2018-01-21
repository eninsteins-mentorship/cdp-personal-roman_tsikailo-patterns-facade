package com.facade;

import com.facade.service.BarbershopService;
import com.facade.service.StoreService;
import com.facade.service.TaxyService;
import com.visitor.client.model.Visitor;

public class CustomerOrientedApplication implements ServiceFacade {
    private TaxyService taxyService;
    private BarbershopService barbershopService;
    private StoreService storeService;

    public CustomerOrientedApplication() {
        taxyService = new TaxyService(5);
        barbershopService = new BarbershopService();
        storeService = new StoreService();
    }

    @Override
    public void visitStoreViaTaxy(Visitor visitor) {
        taxyService.accept(visitor);
        storeService.accept(visitor);
        taxyService.accept(visitor);
    }

    @Override
    public void visitBarbershopViaTaxy(Visitor visitor) {
        taxyService.accept(visitor);
        barbershopService.accept(visitor);
        taxyService.accept(visitor);
    }
}
