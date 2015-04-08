/* Osmar Santana */

\W    /* enable warnings! */

use a_vets;

/*  TASK 00 */ 
select user(), current_date(), version(), @@sql_mode\G

/*  TASK 01 */
select
    stf_job_title as "Job tile",
    stf_name_last as "Last name"
from 
    vt_staff
join
    vt_staff_pay using (stf_id)
where
    stf_salary > 3000;



select 
    stf_job_title as "Job tile",
    stf_name_last as "Last name"
from 
    vt_staff 
where 
    stf_id in ( 
        select 
            stf_id 
        from 
            a_vets.vt_staff_pay
        where
            stf_salary > 3000
     );  

/*  TASK 02 */

select
    cl_id as "Client ID",
    an_id as "Animal ID",
    an_name as "Animal name",
    an_dob as "Animal DOB",
    an_type
from
    vt_animals
where 
    cl_id in(
        select 
	    cl_id
	from 
	    vt_clients
	where 
	    cl_state = 'NY'

	or
	    cl_state = 'MA'
    )
and an_type not in ("dog","bird","cat");
                 

/*  TASK 03 */

set @myvar = 250;
select 
    srv_id as "Service ID",
    ex_fee as "Fee charged",
    ex_id as "Exam ID",
    ex_date as "Exam date"
from vt_exam_details
join vt_exam_headers using (ex_id)
where 
    ex_fee > @myvar;

/*  TASK 04 */

set @animal_id = 15001;
select 
    cl_id as "Client ID",
    cl_name_last as "Client last name",
    an_type as "Animal Type",
    srv_id as "Service ID",
    srv_desc as "Service Description",
    ex_fee as "Fee charged"
from vt_clients 
join vt_animals using (cl_id)
join vt_exam_headers using (an_id)
join vt_exam_details using (ex_id)
join vt_services using (srv_id)
where vt_animals.an_id = @animal_id;

set @animal_id = 16004;
select 
    cl_id as "Client ID",
    cl_name_last as "Client last name",
    an_type as "Animal Type",
    srv_id as "Service ID",
    srv_desc as "Service Description",
    ex_fee as "Fee charged"
from vt_clients 
join vt_animals using (cl_id)
join vt_exam_headers using (an_id)
join vt_exam_details using (ex_id)
join vt_services using (srv_id)
where vt_animals.an_id = @animal_id;

set @animal_id = 15401;
select 
    cl_id as "Client ID",
    cl_name_last as "Client last name",
    an_type as "Animal Type",
    srv_id as "Service ID",
    srv_desc as "Service Description",
    ex_fee as "Fee charged"
from vt_clients 
join vt_animals using (cl_id)
join vt_exam_headers using (an_id)
join vt_exam_details using (ex_id)
join vt_services using (srv_id)
where vt_animals.an_id = @animal_id;


/*  TASK 05 */

select 
    srv_id,
    srv_desc
from 
    vt_services
where
    srv_desc like '%Feline%'
and
    srv_desc not like '%Dental%'
order by
    srv_type, srv_id; 
    


/*  TASK 06 */


select 
    cl_id,
    cl_name_last
from 
    vt_clients
where
    cl_id in (
        select 
            cl_id
        from 
            vt_animals
        where
            an_type in  ('snake', 'chelonian', 'crocodilian','lizard')
    );


/*  TASK 07 */

select 
    cl_id,
    cl_name_last
from 
    vt_clients
where
    cl_id in (
        select 
            cl_id
        from 
            vt_animals
        where
            an_type = 'bird'
    )
and
    cl_id in (
        select 
            cl_id
        from 
            vt_animals
        where
            an_type in  ('snake', 'chelonian', 'crocodilian','lizard')
    );

/*  TASK 08 */

select 
    cl_id,
    cl_name_last
from 
    vt_clients
where
    cl_id in (
        select 
            cl_id
        from 
            vt_animals
        where
            an_type = 'bird'
    )
and
    cl_id not in (
        select 
            cl_id
        from 
            vt_animals
        where
            an_type in  ('snake', 'chelonian', 'crocodilian','lizard')
    );

/*  TASK 09 */

select 
    cl_id,
    cl_name_last
from 
    vt_clients
where
    cl_id in (
        select 
            cl_id
        from 
            vt_animals
        where
            an_type = 'dog'
    )
and
    cl_id in (
        select 
            cl_id
        from 
            vt_animals
        where
            an_type in  ('hamster', 'capybara', 'porcupine', 'dormouse')
    );

