#!/usr/local/bin/python3
print("Content-Type: text/html; charset=utf-8\n\n")

import cgitb; cgitb.enable()
import os.path, sys

# Fixed an error in the line below. Thanks to Dan!
# EDIT MYTABLELAB BELOW TO BE THE PATH TO YOUR tablelab IN YOUR HOME DIR.

MYTABLELAB = '/Users/yourlogname/and_so_on/tablelab'

MYPYDIR = os.path.dirname(MYTABLELAB)

DATAFILE = 'data/forbeswomen.tsv'

CAPTION = 'Table with Forbes Top 50 Women'

sys.path.append(MYPYDIR)
sys.path.append(MYTABLELAB)

import tablelab.page
import tablelab.tablemaker

tablelab.page.pagedict['title'] = 'Forbes: Top 50 Women'
tablelab.page.pagedict['css'] = 'css/downtownstyle.css'

tablelab.page.pagedict['content'] = tablelab.tablemaker.file2table(DATAFILE, CAPTION)

print(tablelab.page.PAGE_TEMPLATE.format(**tablelab.page.pagedict))

