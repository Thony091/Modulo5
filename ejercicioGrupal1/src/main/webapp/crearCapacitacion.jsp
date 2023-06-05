<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/css/bootstrap.min.css"  rel="stylesheet">
		<title>Capacitación</title>
		<link rel="stylesheet" href="css/styles.css">
	</head>
	<body>
		<div class="container">
			<!-- Codigo formulario Capacitacion -->
			<main class="row mt-3 mb-5 " >

				<div class="mt-5 contacto">

				  <h2 class="offset-1 col-10 fs-1"><strong> Crear capacitacion </strong></h2>
				  
				  <form action="ServletCrearCapacitacion" method="POST" class="offset-1 col-10 form mb-5">
					<div class="form-group fs-3 mt-4">
						<label for="rutCliente">Rut de cliente:</label>
						<input 
							type="text" 
							class="form-control fs-4" 
							id="rutCliente" 
							placeholder="88.231.332-k"
							name="rutCliente"
							required>
						<small id="rutClienteHelp" class=" form-text text-danger"> </small>
					</div>
		  
					<div class="form-group fs-3 mt-4">
					  <label for="dia">Día: </label>
					  <input 
						  type="text" 
						  class="form-control fs-4" 
						  id="dia"
						  placeholder="Lunes, Martes, Mier..."
						  name="dia"
						   >		  
					  <small id="diaHelp" class=" form-text text-danger"> </small>
					</div> 
		  
					<div class="form-group fs-3 mt-4">
					  <label for="hora">Hora:</label>
					  <input 
					  		type="text" 
					  		class="form-control fs-4" 
					  		id="hora" 
					  		placeholder="HH:MM"
					  		name="hora"
					  		>
					  <small id="horaHelp" class=" form-text text-danger"> </small>
					</div>   
					<div class="form-group fs-3 mt-4">
					  <label for="lugar">Lugar:</label>
					  <input 
					  		type="text" 
					  		class="form-control fs-4" 
					  		id="lugar" 
					  		placeholder="-"
					  		name="lugar"
					  		>
					  <small id="lugarHelp" class=" form-text text-danger"> </small>
					</div>   
					<div class="form-group fs-3 mt-4">
					  <label for="duracion">Duración:</label>
					  <input 
					  		type="text" 
					  		class="form-control fs-4" 
					  		id="duracion" 
					  		placeholder="X horas"
					  		name="duracion"
					  		>
					  <small id="duracionHelp" class=" form-text text-danger"> </small>
					</div>   
					<div class="form-group fs-3 mt-4">
					  <label for="cantAsistentes">Cantidad de asistentes:</label>
					  <input 
					  		type="number" 
					  		class="form-control fs-4" 
					  		id="cantAsistentes" 
					  		placeholder="-"
					  		name="cantAsistentes"
					  		>
					  <small id="cantAsistentesHelp" class=" form-text text-danger"> </small>
					</div>

		  			<div>
					<button class="btn btn-primary btn-block mt-4 fs-3 m-3" type="submit">Registrar Capacitación</button>
					<small id="finalHelp" class="form-text text-danger"> </small>
		  			</div>
				  </form>

				</div>
			  </main>
			  <!-- Fin Codigo formulario Capacitacion -->
			  
		  <script src="https://code.jquery..com/jquery-3.6.0.min.js"></script>
		  <script src="js/app.js"></script>
		</div>
	
	</body>
</html>