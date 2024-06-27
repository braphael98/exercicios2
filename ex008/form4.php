<?php
$horasMes = $_POST['horasMes'];
$salPorHora = $_POST['salPorHora'];
$horasExtra = $_POST['horasExtra'];


$salarioBruto = $salPorHora * $horasMes;

if($horasExtra == 0){
    $salarioBruto = $salPorHora * $horasMes;
    echo $salarioBruto*4;
    exit();
}

$valorHoraExtra = $salPorHora +($salPorHora/2);
$totalHorasExtras = $valorHoraExtra*$horasExtra;
$salarioComHoraExtra = ($salarioBruto*4)+ $totalHorasExtras;
echo "Salario total é $salarioComHoraExtra";









