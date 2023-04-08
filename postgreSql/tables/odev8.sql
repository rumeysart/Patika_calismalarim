--test veritabanınızda employee isimli sütun bilgileri id(INTEGER), 
--name VARCHAR(50), birthday DATE, email VARCHAR(100) olan bir tablo oluşturalım.
CREATE TABLE employee(
	id INTEGER PRIMARY KEY,
	first_name VARCHAR(50) NOT NULL,
	last_name VARCHAR(50) NOT NULL,
	birthday DATE,
	email VARCHAR(100)
);


--Oluşturduğumuz employee tablosuna 'Mockaroo' servisini kullanarak 50 adet
--veri ekleyelim.


insert into employee (id, first_name, last_name, birthday, email) values (1, 'Esmaria', 'Morrill', '1962-02-07', 'emorrill0@nih.gov');
insert into employee (id, first_name, last_name, birthday, email) values (2, 'Lexie', null, '1938-04-08', 'lvasyanin1@cam.ac.uk');
insert into employee (id, first_name, last_name, birthday, email) values (3, 'Bertrando', 'Gath', '1914-11-10', 'bgath2@nytimes.com');
insert into employee (id, first_name, last_name, birthday, email) values (4, 'Thea', 'Mahmood', '1916-03-10', 'tmahmood3@hostgator.com');
insert into employee (id, first_name, last_name, birthday, email) values (5, 'Christoph', 'Scourfield', '1968-12-14', 'cscourfield4@lycos.com');
insert into employee (id, first_name, last_name, birthday, email) values (6, 'Mallorie', 'Twatt', null, 'mtwatt5@wunderground.com');
insert into employee (id, first_name, last_name, birthday, email) values (7, 'Kinna', 'Abels', '1985-04-07', 'kabels6@cnn.com');
insert into employee (id, first_name, last_name, birthday, email) values (8, 'Lyndsay', 'Neville', '1978-04-15', 'lneville7@google.ca');
insert into employee (id, first_name, last_name, birthday, email) values (9, 'Karly', 'Scud', '1968-05-21', 'kscud8@cmu.edu');
insert into employee (id, first_name, last_name, birthday, email) values (10, 'Ernest', 'Micheli', '1978-11-25', 'emicheli9@github.io');
insert into employee (id, first_name, last_name, birthday, email) values (11, 'Nels', 'Fearne', '2009-04-25', 'nfearnea@gravatar.com');
insert into employee (id, first_name, last_name, birthday, email) values (12, 'Murielle', 'Cleen', '1937-07-28', 'mcleenb@cargocollective.com');
insert into employee (id, first_name, last_name, birthday, email) values (13, 'Carine', 'Eisold', '1915-04-06', 'ceisoldc@clickbank.net');
insert into employee (id, first_name, last_name, birthday, email) values (14, 'Mae', 'Mollitt', '1944-06-08', 'mmollittd@chicagotribune.com');
insert into employee (id, first_name, last_name, birthday, email) values (15, 'Walton', 'Hainsworth', '1986-08-06', 'whainsworthe@admin.ch');
insert into employee (id, first_name, last_name, birthday, email) values (16, 'Siegfried', 'Stenett', '1915-11-29', 'sstenettf@oaic.gov.au');
insert into employee (id, first_name, last_name, birthday, email) values (17, 'Jenilee', 'Hugues', '1918-01-08', 'jhuguesg@nba.com');
insert into employee (id, first_name, last_name, birthday, email) values (18, 'Jenica', 'McGeaney', null, 'jmcgeaneyh@ezinearticles.com');
insert into employee (id, first_name, last_name, birthday, email) values (19, 'Isabella', 'Brade', '1991-10-16', 'ibradei@etsy.com');
insert into employee (id, first_name, last_name, birthday, email) values (20, 'Fawn', 'Frenchum', '1911-03-18', 'ffrenchumj@wunderground.com');
insert into employee (id, first_name, last_name, birthday, email) values (21, 'Ekaterina', 'Perrigo', null, 'eperrigok@creativecommons.org');
insert into employee (id, first_name, last_name, birthday, email) values (22, 'Elisha', 'Riccione', '1911-09-12', 'ericcionel@narod.ru');
insert into employee (id, first_name, last_name, birthday, email) values (23, 'Packston', 'Ricketts', '1938-10-12', 'prickettsm@toplist.cz');
insert into employee (id, first_name, last_name, birthday, email) values (24, 'Karole', 'Buttrum', '1985-10-01', 'kbuttrumn@rakuten.co.jp');
insert into employee (id, first_name, last_name, birthday, email) values (25, 'Bentley', 'Burtonwood', '1913-05-03', 'bburtonwoodo@wufoo.com');
insert into employee (id, first_name, last_name, birthday, email) values (26, 'Kayle', 'Koeppe', null, 'kkoeppep@census.gov');
insert into employee (id, first_name, last_name, birthday, email) values (27, 'Helaine', 'Hesser', '1996-12-08', 'hhesserq@rambler.ru');
insert into employee (id, first_name, last_name, birthday, email) values (28, 'Kimberlyn', 'Reinhart', '1906-08-18', 'kreinhartr@1688.com');
insert into employee (id, first_name, last_name, birthday, email) values (29, 'Erwin', null, '1965-03-25', 'egreenroas@list-manage.com');
insert into employee (id, first_name, last_name, birthday, email) values (30, 'Judas', 'Brilon', '1948-03-02', 'jbrilont@mozilla.com');
insert into employee (id, first_name, last_name, birthday, email) values (31, 'Rik', 'Gaul', '1943-08-23', 'rgaulu@wisc.edu');
insert into employee (id, first_name, last_name, birthday, email) values (32, 'Elwood', 'Pattini', '1921-10-22', 'epattiniv@smugmug.com');
insert into employee (id, first_name, last_name, birthday, email) values (33, 'Shalne', 'Myhan', '1966-11-19', 'smyhanw@gizmodo.com');
insert into employee (id, first_name, last_name, birthday, email) values (34, 'Symon', null, '1991-09-28', 'sgrinstonx@tripadvisor.com');
insert into employee (id, first_name, last_name, birthday, email) values (35, 'Mandel', 'Cape', '1921-11-27', 'mcapey@noaa.gov');
insert into employee (id, first_name, last_name, birthday, email) values (36, 'Ruddie', 'Tomaino', '1974-03-20', 'rtomainoz@umn.edu');
insert into employee (id, first_name, last_name, birthday, email) values (37, 'Inness', 'Rodder', '1929-08-24', 'irodder10@lycos.com');
insert into employee (id, first_name, last_name, birthday, email) values (38, 'Honey', 'Hatter', '2008-11-10', 'hhatter11@rakuten.co.jp');
insert into employee (id, first_name, last_name, birthday, email) values (39, 'Cosette', 'Simonson', null, 'csimonson12@zimbio.com');
insert into employee (id, first_name, last_name, birthday, email) values (40, 'Meg', 'Easen', '1921-05-27', 'measen13@umn.edu');
insert into employee (id, first_name, last_name, birthday, email) values (41, 'Davon', 'Parnham', null, 'dparnham14@cbc.ca');
insert into employee (id, first_name, last_name, birthday, email) values (42, 'Rene', 'Billham', '1920-01-31', 'rbillham15@cbc.ca');
insert into employee (id, first_name, last_name, birthday, email) values (43, 'Waly', null, '1954-05-25', 'wgwyn16@ifeng.com');
insert into employee (id, first_name, last_name, birthday, email) values (44, 'Tandie', null, '1959-03-17', 'tiltchev17@earthlink.net');
insert into employee (id, first_name, last_name, birthday, email) values (45, 'Carlos', 'Atmore', '1952-10-01', 'catmore18@wikimedia.org');
insert into employee (id, first_name, last_name, birthday, email) values (46, 'Whitaker', null, null, 'wdusting19@homestead.com');
insert into employee (id, first_name, last_name, birthday, email) values (47, 'Melany', 'Justice', '1988-08-31', 'mjustice1a@yellowbook.com');
insert into employee (id, first_name, last_name, birthday, email) values (48, 'Lelia', 'Canlin', '2008-06-15', 'lcanlin1b@state.tx.us');
insert into employee (id, first_name, last_name, birthday, email) values (49, 'Alli', 'Dziwisz', '1965-01-26', 'adziwisz1c@gizmodo.com');
insert into employee (id, first_name, last_name, birthday, email) values (50, 'Robin', 'Lancley', '1958-07-19', 'rlancley1d@army.mil');
	


--Sütunların her birine göre diğer sütunları güncelleyecek 5 adet 
--UPDATE işlemi yapalım.

UPDATE employee
SET name = 'Robert'
WHERE email ='epattiniv@smugmug.com'
RETURNING*;

UPDATE employee
SET name= 'Queen'
WHERE name LIKE 'R%'
RETURNING*;

UPDATE employee
SET email = 'bakasta@wizard.king'
WHERE id = 12
RETURNING*;

UPDATE employee
SET name= 'Smurfs'
WHERE name LIKE 'A%'
RETURNING*;

UPDATE employee
SET birtday = '1907-03-10'
WHERE name = 'Meg'
RETURNING*;


--Sütunların her birine göre ilgili satırı silecek 5 adet 
--DELETE işlemi yapalım.

DELETE FROM employee
WHERE name ='Robin'
RETURNING*;

DELETE FROM employee
WHERE id= 11
RETURNING*;

DELETE FROM employee
WHERE email = 'mcapey@noaa.gov'
RETURNING*;

DELETE FROM employee
WHERE id= 29
RETURNING*;

DELETE FROM employee
WHERE birtday ='1921-05-27'
RETURNING*;



