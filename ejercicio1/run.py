from mipaquete.modelo import *
e=Empleado()
e.agregar_nombre("Luis")
e.agregar_apellido("Benitez")
e.agregar_cedula("110101010")
print(e.presentar_datos())