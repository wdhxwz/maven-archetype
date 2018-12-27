## Archetype是什么

Archetype是Maven用来生成项目的一个模板，本质上也是一个maven项目。

一个Archetype由下面几部分组成

- 描述符文件(archetype-metadata.xml)

该文件位于src/main/resources/META-INF/maven/目录下，列出了Archetype中包含的所有文件，并对它们进行了分类。

- 模板文件

模板文件会被Maven archetype插件复制到新生成的项目中，模板文件位于目录：src/main/resources/archetype-resources/

- 模板pom.xml文件

位于目录：src/main/resources/archetype-resources

- 自定义的archetype的pom文件

指定了该archetype的groupId、artifactId、version、packaging等内容



https://maven.apache.org/guides/mini/guide-creating-archetypes.html





