
<?php
$salarioBruto = $_POST['salarioBruto'];
$valorPrestacao = $_POST['valorPrestacao'];



$valorDoSalario = ($salarioBruto *30)/100;

if($valorPrestacao > $valorDoSalario){
 echo "Não é possivel realizar o emprestimo";
} else {
    echo "É possivel realizar o emprestimo";
}


