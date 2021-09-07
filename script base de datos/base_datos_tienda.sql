create database tiendagrupo18;
use tiendagrupo18;

create table clientes(
cedula_cliente integer not null auto_increment primary key,
direccion_cliente varchar(255),
email_cliente varchar(255),
nombre_cliente varchar(255),
telefono_cliente varchar(255)
);

create table usuarios(
cedula_usuario integer not null auto_increment primary key,
email_usuario varchar(255),
nombre_usuario varchar(255),
password varchar(255),
usuario varchar(255)
);

create table proveedores(
nit_proveedor integer not null auto_increment primary key,
ciudad_proveedor varchar(255),
direccion_proveedor varchar(255),
nombre_proveedor varchar(255),
telefono_proveedor varchar(255)
);

create table ventas(
codigo_venta integer not null auto_increment primary key,
cedula_cliente integer not null,
cedula_usuario integer not null,
iva_venta double,
total_venta double,
valor_venta double,
foreign key(cedula_cliente) references clientes(cedula_cliente),
foreign key(cedula_usuario) references usuarios(cedula_usuario)
);

create table productos(
codigo_producto integer not null auto_increment primary key,
iva_compra double,
nit_proveedor integer not null,
nombre_producto varchar(255),
precio_compra double,
precio_venta double,
foreign key(nit_proveedor) references proveedores(nit_proveedor)
);

create table detalle_ventas(
codigo_detalle_venta integer not null auto_increment primary key,
cantidad_producto int(11),
codigo_producto integer not null,
codigo_venta integer not null,
valor_total double,
valor_venta double,
valor_iva double,
foreign key(codigo_producto) references productos(codigo_producto),
foreign key(codigo_venta) references ventas(codigo_venta)
);


select * from clientes;
select * from usuarios;
select * from proveedores;
select * from ventas;
select * from productos;
select * from detalle_ventas;
SHOW TABLES;
SHOW FULL TABLES;

drop table clientes;
drop table usuarios;
drop table proveedores;
drop table ventas;
drop table productos;
drop table detalle_ventas;