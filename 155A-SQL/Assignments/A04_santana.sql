/* Osmar Santana */

\W    /* enable warnings! */

use   a_vets;

/*  TASK 00 */ 
select user(), current_date(), version(), @@sql_mode\G

/*  TASK 01 */
SELECT distinct 
	cl_id as "client id", 
	cl_name_last as "last name", 
	an_type as "animal type" 
FROM vt_clients 
JOIN vt_animals USING (cl_id);

/*  TASK 02 */
SELECT distinct ex_id as "exam id", ex_date as "ex_date", srv_id as "service id", ex_fee as "fee charged", an_type
FROM vt_exam_headers  eh
JOIN vt_exam_details  ed USING (ex_id)
JOIN vt_animals       an ON eh.an_id = an.an_id
WHERE an_type IN ('hamster', 'capybara', 'porcupine', 'dormouse') 
ORDER BY ex_id, srv_id;


/*  TASK 03 */

SELECT stf_id, concat(stf_name_first,' ',stf_name_last) as staff,ex_date
FROM vt_exam_headers eh
JOIN vt_staff USING (stf_id)
JOIN vt_animals an ON eh.an_id = an.an_id
WHERE an_type NOT IN ('snake', 'chelonian', 'crocodilian','lizard')
ORDER BY ex_date;

/*  TASK 04 */

SELECT cl_id as "client id", ex_id as "exam id", stf_id as "staff person id", srv_id as "service id", srv_desc as "service description", srv_list_price as "service list price", ex_fee as "fee charged"
FROM vt_animals
JOIN vt_exam_headers USING (an_id)
JOIN vt_exam_details USING (ex_id)
JOIN vt_services USING (srv_id)
where ex_fee < (srv_list_price / 2)
ORDER BY stf_id, ex_id, srv_id;

/*  TASK 05 */

SELECT ex_id, ex_fee, ex_desc, srv_desc, an_id
FROM vt_exam_headers
JOIN vt_exam_details USING (ex_id)
JOIN vt_services USING (srv_id)
WHERE ex_fee BETWEEN 50.00 and 100.00
ORDER BY srv_id, ex_fee;

/*  TASK 06 */

SELECT DISTINCT cl_id, cl_name_last
FROM vt_clients
JOIN vt_animals USING (cl_id)
WHERE an_type = 'cat'
ORDER BY cl_id;

/*  TASK 07 */

SELECT DISTINCT cl_id, cl_name_last 
FROM vt_clients
JOIN vt_animals USING (cl_id)
WHERE an_type != 'cat'
ORDER BY cl_id;

/*  TASK 08 */

SElECT DISTINCT cl_id, cl_name_last
FROM vt_clients
JOIN vt_animals USING (cl_id)
WHERE an_type IN ('hamster', 'capybara', 'porcupine', 'dormouse')
ORDER BY cl_id;

/*  TASK 09 */

SElECT DISTINCT cl_id, cl_name_last
FROM vt_clients
JOIN vt_animals USING (cl_id)
WHERE an_type NOT IN ('hamster', 'capybara', 'porcupine', 'dormouse')
ORDER BY cl_id;




/*  TASK 10 */
