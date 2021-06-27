# Programming Recipes

Notes (June 27,2021)
- Usr Java 8 for now. Currently Java 16 (Latest) does not work nicely with IntelliJ. Keep getting an error
> Also Gradle doesent start up properly with Java 16
   

**How to check Java Version**
> java -version

**How to check which version of java you have on your computer ?**
> /usr/libexec/java_home -V

**Output should look like this**

`Matching Java Virtual Machines (2):
16.0.1 (x86_64) "Oracle Corporation" - "Java SE 16.0.1" /Library/Java/JavaVirtualMachines/jdk-16.0.1.jdk/Contents/Home
1.8.0_292 (x86_64) "Amazon" - "Amazon Corretto 8" /Users/timmanas/Library/Java/JavaVirtualMachines/corretto-1.8.0_292/Contents/Home
/Library/Java/JavaVirtualMachines/jdk-16.0.1.jdk/Contents/Home`


**Currently in system**

`openjdk version "1.8.0_292"
OpenJDK Runtime Environment Corretto-8.292.10.1 (build 1.8.0_292-b10)
OpenJDK 64-Bit Server VM Corretto-8.292.10.1 (build 25.292-b10, mixed mode)`

**Currently in Bash Profile**
> export JAVA_HOME=`/usr/libexec/java_home -v 1.8`

**How to install Java8 ?**
> brew search openjdk

> brew install openjdk@8

> Note: Dont forget to swith the JAVA_HOME path in bash profile 