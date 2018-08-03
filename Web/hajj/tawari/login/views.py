from django.shortcuts import render,redirect
from login.models import admin,benevole
from django.http import JsonResponse

# Create your views here.
def index(request):

		if request.method=="POST":
			user=admin.objects.filter(email=request.POST.get('Email'),password=request.POST.get('Password1'))
			if  not user:
				return redirect('/')
			else:
				return redirect('/dashboard')
		else:
			return redirect('/')

def mob_log(request):
		benevole.objects.create(email=request.POST.get('Email'),password=request.POST.get('Password1'))
		if request.method=="POST":
			user=benevole.objects.filter(email=request.POST.get('Email'),password=request.POST.get('Password1'))
			if  not user:
				return JsonResponse({'reponse':False})
			else:
				return JsonResponse({'reponse':True,'user':user})
		else:
			return redirect('/')
	