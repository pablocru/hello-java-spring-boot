-- Delete the user if they exists
DROP USER IF EXISTS 'springstudent'@'%';

--
-- Create the user:
-- - Id: springstudent
-- - Passwd: springstudent
CREATE USER 'springstudent'@'%' IDENTIFIED BY 'springstudent';

-- Add all privileges
GRANT ALL PRIVILEGES ON *.* TO 'springstudent'@'%';

FLUSH PRIVILEGES;
