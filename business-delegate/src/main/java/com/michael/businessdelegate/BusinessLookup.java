package com.michael.businessdelegate;

/**
 * @author Michael Chu
 * @since 2019-08-05 16:47
 */
public class BusinessLookup {

    private EjbService ejbService;

    private JmsService jmsService;

    public BusinessService getBusinessService(ServiceType serviceType) {
        if (serviceType.equals(ServiceType.EJB)) {
            return ejbService;
        } else {
            return jmsService;
        }
    }

    public void setJmsService(JmsService jmsService) {
        this.jmsService = jmsService;
    }

    public void setEjbService(EjbService ejbService) {
        this.ejbService = ejbService;
    }
}
