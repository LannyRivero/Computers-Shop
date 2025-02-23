package dev.lanny.computer_store.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class LaptopTest {
    private Laptop laptop;

    @BeforeEach
    void setUp() {
        laptop = new Laptop("Dell", 16, "Intel i7", "Windows 10", 1200.0, 2.5);
    }

    @Test
    @DisplayName("Verificar atributos de la Laptop")
    void testLaptop_Attributes() {
        assertThat(laptop.getBrand(), is("Dell"));
        assertThat(laptop.memory, is(16));
        assertThat(laptop.processor, is("Intel i7"));
        assertThat(laptop.operatingSystem, is("Windows 10"));
        assertThat(laptop.price, is(1200.0));
        assertThat(laptop.getWeight(), is(2.5));
    }

    

    @Test
    @DisplayName("Verificar método toString() en Laptop")
    void test_ToString() {
        String result = laptop.toString();
        assertThat(result, containsString("Dell"));
        assertThat(result, containsString("16GB"));
        assertThat(result, containsString("Intel i7"));
        assertThat(result, containsString("Windows 10"));
        assertThat(result, containsString("1200.0"));
    }

    @Test
    @DisplayName("Verificar método getWeight() en Laptop")
    void test_GetWeight() {
        assertThat(laptop.getWeight(), is(2.5));
    }
    
    @Test
    @DisplayName("Verificar método displayDetails() en Laptop")
    void test_DisplayDetails() {
        laptop.displayDetails();
    }   
}

