<html>
    <head>
        <?php
            $Titulo= $_POST["Titulo"];
                    
            $contenido="Titulo";

            $archivo = fopen("datos/$Titulo.txt","w");
            fwrite($archivo,$contenido)
        ?>
    </head>
    <body></body>
</html>