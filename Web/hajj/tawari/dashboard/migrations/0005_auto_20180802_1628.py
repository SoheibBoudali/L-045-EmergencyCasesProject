# Generated by Django 2.0.7 on 2018-08-02 13:28

from django.db import migrations, models


class Migration(migrations.Migration):

    dependencies = [
        ('dashboard', '0004_hajjdata'),
    ]

    operations = [
        migrations.CreateModel(
            name='HajjDatta',
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
            ],
        ),
        migrations.DeleteModel(
            name='HajjData',
        ),
    ]
