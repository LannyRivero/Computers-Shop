package dev.lanny.computer_store.model;

public class Laptop extends Computer {
    private double weight;

    public Laptop(String brand, int memory, String processor, String operatingSystem, double price, double weight) {
        super(brand, memory, processor, operatingSystem, price);
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }
    @Override
    public void displayDetails() {
        System.out.println("Laptop -> Marca: " + brand + ", Memoria: " + memory + "GB, Procesador: " + processor
                + ", SO: " + operatingSystem + ", Precio: $" + price + ", Peso: " + weight + "kg");
    }

    @Override
    public String toString() {
        return super.toString() + ", Weight: " + weight + "kg";
    }
}
