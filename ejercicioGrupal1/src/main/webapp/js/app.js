$(document).ready(function() {
	$("#form-login").submit(function(event) {
		event.preventDefault();
		authUser();
	});

	$("#form-register").submit(function(event) {
		event.preventDefault();
		registroCapacitacion();
	});

	
});


