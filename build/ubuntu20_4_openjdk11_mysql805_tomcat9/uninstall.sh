#!/user/bin/env bash

sudo systemctl stop tomcat9
echo -e "\e[1;32m======================== stop tomcat9 complete ... ========================\e[0m"
sudo service mysql stop
echo -e "\e[1;32m======================== stop mysql-server complete ... ========================\e[0m"
sudo apt-get remove mysql-server -y
sudo apt-get purge mysql-server -y
echo -e "\e[1;32m======================== remove mysql complete ... ========================\e[0m"
sudo apt-get remove openjdk-11-jre-headless -y
sudo apt-get purge openjdk-11-jre-headless -y
echo -e "\e[1;32m======================== remove openjdk-11-jre-headless complete ... ========================\e[0m"
sudo /rm -r /var/lib/tomcat9/bzms_*
sudo /rm -r /var/lib/tomcat9/webapps/bzms*
sudo /rm -r /var/lib/tomcat9/weapps/wbbzms
sudo /rm -r /etc/systemd/system/tomcat9.service.d/override.conf
sudo systemctl daemon-reload
sudo apt-get remove tomcat9 -y
sudo apt-get purge tomcat9 -y
sudo apt-get autoremove -y
echo -e "\e[1;32m======================== remove tomcat9 complete ... ========================\e[0m"
echo uninstall complete!
