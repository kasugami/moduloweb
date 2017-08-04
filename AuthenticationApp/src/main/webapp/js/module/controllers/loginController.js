function loginControllerFunction($http, $rootScope, $scope, $stateParams,$state, SignedUser) {
	var loginVM = this;
	console.log("Entrando al loginFunction");
	loginVM.formLogin = {};
	loginVM.loginError = "none";

	loginVM.login = function() {		
		console.log("Iniciando logeo ....");
		loginVM.submitted = true;
		if($scope.loginViewForm.$valid) {
			console.log("Submitiendo:" + JSON.stringify(loginVM.formLogin));
			$http.post("app/session/login", loginVM.formLogin)
				.success(function(response){
					console.log("Regresando del servidor2");
					console.log("respueste:" + JSON.stringify(response));
					SignedUser.setSigned = loginVM.formLogin;
					$state.go("welcome");
				})
				.error(function(data, status, headers, config)  {
					loginVM.errorMsg = data.message; 
					loginVM.loginError = "inLine";
				});
		}	
		
	};
}