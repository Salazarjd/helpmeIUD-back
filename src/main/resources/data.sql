INSERT INTO usuarios (username, nombre, apellido, password, red_social, fecha_nacimiento, enabled, image)
values('juan.salazarv@es.iudigital.edu.co', 'juan', 'salazar', '', 0, '1990-11-23', 1, '')

INSERT INTO roles (nombre, descripcion)
       values('ROLE_ADMIN', 'aministrador')

INSERT INTO roles (nombre, descripcion)
values('ROLE_USER', 'usuario')

INSERT INTO roles_usuarios(usuarios_id, roles_id)
values(1,1)

INSERT INTO roles_usuarios(usuarios_id, roles_id)
values(1,2)

INSERT INTO delitos (nombre, descripcion, usuarios_id)
values('hurto', 'Cuando lo roban a uno', 1);

INSERT INTO delitos (nombre, descripcion, usuarios_id)
values('homicidio', 'Cuando lo matan a uno', 1);
