from github import Github
import json
#graphuviz
#pythonchart
#pythonplotting

# using username and password
g = Github("get", "a cheese")
pyth = str("python")
#uhh = g.search_repositories(query = "language:python created:2019-10-06..2019-10-07",)
google = g.search_repositories("org:google is:public created:2017-01-01..2017-12-31")
print("The {0:100}".format(str(g.get_rate_limit())))
i = 0
lang = ""
googleLRepos = {}

for repo in google:
    lang = repo.language
    if(i == 899):
        print("done")
        break
    if lang not in googleLRepos:
        googleLRepos[lang] = 1
        print("{0} repo count is: {1}".format(lang, str(googleLRepos[lang])))
    else:
        googleLRepos[lang] += 1
        print("{0} repo count is: {1}".format(lang, str(googleLRepos[lang])))
    #branch = repo.get_branch("master")
    #x = branch._rawData
    #y = x["commit"]
    #z = y["commit"]
    #d = z["author"]
   # c = d["date"]
   # print(repo.created_at)
    print(i)
    i += 1

google = g.search_repositories("org:google is:public created:2018-01-01..2018-12-31")
print("The {0:100}".format(str(g.get_rate_limit())))

for repo in google:
    lang = repo.language
    if(i == 899):
        print("done")
        break
    if lang not in googleLRepos:
        googleLRepos[lang] = 1
        print("{0} repo count is: {1}".format(lang, str(googleLRepos[lang])))
    else:
        googleLRepos[lang] += 1
        print("{0} repo count is: {1}".format(lang, str(googleLRepos[lang])))
    #branch = repo.get_branch("master")
    #x = branch._rawData
    #y = x["commit"]
    #z = y["commit"]
    #d = z["author"]
   # c = d["date"]
   # print(repo.created_at)
    print(i)
    i += 1

google = g.search_repositories("org:google is:public created:2019-01-01..2019-12-31")
print("The {0:100}".format(str(g.get_rate_limit())))

for repo in google:
    lang = repo.language
    if(i == 899):
        print("done")
        break
    if lang not in googleLRepos:
        googleLRepos[lang] = 1
        print("{0} repo count is: {1}".format(lang, str(googleLRepos[lang])))
    else:
        googleLRepos[lang] += 1
        print("{0} repo count is: {1}".format(lang, str(googleLRepos[lang])))
    #branch = repo.get_branch("master")
    #x = branch._rawData
    #y = x["commit"]
    #z = y["commit"]
    #d = z["author"]
   # c = d["date"]
   # print(repo.created_at)
    print(i)
    i += 1

print(i)
print(googleLRepos)
jsonV = json.dumps(googleLRepos)
f = open("googleLanguages.json", "x")
f.write(jsonV)
f.close()
print(jsonV)
