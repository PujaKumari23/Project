#project aim is to find the relation between corona virus and happiness of people living there
import pandas as pd
import numpy as np
import seaborn as sns
import matplotlib.pyplot as plt
print('required Modules are imported.')


#Task 2- IMPORTING COVID DATASET
confirmeddata = pd.read_csv('ConfirmedCases.csv')
confirmeddata.drop(['Lat', 'Long'], axis=1, inplace=True)
confirmed_data_aggregated = confirmeddata.groupby("Country/Region").sum()

confirmed_data_aggregated.loc['China'].plot()
confirmed_data_aggregated.loc['Italy'].plot()
confirmed_data_aggregated.loc['Spain'].plot()
confirmed_data_aggregated.loc['Uganda'].plot()
plt.legend()

DataCountry = list(confirmed_data_aggregated.index)
max_infection_rates = []
for c in DataCountry :
    max_infection_rates.append(confirmed_data_aggregated.loc[c].diff().max())
confirmed_data_aggregated['max infection rate'] = max_infection_rates

corona_data = pd.DataFrame(confirmed_data_aggregated['max infection rate'])

happinessdata = pd.read_csv("HappinessData.csv")

uselessColumnsDrop = ['Overall rank', 'Score', 'Generosity', 'Perceptions of corruption']
happinessdata.drop(uselessColumnsDrop, axis=1, inplace=True)

happinessdata.set_index(['Country or region'], inplace=True)

data = happinessdata.join(corona_data).copy()

data.corr()

plt.figure(1)
x1 = data['GDP per capita']
y1 = data['max infection rate']
sns.scatterplot(x1, np.log(y1))
#for more accurate data we use regplot
sns.regplot(x1, np.log(y1))
plt.show()

plt.figure(2)
x2 = data['Social support']
y2 = data['max infection rate']
sns.scatterplot(x2, np.log(y2))
sns.regplot(x2, np.log(y2))
plt.show()


plt.figure(3)
x3 = data['Healthy life expectancy']
y3 = data['max infection rate']
sns.scatterplot(x3, np.log(y3))
sns.regplot(x3, np.log(y3))
plt.show()

plt.figure(4)
x4 = data['Freedom to make life choices']
y4 = data['max infection rate']
sns.scatterplot(x4, np.log(y4))
sns.regplot(x4, np.log(y4))
plt.show()
