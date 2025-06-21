```La programmation orientée aspect (POA), ou en anglais Aspect-Oriented Programming (AOP), est un paradigme de programmation qui complète les paradigmes comme la programmation orientée objet (POO) en permettant une meilleure modularisation du code, notamment pour les préoccupations transversales (cross-cutting concerns).```

### Voici les principales notions de la POA :

## 🔑 1. Aspect
Un aspect est une unité modulaire de code qui encapsule une préoccupation transversale (ex : journalisation, sécurité, gestion des transactions). Il permet de séparer cette logique du code métier principal.

## 🔑 2. Point de jonction (Join Point)
Un point de jonction est un point bien défini dans l’exécution du programme où un aspect peut intervenir. Exemple : appel d’une méthode, accès à un attribut, etc.

## 🔑 3. Pointcut (Point de coupe)
Un pointcut est une expression qui sélectionne un ou plusieurs points de jonction. Il sert à définir les endroits du code où un aspect doit s’appliquer.

## 🔑 4. Advice (Conseil)
Un advice est le code exécuté à un point de jonction sélectionné par un pointcut. Il existe plusieurs types :

Before advice : exécuté avant le point de jonction

After advice : exécuté après le point de jonction

Around advice : englobe le point de jonction, permettant d’exécuter du code avant et après, voire d’empêcher l'exécution de l’opération

## 🔑 5. Weaving (Tissage)
Le tissage est le processus qui insère les aspects dans le code principal selon les règles définies. Il peut avoir lieu :

À la compilation

Au chargement

À l’exécution

🔑 6. Préoccupations transversales
Ce sont des fonctionnalités qui traversent plusieurs modules du système (logging, sécurité, gestion des erreurs, etc.) mais qui ne doivent pas être mélangées au code métier principal.

## 🧩 Syntaxe de base d’un pointcut

modificateur-retour nom.package.Classe.méthode(paramètres)




## les proxies JDK et CGLIB est clé pour bien maîtriser Spring AOP, car ce sont les mécanismes utilisés pour appliquer les aspects au moment de l’exécution.
```
1. Proxy JDK
   Fonctionne uniquement si le bean implémente une interface.

Spring crée un objet proxy qui implémente la même interface.

Le proxy délègue l’appel à l’objet réel + exécute les aspects.
```
```
2. CGLIB Proxy
   Utilisé si le bean n’implémente pas d’interface.

Spring crée un sous-classe dynamique de ta classe cible.

Le proxy hérite de ta classe et surcharge les méthodes.
```