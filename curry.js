(function() {
		
	var leftCurriedBinaryFn = function(fn){
		return function(arg1){
			return function(arg2){
				return fn(arg1,arg2);
			}			
		}		
	}
	var getImageURL = leftCurriedBinaryFn(function(baseUrl,name){		
		return baseUrl +"/"+ name;		
	});
	
	var app1Images = getImageURL("http://app1");	
	var app2Images = getImageURL("http://app2");	
	
	console.log(app1Images("kitty.png"));
	console.log(app2Images("kitty.png"));	
})();