package com.example.adrian.guanajuato.database;

/**
 * Created by adrian on 31/03/18.
 */

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;
import android.content.Context;

import android.database.Cursor;

import com.example.adrian.guanajuato.Entidades.Lugar;

import java.util.ArrayList;
import java.util.List;

public class Database {


    SQLiteDatabase db;

    public Database(Context ctx) {
        try {

            db = ctx.openOrCreateDatabase("bdprueba", 0, null);
            db.execSQL("drop table if exists ciudad;");
            db.execSQL("create table ciudad(id_ciudad int primary key, ciudad varchar(255));");
            db.execSQL("insert into ciudad(id_ciudad,ciudad) values(46,'Abasolo')," +
                    "(1,'Acámbaro')," +
                    "(2,'San Miguel de Allende')," +
                    "(3,'Apaseo el Alto')," +
                    "(4,'Apaseo el Grande')," +
                    "(5,'Atarjea')," +
                    "(6,'Celaya')," +
                    "(7,'Manuel Doblado')," +
                    "(8,'Comonfort')," +
                    "(9,'Coroneo')," +
                    "(10,'Cortazar')," +
                    "(11,'Cuerámaro')," +
                    "(12,'Doctor Mora')," +
                    "(13,'Dolores Hidalgo')," +
                    "(14,'Guanajuato')," +
                    "(15,'Huanímaro')," +
                    "(16,'Irapuato')," +
                    "(17,'Jaral del Progreso')," +
                    "(18,'Jerécuaro')," +
                    "(19,'León')," +
                    "(20,'Moroleón')," +
                    "(21,'Ocampo')," +
                    "(22,'Pénjamo')," +
                    "(23,'Pueblo Nuevo')," +
                    "(24,'Purísima del Rincón')," +
                    "(25,'Romita')," +
                    "(26,'Salamanca')," +
                    "(27,'Salvatierra')," +
                    "(28,'San Diego de la Unión')," +
                    "(29,'San Felipe')," +
                    "(30,'San Francisco del Rincón')," +
                    "(31,'San José Iturbide')," +
                    "(32,'San Luis de la Paz')," +
                    "(33,'Santa Catarina')," +
                    "(34,'Santa Cruz de Juventino Rosas')," +
                    "(35,'Santiago Maravatío')," +
                    "(36,'Silao de la Victoria')," +
                    "(37,'Tarandacuao')," +
                    "(38,'Tarimoro')," +
                    "(39,'Tierra Blanca')," +
                    "(40,'Uriangato')," +
                    "(41,'Valle de Santiago')," +
                    "(42,'Victoria')," +
                    "(43,'Villagrán')," +
                    "(44,'Xichú')," +
                    "(45,'Yuriria')");
            db.execSQL("drop table  if exists lugar;");
                db.execSQL("create table lugar(id_lugar int primary key, lugar varchar(255), ubicacion text, descripcion text,image text, id_ciudad int, constraint lugarFK foreign key (id_ciudad) references ciudad(id_ciudad));");
                db.execSQL("insert into lugar values" +
                        "(1,'Fuente taurina','Plazuela Hidalgo','También conocida como Pila de Águila. Fue construida para conmemorar la primera corrida de toros en la Nueva España en siglo XVI, presenta diversas escenas de tauromaquia; su estilo artístico no está bien definido. Se localiza en la Plazuela Hidalgo.','http://www.cultura.gob.mx/turismocultural/destino_mes/guanajuato/imgs/fuente_taurina.jpg',1)," +
                        "(2,'Templo de San Francisco','Atrio Parroquial S/N','El Templo de San Francisco, construido en el siglo XVII, con una proyección barroca. Este edificio tiene un hermoso atrio con 16 pilares, los cuales le brindan una estampa de solemnidad y nobleza.','https://photo620x400.mnstatic.com/3591423007b8cf624d3bceb3f624eea8/parroquia-de-san-francisco.jpg',1)," +
                        "(3,'El acueducto','Avenida Hidalgo esquina con Leandro Valle.','Construido en 1528, es una de las primeras obras hidráulicas realizadas en México durante la Conquista. Tiene nueve arcos, de forma ojival de medio punto, uno de los arcos se encuentra adornado con la escultura del señor San José.','http://www.cultura.gob.mx/turismocultural/destino_mes/guanajuato/imgs/acueducto.jpg ',1)," +
                        "(4,'Zona arqueológica de Chupícuaro','Norte de la ciudad.','Es una interesante zona arqueológica, en la que se han encontrado restos de cerámica y figurillas angulosas con formas geométricas.','http://www.cultura.gob.mx/turismocultural/destino_mes/guanajuato/imgs/chipicuaro.jpg',1)," +
                        "(5,'Templo del Hospital','Calle Hidalgo .','Su portada se encuentra enmarcada por un arco plateresco decorado con imágenes esculpidas en cantera, en las que se nota fuertemente la mano del artista indígena. En el interior destaca por su trabajo, sobre todo por un púlpito tallado totalmente en cantera. ','http://www.cultura.gob.mx/turismocultural/destino_mes/guanajuato/imgs/templo_hospital.jpg',1)," +

                        "(6,'Museo de momias','Tecnológico s/n, Bajío de Las Americas.','En este museo puedes conocer las diferentes culturas que han dado lugar a Celaya y parte de México. Cuenta con ocho salas y nueve ejes temáticos en los que puedes apreciar desde pinturas, artículos antiguos y monumentos de épocas atrás.','https://c1.staticflickr.com/7/6001/5983487427_03c4fda72d_b.jpg',6)," +
                        "(7,'Plaza de Armas','Jardin principal.','Esta plaza se fundó en el año de 1906 por el reconocido ingeniero Brunel, tiene una estructura arquitectónica definida por hermosos portales, adentro se encuentra un kiosko artístico, enfrente de dicha plaza se llevan a cabo eventos representativos de la cultura y sociedad de Celaya.','https://cdnblog.mexicodestinos.com/blog/wp-content/uploads/2013/05/Plaza-de-Armas2-e1369501309799.jpg',6)," +
                        "(8,'Presidencia Municipal','Jardin principal.','En el Palacio Municipal puedes visitar y admirar los murales donde se representan a los Héroes de México, estos fueron creados por el artista Octavio Ocampo, además, este edificio fue construido en el siglo XVIII, lo que te da una idea de la historia que aquí puedes encontrar.','https://cdnblog.mexicodestinos.com/blog/wp-content/uploads/2013/05/Presidencia-Municipal-e1470437284796.jpg',6)," +
                        "(9,'Catedral de Celaya','Francisco I. Madero 201.','La Catedral es una de las creaciones del Arquitecto Tresguerras, fue remodelada en el siglo XIX con un estilo neoclásico. Representa a Celaya por ser sin duda una estructura hermosa cuyo interior esta decorado con bellos murales como “La Resurrección de Lázaro”, “El Juicio Final”, entre otras.','https://cdnblog.mexicodestinos.com/blog/wp-content/uploads/2013/05/Catedral-de-Celaya-560x420.jpg',6)," +
                        "(10,'Templo de la Tercera Orden','Indepencia, Col. Centro.','Otra obra del Arquitecto Tresguerras es este templo, donde también incluyo su obra artística en el año de 1820. Tiene un estilo neoclásico y es uno de las más antiguos en Celaya.','https://cdnblog.mexicodestinos.com/blog/wp-content/uploads/2013/05/Templo-de-la-tercera-Orden-568x420.jpg',6)," +
                        "(11,'Templo del carmen','El Carmen, Col. Centro.','Este templo es una de las verdaderas obras maestras del arquitecto Tresguerras, pues en esté se plasma parte de su ingenio, el templo tiene un estilo neoclásico y su interior es de una belleza inigualable. Se aprecian murales y pinturas que representan  parte de la historia cristiana.','http://www.itcelaya.edu.mx/deportivo/wp-content/uploads/2016/08/42361321.jpg',6)," +
                        "(12,'Bola de agua','Jardin principal','Uno de los símbolos que representa a Celaya y es que es la única de su tipo en el mundo. Fue construida por el alemán Enrique Shondube. Se trata de una gran esfera que distribuye agua a una parte de la ciudad desde el año 1908. Tiene una altura de 35 metros y de diámetro 12.','https://cdnblog.mexicodestinos.com/blog/wp-content/uploads/2013/06/la-bola-del-agua-04-600x300.jpg',6)," +


                        "(13,'Callejon del beso','Zona Centro','Dos balcones, separados por apenas 68 centímetros sobre una estrecha calle es lo que se conoce como el Callejón del Beso. Este lugar también tiene su propia leyenda. Si lo visitas en pareja tienes que besarla en el tercer escalón del callejón, garantizan 7 años de felicidad.','http://elfonografo.mx/wp-content/uploads/2018/03/Blog_20180322_Leyendas_ElCallejonDelBeso1.jpg',14)," +
                        "(14,'Universidad de Guanajuato','Noria Alta S/N.','Este edificio neoclásico se convirtió en Universidad en 1945. Durante sus primeros años fue un hospicio. Su belleza es singular y esta construida en cantera verde con una hermosa escalinata desde la cual se tiene una gran muy buena vista de la Ciudad de Guanajuato.','https://cdnblog.mexicodestinos.com/blog/wp-content/uploads/2013/05/universidad-de-guanajuato.jpg',14)," +
                        "(15,'Teatro Juárez','De Sopeña 10.','Es tal vez después del Palacio de Bellas Artes en la Ciudad de México, el teatro más hermoso de México. Construido entre 1872 y 1903, de estilo dórico romano, fué inaugurado el 27 de Octubre de 1903 por el entonces Presidente Porfirio Díaz con la ópera Aída. Se encuentra en la Plazuela de Cata 1, Guanajuato.','https://cdnblog.mexicodestinos.com/blog/wp-content/uploads/2013/05/guanajuato-.jpg',14)," +
                        "(16,'Alhóndiga','calle 28 de Septiembre, esquina con Mendizába','La Alhóndiga de Granaditas es un edificio construido en la ciudad de Guanajuato, en el estado de Guanajuato, México, a finales del siglo XVIII, en tiempos del virreinato, empleado en un principio como almacén y comercio de granos (es decir, una alhóndiga).','https://upload.wikimedia.org/wikipedia/commons/thumb/c/c2/Alhondiga-Granaditas-Mexico.JPG/270px-Alhondiga-Granaditas-Mexico.JPG',14)," +
                        "(17,'Palacio de Gobierno','Paseo de La Presa 103, Barrio de la Presa.','Los legisladores y servidores públicos en Guanajuato pueden sentirse orgullosos de tener uno de los mas bellos palacios legislativos en México. Su fachada es de estilo neoclásico y el interior tiene una marcada influencia Art Nouveau del siglo XIV.','https://cdnblog.mexicodestinos.com/blog/wp-content/uploads/2013/05/palacio-de-gobierno-guanajuato.jpg',14)," +
                        "(18,'Puente del Campanero y cuesta del Tecolote','Calle numero 10','Es un lugar muy singular en Guanajuato. Se trata de un pequeño puente que une a dos casas. Aquí puedes disfrutar de un café o te en el restaurante del lugar.','https://cdnblog.mexicodestinos.com/blog/wp-content/uploads/2013/05/puente-del-campanero.jpg',14)," +
                        "(19,'Jardín del Cantador','Cantador 72, Zona Centro.','Tiene columnas en cantera, fuentes y en su centro un quisco. Su nombre se debe a José Carpio, un músico que animaba en este lugar en la época de la colonia a los habitantes con su música.','https://cdnblog.mexicodestinos.com/blog/wp-content/uploads/2013/05/jardin-el-cantador.jpg',14)," +

                        "(20,'Jardín Principal','Principal, Centro.','Este jardín es el corazón turístico de San Miguel de Allende, aunque el parque por si solo es atractivo, merece la pena darse una vuelta por las tardes para escuchar a los músicos que aquí se reúnen. Durante el Festival Cervantino este parque esta inundado literalmente de estudiantinas.','https://cdnblog.mexicodestinos.com/blog/wp-content/uploads/2013/05/parque-principal-san-miguel-de-allende.jpg',2)," +
                        "(21,'Casa de las Conspiraciones','Corregidora 14, Centro','Esta casona del Siglo XVIII perteneció a Domingo Allende, hermano del héroe de la Independencia de México Ignacio Allende.','https://cdnblog.mexicodestinos.com/blog/wp-content/uploads/2013/05/casa-plaza-conspiraciones.jpg',2)," +
                        "(22,'Museo Casa de Ignacio Allende','Cuna de Allende 1, Centro','Este edificio considerado histórico empezó a construirse en el año de 1760 por órdenes de Don Domingo Narciso de Allende. ','https://cdnblog.mexicodestinos.com/blog/wp-content/uploads/2013/05/museo-casa-allende-gto.jpg',2)," +
                        "(23,'El Charco del Ingenio','Paloma S/N, Las Colonias.','Se trata de una reserva natural ubicada muy cerca de San Miguel de Allende. El Charco tiene una colección de cactáceas y otras plantas de la región, varias de ellas en peligro de extinción.','https://cdnblog.mexicodestinos.com/blog/wp-content/uploads/2013/05/charco-del-ingenio.jpg',2)," +
                        "(77,'Teatro Angela peralta','Mesones 82, Centro.','Este teatro se empezó a construir en 1871, dos años después de haberse terminado nadie sabía que nombre ponerle, fue una casualidad que en aquella época la soprano mexicana Ángela Peralta se encontraba en esas fechas en Guanajuato, por lo que para recordar este acontecimiento se decidió llamarlo así.','http://www.de-paseo.com/san-miguel-de-allende/wp-content/uploads/2015/07/sma-si-teatro-angela-peralta-head.jpg',2),"+

                        "(24,'Parroquia de Nuestra Señora de los Dolores','Entre calle Queretaro y Plaza Principal S/N, Centro.','Cada templo en México tiene una historia que contar, pero este en particular además de bello, fue donde nació la libertad.','https://elsouvenir.com/wp-content/uploads/2015/09/dolores-hidalgo-parroquia.jpg',13)," +
                        "(25,'Museo de José Alfredo Jiménez y Mausoleo','Guanajuato 13, Centro.','En esta casa nació José Alfredo Jiménez y vivió sus primeros años; a la entrada del museo -en la primera sala- nos encontraremos con una pintura al óleo sobre tela de Octavio Ocampo.','https://elsouvenir.com/wp-content/uploads/2015/09/dolores-hidalgo-museo-jose-alfredo.jpg',13)," +
                        "(26,'Viñedos Cuna de Tierra','Carretera Dolores Hidalgo - San Luis de la Paz Km.11','Cuna de Tierra cuenta con una gran extensión para que puedas gastar toda una tarde disfrutando un paseo por los viñedos y conocer el proceso de cómo se hacen los vinos de casa, visitar sus tanques de oxidación, sus barricas y además podrás disfrutar de una degustación tipo cata.','https://elsouvenir.com/wp-content/uploads/2015/09/dolores-hidalgo-campos-cuna-de-tierra.jpg',13)," +

                        "(27,'Fuente de Aguas Danzarinas','Plazuela Miguel Hidalgo 271, Col. Centro.','Esta fuente es una de las atracciones más conocidas de Irapuato. Cada cierto tiempo el agua de esta fuente danza acompañada con luz y sonido, en un espectáculo que sorprende a los visitantes. Por las noches se puede apreciar mejor ya que el agua se torna de diversos colores. Se encuentra en el centro de la cuidad a un lado de la Catedral.','https://cdnblog.mexicodestinos.com/blog/wp-content/uploads/2013/06/Fuente-de-Aguas-Danzarinas.jpg',16)," +
                        "(28,'Torre del Reloj del Sol','Plaza juarez','Este reloj es una de las piezas labradas en cantera más antiguos y mejor conservados. Se encuentra en la “Plaza Juan Álvarez”.','https://cdnblog.mexicodestinos.com/blog/wp-content/uploads/2013/06/Torre-del-Reloj-del-Sol-1.jpg',16)," +
                        "(29,'Colegio de la Enseñanza o Palacio Municipal','Jardín Principal S/N, Centro.','Construido entre los años 1800 y 1804 tiene un estilo neoclásico, por dentro tiene un patio muy amplio ya que estaba destinado a ser una construcción de dos pisos que por diferentes circunstancias no se hizo.','https://cdnblog.mexicodestinos.com/blog/wp-content/uploads/2013/06/Palacio-Municipal.png',16)," +
                        "(30,'Casa de la Cultura','Álvaro Obregón 16, Col. Centro.','Edificio de estilo neoclásico, dentro tiene un amplio patio en el que se imparten talleres y diferentes disciplinas de arte, además de vender y exhibir exposiciones artísticas, puedes visitarlo durante el día y llevarte algunos recuerdos de este buen lugar para la cultura y las artes.','https://cdnblog.mexicodestinos.com/blog/wp-content/uploads/2013/06/Casa-de-la-cultura-Irapuato.jpg',16)," +
                        "(31,'Catedral de Irapuato','Plazuela Abasolo 271, Col. Centro.','Es una hermosa estructura estilo barroco. Se dice que por el año 1631 ya estaba construida, tiene un diseño en forma de cruz y en su interior puedes admirar monumentos y la famosa Virgen de la Soledad que es una de las más antiguas en la catedral.','https://cdnblog.mexicodestinos.com/blog/wp-content/uploads/2013/06/Catedral-Irapuato.jpg',16)," +

                        "(32,'Arco Triunfal de la Calzada de los Héroes','Calle Calz. de los Heroes 104, Centro.','Este arco es un orgullo de la Ciudad de León. Fue construido para conmemorar el 83 aniversario de la Independencia de México en 1893.','https://cdnblog.mexicodestinos.com/blog/wp-content/uploads/2013/05/arco-los-heroes-leon.jpg',19)," +
                        "(33,'Museo de Ciencias Explora','Francisco Villa 202, La Maﬂinica.','Un lugar donde los niños de 3 a 99 años lo van a disfrutar. Se trata del típico museo “toca juega y aprende”, tiene 6 salas temáticas interactivas , galería de exposiciones temporales, un lago, juegos, pista para correr, sala de lectura, cafetería, teatro IMAX, auditorio al aire libre y decenas de actividades.','https://cdnblog.mexicodestinos.com/blog/wp-content/uploads/2013/05/museo-explora.jpg',19)," +
                        "(34,'Parque Metropolitano','Blvd. A. López Mateos Nte. s/n Col. Presa El Palote.','En este parque los meses de noviembre se lleva a cabo el Festival Internacional de Globo Aerostático, es un espectáculo en el que que niños y adultos quedarán encantados de presenciar. En cualquier otra época del año puedes visitar la presa y los restos de una antigua hacienda del siglo XVIII, hay tirolesas.','https://cdnblog.mexicodestinos.com/blog/wp-content/uploads/2013/05/parque-metropolitano-de-leon.jpg',19)," +
                        "(35,'Vergel de la Sierra','Carretera León-San Felipe Km. 26.\n','Vergel de la Sierra es ideal para la practica del ecoturismo. Cuenta con todos los serviios para pasar un día de campo, campo de golf de 18 hoyos y diversas actividades recreativas como paseos en kayac, motos, pesca y rappel entre otros. También dispone de alojamiento y restaurante. ','https://cdnblog.mexicodestinos.com/blog/wp-content/uploads/2013/05/vergel-leon.png',19)," +
                        "(36,'El Zoológico de León (Zooleon)','Se encuentra en Camino a Ibarrilla kilómetro 6, Arboledas de La Luz.','En este zoológico hay un safari nocturno muy interesante el cual te recomiendo. Es interesante ya que se encuentra ubicado en un área natural en la que viven más de 2000 animales de 240 especies diferentes.','https://cdnblog.mexicodestinos.com/blog/wp-content/uploads/2013/05/zoologico-de-leon-gto.jpg',14)" +
                        ";");
        } catch (Exception e)

        {
            Log.d("Base de Datatos", "Exception initBD: " + e.toString());
        }


    }

    public String[] getciudad() {
        int cont=0;
        String ciudades[] = new String[46];
        String[] atributos={"ciudad"};
        Cursor c = null;
        c = db.query("ciudad", atributos, null, null, null, null, "ciudad asc");
        try {

            if (c.moveToFirst()) {
                //Recorremos el cursor hasta que no haya más registros
                do {

                    ciudades[cont]= c.getString(0);
                    cont++;
                } while(c.moveToNext());
            }

            return ciudades;

        } catch (Exception e) {

            Log.d("BASEDATOS", e.toString());

        }
        return ciudades;
    }
    public List<Lugar> get_lugar(String id_ciudad)
    {
        String[] atributos={"ciudad"};
         List<Lugar> product_list1=new ArrayList<Lugar>();
        List<String> list =new ArrayList<String>();
        String rawQuery="";
        if(id_ciudad.equals("todos")) {
            rawQuery = "SELECT id_lugar,c.ciudad,lugar,descripcion,ubicacion,image FROM ciudad c inner join lugar l on l.id_ciudad=c.id_ciudad"
                    ;
        }
        else {
             rawQuery = "SELECT id_lugar,c.ciudad,lugar,descripcion,ubicacion,image FROM ciudad c inner join lugar l on l.id_ciudad=c.id_ciudad"
                    + " WHERE ciudad = '"+id_ciudad+"'" ;
        }

        Cursor c = db.rawQuery(
                rawQuery,
                null
        );
        try {

            if (c.moveToFirst()) {
                //Recorremos el cursor hasta que no haya más registros
                do {

                    product_list1.add(new Lugar(
                            c.getInt(0),
                            c.getString(1),
                            c.getString(2),
                            c.getString(3),
                            c.getString(4),
                            c.getString(5)
                    ));
                    list.add(c.getString(2));
                } while(c.moveToNext());
            }

            return product_list1;

        } catch (Exception e) {

            Log.d("BASEDATOS", e.toString());

        }
        return product_list1;
    }

}
