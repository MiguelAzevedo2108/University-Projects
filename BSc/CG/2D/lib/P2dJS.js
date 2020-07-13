function main(){
	var square = document.getElementById("acanvas").getContext("2d");
	capa(square);
	
}

function capa(c){


		//BackGround
	

	enter(c,0,0,300,500);					
	drawSquare(c,1,1,0,0,"rgb(254,213,3)");
	c.restore();
												
	enter(c,15,15,135*2,235*2);
	drawSquare(c,1,1,0,0,"rgb(230,44,47)");
	c.restore();

	enter(c,20,20,130*2,230*2);
	drawSquare(c,1,1,0,0,"rgb(254,213,3)");
	c.restore();

	enter(c,25,25,125*2,225*2);					
	drawSquare(c,1,1,0,0,"rgb(230,44,47)");
	c.restore();

	
		// Center Square 


	enter(c,98,160,100,100);				
	drawSquare(c,1,1,0,0,"black");
	c.restore();

	enter(c,102,164,92,92);					
	drawSquare(c,1,1,0,0,"rgb(230,44,47)");
	c.restore();



		// Draw LeftBar


	enter(c,15,1,369,-540);					
	c.rotate(5*Math.PI/120);
	drawLeftBar(c);
	leave(c,"black","black");


		
		// Draw RightBar


	enter(c,12,10,470,-470);					
	c.rotate(2*Math.PI/680);
	drawRightBar(c);
	leave(c,"black","black");


		// DrawM

  	
  	enter(c,43,7,380,-490);			
  	c.rotate(-2*Math.PI/100);
  	drawLetterM(c);
  	leave(c,"white","white");


  		// drawOR


  	enter(c,38,5,360,-490);			
  	drawLettersOR(c);
  	leave(c,"white","white");


  		// DrawInside0


  	enter(c,40,8,340,-490);			
  	drawInsideO(c);
  	leave(c,"rgb(230,44,47)","white");

  	enter(c,15,65,450,-400);
  	InsideO2(c);
  	leave(c,"rgb(230,44,47)","white");

  		
  		// DrawTE


  	enter(c,18,5,440,-490);			
  	drawLettersTE(c);
  	leave(c,"white","white");


  		// DrawInsideE


  	enter(c,18,6,440,-490);			
  	InsideE(c);
  	leave(c,"rgb(230,44,47)","white");


  		// DrawS


  	enter(c,20,18,440,-490);			
  	drawLetterS(c);
  	leave(c,"white","white");


  		// DrawUBITA


  	enter(c,20,18,440,-490);			
  	drawLettersUBITA(c);
  	leave(c,"white","white");


  		// Draw AccentU


  	enter(c,20,18,440,-490);			
  	drawAccentU(c);
  	leave(c,"white","white");

  		
  		// Draw InsideB


  	enter(c,22,18,440,-490);			
  	drawInsideB(c);
  	leave(c,"rgb(230,44,47)","white");


  		// Draw Point


  	enter(c,189,396,3,-3);				
  	drawPoint(c);
  	leave(c,"white","white");


  		// Draw InsideA


  	enter(c,20,18,440,-490);			
  	drawInsideA(c);
  	leave(c,"rgb(230,44,47)","white");


  		//DrawJ


  	enter(c,15,20,420,-400);
  	drawLetterJ(c);
  	leave(c,"white","white");


  		//Draw MiniPoint


  	enter(c,17,20,420,-400);
  	drawMiniPoint(c);
  	leave(c,"white","white");


  		//DrawK


  	enter(c,20,20,420,-400);
  	drawLetterK(c);
  	leave(c,"white","white");


  		//DrawMiniPoint


  	enter(c,55,20,420,-400);
  	drawMiniPoint(c);
  	leave(c,"white","white");


  		//DrawR


  	enter(c,25,20,410,-400);
  	drawLetterR(c);
  	leave(c,"white","white");


  		//DrawInsideR


  	enter(c,25,20,410,-400);
  	drawInsideR(c);
  	leave(c,"rgb(230,44,47)","white");


  		//DrawTopO


  	enter(c,33,20,410,-400);
  	drawTopO(c);
  	leave(c,"white","white");


  		//DrawInsideO


  	enter(c,33,20,410,-400);
  	InsideTopO(c);
  	leave(c,"rgb(230,44,47)","white");


  		//DrawW


  	enter(c,40,20,410,-400);
  	drawLetterW(c);
  	leave(c,"white","white");
  	

  		//DrawL


  	enter(c,42,20,410,-400);
  	drawLetterL(c);
  	leave(c,"white","white");


  		//DrawI


  	enter(c,43,20,410,-400);
  	drawLetterI(c);
  	leave(c,"white","white");

  		
  		//DrawMiniPoint


  	enter(c,168,-35,400,-490);
  	drawMiniPoint(c);
  	leave(c,"white","white");

  		
  		//DrawN


  	enter(c,48,20,410,-400);
  	drawLetterN(c);
  	leave(c,"white","white");


  		//DrawG


  	enter(c,53,20,410,-400);
  	drawLetterG(c);
  	leave(c,"white","white");

  }


  		//Draw DownLetters


function drawLetterM(c){
	c.beginPath();
		c.moveTo(0.271,-0.694);
		c.bezierCurveTo(0.183,-0.7827,0.174,-0.704,0.2013,-0.5664);
		c.lineTo(0.185,-0.5664);
		c.lineTo(0.150,-0.664);
		c.lineTo(0.148,-0.565);
		c.lineTo(0.127,-0.565);
		c.bezierCurveTo(0.087,-0.744,0.076,-0.7128,0.0769,-0.700);
		c.bezierCurveTo(0.067,-0.717,0.100,-0.761,0.128,-0.628);
		c.lineTo(0.140,-0.731);
		c.lineTo(0.173,-0.640);
		c.bezierCurveTo(0.158,-0.748,0.222,-0.753,0.271,-0.692);
	c.closePath();
}

function drawLettersOR(c){
	c.beginPath();
		c.moveTo(0.206,-0.662);
		c.bezierCurveTo(0.183,-0.707,0.239,-0.763,0.251,-0.666);
		c.lineTo(0.266,-0.655);
		c.lineTo(0.260,-0.704);
		c.lineTo(0.274,-0.703);
		c.lineTo(0.281,-0.645);
		c.lineTo(0.288,-0.638);
		c.bezierCurveTo(0.314,-0.679,0.318,-0.592,0.278,-0.632);
		c.lineTo(0.267,-0.628);
		c.lineTo(0.267,-0.640);
		c.lineTo(0.253,-0.654);
		c.bezierCurveTo(0.254,-0.639,0.226,-0.624,0.208,-0.657);
		c.bezierCurveTo(0.207,-0.657,0.204,-0.659,0.202,-0.657);
		c.bezierCurveTo(0.201,-0.661,0.207,-0.661,0.209,-0.660);

}


function drawLettersTE(c){	
	c.beginPath();
		c.moveTo(0.348,-0.556);
		c.lineTo(0.330,-0.560);
		c.lineTo(0.325,-0.589);
		c.bezierCurveTo(0.360,-0.581,0.259,-0.614,0.294,-0.587);
		c.bezierCurveTo(0.258,-0.602,0.301,-0.614,0.326,-0.596);
		c.bezierCurveTo(0.301,-0.704,0.312,-0.717,0.355,-0.684);
		c.bezierCurveTo(0.376,-0.702,0.390,-0.696,0.395,-0.676);
		c.bezierCurveTo(0.391,-0.670,0.373,-0.706,0.362,-0.675);
		c.lineTo(0.388,-0.646);
		c.bezierCurveTo(0.411,-0.638,0.388,-0.594,0.360,-0.626);
		c.bezierCurveTo(0.348,-0.644,0.345,-0.678,0.351,-0.677);
		c.bezierCurveTo(0.325,-0.705,0.317,-0.7,0.339,-0.595);
		c.bezierCurveTo(0.372,-0.584,0.381,-0.586,0.371,-0.598);
		c.bezierCurveTo(0.390,-0.597,0.381,-0.569,0.342,-0.585);	
	c.closePath();
}


function drawInsideO(c){
	c.beginPath();
		c.moveTo(0.227,-0.654);
		c.bezierCurveTo(0.209,-0.715,0.228,-0.738,0.240,-0.665);
	c.closePath();

}


function InsideE(c){
	c.beginPath();
		c.moveTo(0.363,-0.664);
		c.bezierCurveTo(0.403,-0.619,0.368,-0.618,0.363,-0.664);
	c.closePath();
}


function drawLetterS(c){
	c.beginPath();
		c.moveTo(0.149,-0.869);
		c.bezierCurveTo(0.157,-0.920,0.212,-0.878,0.162,-0.821);
		c.bezierCurveTo(0.112,-0.730,0.263,-0.706,0.226,-0.791);
		c.bezierCurveTo(0.245,-0.715,0.138,-0.752,0.193,-0.830);	
		c.bezierCurveTo(0.235,-0.891,0.156,-0.934,0.148,-0.876);
	c.closePath();
}

function drawLettersUBITA(c){
	c.beginPath();	
		c.moveTo(0.291,-0.857);
		c.bezierCurveTo(0.276,-0.878,0.267,-0.895,0.283,-0.803);
		c.lineTo(0.267,-0.805);
		c.bezierCurveTo(0.252,-0.906,0.226,-0.892,0.252,-0.806);
		c.lineTo(0.235,-0.810);
		c.bezierCurveTo(0.234,-0.818,0.227,-0.839,0.216,-0.835);
		c.lineTo(0.227,-0.834);
		c.bezierCurveTo(0.212,-0.883,0.237,-0.905,0.257,-0.877);
		c.bezierCurveTo(0.265,-0.894,0.289,-0.881,0.294,-0.869);
		c.bezierCurveTo(0.300,-0.880,0.336,-0.895,0.345,-0.852);
		c.lineTo(0.361,-0.827);
		c.bezierCurveTo(0.346,-0.875,0.382,-0.890,0.403,-0.833);
		c.bezierCurveTo(0.408,-0.890,0.430,-0.867,0.448,-0.801);
		c.bezierCurveTo(0.459,-0.810,0.471,-0.791,0.462,-0.785);
		c.bezierCurveTo(0.475,-0.769,0.482,-0.788,0.464,-0.803);
		c.bezierCurveTo(0.442,-0.821,0.422,-0.867,0.461,-0.858);
		c.bezierCurveTo(0.465,-0.854,0.472,-0.849,0.474,-0.841);
		c.bezierCurveTo(0.471,-0.857,0.498,-0.866,0.499,-0.833);
		c.bezierCurveTo(0.482,-0.870,0.486,-0.846,0.497,-0.772);
		c.lineTo(0.483,-0.777);
		c.bezierCurveTo(0.463,-0.763,0.439,-0.787,0.432,-0.825);
		c.bezierCurveTo(0.411,-0.891,0.413,-0.842,0.429,-0.754);
		c.bezierCurveTo(0.495,-0.741,0.422,-0.759,0.466,-0.756); 
		c.bezierCurveTo(0.477,-0.750,0.483,-0.731,0.430,-0.743);
		c.lineTo(0.435,-0.719);
		c.lineTo(0.421,-0.720);
		c.lineTo(0.414,-0.744);
		c.bezierCurveTo(0.396,-0.748,0.388,-0.747,0.399,-0.739);
		c.bezierCurveTo(0.382,-0.731,0.383,-0.766,0.414,-0.755);
		c.lineTo(0.404,-0.821);
		c.bezierCurveTo(0.382,-0.855,0.360,-0.904,0.385,-0.79);
		c.lineTo(0.370,-0.791);
		c.lineTo(0.349,-0.835);
		c.bezierCurveTo(0.356,-0.803,0.340,-0.782,0.316,-0.800);
		c.bezierCurveTo(0.334,-0.762,0.339,-0.707,0.319,-0.714);
		c.bezierCurveTo(0.310,-0.711,0.299,-0.772,0.290,-0.860);
	c.closePath();

}

		//Draw Stuff Inside Downletters

function drawAccentU(c){
	c.beginPath();
		c.moveTo(0.253,-0.783);
		c.lineTo(0.277,-0.762);
		c.lineTo(0.285,-0.770);
		c.lineTo(0.260,-0.793);
	c.closePath();

}


function drawInsideB(c){
	c.beginPath();
		c.moveTo(0.311,-0.819);
		c.lineTo(0.298,-0.856);
		c.bezierCurveTo(0.322,-0.913,0.348,-0.760,0.313,-0.818);
	c.closePath();

}

function drawPoint(c){
	c.beginPath();	
		c.ellipse(0,0, 1,1, 0, 0,2*Math.PI);
	c.closePath();

}

function drawInsideA(c){
	c.beginPath();
		c.moveTo(0.476,-0.811);
		c.bezierCurveTo(0.443,-0.852,0.462,-0.845,0.475,-0.824);
	c.closePath();

}


		//DrawSquares


function drawSquare(c,largura,comprimento,x,y,color){
	c.fillStyle = color;
	c.fillRect(x,y,largura,comprimento);
}


		//Draw X


function drawLeftBar(c){
	c.beginPath();
		c.moveTo(0.287,-0.424);
		c.bezierCurveTo(0.280,-0.384,0.263,-0.293,0.232,-0.338);
		c.lineTo(0.301,-0.548);
		c.bezierCurveTo(0.306,-0.557,0.317,-0.578,0.322,-0.585);
		c.bezierCurveTo(0.332,-0.573,0.309,-0.553,0.313,-0.511);
	c.closePath();

}

function drawRightBar(c){
	c.beginPath();
		c.moveTo(0.300,-0.459);
		c.lineTo(0.437,-0.261);
		c.bezierCurveTo(0.474,-0.186,0.453,-0.178,0.384,-0.288);
		c.lineTo(0.247,-0.499);	
		c.bezierCurveTo(0.200,-0.580,0.220,-0.579,0.252,-0.516);
	c.closePath();

}


		//Draw TopLetters


function drawLetterJ(c){
	c.beginPath();
		c.moveTo(0.101,-0.091);
		c.lineTo(0.101,-0.082);
		c.lineTo(0.063,-0.082);
		c.lineTo(0.063,-0.091);
		c.lineTo(0.077,-0.091);
		c.lineTo(0.077,-0.154);
		c.bezierCurveTo(0.081,-0.168,0.057,-0.193,0.0605,-0.153);
		c.lineTo(0.0497,-0.153);
		c.bezierCurveTo(0.039,-0.187,0.086,-0.206,0.088,-0.153);
		c.lineTo(0.087,-0.091);
	c.closePath();

}


function drawLetterK(c){
	c.beginPath();
		c.moveTo(0.126,-0.083);
		c.lineTo(0.126,-0.183);
		c.lineTo(0.137,-0.183);
		c.lineTo(0.137,-0.154);
		c.lineTo(0.142,-0.146);
		c.lineTo(0.159,-0.182);
		c.lineTo(0.170,-0.182);
		c.lineTo(0.150,-0.134);
		c.lineTo(0.171,-0.083);
		c.lineTo(0.157,-0.083);
		c.lineTo(0.138,-0.130);
		c.lineTo(0.137,-0.083);
	c.closePath();
}

function drawLetterR(c){
	c.beginPath();
		c.moveTo(0.207,-0.077);
		c.lineTo(0.207,-0.183);
		c.lineTo(0.219,-0.183);
		c.lineTo(0.219,-0.145);
		c.lineTo(0.224,-0.145);
		c.lineTo(0.240,-0.183);
		c.lineTo(0.251,-0.183);
		c.lineTo(0.232,-0.145);
		c.bezierCurveTo(0.269,-0.126,0.262,-0.063,0.207,-0.077);
}

function InsideTopO(c){
	c.beginPath();
		c.moveTo(0.286,-0.157);
		c.lineTo(0.286,-0.110);
		c.bezierCurveTo(0.286,-0.071,0.270,-0.091,0.272,-0.110);
		c.lineTo(0.272,-0.154);
		c.bezierCurveTo(0.275,-0.191,0.289,-0.162,0.286,-0.157);

}

function drawLetterW(c){
	c.beginPath();
		c.moveTo(0.311,-0.074);
		c.lineTo(0.317,-0.160);
		c.lineTo(0.323,-0.128);
		c.lineTo(0.333,-0.128);
		c.lineTo(0.338,-0.157);
		c.lineTo(0.353,-0.074);
		c.lineTo(0.365,-0.074);
		c.lineTo(0.344,-0.183);
		c.lineTo(0.333,-0.183);
		c.lineTo(0.328,-0.156);
		c.lineTo(0.322,-0.183);
		c.lineTo(0.310,-0.183);
		c.lineTo(0.301,-0.074);
	c.closePath();
}


function drawLetterL(c){
	c.beginPath();
		c.moveTo(0.372,-0.074);
		c.lineTo(0.382,-0.076);
		c.lineTo(0.382,-0.171);
		c.lineTo(0.397,-0.171);
		c.lineTo(0.397,-0.183);
		c.lineTo(0.372,-0.183);
	c.closePath();

}

function drawLetterI(c){
	c.beginPath();
		c.moveTo(0.406,-0.107);
		c.lineTo(0.416,-0.107);
		c.lineTo(0.416,-0.183);
		c.lineTo(0.406,-0.183);
	c.closePath();

}

function drawLetterN(c){
	c.beginPath();
		c.moveTo(0.431,-0.074);
		c.lineTo(0.444,-0.074);
		c.lineTo(0.466,-0.138);
		c.lineTo(0.465,-0.074);
		c.lineTo(0.477,-0.074);
		c.lineTo(0.477,-0.183);
		c.lineTo(0.465,-0.183);
		c.lineTo(0.442,-0.104);
		c.lineTo(0.442,-0.183);
		c.lineTo(0.431,-0.183);
	c.closePath();
}

function InsideO2(c){
	c.beginPath();
		c.moveTo(0.238,-0.660);
		c.bezierCurveTo(0.246,-0.654,0.228,-0.628,0.236,-0.659);

}

function drawLetterG(c){
	c.beginPath();
		c.moveTo(0.484,-0.098);
		c.bezierCurveTo(0.481,-0.062,0.532,-0.056,0.529,-0.098);
		c.lineTo(0.519,-0.098);
		c.bezierCurveTo(0.520,-0.068,0.492,-0.079,0.495,-0.100);
		c.lineTo(0.495,-0.155);
		c.bezierCurveTo(0.497,-0.179,0.521,-0.170,0.516,-0.155);
		c.lineTo(0.502,-0.155);
		c.lineTo(0.502,-0.143);
		c.lineTo(0.527,-0.143);
		c.lineTo(0.527,-0.183);
		c.lineTo(0.516,-0.183);
		c.lineTo(0.516,-0.176);
		c.bezierCurveTo(0.502,-0.185,0.486,-0.178,0.483,-0.158);
	c.closePath();
}



		//Draw Stuff Inside TopLetters


function drawInsideR(c){
	c.beginPath();
		c.moveTo(0.218,-0.087);
		c.bezierCurveTo(0.248,-0.084,0.248,-0.131,0.218,-0.133);
	c.closePath();

}

function drawTopO(c){
	c.beginPath();
		c.moveTo(0.261,-0.159);
		c.lineTo(0.261,-0.106);
		c.bezierCurveTo(0.260,-0.068,0.296,-0.061,0.297,-0.104);
		c.lineTo(0.297,-0.153);
		c.bezierCurveTo(0.294,-0.205,0.261,-0.181,0.261,-0.159);

}

function drawMiniPoint(c){
	c.beginPath();
		c.moveTo(0.105,-0.172);
		c.lineTo(0.105,-0.183);
		c.lineTo(0.114,-0.183);
		c.lineTo(0.114,-0.172);
	c.closePath();
}

function enter(c, dx, dy, sx, sy) {
    c.save();
	c.translate(dx,dy)
	c.scale(sx,sy);
}

function leave(c, fs,ss) {
    c.restore();
    c.fillStyle = fs;
    c.strokeStyle = ss;
    c.fill();
    c.stroke();
}