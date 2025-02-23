package dev.lanny.computer_store.controller;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import dev.lanny.computer_store.model.Computer;
import dev.lanny.computer_store.model.ComputerStore;
import dev.lanny.computer_store.model.Desktop;
import dev.lanny.computer_store.model.Laptop;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;
import java.util.List;


class ComputerStoreControllerTest {
    private ComputerStore store;
    private ComputerStoreController controller;

    @BeforeEach
    void setUp() {
        store = new ComputerStore("Tech Store", "John Doe", "123456789");
        controller = new ComputerStoreController(store);
    }

    @Test
    @DisplayName("Validamos poder Agregar una computadora a la tienda")
    void test_Add_Computer() {
        Computer laptop = new Laptop("Dell", 16, "Intel i7", "Windows 10", 1200.0, 2.5);
        controller.addComputer(laptop);
        assertThat(store.getComputerCount(), is(1));
    }

    @Test
    @DisplayName("VAlidamos poder eliminar una computadora por marca")
    void test_Remove_Computer() {
        Computer desktop = new Desktop("HP", 8, "AMD Ryzen 5", "Windows 11", 900.0, "Tower");
        controller.addComputer(desktop);
        boolean removed = controller.removeComputer("HP");
        assertThat(removed, is(true));
        assertThat(store.getComputerCount(), is(0));
    }

    @Test
    @DisplayName("Se valida eliminar una computadora inexistente")
    void test_Remove_NonExistent_Computer() {
        boolean removed = controller.removeComputer("Lenovo");
        assertThat(removed, is(false));
    }

   
 

    @Test
    @DisplayName("Se valida poder listar todas las computadoras en la tienda")
    void test_List_Computers() {
        Computer laptop = new Laptop("Asus", 32, "Intel i9", "Windows 11", 2000.0, 2.2);
        Computer desktop = new Desktop("Acer", 16, "AMD Ryzen 7", "Windows 10", 1100.0, "Mini");
        controller.addComputer(laptop);
        controller.addComputer(desktop);
        List<Computer> computers = controller.listComputers();
        assertThat(computers, hasSize(2));
    }
}

