<?php
$preco = $_POST['preco'];
$dia = $_POST['dia'];
$musica = $_POST['musicaAoVivo'];

if($dia == 2 or $dia == 3 or $dia ==5){
    $preco = $preco*0.25;
}

if($musica == 'sim'){
    $preco = $preco*(-0.15);
}
echo "Ticket para $dia, Preço da entrada é $preco";