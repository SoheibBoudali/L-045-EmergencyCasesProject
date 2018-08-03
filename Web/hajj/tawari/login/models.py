from django.db import models

# Create your models here.
class admin(models.Model):

	email=models.EmailField()
	firstname=models.TextField()
	lastname=models.TextField()
	password=models.TextField()
	state =models.IntegerField()
	phone=models.IntegerField()	

#email='hajj@hack.com',firstname='Lahdir',lastname='akram',password='hajj_pass',state=1,phone=0781985716,age=21,location=22222222
	def __str__(self):
		return self.firstname

class benevole(models.Model):

	email=models.EmailField()
	firstname=models.TextField()
	lastname=models.TextField()
	password=models.TextField()
	state =models.IntegerField()
	phone=models.IntegerField()
	age=models.IntegerField()
	location=models.BigIntegerField()	

#email='hajj@hack.com',firstname='Lahdir',lastname='akram',password='hajj_pass',state=1,phone=0781985716,age=21,location=22222222
	def __str__(self):
		return self.firstname