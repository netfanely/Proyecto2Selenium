# 🧪 Proyecto de Automatización UI - Login con Selenium, Cucumber y Java

Este proyecto realiza pruebas automatizadas de la funcionalidad de **login** en la web demo:  
🔗 [https://the-internet.herokuapp.com/login](https://the-internet.herokuapp.com/login)

## 🚀 Tecnologías utilizadas

- ✅ Java 11+
- ✅ Selenium WebDriver
- ✅ Cucumber (BDD)
- ✅ JUnit
- ✅ Maven
- ✅ Firefox + GeckoDriver
- ✅ Page Object Model (POM)
- ✅ Patrón MVC (Modelo - Vista - Controlador)

## 🧱 Estructura del proyecto

"""
src/test/java/
├── features/ # Archivos .feature con los escenarios de Cucumber
├── stepdefinitions/ # Definición de pasos de Cucumber
├── runners/ # Runner con configuración de Cucumber
├── pages/ # Page Objects (POM)
├── utils/ # Utilitarios (esperas, config, hooks, etc.)
"""

## 📂 Ejecución del proyecto

### Prerequisitos:

- Instalar Java (JDK 11+)
- Instalar Maven
- Instalar Firefox
- Configurar correctamente el `geckodriver` en tu PATH

### Ejecutar pruebas:

Desde consola:

```bash
mvn test
✅ Escenarios implementados

    Login exitoso

    Login con credenciales inválidas

    Validación de mensaje de error

📊 Reportes

Los reportes se generan automáticamente al ejecutar los tests y pueden ser configurados para usar:

    HTML Reports

    ExtentReports (opcional)

    Cucumber HTML Plugin

💡 Mejora futura

Se puede extender para automatizar:

    Drag and Drop

    Dropdowns

    Alerts

    Checkboxes

    Form Authentication

🧑‍💻 Autor

Proyecto creado por @netfanely como parte de su portafolio QA Automation Engineer.
