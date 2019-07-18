-- SQL Required to get set up with the project
-- database config is in the application.properties
-- db default name is pet_hotel
CREATE TABLE "owners" (
"id" SERIAL PRIMARY KEY,
"name" VARCHAR (80) NOT NULL
);

CREATE TABLE "pets" (
"id" SERIAL PRIMARY KEY,
"name" VARCHAR (20) NOT NULL,
"breed" VARCHAR (20) NOT NULL,
"color" VARCHAR (20) NOT NULL,
"checked_in" BOOLEAN DEFAULT TRUE,
"owner_id" INT REFERENCES "owners" NOT NULL
);

INSERT INTO "owners" ("name")
VALUES ('Koua'), ('Dayton'), ('Kibret'), ('Kellen');

INSERT INTO "pets" ("name", "breed", "color", "owner_id")
VALUES ('Charlie', 'Shih-tzu', 'Black', 1),
('Thorin', 'Rabbit', 'White', 2),
('Gatsby', 'Cat', 'White', 3),
('Juniper', 'Cat', 'Tabby', 4);