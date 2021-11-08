#!/usr/bin/env bash
sudo apt-get update
sudo apt-get install openjdk-11-jre-headless -y
echo -e "\e[1;32m======================== Install openjdk11 complete ... ========================\e[0m"
sudo apt-get install mysql-server -y
echo -e "\e[1;32m======================== Install mysql complete ... ========================\e[0m"
npd=iggcas215
sudo cat /etc/mysql/debian.cnf |grep password |sed  '/^password = /!d;s/.*= //'| sed -e '2,$d'> ./pwd.bzfx
pd=$(cat ./pwd.bzfx)
mysql -u debian-sys-maint -p$pd -e "ALTER USER 'root'@'localhost' IDENTIFIED WITH mysql_native_password BY '$npd';"
mysql -u debian-sys-maint -p$pd -e "flush privileges;"
mysql -uroot -p$npd -e "source ~/bzfx_build/bzfx.sql;"
\rm ./pwd.bzfx
echo -e "\e[1;32m======================== Config mysql complete ... ========================\e[0m"
sudo apt-get install tomcat9 -y
echo -e "\e[1;32m======================== Install tomcat9 complete ... ========================\e[0m"
sudo systemctl stop tomcat9
cd /etc/systemd/system/
sudo mkdir tomcat9.service.d
cd tomcat9.service.d
sudo cat ~/tomcat9_paths.conf > override.conf
sudo systemctl daemon-reload
cd /var/lib/tomcat9/
pwd
sudo mkdir bzfx_data bzfx_logs
sudo chown tomcat:tomcat bzfx_*
cd webapps
pwd
sudo cp ~/bzfx_build/bzfx.war .
sudo mkdir wbbzfx
sudo cp -r ~/bzfx_build/wbbzfx ./wbbzfx
echo -e "\e[1;32m======================== Config tomcat9 complete ... ========================\e[0m"
sudo systemctl restart tomcat9
echo -e "\e[1;32m======================== Install bzfx complete ... ========================\e[0m"
