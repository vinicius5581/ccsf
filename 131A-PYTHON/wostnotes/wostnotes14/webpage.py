"""
CS131A Python Programming.  Spring 2015. Ulf Wostner.
Dan at the computer in class.

Simple webpage template.

"""


TEMPLATE = """
<html>
	<head>
		<title>
			{title:}
		</title>
	</head>
	<body>
		<h1>{header:}</h1>
	{content:}
		<hr>
	</body>
</html>
"""

d = dict()
d['title'] = 'My home page'
d['header'] = 'Downtown Pythonistas'
d['content'] = """She-bang, she-bang #! #!\n"""
d['content'] += """ <a href='http://en.wikipedia.org/wiki/Shebang_%28Unix%29'>
    wikipedia about the she-bang notation</a>"""


print(TEMPLATE.format(**d))
