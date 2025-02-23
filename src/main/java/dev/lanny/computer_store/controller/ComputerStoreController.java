package dev.lanny.computer_store.controller;

import dev.lanny.computer_store.model.ComputerStore;
import dev.lanny.computer_store.model.Computer;
import java.util.List;

public class ComputerStoreController {
    private ComputerStore storeComputer;

    public ComputerStoreController(ComputerStore model) {
        this.storeComputer = model; 
    }

    public void addComputer(Computer computer) {
        storeComputer.addComputer(computer);
    }

    public int getComputerCount() {
        return storeComputer.getComputerCount();
    }

    public boolean removeComputer(String brand) {
        return storeComputer.removeComputer(brand);
    }

    public Computer searchComputer(String brand) {
        return storeComputer.searchComputer(brand).orElse(null);
    }

    public List<Computer> listComputers() {
        return storeComputer.listComputers();
    }
}
