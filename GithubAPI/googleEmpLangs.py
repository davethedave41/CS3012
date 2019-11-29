from github import Github
import json

#graphuviz
#pythonchart
#pythonplotting

# using username and password
g = Github("with", "extra")
pyth = str("python")
#uhh = g.search_repositories(query = "language:python created:2019-10-06..2019-10-07",)
google = g.search_repositories("org:google is:public created:2019-01-01..2019-12-31")
print("The {0:100}".format(str(g.get_rate_limit())))
i = 0
lang = ""
googleLEmps = {}
employees = []
for repo in google:
    if(i == 899):
        print("done")
        break
    contributorList = repo.get_contributors()
    for helper in contributorList:
        if (i == 899):
            i += 1
            break
        if helper.id in employees or helper.company == None:
            i += 1
            continue
        elif "oogle" in helper.company:
            employees.append(helper.id)
            repoList = helper.get_repos()
            for hRepo in repoList:
                if(i == 899):
                    i += 1
                    break
                lang = hRepo.language
                if lang not in googleLEmps:
                    googleLEmps[lang] = 1
                    print("{0} repo count is: {1}".format(lang, str(googleLEmps[lang])))
                else:
                    googleLEmps[lang] += 1
                    print("{0} repo count is: {1}".format(lang, str(googleLEmps[lang])))
    i += 1
    #branch = repo.get_branch("master")
    #x = branch._rawData
    #y = x["commit"]
    #z = y["commit"]
    #d = z["author"]
   # c = d["date"]
   # print(repo.created_at)
print(googleLEmps)
f = open("googleEmpLanguages.json","x")
print(i)
f.write(json.dumps(googleLEmps))
f.close()
print(json.dumps(googleLEmps))


