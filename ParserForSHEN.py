from bs4 import BeautifulSoup
import urllib3

def pars(url):
	http = urllib3.PoolManager()

	#url = 'https://www.dvfu.ru/schools/school_of_natural_sciences/structures/department/cluster-physics-and-mathematics-departments/'
	#url = 'https://www.dvfu.ru/schools/school_of_natural_sciences/structures/department/the-chemical-cluster-of-departments/'
	response = http.request('GET', url)
	soup = BeautifulSoup(response.data)

	#print('---------------------------------------------')
	#print(soup.find_all('table')[0].find_all('td'))
	#print('---------------------------------------------')

	data = []
	table = soup.find('table')
	table_body = table.find('tbody')

	rows = table_body.find_all('tr')
	for row in rows:
		cols = row.find_all('td')
		cols = [ele.text.strip() for ele in cols]
		data.append([ele for ele in cols if ele]) # Get rid of empty values

	m_data = []

	for j in range(len(data)-1):
		i = j+1
		data_ = dict.fromkeys(['Name', 'Post', 'Phone', 'Email', 'School', 'Department'])

		data_['School'] = 'ШЕН'
		data_['Department'] = data[i][0]
		data_['Post'] = data[i][1].split('\n')[0]
		data_['Name'] = data[i][1].split('\n')[1]


		if (data[i][2].find('Тел.') > 0):
			temp = data[i][2][data[i][2].find('Тел.')+6:data[i][2].find('Тел.')+23].split()
			temp[1] = temp[1][1:4]
			temp = '-'.join(temp)
			data_['Phone'] = temp

		if (data[i][2].find('E-mail:') > 0):
			temp = data[i][2][data[i][2].find('E-mail:')+8:]
			data_['Email'] = temp

		m_data.append(data_)

	return m_data

#print('\n'.join(data_))
#print(m_data)

m_data = []

urls = ['https://www.dvfu.ru/schools/school_of_natural_sciences/structures/department/cluster-physics-and-mathematics-departments/',
'https://www.dvfu.ru/schools/school_of_natural_sciences/structures/department/the-cluster-of-biological-departments/',
'https://www.dvfu.ru/schools/school_of_natural_sciences/structures/department/the-chemical-cluster-of-departments/',
'https://www.dvfu.ru/schools/school_of_natural_sciences/structures/department/the-cluster-of-the-departments-of-earth-sciences/']



with open('out.txt', 'w') as f:
	for u in urls:
		for i in pars(u):
			s = ''
			s += '{\n'
			
			for j in i.keys():
				if (i[j] != None):
					s += '    '
					s += j + ': "'+i[j]+'"'

					s += '\n'


			s = s[0:len(s)-1]
			s += '\n} '
			f.write(s)

