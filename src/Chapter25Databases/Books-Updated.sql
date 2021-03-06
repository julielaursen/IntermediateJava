DROP TABLE authorISBN;
DROP TABLE titles;
DROP TABLE authors;

CREATE TABLE authors (
   authorID NUMBER GENERATED ALWAYS AS IDENTITY NOT NULL,
   firstName varchar2(20) NOT NULL,
   lastName varchar2(30) NOT NULL,
   CONSTRAINT author_id_pk PRIMARY KEY(authorID)
);

CREATE TABLE titles (
   isbn varchar2(20) NOT NULL,
   title varchar2(100) NOT NULL,
   editionNumber NUMBER NOT NULL,
   copyright varchar2(4) NOT NULL,
   CONSTRAINT isbn_pk PRIMARY KEY(isbn)
);

CREATE TABLE authorISBN (
   authorID NUMBER NOT NULL,
   isbn varchar2(20) NOT NULL,
   CONSTRAINT author_isbn_pk PRIMARY KEY (authorID, isbn),
   FOREIGN KEY (authorID) REFERENCES authors (authorID), 
   FOREIGN KEY (isbn) REFERENCES titles (isbn)
);

INSERT INTO authors (firstName,lastName)
VALUES 
   ('Paul','Deitel');

INSERT INTO authors (firstName,lastName)
VALUES 
   ('Harvey','Deitel');

INSERT INTO authors (firstName,lastName)
VALUES
   ('Abbey','Deitel');

INSERT INTO authors (firstName,lastName)
VALUES
   ('Dan','Quirk');

INSERT INTO authors (firstName,lastName)
VALUES
   ('Michael','Morgano');

INSERT INTO titles (isbn,title,editionNumber,copyright)
VALUES
   ('0132151006','Internet ' || chr(38) || ' World Wide Web How to Program',5,'2012');

INSERT INTO titles (isbn,title,editionNumber,copyright)
VALUES
   ('0133807800','Java How to Program',10,'2015');

INSERT INTO titles (isbn,title,editionNumber,copyright)
VALUES
   ('0132575655','Java How to Program, Late Objects Version',10,'2015');

INSERT INTO titles (isbn,title,editionNumber,copyright)
VALUES
   ('013299044X','C How to Program',7,'2013');

INSERT INTO titles (isbn,title,editionNumber,copyright)
VALUES
   ('0132990601','Simply Visual Basic 2010',4,'2013');

INSERT INTO titles (isbn,title,editionNumber,copyright)
VALUES
   ('0133406954','Visual Basic 2012 How to Program',6,'2014');

INSERT INTO titles (isbn,title,editionNumber,copyright)
VALUES
   ('0133379337','Visual C# 2012 How to Program',5,'2014');

INSERT INTO titles (isbn,title,editionNumber,copyright)
VALUES
   ('0136151574','Visual C++ How to Program',2,'2008');

INSERT INTO titles (isbn,title,editionNumber,copyright)
VALUES
   ('0133378713','C++ How to Program',9,'2014');

INSERT INTO titles (isbn,title,editionNumber,copyright)
VALUES
   ('0133764036','Android How to Program',2,'2015');

INSERT INTO titles (isbn,title,editionNumber,copyright)
VALUES
   ('0133570924','Android for Programmers: An App-Driven Approach, Volume 1',2,'2014');

INSERT INTO titles (isbn,title,editionNumber,copyright)
VALUES
   ('0132121360','Android for Programmers: An App-Driven Approach',1,'2012');

INSERT INTO authorISBN (authorID, isbn)
VALUES
   (1,'0132151006');

INSERT INTO authorISBN (authorID, isbn)
VALUES
   (2,'0132151006');

INSERT INTO authorISBN (authorID, isbn)
VALUES
   (3,'0132151006');

INSERT INTO authorISBN (authorID, isbn)
VALUES
   (1,'0133807800');

INSERT INTO authorISBN (authorID, isbn)
VALUES
   (2,'0133807800');

INSERT INTO authorISBN (authorID, isbn)
VALUES
   (1,'0132575655');

INSERT INTO authorISBN (authorID, isbn)
VALUES
   (2,'0132575655');

INSERT INTO authorISBN (authorID, isbn)
VALUES
   (1,'013299044X');

INSERT INTO authorISBN (authorID, isbn)
VALUES
   (2,'013299044X');

INSERT INTO authorISBN (authorID, isbn)
VALUES
   (1,'0132990601');

INSERT INTO authorISBN (authorID, isbn)
VALUES
   (2,'0132990601');

INSERT INTO authorISBN (authorID, isbn)
VALUES
   (3,'0132990601');

INSERT INTO authorISBN (authorID, isbn)
VALUES
   (1,'0133406954');

INSERT INTO authorISBN (authorID, isbn)
VALUES
   (2,'0133406954');

INSERT INTO authorISBN (authorID, isbn)
VALUES
   (3,'0133406954');

INSERT INTO authorISBN (authorID, isbn)
VALUES
   (1,'0133379337');

INSERT INTO authorISBN (authorID, isbn)
VALUES
   (2,'0133379337');

INSERT INTO authorISBN (authorID, isbn)
VALUES
   (1,'0136151574');

INSERT INTO authorISBN (authorID, isbn)
VALUES
   (2,'0136151574');

INSERT INTO authorISBN (authorID, isbn)
VALUES
   (4,'0136151574');

INSERT INTO authorISBN (authorID, isbn)
VALUES
   (1,'0133378713');

INSERT INTO authorISBN (authorID, isbn)
VALUES
   (2,'0133378713');

INSERT INTO authorISBN (authorID, isbn)
VALUES
   (1,'0133764036');

INSERT INTO authorISBN (authorID, isbn)
VALUES
   (2,'0133764036');

INSERT INTO authorISBN (authorID, isbn)
VALUES
   (3,'0133764036');

INSERT INTO authorISBN (authorID, isbn)
VALUES
   (1,'0133570924');

INSERT INTO authorISBN (authorID, isbn)
VALUES
   (2,'0133570924');

INSERT INTO authorISBN (authorID, isbn)
VALUES
   (3,'0133570924');

INSERT INTO authorISBN (authorID, isbn)
VALUES
   (1,'0132121360');

INSERT INTO authorISBN (authorID, isbn)
VALUES
   (2,'0132121360');

INSERT INTO authorISBN (authorID, isbn)
VALUES
   (3,'0132121360');

INSERT INTO authorISBN (authorID, isbn)
VALUES
   (5,'0132121360');

 COMMIT;