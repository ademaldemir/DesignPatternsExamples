package com.designpatterns.proxy.maskexample;

public class AuthenticatableMaskOrderProxy implements IOrderableMask {

    private IOrderableMask _orderMask;

    public AuthenticatableMaskOrderProxy() {
        this._orderMask = new MaskOrder();
    }

    @Override
    public void createOrder(Person person) {
        // Before calling the method of MaskOrder
        // we will be control the user is valid or not.

        Boolean isValid = checkPersonIsValid(person);

        if (isValid) {
            _orderMask.createOrder(person);
        }
    }

    private Boolean checkPersonIsValid(Person person) {
        return person.tc.length() == 11 && person.address != "";
    }
}
