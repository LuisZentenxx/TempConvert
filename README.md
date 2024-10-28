# TempConverter - App Básica para Principiantes 🌡️

¡Bienvenido/a a la app **TempConverter** ! Esta es una aplicación sencilla para aprender a convertir entre diferentes unidades de temperatura `Celsius`, `Fahrenheit`, `Kelvin`, `Rankine` y `Réaumur` mientras practicas conceptos básicos de desarrollo en Kotlin y Android.

## Descripción General 💡
Esta app permite a los usuarios ingresar una temperatura en una unidad y convertirla a otra unidad con solo un toque. Es perfecta para principiantes que buscan mejorar sus habilidades en Android al aprender sobre layouts, eventos, y manejo de cadenas de texto.

## Características Principales ✅
- **Conversión entre unidades**: Convierte entre `Celsius`, `Fahrenheit`, `Kelvin`, `Rankine` y `Réaumur`. ❄️
- **Interfaz básica**: Usa una disposición de botones y campos de entrada para obtener datos del usuario y mostrar resultados.
- **Interacción con eventos**: Implementa `Listeners` que responden a la acción del usuario, como al presionar el botón de "Convertir".
- **Gestión de strings**: Convierte y maneja cadenas de texto ingresadas para mostrarlas de manera clara.

## Conceptos Clave 📚
Esta aplicación cubre conceptos fundamentales en el desarrollo de aplicaciones Android con Kotlin:

- **Layouts**: Estructuras básicas de diseño en Android que permiten organizar los elementos visuales de la aplicación.
- **Eventos (Listeners)**: Permiten que la app reaccione a la interacción del usuario, como hacer clic en un botón para convertir la temperatura.
- **Manipulación de Strings**: Cómo manejar cadenas de texto en Kotlin para mostrarlas en el formato adecuado.
- **Conversión de Tipos**: Convertir los valores ingresados (en texto) a números para realizar cálculos.
- **Funciones Lambda y Funciones de Orden Superior**: Una función lambda es una expresión que define una función sin necesidad de darle un nombre.
- Se utiliza principalmente para crear funciones de manera concisa y para pasar funciones como argumentos a otras funciones.

## Fórmulas
### De Fahrenheit (F) a otras escalas:
- **Fahrenheit a Celsius (°C):**
  ```plaintext
  °C = (°F - 32) * 5/9
  ```
- **Fahrenheit a Rankine (°R):**
  ```plaintext
  °R = °F + 459.67
  ```
- **Fahrenheit a Kelvin (K):**
  ```plaintext
  K = (°F - 32) * 5/9 + 273.15
  ```
- **Fahrenheit a Réaumur (°RE):**
  ```plaintext
  °RE = (°F - 32) * 4/9

### De Celsius (C) a otras escalas:
- **Celsius a Fahrenheit (°F):**
  ```plaintext
  °F = °C * 9/5 + 32
  ```
- **Celsius a Rankine (°R):**
  ```plaintext
  °R = (°C + 273.15) * 9/5
  ```
- **Celsius a Kelvin (K):**
  ```plaintext
  K = °C + 273.15
  ```
- **Celsius a Réaumur (°RE):**
  ```plaintext
  °RE = °C * 4/5

### De Rankine (°R) a otras escalas:

- **Rankine a Fahrenheit (°F):**
  ```plaintext
  °F = °R - 459.67
  ```
- **Rankine a Celsius (°C):**
  ```plaintext
  °C = (°R - 491.67) * 5/9
  ```
- **Rankine a Kelvin (K):**
  ```plaintext
  K = °R * 5/9
  ```
- **Rankine a Réaumur (°RE):**
  ```plaintext
  °RE = (°R - 491.67) * 4/9
  ```

### De Kelvib (K) a otras escalas:

- **Kelvin a Fahrenheit (°F):**
  ```plaintext
  °F = (K - 273.15) * 9/5 + 32
  ```
- **Kelvin a Celsius (°C):**
  ```plaintext
  °C = K - 273.15
  ```
- **Kelvin a Rankine (°R):**
  ```plaintext
  °R = K * 9/5
  ```
- **Kelvin a Réaumur (°RE):**
  ```plaintext
  °RE = (K - 273.15) * 4/5
  ```

### De Réaumur (°RE) a otras escalas:

- **Réaumur a Fahrenheit (°F):**
  ```plaintext
  °F = °RE * 9/4 + 32
  ```
- **Réaumur a Celsius (°C):**
  ```plaintext
  °C = °RE * 5/4
  ```
- **Réaumur a Rankine (°R):**
  ```plaintext
  °R = (°RE * 9/4) + 491.67
  ```
- **Réaumur a Kelvin (K):**
  ```plaintext
  K = °RE * 5/4 + 273.15
  ```
## Instalación y Ejecución 💻

1. **Clonar el repositorio**:
   ```bash
   git clone https://github.com/LuisZentenxx/TempConvert.git
   ```
