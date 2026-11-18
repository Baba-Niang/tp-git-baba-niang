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

Q6. Pourquoi ne versionne-t-on pas le fichier compilé Main.class ? En quoi .gitignore simplifie-t␂il l'usage de git add . ?
On ne versionne pas Main.class car lorsquon travail en groupe chacun peut compiler et avoir son propre .class et cela peut causer des erreur, des conflit.
.gitignore, simplifie bien lusage de git add parceque quand on as des fichierindesirable comme les .class git add. les prends tous eton est oblige apres de les supprimer un a un, donc mettre tout ce qui nest pas aussi interessant dant le .gitignore et plus economique.

Q7. Quelle différence entre git revert et git reset ? Lequel utiliser sur une branche déjà
partagée sur GitHub, et pourquoi ?
git revert annule un commit en créant un nouveau commit qui fait l’inverse. L’ancien commit reste visible dans l’historique.

git reset fait reculer la branche à un commit précédent. Les commits qui venaient après disparaissent de l’historique.

Sur une branche déjà partagée sur GitHub, il faut utiliser git revert. Les autres membres de l’équipe ont déjà récupéré les commits. Si on les supprime avec git reset, notre historique ne correspond plus au leur, ce qui crée des conflits et peut faire perdre leur travail. git revert, lui, ne supprime rien : il ajoute simplement un commit que tout le monde récupère normalement avec git pull.

git reset est donc à réserver aux commits qui sont seulement sur notre PC (pas encore poussés).

Q8. Que signifie HEAD~1 ? Que veut dire le message « detached HEAD » vu à l'étape 3.8 ?
HEAD désigne le commit sur lequel on se trouve actuellement, en général le dernier commit de la branche. HEAD~1 veut dire « un commit avant HEAD », c’est-à-dire l’avant-dernier commit. De la même façon, HEAD~2 désigne deux commits avant, et ainsi de suite.

Le message « detached HEAD » (HEAD détachée) apparaît quand on se place directement sur un ancien commit, par exemple avec git checkout <identifiant>, au lieu d’être sur une branche. HEAD n’est alors plus attachée à une branche comme main : elle pointe directement sur un commit. On peut regarder le code tel qu’il était à ce moment-là, mais si on fait des commits dans cet état, ils n’appartiennent à aucune branche et risquent d’être perdus. Pour revenir à la normale, on tape git switch main.
