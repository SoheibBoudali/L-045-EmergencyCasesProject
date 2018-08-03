from django.db import models

# Create your models here.
class Hajjdata(models.Model):
    id = models.IntegerField(db_column='ID',primary_key=True)  # Field name made lowercase. This field type is a guess.
    first_name = models.TextField(db_column='FIRST_NAME', blank=True, null=True)  # Field name made lowercase. This field type is a guess.
    season = models.IntegerField(db_column='SEASON', blank=True, null=True)  # Field name made lowercase. This field type is a guess.
    age = models.IntegerField(db_column='AGE', blank=True, null=True)  # Field name made lowercase. This field type is a guess.
    entry_date = models.IntegerField(db_column='ENTRY_DATE', blank=True, null=True)  # Field name made lowercase. This field type is a guess.
    exit_date = models.IntegerField(db_column='EXIT_DATE', blank=True, null=True)  # Field name made lowercase. This field type is a guess.
    entry_time = models.TextField(db_column='ENTRY_TIME', blank=True, null=True)  # Field name made lowercase. This field type is a guess.
    exit_time = models.TextField(db_column='EXIT_TIME', blank=True, null=True)  # Field name made lowercase. This field type is a guess.
    gender = models.TextField(db_column='GENDER', blank=True, null=True)  # Field name made lowercase. This field type is a guess.
    passport_issue_pla = models.TextField(db_column='PASSPORT_ISSUE_PLA', blank=True, null=True)  # Field name made lowercase. This field type is a guess.
    lk_visa_issue_plac = models.IntegerField(db_column='LK_VISA_ISSUE_PLAC', blank=True, null=True)  # Field name made lowercase. This field type is a guess.
    lk_nationality_des = models.IntegerField(db_column='LK_NATIONALITY_DES', blank=True, null=True)  # Field name made lowercase. This field type is a guess.
    lk_airline_name_le = models.TextField(db_column='LK_AIRLINE_NAME_LE', blank=True, null=True)  # Field name made lowercase. This field type is a guess.

    def __str__(self):
    	return self.first_name+'--'+self.age+'--'+self.passport_issue_pla

    class Meta:
        managed = False
        db_table = 'hajjdata'

class EmrHist(models.Model):
    
    hajj_id=models.TextField()
    voulont_id=models.IntegerField()
    date=models.IntegerField()
    description=models.TextField()
    
    def __str__(self):
        return self.description
 

        



