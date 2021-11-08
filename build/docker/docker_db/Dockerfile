FROM mysql:8.0

MAINTAINER bzms db base on mysql8.0 cardinal.tech

COPY ./bzfx.sql /tmp
COPY ./mysql/conf/my.cnf /etc/mysql

RUN mv /tmp/*.sql /docker-entrypoint-initdb.d \
         && cp /usr/share/zoneinfo/Asia/Shanghai /etc/localtime \
         && echo "Asia/Shanghai"> /etc/timezone
EXPOSE 3306