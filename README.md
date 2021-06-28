### 当前系统使用的是jacoco的offline离线模式,不使用online在线模式的原因如下
原因：因为如果要使用powerMock进行mock静态方法的话，powerMock和jacoco在线模式一起使用会出现冲突，
具体冲突原因可以参考[链接](https://github.com/powermock/powermock/wiki/Code-coverage-with-JaCoCo)
所以，如果你要使用powerMock的某些强大的功能的话，那么你需要使用jacoco的离线模式
### 整个系统使用的技术和版本
+ gradle 6.5
+ springboot 2.3.2.RELEASE
+ > org.jacoco.ant 0.8.4
+ > org.jacoco.agent 0.8.4
+ sonarqube-gradle-plugin 2.7.1

### 扫描代码覆盖率
```
./gradlew clean report sonarqube
```
### 构建+扫描
```
./gradlew clean build report sonarqube
```
