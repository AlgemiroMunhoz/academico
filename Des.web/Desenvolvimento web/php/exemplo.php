<?php
    $ARR = ['Carlos', 'Ana', 'Julia'];
    $ARR [] = ($_POST['aaaa'] == 1) ? 'Ana' : 'Julia';
?>
<html>
    <ul>
        <?php
            foreach ($ARR as $key => $value) {
                echo "<li classes=\"$key\">$value</li>";
            }
        ?>
    </ul>
    <form action = "index.php" method = "post">
        <input type = "submit" name = "enviar" value = "<?php echo $enviar; ?>" />
        <input type="button" value="enviar">
    </form>
</html>
<?php

// http://localhost
