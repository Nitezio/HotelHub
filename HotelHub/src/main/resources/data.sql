-- Create Room Type Table
CREATE TABLE room_type (
                           room_type_id BIGINT AUTO_INCREMENT PRIMARY KEY,
                           type_name VARCHAR(255) NOT NULL,
                           description VARCHAR(255) NOT NULL
);

-- Create Package Table
CREATE TABLE package (
                         package_id BIGINT AUTO_INCREMENT PRIMARY KEY,
                         package_name VARCHAR(255) NOT NULL,
                         food_included VARCHAR(255),
                         number_of_days INT,
                         max_people INT,
                         facilities_included VARCHAR(255),
                         package_price DECIMAL(10, 2)
);

-- Create Room Table
CREATE TABLE room (
                      room_id BIGINT AUTO_INCREMENT PRIMARY KEY,
                      room_number VARCHAR(50) NOT NULL,
                      room_type_id BIGINT,
                      status VARCHAR(50),
                      price_per_night DECIMAL(10, 2),
                      FOREIGN KEY (room_type_id) REFERENCES room_type(room_type_id)
);

-- Create Customer Table
CREATE TABLE customer (
                          customer_id BIGINT AUTO_INCREMENT PRIMARY KEY,
                          name VARCHAR(255) NOT NULL,
                          email VARCHAR(255) NOT NULL UNIQUE,
                          phone_number VARCHAR(50),
                          address VARCHAR(255)
);

-- Create Booking Table
CREATE TABLE booking (
                         booking_id BIGINT AUTO_INCREMENT PRIMARY KEY,
                         customer_id BIGINT,
                         package_id BIGINT,
                         room_id BIGINT,
                         check_in_date DATE,
                         check_out_date DATE,
                         booking_date DATE,
                         status VARCHAR(50),
                         FOREIGN KEY (customer_id) REFERENCES customer(customer_id),
                         FOREIGN KEY (package_id) REFERENCES package(package_id),
                         FOREIGN KEY (room_id) REFERENCES room(room_id)
);

-- Create Payment Table
CREATE TABLE payment (
                         payment_id BIGINT AUTO_INCREMENT PRIMARY KEY,
                         booking_id BIGINT,
                         payment_date DATE,
                         method VARCHAR(50),
                         status VARCHAR(50),
                         FOREIGN KEY (booking_id) REFERENCES booking(booking_id)
);

-- Insert Room Types
INSERT INTO room_type (type_name, description) VALUES ('Single', 'A room for one person.');
INSERT INTO room_type (type_name, description) VALUES ('Double', 'A room for two people.');
INSERT INTO room_type (type_name, description) VALUES ('Suite', 'A luxurious room with additional amenities.');

-- Insert Packages
INSERT INTO package (package_name, food_included, number_of_days, max_people, facilities_included, package_price) VALUES ('Silver', 'Breakfast', 1, 1, 'Free Wi-Fi', 100.00);
INSERT INTO package (package_name, food_included, number_of_days, max_people, facilities_included, package_price) VALUES ('Gold', 'Breakfast and Dinner', 2, 2, 'Free Wi-Fi, Pool Access', 200.00);
INSERT INTO package (package_name, food_included, number_of_days, max_people, facilities_included, package_price) VALUES ('Platinum', 'All Meals', 3, 4, 'Free Wi-Fi, Pool Access, Spa', 300.00);

-- Insert Rooms
INSERT INTO room (room_number, room_type_id, status, price_per_night) VALUES ('101', 1, 'Available', 80.00);
INSERT INTO room (room_number, room_type_id, status, price_per_night) VALUES ('102', 2, 'Available', 150.00);
INSERT INTO room (room_number, room_type_id, status, price_per_night) VALUES ('103', 3, 'Available', 250.00);

-- Insert Customers
INSERT INTO customer (name, email, phone_number, address) VALUES ('John Doe', 'john@example.com', '1234567890', '123 Main St');
INSERT INTO customer (name, email, phone_number, address) VALUES ('Jane Smith', 'jane@example.com', '0987654321', '456 Elm St');