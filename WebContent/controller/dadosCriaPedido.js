var criaPedidoModulo = angular.module('criaPedidoModulo', []);

criaPedidoModulo.controller('criaPedidoController', function ($scope, $http) {
	
  urlPedido = 'http://localhost:8080/MeusPedidos/rest/pedidos';
  urlCliente = 'http://localhost:8080/MeusPedidos/rest/clientes';
  urlItem = 'http://localhost:8080/MeusPedidos/rest/itens';
  
  $scope.listarPedidos = function() {	  
	  $http.get(urlPedido).then(successCallback, errorCallback);

	  function successCallback(response){
		  $scope.pedidos = response.data;
	  }
	  function errorCallback(error){
		  alert(erro);
	  }
  }
  
  $scope.listarClientes = function() {	  
	  $http.get(urlCliente).then(successCallback, errorCallback);

	  function successCallback(response){
		  $scope.clientes = response.data;
	  }
	  function errorCallback(error){
		  alert(erro);
	  }
  }
  
  $scope.listarItens = function() {	  
	  $http.get(urlItem).then(successCallback, errorCallback);

	  function successCallback(response){
		  $scope.itens = response.data;
	  }
	  function errorCallback(error){
		  alert(erro);
	  }
  }

  $scope.salvarPedido = function(){
	  $http.post(urlPedido, $scope.pedido).then(function(pedido) {
	    	$scope.pedidos.push(pedido.data.data);
	    	$scope.listarPedidos();
	    	$scope.limparCampos();
		});  
  }

  $scope.limparCampos = function(){
    $scope.pedido = null;
  }

  $scope.selecionaPedido = function(pedidoSelecionado){
    $scope.pedido = pedidoSelecionado;
  }
  
  $scope.listarClientes();
  $scope.listarItens();
  $scope.listarPedidos();

})