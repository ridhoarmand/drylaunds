DROP DATABASE IF EXISTS dblaundry;

CREATE DATABASE IF NOT EXISTS dblaundry;

USE dblaundry;

-- Membuat tabel users
CREATE TABLE users (
                       id VARCHAR(10) NOT NULL,
                       username VARCHAR(50) UNIQUE NOT NULL,
                       password VARCHAR(50) NOT NULL,
                       name VARCHAR(100) NOT NULL,
                       PRIMARY KEY (id)
);

-- Membuat tabel members
CREATE TABLE members (
                         id VARCHAR(10) NOT NULL,
                         name VARCHAR(100) NOT NULL,
                         address VARCHAR(100),
                         phone VARCHAR(15),
                         PRIMARY KEY (id)
);

-- Membuat tabel services
CREATE TABLE services (
                          id VARCHAR(10) NOT NULL,
                          name VARCHAR(10) NOT NULL,
                          description VARCHAR(10) NOT NULL,
                          price DECIMAL(10,2) NOT NULL,
                          unit ENUM('Satuan', 'KG') NOT NULL,
                          PRIMARY KEY (id)
);

-- Membuat tabel orders
CREATE TABLE orders (
                        id VARCHAR(10) NOT NULL,
                        user_id VARCHAR(10) NOT NULL,
                        member_id VARCHAR(10) DEFAULT 1,
                        orderer VARCHAR(100) NOT NULL,
                        date DATE NOT NULL,
                        status ENUM('On Process','Done','Already Taken'),
                        PRIMARY KEY (id),
                        FOREIGN KEY (user_id) REFERENCES users(id),
                        FOREIGN KEY (member_id) REFERENCES members(id)
);

-- Membuat tabel order_details
CREATE TABLE order_details (
                               id VARCHAR(10) NOT NULL,
                               order_id VARCHAR(10) NOT NULL,
                               service_id VARCHAR(10) NOT NULL,
                               qty DECIMAL(4,2),
                               price DECIMAL(10,2),
                               subtotal DECIMAL(10,2),
                               PRIMARY KEY (id),
                               FOREIGN KEY (order_id) REFERENCES orders(id),
                               FOREIGN KEY (service_id) REFERENCES services(id)
);

-- Membuat tabel payments
CREATE TABLE payments (
                          id VARCHAR(10) NOT NULL,
                          order_id VARCHAR(10) NOT NULL UNIQUE,
                          date DATE NOT NULL,
                          bill DECIMAL(10,2),
                          pay DECIMAL(10,2),
                          `change` DECIMAL(10,2),
                          PRIMARY KEY (id),
                          FOREIGN KEY (order_id) REFERENCES orders(id)
);

-- Membuat tabel pickups
CREATE TABLE pickups (
                         id VARCHAR(10) NOT NULL,
                         order_id VARCHAR(10) NOT NULL UNIQUE,
                         date DATE,
                         PRIMARY KEY (id),
                         FOREIGN KEY (order_id) REFERENCES orders(id)
);
