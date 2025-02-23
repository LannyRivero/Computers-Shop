package dev.lanny.computer_store.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;
import java.util.List;
import static org.hamcrest.CoreMatchers.is;


public class ComputerStoreTest {

    private ComputerStore store;
    private ComputerStoreController controller;
    private Laptop laptop;
    private Desktop desktop;

    @BeforeEach
    public void setUp() {
        store = new ComputerStore("Asturecno", "John Doe", "123456789");
        controller = new ComputerStoreController(store);
        laptop = new Laptop("Lenovo", 16, "Intel Core i7", "Windows 11", 1200, 15.6);
        desktop = new Desktop("HP", 8, "Intel Core i5", "Windows 10", 800, "ATX");

    }

    @Test
    @DisplayName("Validamos poder agregar una lapto a la tienda")
    void test_Add_Laptop() {

        controller.addComputer(laptop);
        System.out.println("🔍 Cantidad de laptops en la tienda: " + store.getComputerCount());
        System.out.println("🔍 Lista de laptops en la tienda: " + store.listComputers());
        assertThat(store.getComputerCount(), is(1));
        assertThat(store.listComputers().get(0), instanceOf(Laptop.class));
    }

    @Test
    @DisplayName("Validamos poder agregar un Desktop a la tienda")
    void test_Add_Desktop() {
        controller.addComputer(desktop);
        assertThat(store.getComputerCount(), is(1));
        assertThat(store.listComputers().get(0), instanceOf(Desktop.class));

    }

    @Test
    @DisplayName("Validamos poder agregar una laptop y un desktop a la tienda")
    void test_Add_Laptop_And_Desktop() {
        controller.addComputer(laptop);
        controller.addComputer(desktop);
        assertThat(store.getComputerCount(), is(2));
        assertThat(store.listComputers().get(0), instanceOf(Laptop.class));
        assertThat(store.listComputers().get(1), instanceOf(Desktop.class));
    }

    @Test
    @DisplayName("Validamos poder eliminar una Laptop  de la tienda por la marca")
    void test_Remove_Computer() {
        controller.addComputer(laptop);
        controller.removeComputer("Lenovo");
        assertThat(store.getComputerCount(), is(0));
    }

    @Test
    @DisplayName("Validamos poder eliminar un Desktop de la tienda por la marca")
    void test_Remove_Desktop() {
        controller.addComputer(desktop);
        controller.removeComputer("HP");
        assertThat(store.getComputerCount(), is(0));
    }

    @Test
    @DisplayName("Validamos poder eliminar una laptop y un desktop de la tienda")
    void test_Remove_Laptop_And_Desktop() {
        controller.addComputer(laptop);
        controller.addComputer(desktop);
        controller.removeComputer("Lenovo");
        controller.removeComputer("HP");
        assertThat(store.getComputerCount(), is(0));
    }
    @Test
    @DisplayName("Eliminar múltiples computadores con la misma marca")
    void test_Remove_MultipleComputers_WithSame_Brand() {
        controller.addComputer(new Laptop("Dell", 16, "Intel i7", "Windows 10", 1200.0, 2.5));
        controller.addComputer(new Desktop("Dell", 8, "AMD Ryzen 5", "Windows 11", 900.0, "Tower"));
        assertThat(controller.removeComputer("Dell"), is(true));
        assertThat(store.getComputerCount(), is(1));
    }

    @Test
    @DisplayName("validamos porder eliminar un computador que noe xiste en la tienda")
    void test_Remove_Computer_Not_Exist() {
        controller.addComputer(laptop);
        controller.searchComputer("Apple"); // just call the method, don't assign the result
        controller.removeComputer("Acer");
        assertThat(store.getComputerCount(), is(1));
    }

    @Test
    @DisplayName("Validamos poder buscar una laptop por la marca")
    void test_Search_Laptop_By_Brand() {
        controller.addComputer(laptop);
        assertThat(controller.searchComputer("Lenovo"), instanceOf(Laptop.class));
    }

    @Test
    @DisplayName("Validamos poder buscar un Desktop por la marca")
    void test_Search_Desktop_By_Brand() {
        controller.addComputer(desktop);
        assertThat(controller.searchComputer("HP"), instanceOf(Desktop.class));
    }

    @Test
    @DisplayName("Validamos poder buscar una laptop y un desktop por la marca")
    void test_Search_Laptop_And_Desktop_By_Brand() {
        controller.addComputer(laptop);
        controller.addComputer(desktop);
        assertThat(controller.searchComputer("Lenovo"), instanceOf(Laptop.class));
        assertThat(controller.searchComputer("HP"), instanceOf(Desktop.class));
    }

    @Test
    @DisplayName("Validamos poder buscar un computador que no existe en la tienda")
    void test_Search_Computer_Not_Exist() {
        controller.addComputer(laptop);
        assertThat(controller.searchComputer("Apple"), is(nullValue()));
    }

    @Test
    @DisplayName("Validamos poder listar todos los computadores de la tienda")
    void test_List_Computers() {
        controller.addComputer(laptop);
        controller.addComputer(desktop);
        assertThat(store.listComputers().size(), is(2));
    }

    @Test
@DisplayName("Listar computadores después de eliminar uno")
void test_ListComputers_AfterRemoval() {
    controller.addComputer(new Laptop("Dell", 16, "Intel i7", "Windows 10", 1200.0, 2.5));
    controller.addComputer(new Desktop("HP", 8, "AMD Ryzen 5", "Windows 11", 900.0, "Tower"));
    controller.removeComputer("Dell");
    List<Computer> computers = controller.listComputers();
    assertThat(computers, hasSize(1));
    assertThat(computers.get(0).getBrand(), is("HP"));
}
@Test
@DisplayName("Verificar la salida del método toString() de ComputerStore")
void testToString() {
    String result = store.toString();
    assertThat(result, containsString("Asturecno"));
    assertThat(result, containsString("John Doe"));
    assertThat(result, containsString("123456789"));
}
}

