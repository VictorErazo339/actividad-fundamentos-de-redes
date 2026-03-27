# Actividad: Arquitectura de Red 🌍



### 🧩 1. Conceptos base

|Concepto|Definición simple|Nivel técnico breve|Ejemplo real|
|-|-|-|-|
|Modelo OSI|Modelo que explica la forma de cómo viajan los datos|Divide la comunicación en 7 capas (red, app, etc.)|Cuando navegas, cada capa maneja parte del envío|
|Subred (Subnet)|División de una red en partes más pequeñas|Usa máscaras IP para separar redes|Empresa separa red de empleados y de invitados|
|DNS|Traduce nombres a direcciones IP|Convierte dominios en IP para ubicar servidores|Escribes google.com y te lleva a su IP real|

---

### 🧱 2. Modelo OSI

#### ¿Qué es el modelo OSI?

Es un modelo que explica cómo se comunican los sistemas en una red, dividiendo el proceso en 7 capas.

#### ¿Para qué sirve?

Sirve para entender, diseñar y solucionar problemas en redes, separando cada función de comunicación.

|Capa|Nombre|¿Qué hace? (simple)|
|-|-|-|
|1|Física|Transmite bits por cables, señales o hardware|
|2|Enlace|Envía datos entre dispositivos en la misma red|
|3|Red|Decide la ruta para enviar datos entre redes|
|4|Transporte|Asegura que los datos lleguen completos y ordenados|
|5|Sesión|Inicia, mantiene y cierra la comunicación entre aplicaciones|
|6|Presentación|Traduce, cifra o formatea los datos|
|7|Aplicación|Interactúa con el usuario (apps, navegador, etc.)|

---

### 🌐 3. DNS

#### ¿Qué es DNS?

Es un sistema que traduce nombres de dominio (como google.com) en direcciones IP que las máquinas entienden.

#### ¿Por qué no usamos IP directamente?

Porque las IP son difíciles de recordar; los nombres de dominio son más fáciles y amigables para las personas.

#### ¿Qué pasa cuando escribes "google.com" en el navegador?

1. Escribes **google.com** en el navegador  
→ El navegador no entiende nombres, necesita una IP.
2. Consulta al **DNS**  
→ Pregunta: “¿Cuál es la IP de google.com?”
3. El DNS responde con una **dirección IP**  
→ Por ejemplo: 142.250.x.x
4. El navegador se conecta al **servidor** usando esa IP  
→ Se envía una solicitud HTTP/HTTPS.
5. El servidor responde con la **página web**  
→ El navegador la renderiza y la ves en pantalla.

---

### 🧩 4. Subnets

#### ¿Qué es una subred?

Es una división de una red grande en redes más pequeñas.

#### ¿Para qué sirve?

Sirve para organizar, mejorar seguridad y optimizar el tráfico de red.

#### ¿Por qué dividir redes?

Para evitar congestión y aislar problemas o accesos.

#### 👉 Ejemplo developer

Red local: separas equipos de oficina y WiFi invitados.  
Cloud: en AWS separas frontend, backend y base de datos en distintas subredes.

---

### 💻 5. Conexión directa con desarrollo

#### ¿Qué pasa cuando tu app falla?

* No encuentra el servidor  
→ Problema con la **IP** (incorrecta o servidor caído)
* No resuelve el dominio  
→ Problema con el **DNS** (no traduce el nombre a IP)
* No puede conectarse  
→ Problema de **red** (firewall, puertos, conexión)

#### Relación rápida

* DNS → Traduce nombre a IP
* IP → Identifica al servidor
* Red → Permite la comunicación entre ambos

---

### 🚨 6. Problemas reales (debugging)

#### ¿Qué significa?

* “DNS not found”  
→ El **DNS** no pudo traducir el dominio a una IP
* “Host unreachable”  
→ No se puede llegar a la **IP** del servidor
* “Network error”  
→ Fallo general de **red** (conexión, firewall, etc.)

#### ¿Qué revisar primero como developer?

1. Dominio correcto y funcionando (DNS)
2. IP / servidor activo (ping o status)
3. Conexión de red (internet, firewall, puertos)

---

### 🌍 7. Caso práctico real: “Tu aplicación está deployada, pero nadie puede acceder”

#### ¿Es problema de DNS?

→ Podría ser si el dominio no resuelve a la IP correcta

#### ¿Es problema de red?

→ Podría ser si el servidor no es accesible (puertos, firewall, caído)

#### ¿Es problema de configuración?

→ Podría ser si la app está mal configurada (puerto, host, SSL, rutas)

---

### 🧪 8. Analogía (Internet como una ciudad)

* **Modelo OSI**  
→ Es como el sistema de correos: cada etapa (empaque, envío, transporte, entrega) cumple una función específica.
* **DNS**  
→ Es la guía telefónica o Google Maps: traduce el nombre de un lugar (google.com) en una dirección exacta.
* **Subnet (Subred)**  
→ Son los barrios de la ciudad: dividen la ciudad en zonas para organizar mejor el tráfico y la seguridad.

---

### 🧠 BONUS (Nivel Bootcamp Pro)

#### ¿Qué es un VPC en cloud?

Es una red virtual privada en la nube donde defines tus propias IPs, subredes y reglas.

#### ¿Qué es una IP privada vs pública?

* Privada → Solo funciona dentro de la red interna
* Pública → Es accesible desde internet

#### ¿Qué es un load balancer?

Es un servicio que distribuye el tráfico entre varios servidores para mejorar rendimiento y disponibilidad.


