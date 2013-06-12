<%@ taglib uri="http://java.sun.com/jstl/core" prefix="c" %>
<html>
<head>
<title>GeekTic</title>
<link href="css/accueil.css" rel="stylesheet" media="screen">
</head>
<body>
<div id="bandeau">
<object classid="clsid:D27CDB6E-AE6D-11cf-96B8-444553540000" width="810" height="260" id="banniere">
<param name="movie" value="flash/banniere.swf" />
<param name="quality" value="high" />
<param name=allowscriptaccess VALUE="always">
<!--[if !IE]>-->
<object data="flash/banniere.swf" 
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
<img src="<c:url value='images/hgeek.jpg'></c:url>" height="350" width="260" alt="coté homme" title="cote_homme">
</div>

<div id="bloc_droite">
<img src="<c:url value='images/fgeek.jpg'></c:url>" height="350" width="260" alt="coté femme" title="cote_femme">
</div>

<div id="bloc_centre">

Choisissez votre camp !
<img src="<c:url value='images/fleche_gauche.png'></c:url>" height="350" width="260" alt="fleche de gauche" title="fleche_gauche">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<img src="<c:url value='images/fleche_droite.png'></c:url>" height="350" width="260" alt="fleche de droite" title="fleche_droite">
<!--  <fieldset>
<legend>Identification:</legend>
<ol><li><label>Identifiant: </label><input type="text" id="identifiant" name="identifiant"></li></ol>
<ol><li><label>Mot de passe: </label><input type="password" id="passsword" name="passsword"></li></ol>
</fieldset>

Vous n'avez pas encore de compte ? Ce n'est pas un soucis ! Cliquez sur le lien suivant:
<a href="./creation_compte/">Créer un compte</a>
-->
</div>

<div id="pied_de_page">
@powered by: Adam Kozlowski
</div>

</body>
</html>
