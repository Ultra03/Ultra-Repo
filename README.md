# Ultra-Repo

Maven repository for my projects!

#Using the repository:

NOTE: It is always recommended to use the latest version. Support for older versions will not be provided.

Add to pom.xml:
```
<!-- Between <repositories></repositories> -->
  <repository>
  	<id>github</id>
  	<url>https://raw.githubusercontent.com/Ultra03/Ultra-Repo/repository</url>
  </repository>

<!-- Between <dependencies></dependencies> -->
 <dependency>
    	<groupId>net.ultra03</groupId>
    	<artifactId>Repository</artifactId>
    	<version>1.0.2</version>
    	<scope>provided</scope>
 </dependency>
