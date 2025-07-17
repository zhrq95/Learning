# -*- coding: utf-8 -*-
 
from django.http import HttpResponse
from django.shortcuts import render_to_response

def search_form(request):
    return render_to_response('search_form.html')
 

def search(request):  
    request.encoding='utf-8'
    if 'q' in request.GET:
        message = 'your search is: ' + request.GET['q']
    else:
        message = 'null'
    return HttpResponse(message)
