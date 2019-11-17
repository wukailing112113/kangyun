FROM fabric8/java-jboss-openjdk8-jdk
EXPOSE 9992 9993
USER root
ENV LANG en_US.UTF-8
ENV TZ=Asia/Shanghai
RUN ln -snf /usr/share/zoneinfo/$TZ /etc/localtime && echo $TZ > /etc/timezone
ADD ./kangyun-user-center.jar .
CMD java -jar kangyun-user-center.jar
