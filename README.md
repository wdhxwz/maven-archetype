# maven-archetype
自定义的maven脚手架


- 先将脚手架mvn clean install到本地，或者deploy到私服上
- 然后执行下面命令
mvn archetype:generate -DgroupId=com.krista -DartifactId=test -Dversion=1.0.0-SNAPSHOT -DarchetypeGroupId=com.krista -DarchetypeArtifactId=krista-archetype -DarchetypeVersion=1.0.0-SNAPSHOT -DarchetypeCatalog=local
