"""
LAB10:tablelab  CS131A Python Programming. Downtown Section. Spring 2015.  
Copyright (c) 2015. Ulf Wostner <wostner@cyberprof.com>. 
All rights reserved. Do not share, post, or distribute in any form.
 
We write programs that can read files and turn them into tables.

>>> mylists = [['city', 'country'], ['SF', 'USA'], ['Paris', 'France'], ['Stockholm', 'Sweden']]
>>> mycaption = 'Great Cities'

>>> from tablemaker import lists2table

>>> mytable = lists2table(mylists, mycaption)

>>> print(mytable)
<table>
<caption>Great Cities</caption>
<tr><th>city</th><th>country</th></tr>
<tr><td>SF</td><td>USA</td></tr>
<tr><td>Paris</td><td>France</td></tr>
<tr><td>Stockholm</td><td>Sweden</td></tr>
</table>

And, we use our code to create a webpage.

For example, you will have

    ~/public_html/cgi-bin/tablelab/forbeswomen.py

 
 
GAMEPLAN:

    THE PYTHON MODULES in tablelab:

    (0) Tip: Print up the tests files and use them as reference when coding.

    (1) Read the tests in tests/testA_filetools.txt
        Write the code in filetools.py and check that tests/testA_filetools.txt work OK.

    (2) Repeat for the other test and python files, until all tests work OK.


    THE PYTHON CGI-BIN:

    (3) Create these directories on hills.

            ~/public_html/css
            ~/public_html/cgi-bin
            ~/public_html/cgi-bin/tablelab
            ~/public_html/cgi-bin/tablelab/data
    
    (4)  There are two files css/downtownstyle.css and cgiscript/forbeswomen.py
        Copy those files to so that you have

        ~/public_html/cgi-bin/tablelab/css/downtownstyle.css
        ~/public_html/cgi-bin/tablelab/forbeswomen.py

    (5) In the LAB10/datalab/data there is a file forbeswomen.tsv 
        Copy that file so that you have 
        ~/public_html/cgi-bin/tablelab/data/forbeswomen.tsv

    (6) EDIT the file ~/public_html/cgi-bin/tablelab/forbeswomen.py by changing one line, 
        so that the scrript can find exactly where in your PYLAB the tablelab is located.

    (7) Fix the permissions on all the files and directories in your public_html.
        See the file cgiscript/permissions.txt.  Your script will not work unless all permissions are correct.
        
    (8) Make sure your page is working.

        http://hills.ccsf.edu/~yourlogname/cgi-bin/tablelab/forbeswomen.py

 
PROGRAMS BY:
 
    *** REPLACE_THIS_WHOLE_LINE  in the file __init__.py with what you get on hills when running  exactly:    $ finger -msp `whoami`
 
DATE SUBMITTED:
    
    *** REPLACE_THIS_WHOLE_LINE  in the file __init__.py with what you get on hills when running  exactly:    $ date
 
 
HOW TO SUBMIT YOUR COMPLETED LAB:
 
        (0) EDIT this __init__.py file to replace the two lines above marked by ***.  That's 10 points, folks.
 
        (1) Make sure that all tests run without errors. Otherwise the lab is not completed.
 
        (2) As usual, create a tarball of the lab.
        
        (3) Reply to this email on hills using pine.  Attach the tarball.
 
        (4) DUE DATE: Monday, April 20, 2015 at 11:59 pm.

"""



