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

	#Metodo de presentar datos datos
	def presentar_datos(self):
		cadena = "Informacion de: %s %s\n\t cedula:%s\n"%(self.obtener_nombre(),self.apellido,self.obtener_cedula())
		return cadena

#Creamos la clase Empleado por Horas
class EmpleadoPorHoras(Empleado):
	#Constructor de la clase
	def __init__(self):
		super(EmpleadoPorHoras,self).__init__()#Heredamos con el super de la clase padre Empleado
		self.numero_horas = 0
		self.valor_hora = 0

	#Metodos de agregar
	def agregar_numero_horas(self,numero):
		self.numero_horas = numero

	def agregar_valor_hora(self,valor):
		self.valor_hora = valor

	#Metodos de obtener
	def obtener_numero_horas(self):
		return self.numero_horas

	def obtener_valor_horas(self):
		return self.valor_hora

	#Metodo para calcular el sueldo final
	def calcular_sueldo_final(self):
		return (self.numero_horas * self.valor_hora) + self.comision_fija
	
	#Metodo de presentar datos
	def presentar_datos(self):
		cadena = "%s\n Numero horas:%s\n Valor hora:%s\n Sueldo Final: %s"%(super(EmpleadoPorHoras,self).presentar_datos(),
																			self.obtener_numero_horas(),self.obtener_valor_horas(),self.calcular_sueldo_final())
		return cadena

#Creamos la clase Empleado Fijo
class EmpleadoFijo(Empleado):
	#constructor de la clase
	def __init__(self):
		super(EmpleadoFijo,self).__init__()#Heredamos de la clase padre Empleado
		self.sueldo_fijo = 0
		self.descuento_seguro = 0

	#Metodos de agregar
	def agregar_sueldo_fijo(self,fijo):
		self.sueldo_fijo = fijo

	def agregar_descuento_fijo(self,descuento):
		self.descuento_seguro = descuento

	#Metodos de obtener
	def obtener_sueldo_fijo(self):
		return self.sueldo_fijo

	def obtener_descuento_seguro(self):
		return self.descuento_seguro

	#Metodo para calcular el sueldo final
	def calcular_sueldo_final(self):
		return (self.sueldo_fijo - self.descuento_seguro) + self.comision_fija

	#Metodo para presentar datos
	def presentar_datos(self):
		cadena = "%s\n Sueldo fijo: %s\n Descuento Seguro: %s\n Sueldo Final: %s"%(super(EmpleadoFijo,self).presentar_datos(),
																					self.obtener_sueldo_fijo(),self.obtener_descuento_seguro(),self.calcular_sueldo_final())
		return cadena

#Creamos la clase Empleado por Semana
class EmpleadoPorSemana(Empleado):
	#constructor de la clase
	def __init__(self):
		super(EmpleadoPorSemana,self).__init__()#Heredamos de la clase padre Empleado
		self.numero_semanas = 0
		self.valor_semanal = 0

	#Metodos de agregar
	def agregar_numero_semanas(self,numero):
		self.numero_semanas = numero

	def agregar_valor_semanal(self,valor_semana):
		self.valor_semanal = valor_semana

	#Metodos de obtener
	def obtener_numero_semanas(self):
		return numero_semanas

	def obtener_valor_semanal(self):
		return valor_semanal

	#Metodo de calcular sueldo final
	def calcular_sueldo_final(self):
		return (self.numero_semanas * self.valor_semanal) + self.comision_fija

	#Metodo de presentar datos
	def presentar_datos(self):
		cadena = "%s\n Numero Semanas: %s\n Valor semanal: %s\n Sueldo Final: %s"%(super(EmpleadoPorSemana,self).presentar_datos(),
																		            self.obtener_numero_semanas(),self.obtener_valor_semanal(),self.calcular_sueldo_final())
		return cadena