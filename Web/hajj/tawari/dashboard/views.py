from django.shortcuts import render
from dashboard.models import Hajjdata
from django.http import JsonResponse
from django.core import serializers
from login.models import benevole
from dashboard.models import EmrHist
# Create your views here.
def dashboard(request):
	return render(request,'landing_page.html')

def hojaj_table(request):
	hajjorangelist=[]
	hajjredlist=[]
	count=0
	for row in Hajjdata.objects.raw('select ID,FIRST_NAME,AGE,PASSPORT_ISSUE_PLA,GENDER from hajjdata '):
		row_haj={'name':row.first_name,'age':row.age,'nationality':row.passport_issue_pla,'gender':row.gender}
		count=count+1
		if count>10:
			hajjorangelist.append(row_haj)
		else:
			hajjredlist.append(row_haj)

		if count>600:
			break
	return render(request,'list_hojaj.html',{'hajj_red_list':hajjredlist,'hajj_orange_list':hajjorangelist})

def emergencycases(request):
	table=[]
	for row in EmrHist.objects.raw('select * from dashboard_emrhist'):
		row_hajj={'id_hajj':row.hajj_id,'voulont_id':row.voulont_id,'date':row.date,'desc':row.description}
		table.append(row_hajj)
	return render(request,'emergency.html',{'emrhist':table})

def volunteers_table(request):
	volunteers=[]
	for row in benevole.objects.all():
		row_hajj={'id':row.id,'phone':row.phone,'email':row.email,'firstname':row.firstname,'lastname':row.lastname,'state':row.state}
		volunteers.append(row_hajj)

	return render(request,'list_volunteers.html',{'volunteers':volunteers})
	
