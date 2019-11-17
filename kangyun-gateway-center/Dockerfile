FROM fabric8/java-jboss-openjdk8-jdk
EXPOSE 8769 8769
USER root
ENV LANG en_US.UTF-8
ENV TZ=Asia/Shanghai
RUN ln -snf /usr/share/zoneinfo/$TZ /etc/localtime && echo $TZ > /etc/timezone
ADD ./kangyun-gateway-center.jar .
CMD java -jar kangyun-gateway-center.jar
