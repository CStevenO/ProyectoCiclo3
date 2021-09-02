from sklearn.metrics import plot_confusion_matrix
from sklearn.metrics import confusion_matrix
from sklearn.metrics import precision_score
from sklearn.metrics import accuracy_score
from sklearn.metrics import recall_score
from sklearn.metrics import f1_score
from sklearn.metrics import r2_score
import matplotlib.pyplot as plt
import pandas

from sklearn.model_selection import train_test_split
from sklearn.svm import SVC

#Dataset
df = pandas.read_csv("car.csv")
print(df)
#Linealizacion del dataset
d = {'vhigh':0, 'high':1, 'med':2, 'low':3}
df["buying"] = df["buying"].map(d)
df["maint"] = df["maint"].map(d)
d = {"2":2,"3":3,"4":4,'5more':5}
df["doors"] = df["doors"].map(d)
d = {"2":2,"4":4,'more':5}
df["persons"] = df["persons"].map(d)
d = {'small':0,'med':1,'big':2}
df["lug_boot"] = df["lug_boot"].map(d)
d = {'low':0,'med':1,'high':2}
df["safety"] = df["safety"].map(d)
d = {'unacc':0,'acc':1,'good':2,'vgood':3}  #inaccesibles,accesibles,buenos,muy buenos
df["class"] = df["class"].map(d)
print(df)
#separacion de caracteristicas y destino
features = ["buying","maint","doors","persons","lug_boot","safety"]
X=df[features]
y=df["class"]
#entrenamiento
train_x, test_x, train_y, test_y = train_test_split(X, y, random_state=0)
clf = SVC(random_state=0)
clf.fit(train_x, train_y)

#vector de prediccion
y_pred = clf.predict(test_x)
# Confusion Matrix
macon = confusion_matrix(test_y, y_pred)
# Accuracy
exactitud = accuracy_score(test_y, y_pred)
# Recall
sensibilidad = recall_score(test_y, y_pred, average=None)
# Precision
precision = precision_score(test_y, y_pred, average=None)
#f1
f1 = f1_score(test_y, y_pred, average=None)
#R2
r2 = r2_score(test_y, clf.predict(test_x))
print("Exactitud: {}".format(exactitud))
print("Sensibilidad: {}".format(sensibilidad))
print("Precision: {}".format(precision))
print("F1: {}".format(f1))
print("R2: {}".format(r2))
#plot
cmd_obj = plot_confusion_matrix(clf,X=test_x,y_true=test_y, display_labels=['Inaccesibles','Accesibles','Buenos','Muy Buenos'])  
cmd_objn = plot_confusion_matrix(clf,X=test_x,y_true=test_y,normalize='true', display_labels=['Inaccesibles','Accesibles','Buenos','Muy Buenos'])  
cmd_obj.ax_.set_title("Matriz No-Normalizada")
cmd_objn.ax_.set_title("Matriz Normalizada")
cmd_obj.ax_.set_xlabel("Carros Predecidos")
cmd_objn.ax_.set_xlabel("Carros Predecidos")
cmd_obj.ax_.set_ylabel("Carros Reales")
cmd_objn.ax_.set_ylabel("Carros Reales")
plt.show()


