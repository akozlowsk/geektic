<html>
<head>
<title>GeekTic - Recherche Geek</title>
<link href="css/recherche_geek.css" rel="stylesheet" media="screen">
</head>
<body>
<div id="bandeau">

<object classid="clsid:D27CDB6E-AE6D-11cf-96B8-444553540000" width="810" height="260" id="bannierehomme">
<param name="movie" value="flash/bannierehomme.swf" />
<param name="quality" value="high" />
<param name=allowscriptaccess VALUE="always">
<!--[if !IE]>-->
<object data="flash/bannierehomme.swf" 
	type="application/x-shockwave-flash" width="810" height="260">
	<param name=allowscriptaccess VALUE="always">
	<param name="quality" value="high" />
<!--<![endif]-->
	<a href="http://www.adobe.com/go/getflash">
		<img src="http://www.adobe.com/images/shared/download_buttons/get_flash_player.gif" alt="Get Adobe Flash player"/>
	</a>
<!--[if !IE]>-->
</object>
<!--<![endif]-->
</object>



</div>
<div id="bloc_gauche">
Menu de navigation :
<p><a href="/geektic">page d'acceuil</a></p>
<p><a href="recherche_femme">Rechercher une Geekette</a></p>
<p><a href="quisommenous">Qui sommes nous ?</a></p>
<p><a href="nouscontacter">Nous contacter</a></p>

</div>

<div id="bloc_droite">
<p>Voici les dernières Geeks inscrits :</p>
<img class="dernier_geek" src="images/geek1.jpg">
<img class="dernier_geek" src="images/geek2.jpg">
<img class="dernier_geek" src="images/geek3.jpg">
<img class="dernier_geek" src="images/geek4.jpg">
<img class="dernier_geek" src="images/geek5.jpg">
<img class="dernier_geek" src="images/geek6.jpg">
<img class="dernier_geek" src="images/geek7.jpg">
<img class="dernier_geek" src="images/geek8.jpg">
<img class="dernier_geek" src="images/geek9.jpg">
</div>

<div id="bloc_centre">
Choisissez vos critères:
<form method="post" action="affiche_geek">
<ol><li><label>Python :</label><INPUT type="checkbox" name="langage" value="Python"></li></ol> 
<ol><li><label>PHP :</label><INPUT type="checkbox" name="langage" value="PHP"></li></ol> 
<ol><li><label>JavaScript :</label><INPUT type="checkbox" name="langage" value="JavaScript"></li></ol> 
<ol><li><label>Java :</label><INPUT type="checkbox" name="langage" value="Java"></li></ol> 
<ol><li><label>C++ :</label><INPUT type="checkbox" name="langage" value="C++"></li></ol> 
<ol><li><label>DotNet :</label><INPUT type="checkbox" name="langage" value="DotNet"></li></ol> 
<input type="hidden" name="sexe" value="m">
<input type="submit" value="Trouvez mon âme soeur">
</form>
<img class="chuck" src="images/chuck.jpg">
</div>

<div id="pied_de_page">
Sponsorisé par :
</div>

</body>
</html>
