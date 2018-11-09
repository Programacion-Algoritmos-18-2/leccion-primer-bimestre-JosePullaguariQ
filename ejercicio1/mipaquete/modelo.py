class Empleado(object):#Creamos la clase padre Empleado}
	#Constructor de la clase
	def __init__(self):
		self.nombre = " "
		self.apellido = " "
		self.cedula = " "
		self.comision_fija = 0

	#Mertodos de agregar
	def agregar_nombre(self,n):
		self.nombre = n

	def agregar_apellido(self,a):
		self.apellido = a

	def agregar_cedula(self,c):
		self.cedula = c

	def agregar_comision_fija(self,comision):
		self.comision_fija = comision

	#Metodos de obtener
	def obtener_nombre(self):
		return self.nombre

	def obtener_apellido(self):
		return self.apellido

	def obtener_cedula(self):
		return self.cedula

	def obtener_comision_fija(self):
		return self.comision

	#Metodos de obtener datos
	def presentar_datos(self):
		cadena = "Informacion de %s %s\n\t cedula:%s"%(self.obtener_nombre(),self.apellido,self.obtener_cedula())
		return cadena




