# Github API


Used PyGithub to access github API through python and Django, Pillow and ReportLab python libraries for the visualisationin in this project.
___
I was not able to have the key of the value as its legend/label and I ran out of time so I compromised by having a two different apps running in my django program, one which shows the graph by itself (/gitdata1) and the other screen shows the contents of the json file(/gitdata2).

With the github API I just went through the google repos for 2019 and checked the main language being used in the repo and iterated through the whole repo list for the year. I made a list of the most popular languages used and made a graph out of it.
For my second graph I iterated through google repos again but this time I went through all of the repos of users that worked for google (had google under their company attribute). Then I made another graph out of the most popular language used by __google employees__. 
___
EDIT: I clutched up let's get it. The graph now has labels of the corresponding language and its bar chart. I decicded to keep in the "two apps feature" and now have a total of four different screens. "/app1" and "/app4" are the chart classes that show a diagram with the data, "/app3" and "/app4" are the classes that show a dictionary with all the contents of the graph in text.

![img](https://github.com/davethedave41/LCA/blob/master/GithubAPI/Images/gitdata.PNG)

