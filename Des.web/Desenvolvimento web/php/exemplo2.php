<?php
    $arr = ['Carlos', 'Ana', 'Julia'];
    $arr[] = ($_POST['aaa']);
?>
<html>
    <ul>
        <?php
            foreach($arr as $value){
                echo "<li>".$value."</li>";
            }
        ?>
    </ul>
    <form action="index.php" method="post">
        <input type="text" name="aaa"/>
        <input type="submit" value="enviar" name="enviar"/>
    </form>
</html>