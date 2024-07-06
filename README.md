# Jsymphonic Revival

Note that I am not the orignal author. Jsymphonic was/is located at https://sourceforge.net/projects/symphonic/ and it appears the original author, nicolas_cardoso, abandoned it. This is just moving the code to github and changing a couple things so it will work on modern JVMs and changign the build so it's more modern (I changed it to Maven). I did not change any of the functionality, so this should just work as before. I tried it on linux and it works. 

## Running Jsymphonic
Download the latest jar from https://github.com/brianpipa/jsymphonic/releases/ and then you need to run it. Depending on your OS, and what you have configured, the way to do this may vary.

## Building Jsymphonic
Clone this repo then install the jars to your local maven repo with these commands:
```
mvn install:install-file -Dfile=./jars/jaudiotagger.jar -DgroupId=org -DartifactId=jaudiotagger -Dversion=1.0 -Dpackaging=jar
mvn install:install-file -Dfile=./jars/swing-layout.jar -DgroupId=org.jdesktop.layout -DartifactId=swing-layout -Dversion=1.0 -Dpackaging=jar
```
Once that's done, you can build it with `mvn package` that will create target/jsymphonic-0.4-jar-with-dependencies.jar which is your runnable jar
