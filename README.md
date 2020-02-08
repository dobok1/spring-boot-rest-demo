
Step 1. Download the latest Gradle distribution
https://gradle.org/releases/

Step 2. Unpack the distribution
Microsoft Windows users
Create a new directory C:\Gradle with File Explorer.
Open a second File Explorer window and go to the directory where the Gradle distribution was downloaded. Double-click the ZIP archive to expose the content. Drag the content folder gradle-6.1.1 to your newly created C:\Gradle folder.
Alternatively you can unpack the Gradle distribution ZIP into C:\Gradle using an archiver tool of your choice.

Step 3. Configure your system environment
Microsoft Windows users
In File Explorer right-click on the This PC (or Computer) icon, then click Properties -> Advanced System Settings -> Environmental Variables.
Under System Variables select Path, then click Edit. Add an entry for C:\Gradle\gradle-6.1.1\bin. Click OK to save.

Step 4. Verify your installation
Open a console (or a Windows command prompt) and run gradle -v to run gradle and display the version

Reference: https://gradle.org/install/#prerequisites

Convert maven to glade project

1) Cd path to project where pom.xml is located
2) run command: gradle init
3) Add https to repositories url = 'https://repo.maven.apache.org/maven2'
4) run command: gradle build or gradle clean build

Reference:http://www.rationaljava.com/2016/02/moving-from-maven-to-gradle-in-under-5.html
https://spring.io/guides/gs/gradle/#initial
https://howtodoinjava.com/gradle/convert-maven-project-to-gradle-project/
