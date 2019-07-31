function check(){
		var p1=document.getElementById("p1").value;
		var p2=document.getElementById("p2").value;
		
		if(p1!=p2){
			alert("Password and re-enter password must be same");
			return false;
		}
		
		return true;
	}