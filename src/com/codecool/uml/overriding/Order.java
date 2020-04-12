package com.codecool.uml.overriding;

public class Order implements Orderable{
    private static int idNr = 0;
    private int id;
    private String status;

    public Order(String status) {
        idNr++;
        this.id = idNr;
        this.status = status;
    }

    public String getStatus() {
        return status;
    }

    @Override
    public boolean checkout() {
            return false;
    }

    @Override
    public boolean pay() {
        return false;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", status='" + status + '\'' +
                '}';
    }
}
