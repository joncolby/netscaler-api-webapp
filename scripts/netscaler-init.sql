create database netscaler;
grant all privileges on netscaler.* to 'netscaler'@'localhost' identified by 'netscaler';
grant all privileges on netscaler.* to 'netscaler'@'10.%' identified by 'netscaler';
