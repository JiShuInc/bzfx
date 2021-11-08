#!/usr/bin/env bash
echo "import image bzms_db:latest"
gunzip -c bzms_db-pro_v1.tar.gz | docker load
echo "import image bzms_db:latest complelte!!!"
echo "import image bzms:latest"
gunzip -c bzms-pro_v1.tar.gz | docker load
echo "import image bzms:latest complelte"
