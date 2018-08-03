from django.urls import re_path
from . import views

app_name='dashboard'
urlpatterns = [
	re_path(r'^$', views.dashboard),
	re_path(r'hojaj_table$', views.hojaj_table,name="hojaj_table"),
	re_path(r'emergency_cases$', views.emergencycases,name="emergency_cases"),
	re_path(r'volunteers_table$', views.volunteers_table,name="volunteers_table"),
]