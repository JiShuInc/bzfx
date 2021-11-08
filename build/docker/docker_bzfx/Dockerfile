FROM tomcat8_jdk11:latest

MAINTAINER bzms service based on tomcat8 and openjdk11  cardinal.tech

COPY ./bzfx.war /opt/cardinal/tomcat8/webapps/


RUN cp /usr/share/zoneinfo/Asia/Shanghai /etc/localtime \
         && echo "Asia/Shanghai"> /etc/timezone \
         && mkdir -p /opt/cardinal/data/bzms_logs \
         && rm -rf /opt/cardinal/tomcat8/webapps/ROOT/*  \
         && rm -rf /opt/cardinal/tomcat8/webapps/examples \
         && rm -rf /opt/cardinal/tomcat8/webapps/docs \
         && rm -rf /opt/cardinal/tomcat8/webapps/host-manager \
         && rm -rf /opt/cardinal/tomcat8/webapps/manager

#COPY ./chart100/* /opt/cardinal/tomcat8/webapps/ROOT/

ENV JAVA_HOME /opt/cardinal/jdk-11

ENTRYPOINT ["/opt/cardinal/tomcat8/bin/catalina.sh","run"]

EXPOSE 8080