#Algoritmo para encontrar la definitiva de dos estudiantes
#eEntradas al proceso
NombreA=" "
AsignaturaA=" "
Nota1A=0
Nota2A=0
Nota3A=0
DefinitivaA=0

NombreB=" "
AsignaturaB=" "
Nota1B=0
Nota2B=0
Nota3B=0
DefinitivaB=0

#Proceso
NombreA=input("Ingrese nombre del estudiante A")
AsignaturaA=input("INgrese asignatura A")
Nota1A=float(input("INgrese Nota1"))
Nota2A=float(input("ingrese Nota2"))
Nota3A=float(input("ingrese Nota3"))
DefinitivaA= (Nota1A*0.30 + Nota2A*0.30 + Nota3A*0.40)

NombreB=input("Ingrese nombre del estudiante B")
AsignaturaB=input("INgrese asignatura B")
Nota1B=float(input("INgrese Nota1"))
Nota2B=float(input("ingrese Nota2"))
Nota3B=float(input("ingrese Nota3"))
DefinitivaB= (Nota1B*0.30 + Nota2B*0.30 + Nota3B*0.40)

#salida
print("El estudiante ", NombreA, "obtuvo en la asignatura de ", AsignaturaA, " una definitiva ", DefinitivaA)
print("El estudiante ", NombreB, "obtuvo en la asignatura de ", AsignaturaB, " una definitiva ", DefinitivaB)


