# Generated by Django 2.0.7 on 2018-08-02 13:43

from django.db import migrations, models


class Migration(migrations.Migration):

    dependencies = [
        ('dashboard', '0006_auto_20180802_1637'),
    ]

    operations = [
        migrations.CreateModel(
            name='Hajj',
            fields=[
                ('id', models.AutoField(auto_created=True, primary_key=True, serialize=False, verbose_name='ID')),
                ('Hajj_mat', models.IntegerField()),
                ('FIRST_NAME', models.TextField()),
                ('SEASON', models.IntegerField()),
                ('AGE', models.IntegerField()),
                ('ENTRY_DATE', models.IntegerField()),
                ('EXIT_DATE', models.IntegerField()),
                ('ENTRY_TIME', models.IntegerField()),
                ('EXIT_TIME', models.IntegerField()),
                ('GENDER', models.CharField(max_length=255)),
                ('PASSPORT_ISSUE_PLA', models.TextField()),
                ('LK_VISA_ISSUE_PLAC', models.IntegerField()),
                ('LK_NATIONALITY_DES', models.IntegerField()),
                ('LK_AIRLINE_NAME_LE', models.TextField()),
            ],
        ),
    ]