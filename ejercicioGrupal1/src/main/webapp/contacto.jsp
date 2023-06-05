<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/css/bootstrap.min.css"  rel="stylesheet">
		<title>Contacto</title>
		<link rel="stylesheet" href="css/styles.css">
	</head>
	<body>
		<div class="container">
			<main class="row mt-3 mb-5 " >

				<div class="mt-5 contacto">

				  <h2 class="offset-1 col-10 fs-1"><strong> Enviar una consulta: </strong></h2>
				  
				  <form action="ServletContacto" method="POST" class="offset-1 col-10 form mb-5">
					<div class="form-group fs-3 mt-4">
						<label for="name">Nombre completo:</label>
						<input 
								type="text" 
								class="form-control fs-4" 
								id="name" 
								placeholder="Juanito Connor"
								name="nombreCompleto"
								>
						<small id="nameHelp" class=" form-text text-danger"> </small>
					</div>
		  
					<div class="form-group fs-3 mt-4">
					  <label for="email">Email: </label>
					  <input 
					  		type="email" 
					  		class="form-control fs-4" 
					  		id="email" 
					  		placeholder="jConnor@skynet.com"
					  		name="email"
					  		>
		  
					  <small id="mailHelp" class=" form-text text-danger"> </small>
					</div> 
		  
					<div class="form-group fs-3 mt-4">
					  <label for="asunto">Asunto:</label>
					  <input 
					  		type="text" 
					  		class="form-control fs-4" 
					  		id="asunto" 
					  		placeholder="-"
					  		name="asunto"
					  		>
					  <small id="asuntoHelp" class=" form-text text-danger"> </small>
					</div>   
		  
					<div class="form-group fs-3 mt-4">
					  <label for="text-area">Escribenos tu mensaje:</label>
					  <textarea 
					  		class="form-control fs-4" 
					  		id="text-area" 
					  		rows="4" 
					  		placeholder="Escribenos y nos contactaremos contigo."
					  		name="mensaje"
					  		></textarea>
					  <small id="textHelp" class=" form-text text-danger"> </small>
					</div>
		  			
		  			<div class="d-grid gap-2"> 
					<button class="btn btn-primary btn-block mt-4 fs-3 m-3" type="submit">Enviar</button>
					<small id="finalHelp" class="form-text text-danger"> </small>
		  			</div>
				  </form>
				</div>
			  </main>
		  <script src="https://code.jquery..com/jquery-3.6.0.min.js"></script>
		<script src="js/app.js"></script>
		</div>
	
	</body>
</html>