#from django.shortcuts import render
from django.http import HttpResponse
import os
import json
from django.conf import settings

def barchart(request):

    #instantiate a drawing object
    from . import charts
    d = charts.MyBarChartDrawing()

    #extract the request params of interest.
    #I suggest having a default for everything.
    if 'height' in request:
        d.height = int(request['height'])
    else:
        d.height = 500
    if 'width' in request:
        d.width = int(request['width'])
    else:
        d.width = 600
    
    if 'numbers' in request:
        strNumbers = request['numbers']
        numbers = list(map(int, strNumbers.split(',')))
        d.chart.data = [numbers]   #bar charts take a list-of-lists for data
    d.title.text = "Most Used Languages by Google Employees" 
    d.chart.x = 150
    d.chart.y = 100
    d.chart.barWidth = 50
    d.chart.barSpacing = 20
    d.chart.categoryAxis.categoryNames = request['categories']
  
    #get a GIF (or PNG, JPG, or whatever)
    binaryStuff = d.asString('gif')
    return HttpResponse(binaryStuff, 'image/gif')

# Create your views here.

def index(request):
    file_ = open(os.path.join(settings.BASE_DIR, 'googleEmpLanguages.json'))
    data = json.load(file_)
    useful_data = {x:data[x] for x in data.keys() if data[x] > 50}
    print(useful_data)
    req = {}
    req['numbers'] = ','.join(list(map(str, list(useful_data.values()))))
    req['categories'] = list(useful_data.keys())
    response = barchart(req)
    return HttpResponse(response, 'image/gif')