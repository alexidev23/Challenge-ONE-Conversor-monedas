# Challenge Conversor de Monedas -- Java ☕💱

Challenge como parte del programa **ONE -- Oracle Next
Education -- Alura Latam**.

Este conversor permite transformar montos entre distintas monedas
utilizando "Exchange Rate API".

## 🚀 Funcionalidades

-   Conversión entre monedas como USD, ARS, BRL, COP.
-   Consumo de una API real de tipo de cambio.
-   Lectura y parseo de datos JSON con **Gson**.
-   Menú interactivo con distintas opciones de conversión.
-   Manejo de errores básicos ante respuestas inválidas de la API.
-   Formateo de resultados (dos decimales).

## 🛠 Tecnologías utilizadas

-   **Java 25**
-   **Gson** (parseo de JSON)
-   **HttpClient** para requests HTTP

## 📂 Estructura del proyecto

    src/
     ├── Principal.java        // Lógica principal, menú, flujo del programa
     ├── Conversor.java        // Consumo de API y conversión
     └── MonedasConversor.java // Record para mapear la respuesta JSON

## 📘 Cómo ejecutar el proyecto

1.  Clonar el repositorio:

    ``` bash
    git clone https://github.com/tuusuario/conversor-monedas-java.git
    ```

2.  Abrir el proyecto en tu IDE preferido.

3.  Verificar que esté configurado **Java 25**.

4.  Ejecutar la clase `Principal`.

## 📑 Actividades del Challenge

-   Configuración del ambiente Java.
-   Creación del proyecto.
-   Consumo de una API de tasas de cambio.
-   Parseo y análisis del JSON con Gson.
-   Implementación de un menú funcional.
-   Filtrado y exhibición de monedas.
-   Manejo básico de errores.

## ✔ Conclusión

Este proyecto fortalece habilidades clave: - Consumo de APIs - JSON
parsing - Diseño de lógica - Buenas prácticas
