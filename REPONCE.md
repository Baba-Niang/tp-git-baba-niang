Readme le fichier contenant les reponces aux question du tp.

Q1 : Dans quel fichier l'option --global enregistre-t-elle la configuration ? Quelle différence avec
une configuration sans --global , faite dans un dépôt (fichier .git/config ) ?
R1 : L'option global enregistre dans ~/.gitconfig  valable pour tous tes dépôts. Sans --global → écrit dans .git/config, valable pour ce dépôt seulement. Cest pourquoi lorsquon fait ls ~/.gitconfig on trouvera les reglege permanente comme mon email Baba.niang.isep... mon nom github Baba-Niang....et dautre information.

q2 : Q2. Pourquoi l'email configuré doit-il correspondre à celui du compte GitHub ?
R2 : C'est pour que github puisse identifier qui a ecrit le code car chaque compte est rattacher a un email , en second pour des raison de securite.

Q3. Que contient le dossier .git ? Que perdrait-on en le supprimant ?
R3. Il contient la base de donnes de tes historique : commit..., tes paramettre de configuration du dossier...
En le supprimer on perd notre historique de commit, nos reglege concernant le dossier , le lien vers le depot...

Q4. Quelle est la différence entre git diff et git diff --staged ?
git diff : Voir les modifications que tu viens de faire dans tes fichiers, mais que tu n'as pas encore ajoutées avec git add.
git diff --staged : Vérifier exactement ce qui va être enregistré dans ton prochain commit (les fichiers déjà passés par git add).


Q5. Que représente la suite de caractères au début de chaque ligne de git log --oneline ?
C'est l'identifiant unique que Git utilise pour retrouver, cibler ou manipuler précisément ce commit (par exemple avec un git show <identifiant>)
