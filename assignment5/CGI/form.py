#!/usr/bin/env python3
import cgi
import cgitb
cgitb.enable()
form = cgi.FieldStorage()
print("Content-Type: text/html")
print()
print("<html>")
print("<head><title>CGI Form Submission</title></head>")
print("<body>")
if "name" in form:
    name = form.getvalue("name")
    print("<h1>Hello, " + name + "!</h1>")
else:
    print("<h1>No name provided.</h1>")
print("</body>")
print("</html>")