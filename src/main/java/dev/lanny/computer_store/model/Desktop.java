package dev.lanny.computer_store.model;

public class Desktop extends Computer {
    private String caseType;

    public Desktop(String brand, int memory, String processor, String operatingSystem, double price, String caseType) {
        super(brand, memory, processor, operatingSystem, price);
        this.caseType = caseType;
    }

    public String getCaseType() {
        return caseType;
    }

    @Override
    public void displayDetails() {
        System.out.println("Desktop -> Marca: " + brand + ", Memoria: " + memory + "GB, Procesador: " + processor
                + ", SO: " + operatingSystem + ", Precio: $" + price + ", Tipo de Torre: " + caseType);
    }

    @Override
    public String toString() {
        return super.toString() + ", Case Type: " + caseType;
    }
}

