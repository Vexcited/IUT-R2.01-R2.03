# TP Canard

## Développement

```bash
# Pour générer le dossier `target`.
mvn compile

# Exécuter une classe `main` avec Maven.
# Voir <https://stackoverflow.com/a/1089338>
mvn exec:java -Dexec.mainClass="canard.application.Simulateur"
mvn exec:java -Dexec.mainClass="canard.application.Client"

# Exécuter les tests avec Maven.
mvn test
```
