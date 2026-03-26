# Actividad: Comunicación entre Redes🌐

### 🧩 1. Conceptos base

|Concepto|Definición simple|Nivel técnico (breve)|Ejemplo real|
|-|-|-|-|
|TCP|Forma segura de enviar datos|Protocolo orientado a conexión, garantiza entrega y orden|Cargar una página web sin errores|
|UDP|Forma rápida de enviar datos|Protocolo sin conexión, no garantiza entrega|Streaming o juegos online en tiempo real|
|Puerto|“Puerta” de entrada/salida en un servidor|Número que identifica un servicio en una IP|Puerto 80 (web), 443 (HTTPS)|
|HTTP|Lenguaje de comunicación web|Protocolo de aplicación que usa TCP para transferir datos|Cuando navegas en una página web|

---

### ⚙️ 2. TCP vs UDP

* **Diferencia principal:**
TCP asegura la entrega de datos (conexión y control), UDP envía datos sin verificar.
* **Más confiable:**
TCP, porque confirma que los datos llegan completos y en orden.
* **Más rápido:**
UDP, porque no espera confirmaciones ni control de errores.

|Protocolo|Característica clave|Uso típico|
|-|-|-|
|TCP|Asegura que los datos lleguen completos y en orden|Navegar en sitios web, envío de correos|
|UDP|Envía datos rápidamente sin verificar si llegan|Streaming de video, juegos online|

---

### 🚪 3. Puertos

* **¿Qué es un puerto en una red?**
Es un número que actúa como “canal” para que los datos entren o salgan de una aplicación en un dispositivo.
* **¿Por qué una aplicación necesita un puerto?**
Para diferenciarse de otras apps y poder recibir tráfico específico dentro de una misma IP.
* **¿Qué significan estos puertos?**

  * **80:** HTTP (web sin cifrado)
  * **443:** HTTPS (web segura con cifrado)
  * **3000:** Uso común en desarrollo (apps locales, Node.js)
  * **5432:** Base de datos PostgreSQL
* 👉 **Ejemplo developer: ¿Qué pasa cuando ejecutas `npm run dev`?**
Se levanta un servidor local (ej: http://localhost:3000) que escucha en un puerto y permite acceder a tu app desde el navegador.

---

### 🌐 4. HTTP (HyperText Transfer Protocol)

* **¿Qué es HTTP?**
Es un protocolo que permite la comunicación entre el navegador (cliente) y un servidor web.
* **¿Cómo funciona una petición HTTP?**
El cliente envía una solicitud (request) y el servidor responde (response) con datos o resultados.
* **¿Qué significan:**

  * **GET:** Obtener información
  * **POST:** Enviar/crear datos
  * **PUT:** Actualizar datos existentes
  * **DELETE:** Eliminar datos
* 👉 **Flujo:**
Frontend → Request → Backend → Response → Frontend  
(El usuario interactúa → se envía petición → el servidor procesa → devuelve respuesta → se muestra en pantalla)

---

### 💻 5. Conexión directa con desarrollo

* **¿Qué pasa cuando haces: `fetch("http://localhost:3000/api")`?**
El frontend envía una petición HTTP al backend local para obtener o enviar datos.
* **¿Qué protocolo se usa?**
HTTP
* **¿Qué puerto?**
3000
* **¿Qué tipo de comunicación?**
Cliente → Servidor (request/response)

---

### 🚨 6. Problemas reales (debugging)

* **¿Qué significa:**

  * **Port already in use:** El puerto ya está ocupado por otra aplicación
  * **Connection refused:** El servidor no está corriendo o no acepta conexiones
  * **Timeout:** El servidor no respondió a tiempo
* **¿Qué revisarías como developer?**

  * Si el servidor está levantado (`npm run dev`)
  * Qué puertos están en uso
  * URL/puerto correcto (ej: localhost:3000)
  * Firewall o configuración de red

---

### 🌍 7. Caso práctico real: “Tu frontend no se conecta al backend”

* **¿Puede ser problema de puerto?**
Podría ser, si el frontend apunta a un puerto incorrecto o el backend no está escuchando en ese puerto.
* **¿Puede ser problema de protocolo?**
Si, por ejemplo usar HTTP vs HTTPS incorrectamente puede bloquear la conexión.
* **¿Puede ser problema de red?**
Sí, puede haber firewall, CORS, DNS o configuración de red impidiendo la comunicación.

---

### 🧪 8. Analogía

Imagina Internet como una ciudad con envíos de mensajes 📦:

* **TCP** → Como un correo certificado  
Asegura que el paquete llegue completo y en orden
* **UDP** → Como tirar volantes desde un avión  
Llega rápido, pero sin garantía de entrega
* **Puerto** → Como el número de departamento  
Indica a qué aplicación dentro del servidor va el mensaje
* **HTTP** → Como el idioma de la carta  
Define cómo se comunican cliente y servidor

👉 **Resumen:**
TCP/UDP = cómo se envía  
Puerto = a dónde llega  
HTTP = cómo se entiende

---

### 🧠 BONUS 

* **¿Qué es HTTPS?**
Es HTTP seguro: cifra la comunicación para proteger los datos (SSL/TLS).
* **¿Qué es REST?**
Es un estilo de arquitectura para APIs que usa HTTP y operaciones como GET, POST, PUT, DELETE.
* **¿Qué es un endpoint?**
Es una URL específica del backend donde puedes hacer una petición (ej: /api/users).


