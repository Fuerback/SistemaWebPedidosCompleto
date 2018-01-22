var criaPedidoModulo = angular.module('criaPedidoModulo', ['rw.moneymask']);

criaPedidoModulo.controller('CriaPedidoController', function ($scope, $http) {
	
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
	  }).catch(function(erro) {
		  alert(erro);
	  });
  }

  $scope.limparCampos = function(){
	  $scope.pedido = null;
  }

  $scope.selecionaPedido = function(pedidoSelecionado){
	  $scope.pedido = pedidoSelecionado;
  }
  
  $scope.atualizaCampos = function() {
	  if($scope.pedido.item != undefined) {
		  $scope.atualizaPreco();
		  $scope.atualizaQuantidade();
		  $scope.atualizaRentabilidade();
	  }
  }
  
  $scope.atualizaPreco = function(){
	  $scope.pedido.preco = $scope.pedido.item.preco;
  }
  
  $scope.atualizaQuantidade = function(){
	  document.getElementsByClassName("quantidadeInput")[0].setAttribute("step", $scope.pedido.item.multiplo);
      document.getElementsByClassName("quantidadeInput")[0].setAttribute("value", $scope.pedido.item.multiplo);
      document.getElementsByClassName("quantidadeInput")[0].setAttribute("min", $scope.pedido.item.multiplo);
  }
  
  $scope.atualizaRentabilidade = function() {
	  if($scope.pedido.item != undefined) {
		  if($scope.pedido.item.preco < $scope.pedido.preco) {
			  document.getElementsByClassName("rentabilidadeInput")[0].setAttribute("value", "Ótima");
			  $scope.atualizaBotaoComAlerta(false);
		  } else {
			  var porcentagem = 0.1;
			  var valorPorcentagem = $scope.pedido.item.preco*porcentagem;
			  var valorMaximoDesconto = $scope.pedido.item.preco-valorPorcentagem;			  
			  if ($scope.pedido.preco < valorMaximoDesconto) {
				  document.getElementsByClassName("rentabilidadeInput")[0].setAttribute("value", "Ruim");
				  $scope.atualizaBotaoComAlerta(true);
			  } else {
				  document.getElementsByClassName("rentabilidadeInput")[0].setAttribute("value", "Boa");
				  $scope.atualizaBotaoComAlerta(false);
			  }
		  }
	  }
  }
  
  $scope.atualizaBotaoComAlerta = function(disabled) {
	  document.getElementById("botao").disabled = false;
	  document.getElementById("alerta").style.display = "none";
	  if(disabled) {
		  document.getElementById("botao").disabled = true;
		  document.getElementById("alerta").style.display = "block";
	  }
  }
  
  $scope.listarClientes();
  $scope.listarItens();
  $scope.listarPedidos();
  document.getElementById("alerta").style.display = "none";

})