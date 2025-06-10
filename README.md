# demo-web-automation-framework
Demo Web Automation Framework:

Este proyecto es un ejemplo básico de automatización de pruebas web usando Java, Selenium WebDriver y Maven.

### Requisitos:
- IntelliJ IDEA (u otro IDE compatible con Java)
- Java 11 o superior (Desde IntelliJ puedes configurarlo si no lo tienes instalado)
- Maven (ya viene integrado en IntelliJ)
- Google Chrome/Firefox (para ejecutar las pruebas)


### Contenido del proyecto:
```
demo-web-automation-framework/
├── pom.xml                  → Archivo de configuración Maven (dependencias)
└── src/
    ├── main/
    │   └── java/pages/      → Clases Page Object (estructuran las páginas web)
    └── test/
        └── java/tests/      → Clases de prueba (ejecutan los tests)
```


### ¿Cómo ejecutar la prueba?
1. Clona el proyecto:
```
git clone https://github.com/Gamegart/demo-web-automation-framework.git
cd demo-web-automation-framework
```
2. Abre el proyecto en IntelliJ IDEA.
3. Espera a que Maven descargue las dependencias automáticamente o actualiza manualmente.
4. Ve a la carpeta src/test/java/tests y abre la clase LoginTest.java.
5. Haz clic en el botón verde de Run (▶️) o clic derecho > Run LoginTest.


### ¿Qué hace el test?
- Abre el navegador Chrome.
- Navega a una página del formulario.
- Llena los campos requeridos.
- Hace clic en el botón de Submit.
- Cierra el navegador.
