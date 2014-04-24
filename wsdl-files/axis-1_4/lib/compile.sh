#!/bin/bash

mkdir classes 
javac -classpath $( echo *.jar . | sed 's/ /:/g')  -J-Xmx256m -d classes output/NSConfig/*.java
#javac -Xlint:unchecked  -classpath $( echo *.jar . | sed 's/ /:/g')  -J-Xmx256m output/NSConfig/*.java
pushd classes
jar cvf NSConfig.jar NSConfig/*.class
mv NSConfig.jar ..
popd
