# Etapa 1 ejecución de pruebas
FROM maven:3.9.9-eclipse-temurin-17 AS build
WORKDIR /app

# Copiar todo el proyecto al container
COPY . .

# Ejecutar pruebas y compilar el ",jar"
# Si alguna prueba falla Docker detiene la build
RUN mvn clean package

# Etapa 2: Imagen final ligera solo con el ".jar"
FROM eclipse-temurin:17
WORKDIR /app

# Copiar el ".jar" generado desde la etapa de build
COPY --from=build /app/target/*.jar app.jar

# Comando para ejecutar la aplicación
CMD ["java", "-jar", "app.jar"]
