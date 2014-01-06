CREATE DATABASE IF NOT EXISTS `quickstart`
  DEFAULT CHARACTER SET utf8
  COLLATE utf8_general_ci;

GRANT ALL PRIVILEGES ON quickstart.* TO 'quickstart'@'localhost'
IDENTIFIED BY 'quickstart'
WITH GRANT OPTION;
