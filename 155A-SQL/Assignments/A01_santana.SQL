/* Osmar Santana */


\W   /* enable warnings! */

use a_testbed;

/*  TASK 00 */

select user(), current_date(), version(), @@sql_mode\G;

/*  TASK 01 */

Delete From a_testbed.zoo_2015
Where z_id > 100;
Select *
From a_testbed.zoo_2015;

/*  TASK 02 */

Insert Into a_testbed.zoo_2015  (z_id, z_name, z_type, z_cost, z_dob, z_acquired)   Values
   (100,'Brodie','Monkey', 1500.00, '2014-05-05','2014-09-01'),
   (101,'Lucy','Dog', 850.00, '2014-06-20','2014-10-15'),
   (102,'Billy','Spider', 20.99, '2014-01-17','2015-01-15');

/*  TASK 03 */

Insert Into a_testbed.zoo_2015  (z_id, z_name, z_type, z_cost, z_dob, z_acquired)   Values 
	(21, 'Larry','Lizard', 675.00, '2000-08-15 ','2010-04-15'), 
	(66, 'Martin','Marmot', 825.00, '2007-10-10 ','2014-04-01'), 
	(48, 'Nelli','null', 386.00, '2005-6-12 ','2009-10-14'), 
	(101, 'Apple', 'Dog', 1000.00, '2015-01-16', '2015-01-16'), 
	(102, 'Banana', 'Dog', 1000.00, '2015-01-16', '2015-01-16'), 
	(103, 'Citrus', 'Dog', 1000.00, '2015-01-16', '2015-01-16');


/*  TASK 04 */
Select z_name, z_type, z_id, z_cost, z_dob, z_acquired
From a_testbed.zoo_2015;

/*  TASK 05 */

Select z_type, z_name, z_cost
From a_testbed.zoo_2015
Order by z_type, z_name;

/*  TASK 06 */

Select z_id, z_name, z_dob
From a_testbed.zoo_2015
Where z_type = 'zebra';

/*  TASK 07 */

show tables;

/*  TASK 08 */

desc zoo_2015;

/*  TASK 09 */

show variables like 'char%';