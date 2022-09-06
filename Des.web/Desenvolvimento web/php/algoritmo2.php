<!-- Exemplo:
	- Entrada: 5
	- Saída: 
	5! = 5 * 4 * 3 * 2 * 1 = 120

    # 1! = 1 * 0!
	# 2! = 2 * 1!
	# 3! = 3 * 2!
	# 4! = 4 * 3!
	# 5! = 5 * 4! -->

<?php	
	$num = $_POST['num'];
	$fatorial = 1;
	$tmp = $num;
	
	for($i = 0; $i < $num; $i++) {
		echo $tmp . '! = ' . $tmp . ' * ' . ($tmp - 1) . ' = ';
		$fatorial *= $tmp;
		$tmp--;
		echo $fatorial . '<br>';
	}
	
	echo 'O fatorial do número ' . $num . ' é: ' . $fatorial;
?>