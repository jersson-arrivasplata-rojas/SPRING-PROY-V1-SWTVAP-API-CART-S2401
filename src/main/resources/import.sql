INSERT INTO "public"."swtvap_categories" (id, name, status) VALUES (1,'Madera Colombina', 1);
INSERT INTO "public"."swtvap_categories" (id, name, status) VALUES (2,'Madera Pre-Colombina', 1);
INSERT INTO "public"."swtvap_categories" (id, name, status) VALUES (3,'Madera Post-Colombina', 1);


INSERT INTO "public"."swtvap_products" (id, category_id, code, name, description, price, stock, stock_min, status) VALUES (1, 1, 'PRODUCT-A00001', 'Madera de Cedro', 'Madera de Cedro', 1000, 100, 10, 1);
INSERT INTO "public"."swtvap_products" (id, category_id, code, name, description, price, stock, stock_min, status) VALUES (2, null, 'PRODUCT-A00002', 'Madera de Pino', 'Madera de Pino', 500, 100, 10, 1);
INSERT INTO "public"."swtvap_products" (id, category_id, code, name, description, price, stock, stock_min, status) VALUES (3, null, 'PRODUCT-A00003', 'Madera de Roble', 'Madera de Roble', 2000, 100, 10, 1);
INSERT INTO "public"."swtvap_products" (id, category_id, code, name, description, price, stock, stock_min, status) VALUES (4, 1, 'PRODUCT-A00004', 'Madera de Caoba', 'Madera de Caoba', 3000, 100, 10, 1);
INSERT INTO "public"."swtvap_products" (id, category_id, code, name, description, price, stock, stock_min, status) VALUES (5, 1, 'PRODUCT-A00005', 'Madera de Nogal', 'Madera de Nogal', 4000, 100, 10, 1);
INSERT INTO "public"."swtvap_products" (id, category_id, code, name, description, price, stock, stock_min, status) VALUES (6, 1, 'PRODUCT-A00006', 'Madera de Teca', 'Madera de Teca', 5000, 100, 10, 1);
INSERT INTO "public"."swtvap_products" (id, category_id, code, name, description, price, stock, stock_min, status) VALUES (7, 1, 'PRODUCT-A00007', 'Madera de Cerezo', 'Madera de Cerezo', 6000, 100, 10, 1);


INSERT INTO "public"."swtvap_carts" (id, code, cart_date) VALUES (1, 'CART_00000001', '2021-01-01');


INSERT INTO "public"."swtvap_carts_details" (id, cart_id, product_id, quantity) VALUES (1, 1, 1, 1);
INSERT INTO "public"."swtvap_carts_details" (id, cart_id, product_id, quantity) VALUES (2, 1, 1, 2);
INSERT INTO "public"."swtvap_carts_details" (id, cart_id, product_id, quantity) VALUES (3, 1, 1, 3);
INSERT INTO "public"."swtvap_carts_details" (id, cart_id, product_id, quantity) VALUES (4, 1, 1, 4);
INSERT INTO "public"."swtvap_carts_details" (id, cart_id, product_id, quantity) VALUES (5, 1, 1, 1);
INSERT INTO "public"."swtvap_carts_details" (id, cart_id, product_id, quantity) VALUES (6, 1, 1, 1);
INSERT INTO "public"."swtvap_carts_details" (id, cart_id, product_id, quantity) VALUES (7, 1, 1, 1);
