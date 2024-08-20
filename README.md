# Arquitectura de microservicios con Springboot 3

En este repositorio vamos a encontrar el paso a paso el uso de microservicios utilizando Springboot 3 y Docker.

# ¿Qué necesitamos?

Para este paso a paso debemos contar con Maven instalado en nuestro sistema y Docker.

## 1. Clonar el repositorio

Para comenzar, debemos clonar este repositorio con el siguiente comando:

    git clone https://github.com/oscar0617/ARSW---Microservicios-con-Spring-Boot-3 

## 2. Compilar cada directorio

Una vez el repositorio sea clonado, debemos compilar cada uno de los directorios que contiene a nuestros microservicios, en este ejercicio son:

 - hello
 - date
 - day

Esto, con el comando de Maven:

    mvn clean install

## 3. Realizar el Docker Build
Ahora vamos a construir las imagenes de Docker para poder inicializar cada microservicio en un contenedor distinto.
Vamos a ejecutar el siguiente comando en consola, en cada directorio por separado:

    docker build -t helloworld .
   

## 4. Iniciar los contenedores

Vamos a iniciar nuestros 3 microservicios en diferentes contenedores, esto para comprender como son consumidos por una aplicación principal.
Se ejecuta el siguiente comando en consola:

    docker run -d -p 808X:8080 -t helloworld

Vamos a reemplazar la X por cualquier numero, exceptuando el 0, debido a que nuestra aplicación principal va a ser ejecutada por medio del puerto 8080.
## 5. Comprobar los microservicios

Para esto vamos a ingresar a nuestro localhost, utilizando los puertos que hallamos seleccionado.

## 6. Ejecutamos nuestra aplicación principal

En este paso debemos asegurarnos que en nuestro método que va a utilizar los microservicios, la ruta en nuestro código debe ser exacta, esto para evitar alguna excepción a la hora de ejecutar.
![image](https://github.com/user-attachments/assets/190f76f4-aec0-4700-8ab9-99b8717da6df)
En la imagen podemos observar que las rutas van con el puerto seleccionado para cada microservicio.
Para ejecutar nuestra aplicación, debemos construir la imagen de Docker

    docker build -t helloworld .
Y lanzar nuestra aplicación con Maven o Docker. Para el ejemplo, vamos a hacerlo con Maven:

    mvn spring-boot:run
   
## 7. Ingresar a la aplicación principal
Por último, para comprobar el funcionamiento, ingresamos al localhost nuevamente, utilizando el puerto que hallamos seleccionado con la ruta de nuestro programa.

## Conclusión
Gracias a esta pequeña aplicación podemos darnos cuenta de como los microservicios pueden ser usados en ambientes externos a nuestra aplicación, lo cual permite dividir nuestra aplicación principal en diferentes microservicios que son consumidos de manera independiente.
