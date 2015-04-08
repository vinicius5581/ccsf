/* Osmar Santana */

\W    /* enable warnings! */

use   a_vets;

/*  TASK 00 */ 
select user(), current_date(), version(), @@sql_mode\G

/*  TASK 01 */
select cl_id, cl_name_last from vt_clients where cl_id not in (select cl_id from vt_animals);

/*  TASK 02 */
select cl_id, cl_name_last from vt_clients where cl_id in (select cl_id from vt_animals);

/*  TASK 03 */
select cl_id, cl_name_last from vt_clients where cl_id in (select cl_id from vt_animals where an_type in  ('hamster', 'capybara', 'porcupine', 'dormouse'));

/*  TASK 04 */
select cl_id, cl_name_last from vt_clients where cl_id in (select cl_id from vt_animals where an_type not in  ('snake', 'chelonian', 'crocodilian','lizard'));

/*  TASK 05 */
select an_id, an_name 
from vt_animals 
join vt_exam_headers using (an_id)
join vt_staff using(stf_id) where stf_job_title = 'vet assnt';

/*  TASK 06 */
select cl_id, cl_name_last, an_id, an_name, an_type, ex_id
from vt_clients 
right join vt_animals using (cl_id)
left join vt_exam_headers using (an_id) where ex_id is null
order by cl_id, an_id;

/*  TASK 07 */
select cl_id, cl_name_last, an_id, an_name, an_type, ex_id
from vt_clients 
full join vt_animals using (cl_id)
left join vt_exam_headers using (an_id) where ex_id is null
order by cl_id, an_id;

/*  TASK 08 */
select cl_id, cl_name_last
from vt_clients 
join vt_animals using (cl_id)
where an_type in ('snake', 'chelonian', 'crocodilian','lizard','hamster', 'capybara', 'porcupine', 'dormouse');


