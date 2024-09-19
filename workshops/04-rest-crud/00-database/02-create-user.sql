-- Delete the user if they exists
DROP USER IF EXISTS 'springstudent'@'%';

--
-- Create the user:
-- - Id: springstudent
-- - Passwd: springstudent
CREATE USER 'springstudent'@'%' IDENTIFIED BY 'springstudent';

-- Add all privileges on `employee_directory` table
GRANT ALL PRIVILEGES ON `employee_directory`.* TO 'springstudent'@'%';

FLUSH PRIVILEGES;
