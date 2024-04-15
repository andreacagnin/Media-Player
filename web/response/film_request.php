<?php
//------------ CONNESSIONE AL DATABASE ------------
$h = "localhost";
$u = "root";
$p = "";
$d = "mediaplayer";

$conn = new mysqli($h, $u, $p, $d);
//------------ CONNESSIONE AL DATABASE ------------

//------------ RICHIESTA ED ELABORAZIONE DI DATI DAL DATABASE ------------
$q = 
'SELECT * 
FROM film AS F 
INNER JOIN regista AS R USING (id_regista) 
INNER JOIN country AS C ON F.paese_produzione = C.CountryID 
WHERE id_film = ' .$_GET["id_film"];

$rows = $conn -> query($q);
//------------ RICHIESTA ED ELABORAZIONE DI DATI DAL DATABASE ------------

//------------ INVIO DEI DATI AL CLIENT ------------ 
$xml = new SimpleXMLElement('<films/>');
foreach($rows as $r)
{
    $film = $xml->addChild('film');
    foreach($r as $p => $v)
    {
        $film->addChild($p, $v);
    }
}
echo $xml->asXML();
//------------ INVIO DEI DATI AL CLIENT ------------