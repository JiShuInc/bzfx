#!/usr/bin/env bash
#docker run -itd  --name bzms  --restart=unless-stopped -p 8080:8080 -v /opt/bzms/tomcat:/opt/cardinal/data bzms:v1
docker run -itd  --name bzms  --link bzms_db:bzms_db --restart=unless-stopped -p 8080:8080 -v /Users/zhangbaowen/Desktop/xc-test/bzdb/:/opt/cardinal/data bzms:v1