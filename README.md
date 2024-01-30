PROGRAMACIÓN JAVA 11/12/2023

Se está desarrollando en Java una aplicación de gestión para una empresa. El código está

organizado en tres paquetes distintos:

company: En este paquete irán las clases comunes a toda la aplicación.

utils: En este paquete irán las clases de utilidad general para varias aplicaciones.

main: En este paquete se realizará una pequeña aplicación de prueba.

Ya se encuentra realizada una parte casi funcional para la aplicación de prueba en el paquete main.

Muchas de las clases elaboradas disponen de un método main propio para probar su funcionalidad.

Debemos completar la aplicación de modo que podamos probar llevando a cabo los siguientes

puntos:

NOTA: No os obsesionéis con que funcione. Si no hacéis bien algún punto es posible que no podáis probar. Podéis hacer main

propios en vuestros desarrollos para probar lo que necesitéis.

EXERCICIO 1.- (1 punto)

Queremos representar los días de la semana en el paquete utils mediante un elemento llamado DiaSemana

accesible desde cualquier sitio y del que únicamente pueden existir los siguientes objetos: LUNES, MARTES,

MIÉRCOLES, JUEVES, VIERNES, SÁBADO, DOMINGO.

EXERCICIO 2.- (1 punto)

Queremos representar los meses del año en el paquete utils mediante un elemento llamado Mes accesible desde

cualquier sitio y del que únicamente pueden existir los siguientes objetos: ENERO, FEBRERO, MARZO, ABRIL,

MAYO, JUNIO, JULIO, AGOSTO, SEPTIEMBRE, OCTUBRE, NOVIEMBRE, DICIEMBRE.

Estos objetos tendrán el método public int dias(int año); que retornará el número de días que tiene el mes,

teniendo en cuenta el año pasado como argumento que puede ser bisiesto.

Un año bisiesto es aquel que es divisible entre 400 o que es divisible entre 4 y no entre 100.

EXERCICIO 3.- (2 puntos)

En el paquete utils tenemos los enum Provincia, Country y Bank. Queremos completar los siguientes aspectos:

1) Añadir un método ESTÁTICO a estos enum sobrecargado si es necesario llamado get que permita:

- Obtener un objeto Country a partir de su código ISO de dos letras lanzando una

IllegalArgumentException en caso de que no exista.

- Obtener un objeto Country a partir de su código numérico de país lanzando una

IllegalArgumentException en caso de que no exista.

- Obtener un objeto Bank a partir de su código bancario, en caso de no encontrarse un banco con ese

código debe retornar el elemento UNKNOWN\_BANK.

- Obtener un objeto Provincia a partir de su código alfabético o numérico, lanzando una

IllegalArgumentException si el código no corresponde con ninguna provincia.

b) Sobrescribir el método necesario para que la representación como String de un Country sea "nombre del país" y

el de un Bank "[código] nombre del banco".

EXERCICIO 4.- (2 puntos)

El número de la Seguridad Social en España consiste en un número de 12 dígitos en los que los 2 primeros

números representan la provincia, los 8 siguientes son el número de la seguridad social y los últimos 2 son los

dígitos de control.

Para calcular los dígitos de control, se calcula el resto de la división de los 10 primeros dígitos entre 97. Un NSS

es correcto si el número de control así calculado coincide con el número de control especificado en el número

completo de la seguridad social.

Se pide desarrollar en el paquete utils la clase NSS que representa un número de la seguridad social y que tiene los

siguientes métodos:

public NSS(String numss): Constructor. Lanza una IllegalArgumentException si el NSS no es correcto

(verificando los dígitos de control).

public String control(): Retorna los dígitos de control del NSS.

public int numero(): Retorna el número de la SS del objeto (sin tener en cuenta la provincia y el número de

control).

public Provincia provincia(): Retorna el objeto Provincia que corresponde con el NSS. Se debe usar el método

estático de Provincia Provincia get(String code) para obtener la provincia (aunque no hagáis el método en el

ejercicio 3).

NOTA: Debéis hacer uso de Long y el tipo primitivo long para gestionar números de 64 bits que necesitaréis para operar con el

número de 10 dígitos. Otra alternativa es el uso de BigInteger.

EXERCICIO 5.- (3 puntos)

Queremos hacer una gestión de personal basada en Trabajadores y Candidatos.

Un Candidato es una persona que tiene posibilidad de trabajar en la empresa, y se quiere registrar sobre él la

siguiente información únicamente accesible desde la propia clase o clases heredadas:

Nif dni: Es un objeto de tipo Nif definido en el paquete utils que indica el DNI del candidato.

String apellidosNombre: Almacena los apellidos y nombre del candidato.

String dirección: Almacena la dirección donde vive el candidato.

String teléfono: Almacena el teléfono donde vive el candidato.

String email: Almacena el correo electrónico del candidato.

El DNI no es modificable.

Un Trabajador es un Candidato que firma un contrato laboral con la empresa. Sus atributos solo son accesibles

desde la propia clase, y son:

NSS nss: Es un objeto de tipo NSS definido en el paquete utils que indica el Número de la Seguridad Social del

trabajador.

LocalDate fechaAlta: Es la fecha de alta en la empresa.

Iban iban: Es un objeto de tipo Iban definido en el paquete utils, que indica la cuenta bancaria para el ingreso del

salario.

double salario: Salario mensual del trabajador.

Ni el número de seguridad social ni la fecha de alta son modificables.

La representación como String tanto de los trabajadores como de los candidatos es el [DNI] apellidos y nombre.

Estas dos clases deben tener un constructor que reciba toda la información de los atributos y un

constructor de copia encargado de crear una copia del trabajador/candidato recibido en el constructor.

Para que el constructor de copia funcione correctamente debe implantarse también en las clases que lo precisen.

Por ejemplo, dos objetos distintos (que no son el mismo objeto) no pueden compartir un mismo objeto Iban.

Se pide desarrollar completamente estas dos clases incluyendo los métodos getter y setter necesarios para

gestionar los distintos atributos.

EXERCICIO 6.- (1 punto)

En el paquete utils tenemos desarrollada la clase Storage. Esta clase gestiona el almacenamiento y consulta de

objetos en un Object[]. A partir de esta clase, tenemos desarrollada en el paquete company la clase Curriculos,

que gestiona el almacenamiento de los objetos Candidato.

Teniendo en cuenta que los Trabajadores son Candidato, se pide desarrollar completamente la clase Plantilla

que permite gestionar el almacenamiento de los trabajadores de la empresa a través de la funcionalidad ofrecida

por Storage.
