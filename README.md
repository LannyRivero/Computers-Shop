# 🖥️ Computer Store Project

## 📌 Descripción
Este es un sistema de gestión para una tienda de computadores, desarrollado en **Java** siguiendo la arquitectura **MVC** y aplicando **TDD (Test-Driven Development)** con **JUnit**.

El sistema permite:
- 📌 Agregar nuevos computadores a la tienda.
- 🗑️ Eliminar un computador dado su marca.
- 🔍 Buscar un computador en la tienda por marca.
- 📋 Listar todos los computadores disponibles.

## 🚀 Tecnologías utilizadas
- **Java** (Programación Orientada a Objetos, Abstracción y Herencia)
- **JUnit** (Pruebas unitarias con mínimo 70% de cobertura)
- **Maven / Gradle** (Gestión de dependencias)
- **Diagrams.net** (Modelado UML)

## 📂 Estructura del Proyecto
```
ComputerStoreProject/
│── src/
│   ├── main/
│   │   ├── java/
│   │   │   ├── models/
│   │   │   │   ├── Computer.java
│   │   │   │   ├── Laptop.java
│   │   │   │   ├── Desktop.java
│   │   │   │   ├── ComputerStore.java
│   │   │   ├── controllers/
│   │   │   │   ├── ComputerStoreController.java
│   │   │   ├── views/
│   │   │   │   ├── ComputerStoreView.java
│   ├── test/
│   │   ├── java/
│   │   │   ├── tests/
│   │   │   │   ├── ComputerStoreTest.java
│── diagrams/
│   ├── computer_store_uml.drawio
│── .gitignore
│── pom.xml / build.gradle
│── README.md
```

## 🛠️ Instalación y Ejecución
1️⃣ **Clonar el repositorio**
```bash
 git clone https://github.com/usuario/computer-store.git
 cd computer-store
```

2️⃣ **Compilar el proyecto (si usas Maven)**
```bash
mvn clean install
```

3️⃣ **Ejecutar las pruebas unitarias**
```bash
mvn test
```

4️⃣ **Ejecutar el programa (si es una aplicación CLI)**
```bash
java -jar target/computer-store.jar
```

## 📊 UML - Diagrama de Clases
El siguiente diagrama representa la estructura del proyecto:

![UML Diagram](diagrams/computer_store_uml.png)

## ✅ Pruebas Unitarias
El código ha sido probado con **JUnit**, garantizando una cobertura de pruebas de al menos **70%**. Aquí se muestra una captura de pantalla con la cobertura de pruebas en **VSCode**:

![Test Coverage](screenshots/test_coverage.png)

## 🤝 Contribuciones
¡Las contribuciones son bienvenidas! Puedes:
- Reportar problemas en la sección **Issues** 🐛
- Enviar mejoras a través de un **Pull Request** 🚀

## 📄 Licencia
Este proyecto está bajo la licencia **MIT**.

---
💻 _Desarrollado por Lanny_ 🚀


