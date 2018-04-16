SubProceso sumar(num1, num2)
	Escribir num1+num2;
FinSubProceso

SubProceso resta(num1, num2)
	Escribir num1-num2;
FinSubProceso

SubProceso multiplicacion(num1, num2)
	Escribir num1*num2;
FinSubProceso

SubProceso division(num1, num2)
	Escribir num1/num2;
FinSubProceso

Proceso sin_titulo
	definir opcion Como Entero;
	definir numero1, numero2 como entero;
	Repetir
		escribir "1. suma";
		escribir "2. resta";
		escribir "3. multiplicación";
		escribir "4. divición";
		escribir "5. salir";
		leer opcion;
		Segun opcion Hacer
			1:
				leer numero1, numero2;
				sumar(numero1,numero2);
				Esperar 3 segundos;
				Limpiar Pantalla;
			2:
				leer numero1, numero2;
				resta(numero1,numero2);
				Esperar 3 segundos;
				Limpiar Pantalla;
			3:
				leer numero1, numero2;
				multiplicacion(numero1,numero2);
				Esperar 3 segundos;
				Limpiar Pantalla;
			4:
				leer numero1, numero2;
				division(numero1,numero2);
				Esperar 3 segundos;
				Limpiar Pantalla;	
			5:
				Escribir "muchas gracias por usar esta app";
				esperar 5 Segundos;
			De Otro Modo:
				escribir "opciones incorrecta";
				Esperar tecla;
				Limpiar Pantalla;
		FinSegun
		
	Hasta Que opcion = 5
FinProceso

