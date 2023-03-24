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
    (3, 'Levi 501 Original Fit Jeans', 'The Levi 501 Original Fit Jeans are an American classic. Made from high-quality denim, these jeans feature a straight leg and classic button-fly closure.', 69.99, 2),
    (4, 'Nike Air Force 1 Low', 'The Nike Air Force 1 Low is a classic sneaker that never goes out of style. With a durable leather upper and iconic design, these sneakers are perfect for any occasion.', 99.99, 5),
    (5, 'Harry Potter and the Philosopher  Stone', 'Harry Potter and the Philosopher Stone is the first book in the Harry Potter series. Follow Harry as he discovers his true identity and learns to navigate the magical world of Hogwarts.', 12.99, 3),
    (6, 'The Lord of the Rings Trilogy', 'The Lord of the Rings Trilogy is a classic epic fantasy series by J.R.R. Tolkien. Follow Frodo and his companions on their journey to destroy the One Ring and defeat the evil Sauron.', 39.99, 3),
    (7, 'Instant Pot Duo 6 Quart', 'The Instant Pot Duo 6 Quart is a versatile electric pressure cooker that can cook a wide variety of dishes. With multiple cooking modes and easy-to-use controls, the Instant Pot is perfect for busy families and home cooks.', 89.99, 4),
    (8, 'KitchenAid Artisan Stand Mixer', 'The KitchenAid Artisan Stand Mixer is a must-have for any serious home baker. With a powerful motor and versatile attachments, this stand mixer can handle any baking task with ease.', 399.99, 4),
    (9, 'Coleman Sundome Tent', 'The Coleman Sundome Tent is a popular choice for camping and outdoor enthusiasts. With a spacious interior and easy setup, this tent is perfect for weekend getaways and camping trips.', 99.99, 5),
    (10, 'Patagonia Better Sweater Fleece Jacket', 'The Patagonia Better Sweater Fleece Jacket is a popular choice for outdoor enthusiasts and urban adventurers alike. Made from 100% recycled materials, this jacket is both stylish and sustainable.', 149.99, 2);

-- Générer 10 achats pour l'utilisateur 1 (acheteur)
INSERT INTO purchase (id, date, user_id) VALUES
    (1, '2023-03-23 12:00:00', 1),
    (2, '2023-03-24 15:30:00', 1),
    (3, '2023-03-26 11:45:00', 1),
    (4, '2023-03-27 14:15:00', 1),
    (5, '2023-03-28 10:00:00', 1),
    (6, '2023-03-29 16:00:00', 1),
    (7, '2023-03-30 13:30:00', 1),
    (8, '2023-04-01 09:00:00', 1),
    (9, '2023-04-02 11:00:00', 1),
    (10, '2023-04-03 17:00:00', 1);

-- Générer des articles achetés pour chaque achat
INSERT INTO purchase_item (id, quantity, price, article_id, purchase_id) VALUES
    (1, 2, 999.99, 1, 1),
    (2, 1, 899.99, 2, 1),
    (3, 1, 69.99, 3, 2),
    (4, 1, 99.99, 4, 3),
    (5, 1, 12.99, 5, 4),
    (6, 1, 39.99, 6, 4),
    (7, 1, 89.99, 7, 5),
    (8, 1, 399.99, 8, 6),
    (9, 2, 99.99, 9, 7),
    (10, 1, 149.99, 10, 8),
    (11, 1, 999.99, 1, 9),
    (12, 1, 69.99, 3, 9),
    (13, 1, 39.99, 6, 10),
    (14, 1, 99.99, 4, 10);
