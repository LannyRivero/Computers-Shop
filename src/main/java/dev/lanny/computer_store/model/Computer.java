package dev.lanny.computer_store.model;

public abstract class Computer {
    protected String brand;
    protected int memory;
    protected String processor;
    protected String operatingSystem;
    protected double price;

    public Computer(String brand, int memory, String processor, String operatingSystem, double price) {
        this.brand = brand;
        this.memory = memory;
        this.processor = processor;
        this.operatingSystem = operatingSystem;
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public abstract void displayDetails();

    @Override
    public String toString() {
        return "Brand: " + brand + ", Memory: " + memory + "GB, Processor: " + processor + ", OS: " + operatingSystem + ", Price: $" + price;
    }

}
