# Imagen base con JDK 17
FROM openjdk:17-jdk-slim
# Directorio de trabajo dentro del contenedor
WORKDIR /app
# Copia el archivo jar compilado
COPY target/springdockerexample-0.0.1-SNAPSHOT.jar app.jar
# Expone el puerto 8080
EXPOSE 8080
# Comando para ejecutar la aplicación
ENTRYPOINT ["java", "-jar", "app.jar"]