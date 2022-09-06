<?php 

    $data = $_POST['data'];

    $dia = date('w', strtotime($data));

    switch ($dia) {
        case 0:
            echo "Domingo";
            break;
        
        case 1:
            echo "Segunda";
            break;

        case 2:
            echo "Terça";
            break;

        case 3:
            echo "Quarta";
            break;

        case 4:
            echo "Quinta";
            break;

        case 5:
            echo "Sexta";
            break;

        case 6:
            echo "Sábado";
            break;
    }
 ?>