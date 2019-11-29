#from django.shortcuts import render
from django.http import HttpResponse
import os
import json
from django.conf import settings

# Create your views here.

def index(request):
    file_ = open(os.path.join(settings.BASE_DIR, 'googleLanguages.json'))
    data = json.load(file_)
    return HttpResponse(f'This is the contents of the file: {data}')
