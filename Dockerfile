# Utilisez une image de base avec Maven, OpenJDK 17 et une distrib Linux
FROM maven:3.8.3-openjdk-17 as build

# Créez un répertoire de travail
WORKDIR /app

# Copiez le fichier pom.xml
COPY pom.xml .

# Téléchargez les dépendances du projet
RUN mvn dependency:go-offline -B

# Copiez les fichiers sources
COPY src src

# Construisez le projet avec Maven
RUN mvn clean package -DskipTests

# Utilisez une image de base avec OpenJDK 17 et Linux pour l'exécution
FROM openjdk:17 as runtime

# Copiez le fichier JAR de l'étape de construction
COPY --from=build /app/target/service-user-0.0.1-SNAPSHOT.jar app.jar

# Définissez les variables d'environnement pour l'application
ENV SPRING_PROFILES_ACTIVE=prod

# Exposez le port de l'application
EXPOSE 8083

COPY wait-for-it.sh /wait-for-it.sh

RUN chmod +x /wait-for-it.sh
