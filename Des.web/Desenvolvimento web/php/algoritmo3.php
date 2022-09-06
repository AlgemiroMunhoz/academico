<!-- desenvolver um sistema para calcular e exibir a media final de um estudante (professor pode escolher a
quantidade de atividades avaliativas feita pelo estudante) se media maior que 6 exiba que esta aprovado
ou reprovado -->

<?php

    $notas = [4, 10, 7, 5, 8, 9];
    $media = 0;

    foreach ($notas as $nota) {
        $media += $nota;
    }

    $media = $media / count($notas);

    if ($media >= 6) {
        echo "Aluno aprovado com média $media";
    } else {
        echo "Aluno reprovado com média $media";
    }
?>