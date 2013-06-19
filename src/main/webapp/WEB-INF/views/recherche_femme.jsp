<html>
<head>
<title>GeekTic - Recherche Geekette</title>
<link href="css/recherche_geekette.css" rel="stylesheet" media="screen">
</head>
<body>
<div id="bandeau">

<object classid="clsid:D27CDB6E-AE6D-11cf-96B8-444553540000" width="810" height="260" id="bannierefemme">
<param name="movie" value="flash/bannierefemme.swf" />
<param name="quality" value="high" />
<param name=allowscriptaccess VALUE="always">
<!--[if !IE]>-->
<object data="flash/bannierefemme.swf" 
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
<p><a href="recherche_mec">Rechercher un Geek</a></p>
<p><a href="quisommenous">Qui sommes nous ?</a></p>
<p><a href="nouscontacter">Nous contacter</a></p>

</div>

<div id="bloc_droite">
<p>Voici les dernières Geekettes inscrites :</p>
<img class="derniere_geekette" src="images/geekette1.jpg">
<img class="derniere_geekette" src="images/geekette2.jpg">
<img class="derniere_geekette" src="images/geekette3.jpg">
<img class="derniere_geekette" src="images/geekette4.jpg">
<img class="derniere_geekette" src="images/geekette5.jpg">
<img class="derniere_geekette" src="images/geekette6.png">
<img class="derniere_geekette" src="images/geekette7.jpg">
<img class="derniere_geekette" src="images/geekette8.jpg">
<img class="derniere_geekette" src="images/geekette9.jpg">
</div>

<div id="bloc_centre">
Choisissez vos critères:
<form method="post" action="affiche_geekette">
<ol><li><label>Python :</label><INPUT type="checkbox" name="langage" value="Python"></li></ol> 
<ol><li><label>PHP :</label><INPUT type="checkbox" name="langage" value="PHP"></li></ol> 
<ol><li><label>JavaScript :</label><INPUT type="checkbox" name="langage" value="JavaScript"></li></ol> 
<ol><li><label>Java :</label><INPUT type="checkbox" name="langage" value="Java"></li></ol> 
<ol><li><label>C++ :</label><INPUT type="checkbox" name="langage" value="C++"></li></ol> 
<ol><li><label>DotNet :</label><INPUT type="checkbox" name="langage" value="DotNet"></li></ol> 
<input type="hidden" name="sexe" value="f">
<input type="submit" value="Trouvez mon âme soeur" id="envoyer" name="envoyer">
</form>
<img class="xena" src="images/xena.jpg">
</div>

<div id="pied_de_page">
Sponsorisée par :
</div>

</body>
</html>
