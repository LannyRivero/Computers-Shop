package dev.lanny.computer_store.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;
class ComputerTest {
    private Computer computer;

    @BeforeEach
    void setUp() {
        computer = new Laptop("Generic", 16, "Intel i5", "Windows 10", 800.0, 2.0);
    }

    @Test
    @DisplayName("validamos los  atributos de la clase Computer")
    void testComputerAttributes() {
        assertThat(computer.getBrand(), is("Generic"));
        assertThat(computer.memory, is(16));
        assertThat(computer.processor, is("Intel i5"));
        assertThat(computer.operatingSystem, is("Windows 10"));
        assertThat(computer.price, is(800.0));
    }

    @Test
    @DisplayName("Verificar el uso de polimorfismo en Computer")
    void testPolymorphism() {
        assertThat(computer, instanceOf(Computer.class));
    }
}

