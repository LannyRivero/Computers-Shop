package dev.lanny.computer_store.model;

import java.util.*;

public class ComputerStore {
    private String name;
    private String owner;
    private String taxId;
    private List<Computer> computers;

    public ComputerStore(String name, String owner, String taxId) {
        if (name == null || name.trim().isEmpty() ||
                owner == null || owner.trim().isEmpty() ||
                taxId == null || taxId.trim().isEmpty()) {
            throw new IllegalArgumentException("Name, owner, and tax ID cannot be null or empty");
        }

        this.name = name;
        this.owner = owner;
        this.taxId = taxId;
        this.computers = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public String getOwner() {
        return owner;
    }

    public String getTaxId() {
        return taxId;
    }

    public void addComputer(Computer computer) {
        if (computer == null) {
            throw new IllegalArgumentException("Computer cannot be null");
        }
        computers.add(computer);
    }

    public int getComputerCount() {
        return computers.size();
    }

    public boolean removeComputer(String brand) {
        Optional<Computer> computerToRemove = computers.stream()
                .filter(computer -> computer.getBrand().equalsIgnoreCase(brand))
                .findFirst();

        return computerToRemove.map(computers::remove).orElse(false);
    }

    public Optional<Computer> searchComputer(String brand) {
        return computers.stream()
                .filter(computer -> computer.getBrand().trim().equalsIgnoreCase(brand.trim()))
                .findFirst();
    }

    public List<Computer> listComputers() {
        return Collections.unmodifiableList(computers);
    }

    @Override
    public String toString() {
        return "Store: " + name + ", Owner: " + owner + ", Tax ID: " + taxId;
    }
}
