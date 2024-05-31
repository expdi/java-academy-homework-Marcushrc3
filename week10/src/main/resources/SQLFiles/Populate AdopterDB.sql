-- Populate the PetTypes table
INSERT INTO PetTypes (type) VALUES ('CAT'), ('DOG'), ('TURTLE'), ('FISH');

-- Populate the Adopters table
INSERT INTO Adopters (name, phone_number, adoption_date, address, born_date)
VALUES
    ('Marcus Silva', '123-456-7890', '2025-05-01', 'Estrada do campo limpo, 560', '1999-05-28'),
    ('Silvana', '987-654-3210', '2023-06-15', 'Estrada do campo limpo, 560', '1997-09-23');

-- Populate the Pets table
INSERT INTO Pets (name, breed, type_id, adopter_id)
VALUES
    ('Cookie', 'Labrador', 2, 1),
    ('Flaff', 'Golden', 2, 2);
