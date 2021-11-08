#!/usr/bin/env bash
mkdir -p /opt/bzfx/db/log /opt/bzfx/db/data /opt/bzfx/db/conf /opt/bzfx/db/conf.d
docker run -itd \
             --name bzfx_db \
             --restart always -p 3306:3306 \
             -v /opt/bzfx/db/data:/var/lib/mysql \
             -e MYSQL_ROOT_PASSWORD=Bzfx@2021
             bzdb:latest
