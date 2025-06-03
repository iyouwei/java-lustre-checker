# ECNU JKind

## 介绍
这就是一个Lustre验证的Java实现。就一破项目。

## 注意点
有三个依赖是在lib目录下的jar包，分别是：
- [antlr-4.4-complete.jar](lib/antlr-4.4-complete.jar)
- [antlr-runtime-4.4.jar](lib/antlr-runtime-4.4.jar)
- [smtinterpol.jar](lib/smtinterpol.jar)

它们使用本地引入jar的方式，所以需要修改绝对路径为自己的本地路径
- 修改[jkind-common/pom.xml](jkind-common/pom.xml)下的/Users/wei/IdeaProjects/java-lustre-checker/lib/antlr-4.4-complete.
  jar和/Users/wei/IdeaProjects/java-lustre-checker/lib/antlr-runtime-4.4.jar
- 修改[jkind-service/pom.xml](jkind-service/pom.xml)下的/Users/wei/IdeaProjects/java-lustre-checker/lib/smtinterpol.jar

## 启动

```bash
# 1、编译
mvn clean install -U
# 2、运行
java -jar jkind-server/target/jkind-server-1.0-SNAPSHOT.jar
```

