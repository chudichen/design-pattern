package com.michael.businessdelegate;

/**
 * @author Michael Chu
 * @since 2019-08-05 16:37
 */
public class App {

    public static void main(String[] args) {
        BusinessDelegate businessDelegate = new BusinessDelegate();
        BusinessLookup businessLookup = new BusinessLookup();
        businessLookup.setJmsService(new JmsService());
        businessLookup.setEjbService(new EjbService());

        businessDelegate.setLookupService(businessLookup);
        businessDelegate.setServiceType(ServiceType.EJB);

        Client client = new Client(businessDelegate);
        client.doTask();

        businessDelegate.setServiceType(ServiceType.JMS);
        client.doTask();
    }
}
