# Generated by Django 2.0.7 on 2018-08-02 10:36

from django.db import migrations, models


class Migration(migrations.Migration):

    initial = True

    dependencies = [
    ]

    operations = [
        migrations.CreateModel(
            name='benevole',
            fields=[
                ('id', models.AutoField(auto_created=True, primary_key=True, serialize=False, verbose_name='ID')),
                ('email', models.EmailField(max_length=254)),
                ('firstname', models.TextField()),
                ('lastname', models.TextField()),
                ('password', models.TextField()),
                ('state', models.IntegerField()),
                ('phone', models.IntegerField()),
                ('age', models.IntegerField()),
                ('location', models.BigIntegerField()),
            ],
        ),
    ]