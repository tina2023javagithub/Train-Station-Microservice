-- Insert sample data into trains table
INSERT INTO trains (train_number, train_name) VALUES
('1234', 'Shanghai Express'),
('5678', 'Shanghai Metro'),
('91011', 'Shanghai Bullet Train');

-- Insert sample data into stations table
INSERT INTO stations (station_name, train_id) VALUES
('Shanghai Station', 1),
('Shanghai South Station', 1),
('Shanghai Hongqiao Station', 1),
('Shanghai Railway Station', 2),
('People\'s Square Station', 2),
('Lujiazui Station', 3),
('Xintiandi Station', 3),
('Jing\'an Temple Station', 3);
