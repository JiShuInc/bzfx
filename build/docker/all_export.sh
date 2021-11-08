#!/usr/bin/env bash
echo "export image bzdb:v1"
docker save bzdb:v1 |gzip > bzms_db-pro_v1.tar.gz
echo "export bzdb:v1 complete!!!"
echo "export image bzms:latest"
docker save bzms:latest|gzip > bzms-pro_latest.tar.gz
echo "export image bzms:v1 complete!!!"
