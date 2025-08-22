package dev.nanoservices;

public class HelloCore {

    /*

    manuelles Kopieren des core in .m2

    mvn install:install-file \
  -Dfile=./target/nanoservices-core-0.2.0-SNAPSHOT.jar \
  -DgroupId=dev.nanoservices \
  -DartifactId=nanoservices-core \
  -Dversion=0.2.0-SNAPSHOT \
  -Dpackaging=jar
     */

    HelloSystem system = new HelloSystem();

}
