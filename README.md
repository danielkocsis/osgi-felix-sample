# OSGi Sample Project 

This is a set of small projects to demonstrate how to use OSGi core + DS + Apache Felix + Gradlew + BND Tools Gradle Plugin + IntelliJ together.


## How to run the container?

1. You need to build the project first with `gradle deployBundles` from the `osgi-gradle-sample` root project directory. It will copy all the jar files to the `felix-framework/bundle` folder, wich is the default auto deploy folder of felix.
1. Run the `java -jar bin/felix.jar` command from the `felix-framework` directory
1. As the container has the OSGi Web Console bundle included, you can use the web console to manage the container, to do open the following URL in your browser: `http://localhost:8080/system/console/`


