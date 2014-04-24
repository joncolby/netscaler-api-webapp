#!/bin/bash
 
WSDL=/Users/jcolby/projects/netscaler-api-webapp/wsdl-files/NSConfig.wsdl
#WSDL=NSConfig2.wsdl
java -classpath $( echo *.jar . | sed 's/ /:/g') org.apache.axis.wsdl.WSDL2Java -o output $WSDL
