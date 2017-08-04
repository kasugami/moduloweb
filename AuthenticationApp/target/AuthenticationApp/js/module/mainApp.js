angular
	.module("appADEA", ['ui.router'])
	.config(['$stateProvider','$urlRouterProvider', function($stateProvider, $urlRouterProvider) {
		$urlRouterProvider.otherwise('/login');
		$stateProvider
			.state("login", {
				url: '/login',
				templateUrl : 'pages/login.html',
				controller: 'loginController',
				controllerAs: "loginVM"
			})
			.state("welcome", {
				url: "/welcome",
				templateUrl: "pages/welcome.html",
				controller : 'welcomeController',
				controllerAs: 'welcomeVM'	
			})
	}])
	.factory("SignedUser", signedUserFactoryFunction)
	.controller("loginController",['$http', '$rootScope','$scope', '$stateParams', '$state', 'SignedUser',loginControllerFunction])
	.controller("welcomeController",['$http', '$location','$rootScope','$scope', 'SignedUser',welcomeControllerFunction]);