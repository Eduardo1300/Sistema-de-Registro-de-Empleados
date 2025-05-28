# Sistema de Registro de Empleados con Spring Boot y Angular

Esta aplicación web permite gestionar el **registro y administración de empleados**, así como **registrar asistencias** de manera eficiente.  
Ha sido desarrollada utilizando **Spring Boot (STS)** para el backend y **Angular** para el frontend, integrando tecnologías modernas y buenas prácticas de desarrollo web.

---

## 🧩 Funcionalidades principales

- ✅ **Gestión completa de empleados:** Crear, visualizar, editar y eliminar información del personal.
- 🔒 **Control de roles y seguridad:** El sistema cuenta con autenticación y autorización para acceso restringido según el rol del usuario.
- 📅 **Registro de asistencias:** Solo los usuarios autenticados pueden registrar las asistencias del personal.
- 🔍 **Barra de búsqueda:** Permite filtrar empleados por nombre para facilitar la navegación.
- 💻 **Interfaz dinámica y moderna:** Desarrollada con Angular, proporciona una experiencia fluida y responsiva.
- 🛡️ **Manejo de sesiones y rutas protegidas:** Implementación con Spring Security para proteger accesos no autorizados.
- 🧠 **Modificación en tiempo real:** Los cambios se reflejan de inmediato, mejorando la eficiencia del sistema.
- 🗄️ **Base de datos relacional:** Utiliza MySQL para almacenar los datos de forma segura y estructurada.

---

## ⚙️ Requisitos y ejecución

### 1. Base de datos (MySQL)

- Asegúrate de que el servidor de MySQL esté corriendo.
- Crea una base de datos con el nombre que esté especificado en `application.properties` del backend.
- Si tu usuario o contraseña de MySQL es diferente, actualiza el archivo:


---

### 2. Backend - Spring Boot (STS)

```bash
# Abre el proyecto 'backend' en Spring Tool Suite
# Ejecuta la aplicación desde la clase principal

### 3. Fronted Angular
# Abre la carpeta 'frontend' en Visual Studio Code
npm install
npm run start
```
Navega a:

http://localhost:4200/pages/empleados


4. Acceso al sistema

    Usuario: rrhh

    Contraseña: rrhh

    El login es requerido únicamente para acceder a la sección de registro de asistencias.


🖼️ Capturas de pantalla

    (Agrega aquí tus capturas en formato Markdown cuando las tengas cargadas en la carpeta assets/)

![Vista del proyecto - Lista de empleados](../src/assets/vista_empleados.png)
![Vista del proyecto - nuevo empleado](./src/assets/nuevo_empleados.png)
![Vista del proyecto - editar empleado](./src/assets/editar_empleados.png)
![Vista del proyecto - lista empleado actualizada](./src/assets/vista_empleados_actualizada.png)
![Vista del proyecto - logeo lista asistencia](./src/assets/logeo_lista_asistencia.png)
![Vista del proyecto - lista asistencia](./src/assets/lista_asistencia.png)
![Vista del proyecto - registrar asistencia](./src/assets/registrar_asistencia.png)
![Vista del proyecto - vista asistencia actualizada](./src/assets/vista_asistencia.png)


📝 Estructura del proyecto

proyecto-spring/
├── backend/                  # Proyecto Spring Boot (registro de empleados)
├── frontend/                 # Proyecto Angular
├── README.md                 # Este archivo
└── .gitignore                # Ignorar archivos innecesarios


💬 Contacto

¡Gracias por revisar este proyecto!
Para dudas, sugerencias o mejoras, no dudes en contactarme vía GitHub.
