import json

from django.http import HttpResponse
from django.shortcuts import render


def index(request):
    return HttpResponse("Hello, world!")

def indexRender(request):
    return render(request, 'index.html', {})


with open("json_data.json", 'rb') as read_file_json:
    data = json.load(read_file_json)
    Name = data['Name']
    Rector_name = data['Rector']['Firstname']
    Rector_surname = data['Rector']['Lastname']
    Location_index = data['Location']['index']
    Location_city = data['Location']['city']
    Location_address = data['Location']['address']
    num_administrative = len(data['Subdivision']['Administrative'])
    num_educational = len(data['Subdivision']['Educational'])
    num_faculty = len(data['Subdivision']['Educational'][0]['Faculty'])

    Num_programm = data['Subdivision']['Educational'][0]['Faculty'][0]['Programs'][0]['Num']
    Name_programm = data['Subdivision']['Educational'][0]['Faculty'][0]['Programs'][0]['Name']
    Discipline = data['Subdivision']['Educational'][0]['Faculty'][0]['Programs'][0]['discipline']
    Year = data['Subdivision']['Educational'][0]['Faculty'][0]['Programs'][0]['Year']['year']
    am_group = len(data['Subdivision']['Educational'][0]['Faculty'][0]['Programs'][0]['Year']['groups'])

    group = data['Subdivision']['Educational'][0]['Faculty'][0]['Programs'][0]['Year']['groups'][0]

    department = data['Subdivision']['Educational'][0]
    department_workers = data['Subdivision']['Educational'][0]['Staff'][0]
    department_faculty = data['Subdivision']['Educational'][0]['Faculty'][0]['Programs'][0]

    Structure_name = data['Name']
    Structure_administrative = data['Subdivision']['Administrative']
    Structure_educational = data['Subdivision']['Educational']

dict_Structure = {'Name': Structure_name,
                  'administrative': Structure_administrative,
                  'educational': Structure_educational}

dict_department = {'department': department,
                   'department_workers': department_workers,
                   'department_faculty': department_faculty}

dict_group = {'group': group}

dict_ITMO = {'Name': Name,
             'Rector': [Rector_name, Rector_surname],
             'Location': {'index': Location_index, 'city': Location_city, 'address': Location_address},
             'num_administrative': num_administrative,
             'num_educational': num_educational,
             'num_faculty': num_faculty
             }

dict_discipline = {'Num_programm': Num_programm,
                   'Name_programm': Name_programm,
                   'Discipline': Discipline,
                   'Year': Year,
                   'am_group': am_group
                   }


def universityInfo(request):
    return render(request, 'universityInfo.html', dict_ITMO)


def disciplineInfo(request):
    return render(request, 'disciplineInfo.html', dict_discipline)


def group(request):
    return render(request, 'groupsInfo.html', dict_group)


def departmentsInfo(request):
    return render(request, 'departmentsInfo.html', dict_department)


def universityStructure(request):
    return render(request, 'universityStructure.html', dict_Structure)
