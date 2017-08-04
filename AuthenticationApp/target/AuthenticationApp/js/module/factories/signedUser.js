function signedUserFactoryFunction() {
	var signed = {};
	var interfaz = {
			getSigned : function() {
				return signed;
			},
			setSigned : function(input) {
				signed = input;
			}
		};

		return interfaz;
}