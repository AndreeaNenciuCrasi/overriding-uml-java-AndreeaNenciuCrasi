package com.codecool.uml.overriding;

public abstract class AbstractProcess{
    public void process(Orderable item){

    }

    public void stepBefore(){

    }

    protected abstract void action(Orderable item);

    private void stepAfter(){

    }
}
