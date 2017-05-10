# Ten10Collaboration

A simple project to help the new Ten10 Test Engineers practice collaboration with Git.

Unless you're the only one working on a project, do not push to master, work off a branch and then get your code reviewed and merged.

<h2>Some helpful Git Commands</h2>


>git status

Informs the user what branch they are currently on and shows any modified/new/deleted files

<br/>

>git remote -v

See what remote locations are stored

<br/>

>git remote add <remote\> <url\>

Add a new remote location

<br/>


<h3>I want to get the latest code...</h3>

___

>git pull <remote\> <branch\>

Will get the changes from the specified remote and branch and attempts to merge with local project.
 
git pull essentially performs a git fetch and then a git merge.

<br/>

>git fetch <remote\> <branch\>

Will check to see if there's any changes on the remote compared to your local, will also retrieve any new branches.

<br/>

<h3>I want to push my code...</h3>

___

>git add <file\>

Adds a file to staging (staging: imagine a box of stuff, everything in the box gets pushed to remote, everything not, doesn't).
Use (git add .) to add all changes.

<br/>

>git commit -m "<insert message\>"

Package all of your changes under a single commit with the specified message. Make the message meaningful, messages like "made some changes" is not helpful.

<br/>

>git push <remote\> <branch\>

Push your changes to the remote and branch

<br/>


<h3>I want to work off a branch...</h3>

___


>git checkout -b <branch name\>

Creates a new local branch and switches to it

<br/>

>git checkout <branch name\>

Switches to specified branch

<br/>

>git branch -d <branch name\>

Deletes the specified branch

<br/>


<h3>Example Scenario</h3>

___

- I use <b>git pull origin master</b> to get and merge the latest changes

- I want to work off a new branch so I use <b>git checkout -b temp</b> to create a new branch called temp

- Next I write my code then when I'm done I <b>git add .</b> to add my files to staging

- Then I commit my code with <b>git commit -m "added new functionality"</b>

- I then push my code with <b>git push origin temp</b>

<br/>

- In git (web), I create a pull request because I want my code merged with master and a colleague does a code review and merges it when happy

- With the code now merged, I switch back to master, <b>git checkout master</b>

- And I delete the branch because it's not needed anymore <b>git branch -d temp</b>

- Then I pull the latest master changes, <b>git pull origin master</b>