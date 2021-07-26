# À propos de l'application
Une application desktop pour la gestion des etudiants et des enseignants avec quelques requêtes utiles  

## Les fonctionnalités de cette application
- Authentification : il existe 3 profile dans cette application, l'administrateur, l'etudiant et l'enseignant
#### En tant qu'Administrateur : 
L'administrateur peut s'authentifier avec username = BDDAdmin et le mot de passe = TPAdmin
- Insérer, supprimer ou changer les informations des <i><strong> etudiants </strong></i> (Matricule, Nom , Prénom , Adresse ...)
- Insérer, supprimer ou changer les informations des <i><strong> enseignants</strong></i> (Matricule, Nom, Prénom)
- Insérer, supprimer ou changer les notes des <i><strong>etudiants</strong></i> (Note CC, Note TP, Note Examen)
- Insérer, supprimer ou changer des modules
- Introduire une note pour afficher les noms et prénoms des étudiants ayant obtenus cette note avec le module d'ou il a pris cette dernier (ReQuet 1)
- Affiche pour chaque étudiant, son nom, son prénom sa moyenne par unité d'enseignement ainsi que le libellé de l'unité.
- Afficher la moyenne générale des etudiants
- Afficher la liste des etudiants (Nom et prénom seulement)
#### En tant qu'Etudiant: 
L'Etudiant peut s'authentifier avec username = Etudiant et le mot de passe = TPEtudiant
- Consulter un étudiant en saisissant sa matricule.
#### En tant qu'Enseignant: 
L'Enseignant peut s'authentifier avec username = Enseignant et le mot de passe = TPEnseignant
- Consulter un enseignant en saisissant sa matricule.

## Schéma relationnel de la base de données
Les clés primaires sont en gras et les clés étrangères sont désignées du signe *. Les nombres d'heures sont comptabilisés par semaine.
<strong></strong>
- Etudiant (<strong>matricule_etu</strong>, nom_etu, prenom_etu, date_naissance)
- Unité (<strong>code_Unité</strong>, libelle, nbr_heures, matricule_ens*)
- Enseignant (<strong>matricule_ens</strong>, nom_ens, prenom_ens, âge)
- EtudiantUnité (<strong>matricule_etu*</strong>,<strong>code_Unité*</strong>, note_CC, note_TP, note_examen)
## Quelques captures d'écran de l'application
 Page d'identification                 |   
:-------------------------:
![](https://github.com/ItsYasser/GestionEtudiants/blob/main/ScreenShots/LogIn.png?raw=true)|
 Page d'accueil (Administrateur)       |   
![](https://github.com/ItsYasser/GestionEtudiants/blob/main/ScreenShots/HomePage.png?raw=true)|
 Insérer un étudiant                   |   
![](https://github.com/ItsYasser/GestionEtudiants/blob/main/ScreenShots/SaveEtudiant.png?raw=true)|
 ReQuet 1                  |   
![](https://github.com/ItsYasser/GestionEtudiants/blob/main/ScreenShots/AfficheNoteExamen.png?raw=true)|
 Interface pour l'etudiant             |   
![](https://github.com/ItsYasser/GestionEtudiants/blob/main/ScreenShots/EtudiantPanel.png?raw=true)|
## Outils utilisés
- <b> La Base Des Données : <img src="https://img.shields.io/badge/Oracle-F80000?style=plastic&logo=oracle&logoColor=white" alt="Oracle"> <img src="https://img.shields.io/badge/SQL%20-%23025E8C.svg?style=plastic&logo=amazon-dynamodb&logoColor=white" alt="SQL" >
- Langage de programmation  : <img src="https://img.shields.io/badge/JAVA-007396?style=plastic&logo=java&logoColor=white" alt="JAVA">
- IDE : <img src="https://img.shields.io/badge/Netbeans-1B6AC6?style=plastic&&logo=Apache%20NetBeans%20IDE&logoColor=white" alt="Netbeans"> 
- JDK And JRE Versions : <i>1.8.0_241</i> </b>
## Plus de détails : 
Pour plus de détails et de captures d'écran sur cette application, j'ai fait un rapport expliquant chaque page avec le code associé. 
Téléchargez-le en pdf ici : </a>
    </a>
    <a href="https://github.com/ItsYasser/GestionEtudiants/blob/main/RapportDuProjet.pdf">
    <img src="https://img.shields.io/badge/Download%20PDF-c61b1b?style=flat-square">
  </a>
