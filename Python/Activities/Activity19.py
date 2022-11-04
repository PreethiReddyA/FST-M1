# Using Pandas:

# Write the following data into an excel file:

# FirstName	LastName	Email	PhoneNumber
# Satvik	Shah	satshah@example.com	4537829158
# Avinash	Kati	avinashk@example.com	5892184058
# Lahri	Rath	lahri.rath@example.com	4528727830





import pandas 
from pandas import ExcelFile
from pandas import ExcelWriter

data={
    "FirstName":["Sativk","Avinash","Lahri"],
    "LastName":["Shah","Kati","Rath"],
    "Email":["SatShah@example.com","AviKati@example.com","LahRath@example.com"],
    "PhoneNumber":["8721902764","1892037180","9018736236"],
}

dataframe=pandas.DataFrame(data)
print(dataframe)

writer = ExcelWriter('sample.xlsx')
dataframe.to_excel(writer, 'Sheet1', index = False)
 
# Commit data to the Excel file
writer.save()