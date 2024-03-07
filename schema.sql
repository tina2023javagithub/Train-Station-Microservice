-- Create database
CREATE DATABASE train_information_db;

-- Use the database
USE train_information_db;

-- Drop existing tables if they exist to recreate them
DROP TABLE IF EXISTS trains;
DROP TABLE IF EXISTS stations;


-- Table for storing train information
CREATE TABLE trains (
    train_id INT PRIMARY KEY AUTO_INCREMENT,
    train_number VARCHAR(20) NOT NULL,
    train_name VARCHAR(100) NOT NULL
);

-- Table for storing station details
CREATE TABLE stations (
    station_id INT PRIMARY KEY AUTO_INCREMENT,
    station_name VARCHAR(100) NOT NULL,
    train_id INT,
    FOREIGN KEY (train_id) REFERENCES trains(train_id)
);
