
/*  demo 01  */
create table tst_clients(
    cl_id           int    
  , cl_name_last    varchar(25)     not null
  , constraint tst_clients_pk primary key (cl_id)
);

create table tst_animals(
    an_id           int    
  , an_type         varchar(25)     not null   
  , cl_id           int             not null  
  , constraint tst_animals_clients_fk foreign key (cl_id) references tst_clients(cl_id)
  , constraint tst_animals_pk primary key (an_id)
  );

  
  /*  demo 02  */
Insert into tst_clients values (1, 'H__P__D__');
  Insert into tst_animals values (10, 'hedgehog', 1);
  Insert into tst_animals values (11, 'porcupine', 1);
  Insert into tst_animals values (12, 'dormouse', 1);

Insert into tst_clients values (2, 'H__P_____');
  Insert into tst_animals values (13, 'hedgehog', 2);
  Insert into tst_animals values (14, 'porcupine', 2);

Insert into tst_clients values (3, 'H_____D__');
  Insert into tst_animals values (15, 'hedgehog', 3);
  Insert into tst_animals values (16, 'dormouse', 3);

Insert into tst_clients values (4, 'H________');
  Insert into tst_animals values (17, 'hedgehog', 4);

Insert into tst_clients values (5, '___P__D__');
  Insert into tst_animals values (18, 'porcupine', 5);
  Insert into tst_animals values (19, 'dormouse', 5);

Insert into tst_clients values (6, '___P_____');
  Insert into tst_animals values (20, 'porcupine', 6);

Insert into tst_clients values (7, '______D__');
  Insert into tst_animals values (21, 'dormouse', 7);

Insert into tst_clients values (8, '_________');

-- And a few additional inserts
Insert into tst_clients values (9, 'H4_P2____');
  Insert into tst_animals values (22, 'hedgehog', 9);
  Insert into tst_animals values (23, 'hedgehog', 9);
  Insert into tst_animals values (24, 'hedgehog', 9);
  Insert into tst_animals values (25, 'hedgehog', 9);
  Insert into tst_animals values (26, 'porcupine', 9);
  Insert into tst_animals values (27, 'porcupine', 9);

Insert into tst_clients values (10, 'H3_______');
  Insert into tst_animals values (28, 'hedgehog', 10);
  Insert into tst_animals values (29, 'hedgehog', 10);
  Insert into tst_animals values (30, 'hedgehog', 10);

Insert into tst_clients values (11, 'dog');
  Insert into tst_animals values (31, 'dog', 11);


  /*  demo 03 */
  Select cl_id, cl_name_last
From tst_clients
Join tst_animals using(cl_id)
Where an_type = 'hedgehog';


/*  demo 04 */
Select cl_id, cl_name_last
From tst_clients
Where cl_id in (
    Select cl_id
    From tst_animals 
    Where an_type = 'hedgehog');


/*  demo 05 */
Select cl_id, cl_name_last
From tst_clients
Where cl_id in (
    Select cl_id
    From tst_animals 
    Where an_type = 'hedgehog')
AND cl_id in (
    Select cl_id
    From tst_animals 
    Where an_type = 'porcupine')
;


/*  demo 06 */
Select cl_id, cl_name_last
From tst_clients
Where cl_id in (
    Select cl_id
    From tst_animals 
    Where an_type = 'hedgehog')
AND cl_id NOT in (
    Select cl_id
    From tst_animals 
    Where an_type = 'porcupine')
;


/*  demo 07 */


/*  demo 08 */
Select cl_id, cl_name_last
From tst_clients
Where 
(
    cl_id in (
        Select cl_id
        From tst_animals 
        Where an_type = 'hedgehog')
    OR cl_id in (
        Select cl_id
        From tst_animals 
        Where an_type = 'porcupine')
)
AND cl_id in (
    Select cl_id
    From tst_animals 
    Where an_type = 'dormouse')
;


/*  demo 09 */
Select cl_id, cl_name_last
From tst_clients
Where 
(
    cl_id in (
        Select cl_id
        From tst_animals 
        Where an_type = 'hedgehog')
    OR cl_id in (
        Select cl_id
        From tst_animals 
        Where an_type = 'porcupine')
)
AND cl_id NOT in (
    Select cl_id
    From tst_animals 
    Where an_type = 'dormouse')
;

/*  demo 10 */
Select cl_id, cl_name_last
From tst_clients
Where 
    cl_id NOT in (
        Select cl_id
        From tst_animals 
        Where an_type = 'hedgehog');
