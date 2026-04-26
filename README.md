# 🍕 PizzaApp — TP Android Java

Application Android développée en Java dans le cadre d'un TP universitaire.
Elle affiche une liste de pizzas avec accès aux détails de chaque recette.

---

## 📋 Objectifs pédagogiques

- Organiser un projet Android en packages logiques
- Manipuler une `ListView` avec un `Adapter` personnalisé
- Passer des données entre activités via `Intent`
- Implémenter un Splash Screen animé
- Mettre en œuvre un modèle de données orienté objet

---

## 🏗️ Architecture du projet

```
app/src/main/java/com/example/pizzaapp/
├── classes/
│   └── Produit.java          # Modèle de données (id, nom, prix, durée, image, description)
├── dao/
│   └── ProduitDao.java       # Accès aux données (liste des pizzas)
├── service/
│   └── ProduitService.java   # Logique métier
├── adapter/
│   └── ProduitAdapter.java   # Adapter personnalisé pour la ListView
└── ui/
    ├── SplashActivity.java   # Écran de démarrage animé
    ├── MainActivity.java     # Liste des pizzas
    └── DetailActivity.java   # Détail d'une recette
```

---

## 🧱 Technologies utilisées

| Technologie | Rôle |
|-------------|------|
| Java | Langage principal |
| Android SDK | Plateforme cible |
| ListView + Adapter | Affichage de la liste des pizzas |
| Intent + Bundle | Passage de données entre activités |
| Animation XML | Splash Screen |
| AndroidX AppCompat | Compatibilité arrière |

---

## 📐 Fonctionnalités

### 🎬 Splash Screen
- Écran de démarrage avec logo et animation
- Redirection automatique vers la liste après 2 secondes

### 📋 Liste des pizzas (`MainActivity`)
- Affichage de toutes les pizzas via une `ListView`
- Chaque item affiche : image, nom, prix et durée de préparation
- Adapter personnalisé avec `ViewHolder` pour les performances

### 🍕 Détail d'une pizza (`DetailActivity`)
- Affichage complet de la recette sélectionnée
- Informations : nom, prix, durée, image, description complète
- Passage des données depuis `MainActivity` via `Intent`

---

## 🧩 Modèle de données — `Produit.java`

```java
public class Produit {
    private int id;
    private String nom;
    private double prix;
    private int duree;       // en minutes
    private int image;       // référence drawable R.drawable.*
    private String description;

    // Constructeurs, getters, setters...
}
```

---

## 📦 Structure des packages

| Package | Rôle |
|---------|------|
| `classes/` | Modèles de données (POJO) |
| `dao/` | Accès et stockage des données |
| `service/` | Logique métier entre DAO et UI |
| `adapter/` | Liaison données ↔ vues ListView |
| `ui/` | Activités et interface utilisateur |

---

## ⚙️ Installation

### Prérequis
- Android Studio Hedgehog ou plus récent
- JDK 11+
- Android SDK 34
- Appareil Android ou émulateur (API 21+)

### Étapes

**1. Cloner le projet**
```bash
git clone https://github.com/Eti-Hack/PizzaApp.git
```

**2. Ouvrir dans Android Studio**
```
File → Open → sélectionner le dossier PizzaApp
```

**3. Synchroniser Gradle**
```
File → Sync Project with Gradle Files
```

**4. Lancer l'application**
- Connecte ton appareil Android avec le débogage USB activé
- Ou lance un émulateur
- Clique sur ▶️ Run

---

## 🖼️ Aperçu de l'interface

```
┌─────────────────────┐     ┌─────────────────────┐
│   🍕  PizzaApp      │     │   ← Margherita       │
│                     │     │                     │
│ [img] Margherita    │     │   [    image    ]   │
│       8.50€  15min  │ ──► │                     │
│                     │     │  Prix  : 8.50 €     │
│ [img] Reine         │     │  Durée : 15 min     │
│       9.00€  20min  │     │                     │
│                     │     │  Tomate, mozzarella │
│ [img] 4 Fromages    │     │  basilic frais...   │
│       10.50€ 25min  │     │                     │
└─────────────────────┘     └─────────────────────┘
     MainActivity                DetailActivity
```

---

## 🔄 Flux de navigation

```
SplashActivity
      ↓ (2 secondes)
MainActivity  ──(clic sur une pizza)──►  DetailActivity
  ListView                                 Détail complet
```

---

## 👨‍💻 Auteur

**Etienne DANSOU**
- GitHub : [@Eti-Hack](https://github.com/Eti-Hack)

---

## 📄 Licence

Ce projet est réalisé dans le cadre d'un TP de développement Android.
