package dev.lanny.computer_store.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

class DesktopTest {
    private Desktop desktop;

    @BeforeEach
    void setUp() {
        desktop = new Desktop("HP", 8, "AMD Ryzen 5", "Windows 11", 900.0, "Tower");
    }

    @Test
    @DisplayName("Verificar atributos del Desktop")
    void test_Desktop_Attributes() {
        assertThat(desktop.getBrand(), is("HP"));
        assertThat(desktop.memory, is(8));
        assertThat(desktop.processor, is("AMD Ryzen 5"));
        assertThat(desktop.operatingSystem, is("Windows 11"));
        assertThat(desktop.price, is(900.0));
        assertThat(desktop.getCaseType(), is("Tower"));
    }

    @Test
    @DisplayName("Verificar método displayDetails() en Desktop")
    void test_DisplayDetails() {
        String details = desktop.toString();
        assertThat(details, containsString("HP"));
        assertThat(details, containsString("8GB"));
        assertThat(details, containsString("AMD Ryzen 5"));
        assertThat(details, containsString("Windows 11"));
        assertThat(details, containsString("900.0"));
        assertThat(details, containsString("Tower"));
    }

    @Test
    @DisplayName("Verificar creación de múltiples instancias de Desktop")
    void test_DesktopMultipleInstances() {
        Desktop anotherDesktop = new Desktop("Dell", 16, "Intel i9", "Windows 10", 1500.0, "Mini");
        assertThat(anotherDesktop.getBrand(), is("Dell"));
        assertThat(anotherDesktop.memory, is(16));
        assertThat(anotherDesktop.processor, is("Intel i9"));
        assertThat(anotherDesktop.operatingSystem, is("Windows 10"));
        assertThat(anotherDesktop.price, is(1500.0));
        assertThat(anotherDesktop.getCaseType(), is("Mini"));
    }

    @Test
    @DisplayName("Verificar valores extremos en Desktop")
    void testExtremeValues() {
        Desktop extremeDesktop = new Desktop("TestBrand", 0, "Unknown", "None", -1.0, "Ultra Mini");
        assertThat(extremeDesktop.memory, is(0));
        assertThat(extremeDesktop.price, is(-1.0));
        assertThat(extremeDesktop.getCaseType(), is("Ultra Mini"));
    }
}