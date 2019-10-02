Algoritmo TareaTicketsConBuclesPSEINT
	
	Definir articulos Como ENTERO;
	Definir rep Como ENTERO;
	Definir nombre Como TEXTO;
	Definir cantidad Como ENTERO;
	Definir precio Como ENTERO;
	Definir total Como ENTERO;
	Definir totalT Como ENTERO;
	
	Escribir ("Cuantos articulos vas a registrar");
    Leer articulos;
	
	rep <- 0; 
	totalT <- 0;
	
	Mientras rep < articulos Hacer
		
		Escribir ("                                ");
		Escribir ("Introduce el nombre del producto");
		Leer nombre;
		Escribir ("Introduce la cantidad del producto");
		Leer cantidad;
		Escribir ("Introduce el precio del producto");
		Leer precio;
		
		total <-precio*cantidad; 
		
		Escribir ("Nombre: "), nombre;
		Escribir ("Cantidad: "), cantidad;
		Escribir ("Precio Individual: "), precio;
		Escribir ("Total: "), total;
		
		totalT <- totalT + total;
		rep <- rep + 1;
		
		
	FinMientras
	
	Escribir ("--------------------------");
	Escribir (" TOTAL: "), totalT;
	Escribir ("--------------------------");
	
	
	
	
	
	
FinAlgoritmo
