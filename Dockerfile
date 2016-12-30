FROM maven:3.3.3

ADD pom.xml /tmp/build/
RUN cd /tmp/build && mvn -q dependency:resolve

ADD src /tmp/build/src
        #构建应用
RUN cd /tmp/build && mvn -q -DskipTests=true package \
        #拷贝编译结果到指定目录
        && mv target/*.jar /app.jar \
        #清理编译痕迹
        && cd / && rm -rf /tmp/build

VOLUME /tmp
EXPOSE 8080
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar"]

#FROM frolvlad/alpine-oraclejdk8:slim
#VOLUME /tmp
#ADD target/heatseeking-1.0-SNAPSHOT.jar app.jar
#RUN sh -c 'touch /app.jar'
#ENV JAVA_OPTS=""
#ENTRYPOINT [ "sh", "-c", "java $JAVA_OPTS -Djava.security.egd=file:/dev/./urandom -jar /app.jar" ]