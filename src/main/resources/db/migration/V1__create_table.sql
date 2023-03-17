CREATE TABLE public."user" (
	id int NOT NULL GENERATED ALWAYS AS IDENTITY,
	username varchar NOT NULL,
	"password" varchar NOT NULL
);
CREATE TABLE public.articles (
	id int NOT NULL GENERATED ALWAYS AS IDENTITY,
	"name" varchar NULL
);
CREATE TABLE public.user_favorite (
	id_user int NOT NULL GENERATED ALWAYS AS IDENTITY,
	id_article int NOT NULL GENERATED ALWAYS AS IDENTITY
);
