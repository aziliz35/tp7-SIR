# SIR : TP7. à la découverte des bases NoSQL

  Réalisé par Ismail Mellali et Aziliz Baron

Pour ce TP, nous avons commencé par céer une base de données avec MongoDB puis utiliser la librairie Morphia afin de se connecter
à la base de données.

Pour tester le fonctionnement de Mongo nous avons créé trois classes: 

- Address
- Person
- Article 

#Questions: Quelles sont les limites d’une base de données orientées document ?

Les problème d'une base de données orientées document sont le manque de cohérence des données et le risque de perte de données.
En effet ce type de base de données mais en avant la rapidité de réponse au détriment parfois de l'intégrité des données.

#Redis

Dans un deuxième temps nous avons installé reidis (vous pouvez voir ce projet en changeant de branche) afin de découvrir un autre
système de gestion de base de données NoSQL.

#Questions: Quelles sont les types de données stockés dans Redis, que peut on faire comme types de requêtes ?

Redis est une base de données de type clé-valeur. Il s'agit d'une sorte de hashmap ayant pour valeur des données simple comme des
chaînes de caractères, des listes, des ensembles, etc.

On peur faire des requêtes de type SET, GET. On peut aussi faire des incrémentations(INCR)
