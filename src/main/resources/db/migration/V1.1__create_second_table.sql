CREATE SEQUENCE category_seq INCREMENT 50;
CREATE TABLE category (
    id INTEGER PRIMARY KEY DEFAULT nextval('category_seq'),
    name VARCHAR(255) NOT NULL
);

CREATE SEQUENCE article_seq INCREMENT 50;
CREATE TABLE article (
    id INTEGER PRIMARY KEY DEFAULT nextval('article_seq'),
    name VARCHAR(255) NOT NULL,
    description TEXT,
    price DECIMAL(10, 2) NOT NULL,
    category_id INTEGER REFERENCES category(id) ON DELETE SET NULL
);

CREATE SEQUENCE purchase_seq INCREMENT 50;
CREATE TABLE purchase (
    id INTEGER PRIMARY KEY DEFAULT nextval('purchase_seq'),
    date TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    user_id INTEGER REFERENCES "_user" (id) ON DELETE CASCADE
);

CREATE SEQUENCE purchase_item_seq INCREMENT 50;
CREATE TABLE purchase_item (
    id INTEGER PRIMARY KEY DEFAULT nextval('purchase_item_seq'),
    quantity INTEGER NOT NULL,
    price DECIMAL(10, 2) NOT NULL,
    article_id INTEGER REFERENCES article(id) ON DELETE SET NULL,
    purchase_id INTEGER REFERENCES purchase(id) ON DELETE CASCADE
);
