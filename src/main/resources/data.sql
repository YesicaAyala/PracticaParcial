-- Datos iniciales para la tabla `pais`
INSERT INTO pais (id, nombre) VALUES
(1, 'Japón'),
(2, 'Estados Unidos'),
(3, 'Corea del Sur');

-- Datos iniciales para la tabla `tipo`
INSERT INTO tipo (id, nombre) VALUES
(1, 'Shonen'),
(2, 'Seinen'),
(3, 'Shojo'),
(4, 'Josei');

-- Datos iniciales para la tabla `manga`
INSERT INTO manga (id, nombre, fecha_lanzamiento, temporadas, pais_id, anime, juego, pelicula, tipo_id) VALUES
(1, 'Naruto', '1999-09-21', 10, 1, TRUE, FALSE, TRUE, 1),
(2, 'One Piece', '1997-07-22', 20, 1, TRUE, TRUE, TRUE, 1),
(3, 'Death Note', '2003-12-01', 1, 1, TRUE, FALSE, TRUE, 2),
(4, 'Solo Leveling', '2018-03-04', 1, 3, TRUE, FALSE, FALSE, 2);

-- Datos iniciales para la tabla `usuario`
INSERT INTO usuario (id, username, nombre, email, password) VALUES
(1, 'usuario1', 'Juan Pérez', 'juan.perez@example.com', 'password123'),
(2, 'usuario2', 'Ana Gómez', 'ana.gomez@example.com', 'password456');

-- Datos iniciales para la tabla `favorito`
INSERT INTO favorito (manga_id, usuario_id) VALUES
(1, 1),
(2, 1),
(3, 2);
