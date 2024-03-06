-- Create Database (Optional)
CREATE DATABASE IF NOT EXISTS TrainInfoDB;
USE TrainInfoDB;
drop TABLE IF EXISTS Station;
drop TABLE IF EXISTS Train;


-- Create Train Table
CREATE TABLE IF NOT EXISTS Train (
    Train_ID INT AUTO_INCREMENT PRIMARY KEY,
    Train_Number VARCHAR(50),
    Train_Name VARCHAR(100)
);

-- Create Station Table
CREATE TABLE IF NOT EXISTS Station (
    Station_ID INT AUTO_INCREMENT PRIMARY KEY,
    Train_ID INT,
    Station_Name VARCHAR(100),
    Station_Sequence INT,
    FOREIGN KEY (Train_ID)REFERENCES Train(Train_ID)
);


INSERT INTO Train (Train_Number, Train_Name) VALUES
('101', 'InterCity Express'),
('102', 'Mountain Explorer'),
('103', 'Coastal Liner'),
('104', 'Urban Sprinter'),
('105', 'Northern Star');

-- Stations for InterCity Express (TrainID = 1)
INSERT INTO Station (Train_ID, Station_Name, Station_Sequence) VALUES
(1, 'Capital Central', 1),
(1, 'Midtown', 2),
(1, 'Grandview', 3),
(1, 'Lakeside', 4),
(1, 'Pine Valley', 5),
(1, 'End Line', 6);

-- Stations for Mountain Explorer (TrainID = 2)
INSERT INTO Station (Train_ID, Station_Name, Station_Sequence) VALUES
(2, 'Hilltop', 1),
(2, 'Rocky Ridge', 2),
(2, 'Summit Station', 3),
(2, 'Alpine Base', 4),
(2, 'End Line', 5);

-- Repeat similar patterns for other trains as needed
