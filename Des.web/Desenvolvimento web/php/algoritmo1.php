<?php
    
    $num = -5; intval($_GET['num']);
    if($num &lt; 0){
        echo "O numero é negativo";
    }elseif($num == 0){
        echo "O numero é igual a 0";
    }else{
        echo "O numero é positivo";
    }

?>
