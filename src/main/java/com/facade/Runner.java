package com.facade;

import com.visitor.client.model.CustomerVisitor;

public class Runner {
    public static void main(String[] args) {
        CustomerOrientedApplication application = new CustomerOrientedApplication();
        application.visitBarbershopViaTaxy(new CustomerVisitor("James"));
        application.visitStoreViaTaxy(new CustomerVisitor("Charlie"));
    }
}
