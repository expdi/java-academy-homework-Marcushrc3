-- Create the AdoptionService database
CREATE DATABASE AdoptionService;

-- Connect to the AdoptionService database
\c AdoptionService;

-- Create the PetTypes table
CREATE TABLE PetTypes (
    id SERIAL PRIMARY KEY,
    type VARCHAR(50) NOT NULL
);

-- Create the Adopters table
CREATE TABLE Adopters (
    id SERIAL PRIMARY KEY,
    name VARCHAR(100) NOT NULL,
    phone_number VARCHAR(15),
    adoption_date DATE,
    address VARCHAR(255),
    born_date DATE
);

-- Create the Pets table
CREATE TABLE Pets (
    id SERIAL PRIMARY KEY,
    name VARCHAR(100),
    breed VARCHAR(100),
    type_id INT NOT NULL,
    adopter_id INT,
    FOREIGN KEY (type_id) REFERENCES PetTypes(id),
    FOREIGN KEY (adopter_id) REFERENCES Adopters(id)
);

-- Create indexes
CREATE INDEX idx_adopter_name ON Adopters(name);
CREATE INDEX idx_pet_name ON Pets(name);
CREATE INDEX idx_pet_type ON Pets(type_id);
