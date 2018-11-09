#Importamos la clase modelo
from mipaquete.modelo import *
#Creamos el objeto e tipo Empleado
e = Empleado()
e.agregar_nombre("Luis")
e.agregar_apellido("Benitez")
e.agregar_cedula("1175948392")
print(e.presentar_datos())#presentamos los datos

#Creamos el objeto e1 de tipo Empleado
e1 = EmpleadoPorHoras()
nombre = input("Ingrese su nombre:\n")
e1.agregar_nombre(nombre)
e1.agregar_apellido("Andrade")
e1.cedula = "1174859204"
e1.agregar_valor_hora(20.2)
e1.agregar_numero_horas(15)
print(e1.presentar_datos())#presentamos los datos

#Creamos el objeto e2 de tipo Empleado
e2 = EmpleadoFijo()
e2.agregar_sueldo_fijo(300.2)
e2.descuento_seguro = (10)#Es el porcentaje
comision = input("\nIngrese comision:")
comision = float(comision)
e2.agregar_comision_fija(comision)
e2.nombre = "Ana"
e2.apellido ="Diaz"
print(e2.presentar_datos())#presentamos los datos
