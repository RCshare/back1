-- Insérer des catégories
INSERT INTO category (id, name) VALUES
    (1, 'Electronics'),
    (2, 'Clothing'),
    (3, 'Books'),
    (4, 'Home & Garden'),
    (5, 'Sports & Outdoors');

-- Insérer des articles
INSERT INTO article (id, name, description, price, category_id) VALUES
    (1, 'Apple iPhone 13 Pro', 'The iPhone 13 Pro is the latest and greatest from Apple. With a stunning Super Retina XDR display, powerful A15 Bionic chip, and advanced camera system, the iPhone 13 Pro is the ultimate smartphone.', 999.99, 1),
    (2, 'Samsung Galaxy S21 Ultra', 'The Samsung Galaxy S21 Ultra is a flagship smartphone with a stunning 6.8-inch Dynamic AMOLED display, powerful Exynos 2100 processor, and advanced camera system.', 899.99, 1),
    (3, 'Levi\'s 501 Original Fit Jeans', 'The Levi\'s 501 Original Fit Jeans are an American classic. Made from high-quality denim, these jeans feature a straight leg and classic button-fly closure.', 69.99, 2),
    (4, 'Nike Air Force 1 Low', 'The Nike Air Force 1 Low is a classic sneaker that never goes out of style. With a durable leather upper and iconic design, these sneakers are perfect for any occasion.', 99.99, 5),
    (5, 'Harry Potter and the Philosopher\'s Stone', 'Harry Potter and the Philosopher\'s Stone is the first book in the Harry Potter series. Follow Harry as he discovers his true identity and learns to navigate the magical world of Hogwarts.', 12.99, 3),
    (6, 'The Lord of the Rings Trilogy', 'The Lord of the Rings Trilogy is a classic epic fantasy series by J.R.R. Tolkien. Follow Frodo and his companions on their journey to destroy the One Ring and defeat the evil Sauron.', 39.99, 3),
    (7, 'Instant Pot Duo 6 Quart', 'The Instant Pot Duo 6 Quart is a versatile electric pressure cooker that can cook a wide variety of dishes. With multiple cooking modes and easy-to-use controls, the Instant Pot is perfect for busy families and home cooks.', 89.99, 4),
    (8, 'KitchenAid Artisan Stand Mixer', 'The KitchenAid Artisan Stand Mixer is a must-have for any serious home baker. With a powerful motor and versatile attachments, this stand mixer can handle any baking task with ease.', 399.99, 4),
    (9, 'Coleman Sundome Tent', 'The Coleman Sundome Tent is a popular choice for camping and outdoor enthusiasts. With a spacious interior and easy setup, this tent is perfect for weekend getaways and camping trips.', 99.99, 5),
    (10, 'Patagonia Better Sweater Fleece Jacket', 'The Patagonia Better Sweater Fleece Jacket is a popular choice for outdoor enthusiasts and urban adventurers alike. Made from 100% recycled materials, this jacket is both stylish and sustainable.', 149.99, 2);

-- Ajout de données fictives pour purchase
INSERT INTO purchase (date, user_id)
SELECT
    timestamp '2022-01-01 00:00:00' + interval '1 second' * s.i,
    (SELECT id FROM "_user" WHERE email = 'john.doe@example.com')
FROM generate_series(1, 100) AS s(i);

-- Ajout de données fictives pour purchase_item
INSERT INTO purchase_item (quantity, price, article_id, purchase_id)
SELECT
    floor(random() * 10 + 1)::int, -- quantité entre 1 et 10
    round(random() * 50 + 1, 2)::numeric, -- prix entre 1 et 50 avec 2 décimales
    floor(random() * 100 + 1)::int, -- article_id entre 1 et 100
    floor(random() * 100 + 1)::int -- purchase_id entre 1 et 100
FROM generate_series(1, 1000);
