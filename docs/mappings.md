![](media/image1.png){width="5.905555555555556in"
height="2.3319444444444444in"}

**Descripción**

  Proyecto             HERCULES
-------------------- ------------------------------------------------------------
  Documento            Datasets Hercules
  Autor                Jorge Carrillo (datasets de origen)/ WESO-IZERTIS (mapeos)
  Destinatario         
  Nombre del fichero   Datasets Hercules.docx
  Versión actual       0.2
  Fecha modificación   31/10/2019

**Resumen**

Descripción básica del contenido del documento.

**Control de versiones**

  **Ver.**   **Fecha**    **Autor**                    **Cambios**
---------- ------------ ---------------------------- ----------------------------------------------------------------------
  0.1        25/10/2019   Universidad de Murcia (JC)   Versión inicial
  0.2        31/10/2019   Universidad de Murcia (JC)   Añadido GOLIAT y PAGINA
  0.3        27/12/2019   WESO-IZERTIS                 Primera versión del borrador de mapeos ontológicos para los datasets

Contenido {#contenido .TOC-Heading}
=========

[1 Introducción 5](#introducción)

[2 Vocabularios de interés 5](#vocabularios-de-interés)

[2.1 Infraestructuras ontológicas ad hoc de alto nivel
5](#infraestructuras-ontológicas-ad-hoc-de-alto-nivel)

[2.1.1 Prolegómeno 5](#prolegómeno)

[2.1.2 VIVO y su *ecosistema* 5](#vivo-y-su-ecosistema)

[2.1.3 CERIF y su *ecosistema* 6](#cerif-y-su-ecosistema)

[2.1.4 SPAR y su *ecosistema* 6](#spar-y-su-ecosistema)

[2.2 Otras *familias* de vocabularios o vocabularios individuales de
interés
6](#otras-familias-de-vocabularios-o-vocabularios-individuales-de-interés)

[2.2.1 Prolegómeno 6](#prolegómeno-1)

[2.2.2 La *familia* Dublin Core 6](#la-familia-dublin-core)

[2.2.3 La *familia* SKOS 6](#la-familia-skos)

[2.3 Vocabularios básicos 7](#vocabularios-básicos)

[2.4 Vocabularios transversales 7](#vocabularios-transversales)

[3 Clases de alto nivel 7](#clases-de-alto-nivel)

[3.1 Prolegómeno 7](#prolegómeno-2)

[3.2 La clase 'Organización' 7](#la-clase-organización)

[3.3 La clase 'Proyecto' 8](#la-clase-proyecto)

[3.4 La clase 'Contrato' 8](#la-clase-contrato)

[3.5 La clase 'Patente' 8](#la-clase-patente)

[3.6 La clase 'Participante' 8](#la-clase-participante)

[3.7 La clase 'Financiación' 9](#la-clase-financiación)

[3.8 La clase 'Convocatoria' 9](#la-clase-convocatoria)

[3.9 Las clases 'Área científica' y 'Recurso humano']

[4 Datasets Murcia \[provisional\] 9](#datasets-murcia-provisional)

[4.1 Proyectos y su gestión \[cf:Project; frapo:Project; foaf:Project;
vivo:Project\]
9](#proyectos-y-su-gestión-cfproject-frapoproject-foafproject-vivoproject)

[4.1.1 Orígenes de los proyectos \[cf:Project; frapo:Project;
foaf:Project; vivo:Project\]
9](#orígenes-de-los-proyectos-cfproject-frapoproject-foafproject-vivoproject)

[4.1.2 Jerarquía y dependencias de proyectos \[deps:Dependency\]
10](#jerarquía-y-dependencias-de-proyectos-depsdependency)

[4.1.3 Datos de gestión de los proyectos \[frapo-cerif-time\]
10](#datos-de-gestión-de-los-proyectos-frapo-cerif-time)

[4.1.4 Justificaciones de proyectos 16](#justificaciones-de-proyectos)

[4.1.5 Auditorías de proyectos \[km4c:Auditing\_activities\]
18](#auditorías-de-proyectos-km4cauditing_activities)

[4.1.6 Proyectos finalistas \[cf:Project; frapo:Project; foaf:Project;
vivo:Project\]
19](#proyectos-finalistas-cfproject-frapoproject-foafproject-vivoproject)

[4.1.7 Clasificación de proyectos \[cf:Project; frapo:Project;
foaf:Project; vivo:Project\]
20](#clasificación-de-proyectos-cfproject-frapoproject-foafproject-vivoproject)

[4.2 Recursos Humanos \[fea:HumanResource\]
20](#recursos-humanos-feahumanresource)

[4.3 Ayudas \[frapo, c4n, cf\] 24](#ayudas-frapo-c4n-cf)

[4.4 Contratos \[cf:Contract; frapo:Contract; vivo:Contract;
pext:Contract\]\[frapo:EmploymentContract; frapo:ServiceContract\]
31](#contratos-cfcontract-frapocontract-vivocontract-pextcontractfrapoemploymentcontract-fraposervicecontract)

[4.5 Grupos de Investigación \[frapo:ResearchGroup;
aiiso:ResearchGroup\]
33](#grupos-de-investigación-fraporesearchgroup-aiisoresearchgroup)

[4.6 Otros tipos de proyectos 34](#otros-tipos-de-proyectos)

[4.7 Actividades \[prov:Activity\] 34](#actividades-provactivity)

[4.8 Patentes \[all:Patent\] 36](#patentes-allpatent)

[4.9 GOLIAT 38](#goliat)

[4.10 PAGINA 39](#pagina)

Introducción
============

El proyecto Hércules contempla un modelo ontológico que se inserta en la
filosofía de la Web Semántica y la iniciativa de datos enlazados. Esto
hace que resulten absurdas las iniciativas individualistas que ignoren
el camino recorrido hasta ahora en más de 15 años de esfuerzo
*semántico*.

Por eso, este documento analiza los *datasets* suministrados por la
Universidad de Murcia y los pone en relación con vocabularios relevantes
tanto llevados a cabo en Europa como en Estados Unidos y Canadá.

No obstante, la visión más localista del contexto de la universidad
española, ejemplificada por la Universidad de Murcia, no se descuidará,
siguiendo un poco el famoso adagio de "llegar a lo universal desde lo
local".

Este documento recoge la primera aproximación al modelado del dominio y
se materializa por una parte en un estado de la cuestión y por otra
parte en una propuesta preliminar de mapeos a nivel de clases
ontológicas.

, con análisis de iniciativas parecidas

2.  Vocabularios de interés
    =======================

    1.  Infraestructuras ontológicas ad hoc de alto nivel
        -------------------------------------------------

### Prolegómeno

Por infraestructuras ontológicas de alto nivel entendemos aquellas
arquitecturas complejas e integradoras diseñadas para afrontar un
desafío parecido al que plantea el proyecto Hércules. Consideramos en
este sentido los esfuerzos llevados a cabo aquende y allende del
Atlántico, es decir los dos polos occidentales más importantes en
iniciativas de este tipo (sin por ello desmerecer ni subestimar otras
áreas de manera etnocentrista): Estados Unidos/Canadá y Europa.

### VIVO y su *ecosistema*

La ontología [VIVO](http://www.vivoweb.org/download), sufragada por la
[NIH](https://www.nih.gov/), es un vocabulario pensado para modelar
comunidades académicas de investigación, incluyendo científicos,
publicaciones, recursos, financiación, centros de investigación y
servicios relacionados. Teniendo en cuenta que en la época de su
creación aún no había un estándar semántico para integrar información
oficial de comunidades académicas (y como demuestra el proyecto
Hércules, parece que sigue sin haberlo).

### CERIF y su *ecosistema*

Como iniciativa semejante a VIVO y casi podríamos decir paralela, surgen
en Europa diversas iniciativas, a menudo con cierto grado de vinculación
entre ellas, que vienen a llenar nichos temáticos semejantes.

### SPAR y su *ecosistema*

Como iniciativa también principalmente europea y vinculada a CERIF
tenemos

Otras *familias* de vocabularios o vocabularios individuales de interés
-----------------------------------------------------------------------

### Prolegómeno

En el contexto del proyecto Hércules conviene no desdeñar otras
iniciativas menores y no tan directamente relacionadas con el dominio a
formalizar, pero aún así relevantes y de utilidad para la arquitectura
ontológica recogida en este documento.

### La *familia* Dublin Core

El esquema Dublin Core aglutina un pequeño número de términos que se
usan para describir recursos tanto digitales (vídeo, imágenes, páginas
web, etc.), como físicos (libros, discos, obras de arte)

-   [dcterms](http://purl.org/dc/terms/):

-   [dc](http://purl.org/dc/elements/1.1/):

### La *familia* SKOS

Aunque el principio SKOS (Simple Knowledge Organization System) es una
recomendación del W3C para la representación de vocabularios controlados
(tesauros, esquemas de clasificación, taxonomías, sistemas basados en
*subject-heading* o cualquier otro tipo de vocabulario controlado
estructurado), el modelado que hace de las etiquetas léxicas es de los
más completos y englobantes disponibles en la Web Semántica. Si a eso
añadimos las extensiones XL y XKOS, obtenemos abundantes propiedades de
interés para la arquitectura de ASIO.

-   [skos-core](http://www.w3.org/2004/02/skos/core): la opción que
    consideramos óptima para el soporte de multilingüismo en Hércules

-   [xkos](http://rdf-vocabulary.ddialliance.org/xkos): una extensión de
    SKOS-core para datos estadísticos

-   [skos-xl](http://www.w3.org/2008/05/skos-xl): una extensión de
    SKOS-core que proporciona soporte adicional para describir y enlazar
    etiquetas léxicas.

    1.  Vocabularios básicos
        --------------------

Denominamos vocabularios semánticos básicos a aquellos que, en el
contexto de la Web Semántica, tienen carácter seminal o *meta*.

-   [rdf](http://www.w3.org/1999/02/22-rdf-syntax-ns): la especificación
    de RDF

-   [rdfs](http://www.w3.org/2000/01/rdf-schema): la especificación de
    RDF schema

-   [xsd](http://www.w3.org/2001/XMLSchema): la especificación de XML
    schema

-   owl:

    1.  Vocabularios transversales
        --------------------------

Denominamos vocabularios semánticos transversales a aquellos que, en el
contexto de la Web Semántica, tienen carácter complementario respecto a
nuestro modelo ontológico.

Clases de alto nivel
====================

Prolegómeno
-----------

Siendo de tan alto nivel, la mayoría de las clases listadas en cada
apartado de esta sección son equivalentes *funcionalmente* y se podrían
hacer equivaler por medio de la propiedad sameAs de OWL.

La clase 'Organización'
-----------------------

La superclase de referencia para "organización", fundamental en el
*dataset* de ASIO:

-   [cf:Organization](cf7799e2-3477-11e1-b86c-0800200c9a66)

-   [foaf:Organization](http://xmlns.com/foaf/0.1/Organization) (usado
    por la familia VIVO[^1])

-   [org:Organization](http://www.w3.org/ns/org#Organization)

De esta clase colgará la clase 'University', clave en la arquitectura ontológica del proyecto y la clase 'Company'.
Otras subclases de interés a explorar:

-   [vivo:FundingOrganization](http://vivoweb.org/ontology/core#FundingOrganization)

-   [frapo:FundingAgency](http://purl.org/cerif/frapo/FundingAgency)

-   cf:ExternalOrganisation

-   cf:Funder

La clase 'Proyecto'
-------------------

La superclase de referencia para "proyecto", fundamental en el *dataset*
de ASIO, implicaría un sameAs de las siguientes clases:

-   [cf:Project](cf7799e1-3477-11e1-b86c-0800200c9a66)

-   [vivo:Project](http://vivoweb.org/ontology/core#Project)

-   [foaf:Project](http://xmlns.com/foaf/0.1/Project) (usado por la
    familia SPAR[^2])

La clase 'Contrato'
-------------------

La superclase de referencia para "contrato", fundamental en el *dataset*
de ASIO, implicaría un sameAs de las siguientes clases:

-   [cf:Contract](125a3e36-a300-449f-abfa-11178d87ba63)

-   [frapo:Contract](http://purl.org/cerif/frapo/Contract)

-   [vivo:Contract](http://vivoweb.org/ontology/core#Contract)

-   [pext:Contract](http://www.ontotext.com/proton/protonext#Contract)

La clase 'Patente'
------------------

La superclase de referencia para "patente", fundamental en el *dataset*
de ASIO, implicaría un sameAs de las siguientes clases:

-   [cf:Patent](cf7799e3-3477-11e1-b86c-0800200c9a66) (property
    cf:patentNumber)

-   [bibo:Patent](http://purl.org/ontology/bibo/Patent)

-   [fabio:Patent](http://purl.org/spar/fabio/Patent), properties
    \[cf:\]y sus subclases a explorar:

    -   [fabio:PatentApplication](http://purl.org/spar/fabio/PatentApplication)

    -   [fabio:PatentApplicationDocument](http://purl.org/spar/fabio/PatentApplicationDocument)

    -   [fabio:PatentDocument](http://purl.org/spar/fabio/PatentDocument)

-   [dbpedia-owl:patent](http://dbpedia.org/ontology/patent) (property)

La clase 'Participante'
-----------------------

La superclase de referencia para "participante", fundamental en el
*dataset* de ASIO, implicaría un sameAs de las siguientes clases:

-   [cf:Participant](ddc3dd10-1cfd-11e1-8bc2-0800200c9a66)

La clase 'Financiación'
-----------------------

La superclase de referencia para "FIXME", fundamental en el *dataset* de
ASIO, implicaría

-   cf:Funding

-   [frapo:Funding](http://purl.org/cerif/frapo/Funding)

-   Dfasgasdg

Y también clases concomitantes como:

-   [frapo:FundingPrograme](http://purl.org/cerif/frapo/FundingProgramme)

-   [frapo:FundingApplication](http://purl.org/cerif/frapo/FundingApplication)
    (\<[frapo:Application](http://purl.org/cerif/frapo/Application))

-   [vivo:FundingOrganization](http://vivoweb.org/ontology/core#FundingOrganization)

-   [frapo:FinancialEntity](http://purl.org/cerif/frapo/FinancialEntity)

La clase 'Convocatoria'
-----------------------

La superclase de referencia para "Convocatoria", fundamental en el
*dataset* de ASIO, implicaría

-   cf:Call

La clase 'Área Científica'
---------------

Esta clase es candidata a ser formalizada como vocabulario modular ad hoc (_concept scheme_ de SKOS), que formalizará las áreas científicas bajo la forma de un vocabulario controlado del tipo tesauro, que modela por niveles conceptuales los 'conceptos' definidos por el ministerio.

La clase 'Recurso Humano'
---------------

Esta clase podrá adquirir _condición ontológica autónoma_, es decir, ser elevada a ontología modular independiente.



A continuación incluímos sobre el documento de origen de los datasets y de manera rudimentaria los mapeos a vocabularios mencionados a lo largo de este documento.

Datasets Murcia \[provisional\]
===============================

Proyectos y su gestión \[cf:Project; frapo:Project; foaf:Project; vivo:Project\]
--------------------------------------------------------------------------------

### Orígenes de los proyectos \[cf:Project; frapo:Project; foaf:Project; vivo:Project\]

-   Tipos de origen

    -   Código (texto)

    -   Descripción (texto)

-   Relación entre los orígenes y los proyectos a que dan lugar

    -   Código del tipo de origen (texto)

    -   Identificador del origen (texto)

    -   Identificador del proyecto (texto)

### Jerarquía y dependencias de proyectos \[deps:Dependency\]

-   Dependencias

    -   Identificador de la dependencia (texto)

    -   Descripción (texto)

-   Proyectos relacionados en cada dependencia

    -   Identificador de la dependencia

    -   Identificador del proyecto

-   Jerarquía entre proyectos

    -   Identificador de proyecto de jerarquía superior

    -   Identificador de proyecto de jerarquía inferior

    -   Observaciones

### Datos de gestión de los proyectos \[frapo-cerif-time\]

-   Proyectos \[cf:Project; frapo:Project; foaf:Project; vivo:Project\]

    -   Identificador de proyecto (texto)

    -   Nombre (texto)

    -   Proyecto finalista (Si, No)

    -   Limitativo (Si, No)

> Un proyecto finalista es aquél en el que los ingresos que recibe se
> deben gastar en unos conceptos determinados y no en otros (por
> ejemplo, la entidad que subvenciona te da 5000 euros para material
> informático, pues no puedes comprar sillas). Se resuelve relacionando
> las partidas de ingreso con las partidas de gasto. Desde este punto de
> vista no hay más tipos. O se es finalista o no.
>
> Un proyecto limitativo es aquél en que el importe de todas sus
> partidas de gasto tiene que gastarse en dicha partida de gasto y no se
> pueden compartir con otras partidas de gasto del mismo proyecto.
> (Supongamos que presupuestamos 5000 euros para un proyecto, 2000 para
> material informático y 3000 para material de oficina estrictamente.
> Pues si es limitativo no puedo gastar dinero de material informático
> en material de oficina ni viceversa. En cambio, si es NO limitativo
> puedo repartir los 5000 euros entre ambos conceptos como quiera y por
> lo tanto, superar el gasto previsto para cada concepto por separado
> quedando su importe disponible para gastar en negativo.

-   Fechas de Proyectos \[time\]

    -   Identificador de proyecto (texto)

    -   Fecha de inicio del expediente (Fecha) \[cfStartDate\]

    -   Fecha de inicio del proyecto (Fecha) \[cfStartDate\]

    -   Fecha de fin del proyecto (Fecha) \[cfEndDate\]

    -   Fecha de fin de la facturación (Fecha) \[cfEndDate\]

    -   Código del cambio de fecha (texto)

    -   Motivo del cambio de fecha (texto)

> No hay fecha de fin de expediente. Se entiende la fecha de inicio del
> expediente como la fecha en que la universidad empieza a gestionar la
> obtención de un proyecto para reflejar el trabajo realizado desde el
> principio. Puede ser que al final no se realice el proyecto. Si hay
> proyecto, la fecha final del expediente coincidirá con la fecha de fin
> del proyecto.

-   Tipos de motivos para cambio de fechas

    -   Código (texto)

    -   Descripción (texto)

-   Anualidades de Proyectos \[time\]

    -   Identificador de proyecto (texto)

    -   Número de anualidad (Número 1,2, 3,4 ...)

-   Datos de las Anualidades de Proyectos

    -   Identificador de proyecto (texto)

    -   Número de anualidad (Número)

    -   Fecha de inicio de la anualidad (dd/mm/aaaa) \[cfStartDate\]

    -   Fecha de fin de la anualidad (Fecha) \[cfEndDate\]

    -   Ejercicio de la anualidad (Número) (Es el ejercicio del
        presupuesto de cada partida. Hay veces que las convocatorias
        vienen divididas en anualidades en vez de en fecha de inicio y
        fecha de fin de cada anualidad)

    -   Importe (Número)

    -   Importe de los costes generales (Número) (Son todos aquellos
        gastos que se supone que tiene que realizar cada unidad o
        departamento para desarrollar el proyecto, distintos a los que
        vienen indicados explícitamente en la convocatoria.)

    -   Código del cambio de fecha (texto)

    -   Motivo del cambio de fecha (texto)

-   Importes de los proyectos \[cf:Expenditure-Budget\]

Los importes pueden ser en pesetas o euros.

-   Identificador de proyecto (texto)

-   Importe (Número)

-   Importe Solicitado (Número)

-   Importe Provisional (Número) (tal cual vienen en la convocatoria)

-   Importe Concedido (Número)

-   Importe infraestructura Solicitado (Número) (viene especificado en
    algunas convocatorias)

-   Importe infraestructura Provisional (Número)

-   Importe infraestructura Concedido (Número)

-   Importe Global (Número): No es el importe concedido porque son todos
    aquellos gastos que se supone que tiene que realizar cada unidad o
    departamento para desarrollar el proyecto, distintos a los que
    vienen indicados explícitamente en la convocatoria.

```{=html}
<!-- -->
```
-   Impuestos repercutidos de los proyectos \[dbpedia-owl:Tax;
    lgdo:Tax\]

    -   Identificador de proyecto (texto)

    -   Tipo de Impuesto repercutido (Texto)

    -   Fecha de inicio (Fecha) \[cfStartDate\]

    -   Fecha de fin (Fecha) \[cfEndDate\]

-   Tipos de financiación de proyectos \[cf:Funding\]

    -   Código (texto)

    -   Descripción (texto)

-   Tipos de fuentes de financiación \[cf:Funding;
    frapo:FundingProgramme\]

    -   Código (texto)

    -   Descripción (texto)

    -   Fondo estructural (Si o No)

-   Financiación de los proyectos \[cf:Funding; frapo:Funding\]

    -   Identificador de proyecto (texto)

    -   Código del tipo de financiación (Texto)

    -   Código del tipo de fuente de financiación (Texto)

    -   Número de anualidad (Número)

    -   Importe (Número)

-   Tipos de gastos de un proyecto \[cf:Expenditure-Budget;
    frapo:BudgetCategory; frapo:AvailableFunds\]

    -   Código (texto)

    -   Descripción (texto)

-   Gastos previstos del proyecto \[cf:Expenditure-Budget;
    frapo:BudgetCategory; frapo:AvailableFunds\]

Gasto futuro previsto en el proyecto. Después se relaciona con el gasto
real producido y no se borra la previsión

-   Identificador de proyecto (texto)

-   Identificador del gasto previsto (texto)

-   Código del tipo de origen (texto)

-   Identificador del origen (texto)

-   Número de anualidad (Número)

-   Fecha prevista del gasto (Fecha) \[cfStartDate\] \[cfEndDate\]

-   Descripción (Texto)

-   Código del tipo de gasto (Texto)

-   Importe (Número)

```{=html}
<!-- -->
```
-   Tipos de ingresos de un proyecto \[frapo:Income; cf:IncomeBudget\]

    -   Código (texto)

    -   Descripción (texto)

-   Ingresos previstos del proyecto \[frapo:Income; cf:IncomeBudget\]

Ingreso futuro previsto en el proyecto. Después se relaciona con el
ingreso real producido y no se borra la previsión. Se refiere a
cualquier clase de ingreso y no solo las subvenciones

-   Identificador de proyecto (texto)

-   Identificador del ingreso previsto (texto)

-   Código del tipo de origen (texto)

-   Identificador del origen (texto)

-   Número de anualidad (Número)

-   Fecha prevista del ingreso (Fecha)

-   Descripción (Texto)

-   Código del tipo de ingreso (Texto)

-   Importe (Número)

```{=html}
<!-- -->
```
-   Tipos de actividades \[prov:Activity; pext:Activity\]

    -   Código (texto)

    -   Descripción (texto)

-   Facturas a emitir \[frapo:Invoice; schema:Invoice\]

No desaparecen una vez emitidas. Posteriormente se relacionan con las
facturas realmente emitidas.

-   Identificador de proyecto (texto)

-   Número de orden de la factura prevista (Número)

-   Número de anualidad (Número)

-   Fecha prevista de emisión (Fecha) \[cfStartDate\] \[cfEndDate\]

-   Descripción (Texto)

-   Identificador del tercero (Texto)

-   Importe base (Número)

-   Tipo de impuesto repercutido (Texto)

-   Tipo impositivo (Porcentaje)

-   Importe repercutido (Número)

-   Código de tipo de actividad (Texto)

```{=html}
<!-- -->
```
-   Facturas emitidas \[frapo:Invoice; schema:Invoice\]

    -   Identificador de proyecto (texto)

    -   Identificador de la factura emitida (Texto)

    -   Número de orden de la factura prevista (Número) (Es el número de
        orden de la factura prevista de la tabla anterior)

    -   Número de anualidad (Número)

-   Gastos del proyecto \[frapo:Expenditure; cf:Expenditure-Budget;
    cf:Expenditure-Commitment; cfExpenditure-Actual\]

    -   Identificador de proyecto (texto)

    -   Identificador del gasto (texto)

    -   Identificador del gasto previsto (texto)

    -   Código del tipo de origen (texto)

    -   Identificador del origen (texto)

    -   Número de anualidad (Número)

    -   Descripción (Texto)

    -   Código del tipo de gasto (Texto)

    -   Importe (Número)

    -   Identificador del documento económico (Texto)(cada gasto del
        proyecto se enlaza con la gestión económica del mismo)

-   Ingresos del proyecto \[frapo:Income; cf:Income-Budget;
    cf:Income-Commitment; cf:Income-Actual;\]

    -   Identificador de proyecto (texto)

    -   Identificador del ingreso (texto)

    -   Identificador del ingreso previsto (texto)

    -   Código del tipo de origen (texto)

    -   Identificador del origen (texto)

    -   Número de anualidad (Número)

    -   Descripción (Texto)

    -   Código del tipo de ingreso (Texto)

    -   Importe (Número)

    -   Identificador del documento económico (Texto)

### Justificaciones de proyectos

-   Justificaciones previstas

    -   Identificador de proyecto (texto)

    -   Número de justificación prevista (Número)

    -   Código del tipo de origen (texto)

    -   Identificador del origen (texto)

    -   Tipo de justificación (Parcial o Final)

    -   Clase de justificación (Científica o Económica)

    -   Fecha inicial de devengos (fecha) \[cfStartDate\]

    -   Fecha final de devengos (fecha) \[cfEndDate\]

    -   Fecha inicial de contabilización (fecha) \[cfStartDate\]

    -   Fecha final de contabilización (fecha) \[cfEndDate\]

    -   Fecha inicial de pago (fecha) \[cfStartDate\]

    -   Fecha final de pago (fecha) \[cfEndDate\]

    -   Fecha prevista para la justificación (fecha)

    -   Observaciones (texto)

-   Justificaciones

    -   Identificador de proyecto (texto)

    -   Número de justificación (Número)

    -   Número de justificación prevista (Número)

    -   Código del tipo de origen (texto)

    -   Identificador del origen (texto)

    -   Entidad subvencionadora (Texto)

    -   Tipo de justificación (Parcial o Final)

    -   Clase de justificación (Científica o Económica)

    -   Fecha inicial de devengos (fecha) \[cfStartDate\]

    -   Fecha final de devengos (fecha) \[cfEndDate\]

    -   Fecha inicial de contabilización (fecha) \[cfStartDate\]

    -   Fecha final de contabilización (fecha) \[cfEndDate\]

    -   Fecha inicial de pago (fecha) \[cfStartDate\]

    -   Fecha final de pago (fecha) \[cfEndDate\]

    -   Observaciones (texto)

    -   Importe (Número)

-   Líneas de Justificaciones

Cada línea es un gasto del tipo de gasto indicado.

-   Identificador de proyecto (texto)

-   Número de justificación (Número)

-   Número de línea (Número)

-   Tercero del gasto (Texto)

-   Número de justificante del gasto (Número)

-   Código del tipo de gasto (Texto)

-   Importe (Número)

```{=html}
<!-- -->
```
-   Tipos de rechazo de Justificaciones

    -   Código (Texto)

    -   Descripción (Texto)

-   Rechazos de Justificaciones

    -   Identificador de proyecto (texto)

    -   Número de justificación (Número)

    -   Número de rechazo (Número)

    -   Código del tipo de origen (texto)

    -   Identificador del origen (texto)

    -   Entidad subvencionadora (Texto)

    -   Observaciones (texto)

-   Líneas de rechazos de Justificaciones

    -   Identificador de proyecto (texto)

    -   Número de justificación (número)

    -   Número de línea de justificación (número)

    -   Número de rechazo (Número)

    -   Número de línea de rechazo (número)

    -   Tercero del gasto (Texto)

    -   Número de justificante del gasto (número)

    -   Código del tipo de gasto (texto)

    -   Código del tipo de rechazo (texto)

-   Alegaciones a los rechazos de Justificaciones

    -   Identificador de proyecto (texto)

    -   Número de justificación (Número)

    -   Número de rechazo (Número)

    -   Número de alegación (Número)

    -   Código del tipo de origen (texto)

    -   Identificador del origen (texto)

    -   Entidad subvencionadora (Texto)

    -   Observaciones (texto)

-   Líneas de alegaciones a los rechazos de Justificaciones

    -   Identificador de proyecto (texto)

    -   Número de justificación (número)

    -   Número de línea de justificación (número)

    -   Número de rechazo (Número)

    -   Número de línea de rechazo (número)

    -   Número de alegación (Número)

    -   Número de línea de alegación (número)

    -   Tercero del gasto (Texto)

    -   Número de justificante del gasto (número)

    -   Código del tipo de gasto (texto)

    -   Código del tipo de rechazo (texto)

    -   Observaciones (texto)

### Auditorías de proyectos \[km4c:Auditing\_activities\]

-   Tipos de auditoría \[km4c:Auditing\_activities\]

    -   Código (Texto)

    -   Descripción (Texto)

-   Auditorías de proyectos \[km4c:Auditing\_activities\]

    -   Identificador de auditoría (número)

    -   Código de tipo de auditoría (texto)

    -   Identificador de proyecto (texto)

    -   Código del tipo de origen (texto)

    -   Identificador del origen (texto)

    -   Identificador de empresa que realiza la auditoría (texto)

    -   Identificador de delegación de la empresa que realiza la
        auditoría (texto)

    -   Observaciones (texto)

-   Notas de auditorías de proyectos \[km4c:Auditing\_activities\]

    -   Identificador de auditoría (número)

    -   Número de nota (número)

    -   Tipo de nota (Observaciones o Seguimientos)

    -   Observaciones (texto)

    -   Código de usuario que escribe la nota (texto)

-   Eventos de auditorías de proyectos \[km4c:Auditing\_activities\]

    -   Identificador de auditoría (número)

    -   Número de evento (número)

    -   Tipo de evento (Comienzo, Final, Suspensión, Reanudación)

    -   Observaciones (texto)

    -   Fecha del evento (fecha) \[cfEndDate\]

    -   Código de usuario que escribe la nota (texto)

### Proyectos finalistas \[cf:Project; frapo:Project; foaf:Project; vivo:Project\]

-   Relaciones finalistas

Una relación finalista es una relación entre las partidas de ingreso con
las partidas de gasto en las que se gastarán dichos ingresos

-   Identificación de relación finalista (texto)

-   Descripción (texto)

-   Fecha de inicio (fecha) \[cfStartDate\]

-   Fecha de fin (fecha) \[cfEndDate\]

```{=html}
<!-- -->
```
-   Aplicaciones económicas de las relaciones finalistas

-   Aplicación económica es cada unidad de ingreso o gasto en que se
    dividen todos los conceptos económicos. Hay aplicaciones
    presupuestarias que se componen del ejercicio, vicerrectorado,
    unidad orgánica, programa, subconcepto económico y proyecto (las
    llamamos partidas).

-   Hay aplicaciones extrapresupuestarias que son aquellos conceptos
    económicos por los que se puede gastar o ingresar pero que no se
    presupuestan.

-   También hay aplicaciones comerciales en el caso de la Universidad de
    Murcia no se usa pero podrían usarse en otras universidades.

    -   Identificación de relación finalista (texto)

    -   Número de línea (número) (es un número de orden)

    -   Aplicación económica (texto)

### Clasificación de proyectos \[cf:Project; frapo:Project; foaf:Project; vivo:Project\]

-   Tipos de proyectos

    -   Código (texto)

    -   Descripción (texto)

-   Tipos de cada proyecto

    -   Identificador de proyecto (texto)

    -   Código del tipo de proyecto (texto)

Recursos Humanos \[fea:HumanResource\]
--------------------------------------

-   Tipos de recursos humanos

    -   Tipo de ayuda (texto)

    -   Descripción (texto)

-   Convocatorias que realizan las entidades para financiar becas y
    contratos de personal
    \[c4n:Call\]\[c4n:Issuer\]\[vivo:Internship\]\[c4n:SpatialScope\]

    -   Identificador de convocatoria (texto)

    -   Descripción (texto)

    -   Empresa financiadora (texto)

    -   Referencia convocatoria (texto)

    -   Fecha convocatoria (fecha) \[cfEndDate\]

    -   Fecha alegación (fecha) \[cfEndDate\]

    -   Fecha publicación boletín (fecha) (no se distingue el tipo de
        boletín)

    -   Observaciones (texto)

-   Subprogramas en los que pueden dividirse una convocatoria de becas

    -   Identificador de convocatoria (texto)

    -   Identificador de subprograma (texto)

    -   Descripción (texto)

    -   Resumen (texto)

    -   Fecha resolución (fecha) \[cfEndDate\]

    -   Fecha alegación (fecha) \[cfEndDate\]

-   Becas y contratos pertenecientes a cada uno de los subprogramas
    \[vivo:Internship\]\[ all:Contract\]

    -   Identificador de unidad de recurso humano (texto)

    -   Identificador de convocatoria (texto)

    -   Identificador de subprograma (texto)

    -   Tipo de recurso humano (texto)

    -   Empresa gestora (texto) (es la empresa que gestiona la beca o
        contrato que puede ser distinta de la empresa que la convoca).

    -   Responsable económico (texto) (persona)

    -   Fecha inicio solicitudes (fecha) \[cfStartDate\]

    -   Fecha fin solicitudes (fecha) \[cfEndDate\]

    -   Fecha alegación (fecha) \[cfEndDate\]

    -   Plazo presentación informe (texto) \[c4n:Deadline\]

    -   Duración máxima (número)

    -   Número máximo recursos humano (número)

    -   Movilidad (Sí, No) (indica si el recurso se va a tener que
        desplazar a otro lugar. Las estancias se tratan aparte)

    -   Observaciones (texto)

-   Solicitudes de beca o contrato

    -   Identificador Solicitud (texto)

    -   Identificador Solicitante (texto)

    -   Convocatoria \[c4n:Call; cf:Call\]

        -   Identificador de convocatoria (texto)

        -   Descripción convocatoria (texto)

        -   Referencia convocatoria (texto)

        -   Identificador de subprograma (texto)

        -   Descripción Subprograma (texto)

        -   Identificador de unidad de recurso humano (texto)

        -   Descripción unidad de ayuda (texto)

        -   Tercero convocante (texto)

        -   Fecha convocatoria (fecha) \[time\]

    -   Datos Académicos

        -   Universidad (texto) \[cf:University; svivo:University,
            etc.\]

        -   País Universidad (texto) \[lgdo:Country; juso:Country;
            schema:Country; dbpedia-owl:Country; place:Country;
            poder:Country; pext:Country + properties\]

        -   Estudios reconocidos (texto)

        -   Año fin estudios (número) \[time\]

        -   Titulación (texto)

        -   Idiomas \[gold:Language; lingvo:Lingvo\]

            -   Código Idioma (texto) \[dbpedia-owl:languageCode;
                cf:languageCode; common:languageCode; schema:Language\]

            -   Nivel (número)

        -   Méritos

            -   Título (texto)

            -   Descripción (texto)

    -   Director (texto)

    -   Título (texto)

    -   Objetivos (texto)

    -   Metodología (texto)

    -   Cronograma (texto)

-   Concesiones provisionales de beca o contrato

    -   Convocatoria \[c4n:Call; cf:Call\]

        -   Identificador de convocatoria (texto)

        -   Descripción convocatoria (texto)

        -   Referencia convocatoria (texto)

        -   Identificador de subprograma (texto)

        -   Descripción Subprograma (texto)

        -   Identificador de unidad de recurso humano (texto)

        -   Descripción unidad de ayuda (texto)

        -   Tercero convocante (texto)

        -   Fecha convocatoria (fecha)

    -   Solicitudes

        -   Solicitud recurso humano (texto)

        -   Resolución provisional (texto)

        -   Persona Solicitante (texto)

        -   Puntuación (número)

-   Concesiones definitivas de beca o contrato

    -   Convocatoria \[c4n:Call; cf:Call\]

        -   Identificador de convocatoria (texto)

        -   Descripción convocatoria (texto)

        -   Referencia convocatoria (texto)

        -   Identificador de subprograma (texto)

        -   Descripción Subprograma (texto)

        -   Identificador de unidad de recurso humano (texto)

        -   Descripción unidad de ayuda (texto)

        -   Tercero convocante (texto)

        -   Fecha convocatoria (fecha)

    -   Solicitudes

        -   Solicitud recurso humano (texto)

        -   Resolución provisional (texto)

        -   Persona Solicitante (texto)

        -   Puntuación (número)

    -   Fecha resolución (fecha) \[cfEndDate\]

    -   Fecha publicación (fecha) \[cfEndDate\]

-   Alegaciones a la resolución de beca o contrato

    -   Solicitante (texto)

    -   Fecha alegación (fecha)

    -   Solicitud recurso humano (texto)

    -   Concesión Recurso Humano Provisional (texto)

    -   Texto alegación (texto)

    -   Observaciones (texto)

-   Informes de la beca o contrato

    -   Beneficiario (texto)

    -   Identificador recurso humano (texto)

    -   Título (texto)

    -   Observaciones (texto)

Ayudas \[frapo, c4n, cf\]
-------------------------

-   Tipos de ayudas

    -   Tipo de ayuda (texto)

    -   Descripción (texto)

-   Convocatorias de ayudas \[ c4n:Call;
    cf:Call\]\[cf:FundingProgramme\]

    -   Identificador de convocatoria (texto)

    -   Descripción (texto)

    -   Empresa financiadora (texto)

    -   Empresa gestora (texto)

    -   Referencia convocatoria (texto)

    -   Fecha convocatoria (fecha) \[c4n:Deadline\] \[cfEndDate\]

    -   Fecha resolución (fecha) \[cfEndDate\]

    -   Fecha alegación (fecha) \[cfEndDate\]

    -   Observaciones (texto)

-   Subprogramas en los que puede dividirse una convocatoria de ayuda

    -   Identificador de convocatoria (texto)

    -   Identificador de subprograma (texto)

    -   Descripción (texto)

    -   Resumen (texto)

    -   Fecha resolución (fecha) \[cfEndDate\]

    -   Fecha alegación (fecha) \[cfEndDate\]

-   Ayudas pertenecientes a cada uno de los subprogramas

    -   Identificador de unidad de ayuda (texto)

    -   Identificador de convocatoria (texto)

    -   Identificador de subprograma (texto)

    -   Tipo de ayuda (texto)

    -   Tipo de categoría (texto)

    -   Fecha inicio solicitudes (fecha) \[cfStartDate\]

    -   Fecha fin solicitudes (fecha) \[cfEndDate\]

    -   Fecha resolución (fecha) \[cfEndDate\]

    -   Fecha alegación (fecha) \[cfEndDate\]

    -   Fecha fase 1 (fecha) \[cfEndDate\]

    -   Fecha fase 2 (fecha) \[cfEndDate\]

    -   Tipo de moneda (texto)

    -   Importe mínimo (número)

    -   Importe máximo (número)

    -   Interés mínimo (número)

    -   Interés máximo (número)

    -   Anualidades (Sí, No)

    -   Control anualidades (Sí, No)

    -   Observaciones (texto)

-   Unidades administrativas que gestionan la unidad de ayuda

Ejemplos de unidad de ayuda son:

> Convocatoria = (Entidad) Fundación BBVA + (Fecha de resolución)
> 15/01/2019
>
> Subprograma = Ayudas a investigadores y creadores culturales
>
> Unidad de ayuda = Convocatoria + Subprograma.

-   Identificador de unidad de ayuda (texto)

-   Número (número)

-   Código de la unidad administrativa (texto)

```{=html}
<!-- -->
```
-   Tipos de gasto de las unidades de ayuda

    -   Identificador de unidad de ayuda (texto)

    -   Identificador del tipo de gasto (texto)

    -   Descripción (texto)

    -   Permitido (Sí, No)

-   Previsión de las justificaciones sobre los gastos de una unidad de
    ayuda

    -   Identificador de unidad de ayuda (texto)

    -   Número (número)

    -   Tipo Justificación (Parcial, Final)

    -   Clase de justificación (Científica, Económica)

    -   Fecha inicial de devengos (fecha) \[cfStartDate\]

    -   Fecha final de devengos (fecha) \[cfEndDate\]

    -   Fecha inicio contabilización (fecha) \[cfStartDate\]

    -   Fecha fin contabilización (fecha) \[cfEndDate\]

    -   Fecha inicio pago (fecha) \[cfStartDate\]

    -   Fecha fin pago (fecha) \[cfEndDate\]

    -   Fecha prevista (fecha)

    -   Observaciones (texto)

-   Partidas asociadas a las convocatorias de ayudas

    -   Identificador de convocatoria (texto)

    -   Identificador de subprograma (texto)

    -   Número (número)

    -   Unidad orgánica (texto)

    -   Clasificación económica (texto)

    -   Clasificación funcional (texto)

    -   Tipo de aplicación (texto)

-   Fuentes de financiación de la unidad de ayuda \[cf:Funder\]

    -   Identificador de unidad de ayuda (texto)

    -   Número (número)

    -   Tipo de fuente (texto)

    -   Observaciones (texto)

-   Financiación de la unidad de ayuda \[cf:Funder\]

    -   Identificador de unidad de ayuda (texto)

    -   Número (número)

    -   Tipo de financiación (texto)

    -   Tipo de fuente (texto)

-   Solicitudes de ayuda

    -   Identificador Solicitud (texto)
        \[frapo:Application\]\[frapo:EmploymentApplication\]

    -   Identificador Solicitante (texto)

    -   Convocatoria \[c4n:Call\]

        -   Identificador de convocatoria (texto)

        -   Descripción convocatoria (texto)

        -   Referencia convocatoria (texto)

        -   Identificador de subprograma (texto)

        -   Descripción Subprograma (texto)

        -   Identificador de unidad de ayuda (texto)

        -   Descripción unidad de ayuda (texto)

        -   Tercero convocante (texto)

        -   Fecha convocatoria (fecha) \[c4n:Deadline\]

    -   Entidades colaboradoras

        -   Identificador de empresa (texto)

        -   Tipo de colaboración (Texto)

        -   Tercera parte (texto)

    -   Entidades cofinanciadoras \[cf:Funder\]

        -   Identificador de empresa (texto)

    -   Equipo

        -   Identificador de persona (texto)

        -   Tipo de participación (texto)

    -   Observaciones

    -   Grupo de gasto (texto)

    -   Tipo de moneda (texto)

    -   Importe (número)

    -   Importe global (número)

    -   Desglose gastos ayuda

        -   Número (número)

        -   Tipo de gasto de la ayuda (texto)

        -   Descripción (texto)

        -   Anualidad (número)

        -   Importe (número)

        -   Permitido (Sí, No)

        -   Observaciones (texto)

    -   Datos evento ayuda

        -   Tipo de evento (texto)

        -   Entidad organizadora (texto)

        -   Título evento (texto)

        -   Lugar celebración (texto)

        -   País celebración (texto)

        -   Fechas celebración (fecha)

        -   Observaciones (texto)

        -   Tipo participación (texto)

    -   Referencias Unesco

        -   Área Unesco (texto)

        -   Número campo Unesco (número)

        -   Campo Unesco (texto)

        -   Número línea Unesco (número)

        -   Código línea Unesco (texto)

    -   Código de solicitud (texto)

    -   Familias proyectos

        -   Tipo de familia (texto)

        -   Niveles

            -   Número (número)

            -   Familia proyecto (texto)

-   Concesiones de ayuda provisionales

    -   Identificador Resolución Provisional (texto)

    -   Identificador Solicitud (texto)

    -   Aprobación (Aprobada, Denegada, Aprobada con modificaciones,
        Negociación)

    -   Convocatoria

        -   Identificador de convocatoria (texto)

        -   Descripción convocatoria (texto)

        -   Referencia convocatoria (texto)

        -   Identificador de subprograma (texto)

        -   Descripción Subprograma (texto)

        -   Identificador de unidad de ayuda (texto)

        -   Descripción unidad de ayuda (texto)

        -   Tercero convocante (texto)

        -   Fecha convocatoria (fecha)

    -   Identificador Solicitante (texto)

    -   Observaciones (texto)

    -   Grupo de gasto (texto)(

    -   Tipo de moneda (texto)

    -   Importe (número)

    -   Desglose gasto

        -   Número (número)

        -   Tipo de gasto de la ayuda (texto)

        -   Descripción (texto)

        -   Anualidad (número)

        -   Importe (número)

        -   Permitido (Sí, No)

        -   Observaciones (texto)

    -   Referencia convocante (texto)

Los grupos de gasto son grupos de gasto genéricos que contemplan
distintas clasificaciones de tipos de gastos que ya están
predeterminados en algunos tipos de proyectos, por ejemplo: Proyectos
Internacionales, Proyectos Europeos, Proyectos MEC. Es decir, estos
tipos de proyectos siempre usan los mismos tipos de gastos elegibles y
los agrupamos en grupos de gastos. Otras entidades convocantes no
siempre usan los mismos tipos de gasto tan bien definidos como estos

-   Concesiones de ayuda definitivas

    -   Identificador Concesión Definitiva (texto)

    -   Identificador Solicitud (texto)

    -   Convocatoria

        -   Identificador de convocatoria (texto)

        -   Descripción convocatoria (texto)

        -   Referencia convocatoria (texto)

        -   Identificador de subprograma (texto)

        -   Descripción Subprograma (texto)

        -   Identificador de unidad de ayuda (texto)

        -   Descripción unidad de ayuda (texto)

        -   Tercero convocante (texto)

        -   Fecha convocatoria (fecha)

    -   Identificador Solicitante (texto)

    -   Observaciones (texto)

    -   Fecha concesión (fecha)

    -   Fechas ejecución proyecto (fecha)

    -   Tipo de moneda (texto)

    -   Importe (número)

    -   Desglose gasto

        -   Número (número)

        -   Tipo de gasto de la ayuda (texto)

        -   Descripción (texto)

        -   Anualidad (número)

        -   Importe (número)

        -   Permitido (Sí, No)

        -   Observaciones (texto)

    -   Financiación proyecto

        -   Número (número)

        -   Tipo financiación (texto)

        -   Tipo fuente (texto)

        -   Anualidades

            -   Número anualidad (número)

            -   Importe (número)

        -   Importe

        -   Amortización

            -   Número pago (número)

            -   Fecha límite (fecha) \[c4n:Deadline\]

            -   Importe capital (número)

            -   Importe intereses (número)

            -   Importe (número)

    -   Referencia convocante (texto)

-   Alegaciones a la resolución de la ayuda

    -   Identificador Solicitante (texto)

    -   Fecha alegación (fecha)

    -   Identificador Solicitud (texto)

    -   Identificador Resolución Provisional (texto)

    -   Texto alegación (texto)

    -   Observaciones (texto)

-   Datos de la ayuda

Contratos \[cf:Contract; frapo:Contract; vivo:Contract; pext:Contract\]\[frapo:EmploymentContract; frapo:ServiceContract\]
--------------------------------------------------------------------------------------------------------------------------

-   Datos principales de los contratos

    -   Tipo de contrato (texto)

    -   Título (texto)

    -   Tercero contratante (texto)

    -   Tipo de confidencialidad (Contrato o Entidad)

    -   Propiedad de los resultados (Organización, Contratante,
        Compartida, Sin Resultado) \[uco:OwnershipInfo;
        schema:OwnershipInfo\]

    -   Importe base (número) \[dbpedia-owl:cost; ontosec:Cost\]

    -   Importe infraestructura (número) \[dbpedia-owl:cost;
        ontosec:Cost\]

    -   Importe (número) \[dbpedia-owl:cost; ontosec:Cost\]

    -   Tipo de moneda (texto)

    -   Impuestos repercutidos \[dbpedia-owl:Tax; lgdo:Tax\]

        -   Base del impuesto (número)

        -   Tipo impositivo (número)

        -   Importe del impuesto (número)

        -   Recargo de equivalencia (número)

        -   Motivo de exención (texto)

    -   Cuenta bancaria de abono (texto)

    -   Fecha de aprobación del contrato (fecha) \[time\]

    -   Fecha de firma del contrato (fecha) \[time\]

    -   Fechas de ejecución

        -   Fecha de inicio (fecha) \[time\]

        -   Fecha de fin (fecha) \[time\]

    -   Fecha fin gestión (fecha) \[time\]

    -   Fecha fin facturación (fecha) \[time\]

    -   Equipo Investigador

        -   Identificación del investigador (texto)

        -   Tipo de participación (Investigador principal, responsable
            económico, otros)

        -   Titulación con la que participa (texto)

    -   Convocatoria pública (Sí, No)

    -   Retención de garantía (Sí, No)

    -   Existe mediación de alguna empresa (Sí, No)

    -   Empresa mediadora (texto)

    -   Patentes relacionadas con el contrato

        -   Identificador de patente (texto)

        -   Título (texto)

    -   Desglose de gastos a los que se ha de atener el contrato

        -   Tipo de gasto (texto)

        -   Importe (número)

    -   Importe de garantía (número)

    -   Fecha devolución garantía (fecha)

    -   Anualidades de financiación

        -   Número de anualidad (número)

        -   Importe (número)

-   Prórrogas de contratos

    -   Referencia al contrato que se prorroga (texto)

    -   Tercero contratante (texto)

    -   Persona responsable del contrato (texto)

    -   Tipo de moneda (texto)

    -   Importe base (número)

    -   Importe infraestructura (número)

    -   Importe (número)

    -   Impuestos repercutidos

        -   Base del impuesto (número)

        -   Tipo impositivo (número)

        -   Importe del impuesto (número)

        -   Recargo de equivalencia (número)

        -   Motivo de exención (texto)

    -   Cuenta bancaria de abono (texto)

    -   Fecha de aprobación de la prorroga(fecha)

    -   Fecha de firma de la prorroga (fecha)

    -   Fechas de ejecución

        -   Fecha de inicio (fecha)

        -   Fecha de fin (fecha)

    -   Desglose de gastos a los que se ha de atener el contrato

        -   Tipo de gasto (texto)

        -   Importe (número)

    -   Anualidades de financiación

        -   Número de anualidad (número)

        -   Importe (número)

-   Pago de comisiones a la empresa mediadora

    -   Referencia al contrato por el que se pagan comisiones (texto)

    -   Número de justificante de gasto mediante el que se gestiona el
        gasto (texto)

    -   Número de proyecto (texto)

    -   Tercero al que se hace el pago (texto)

    -   Importe (número)

Grupos de Investigación \[frapo:ResearchGroup; aiiso:ResearchGroup\]
--------------------------------------------------------------------

-   Datos generales del grupo

    -   Identificador del grupo (texto)

    -   Descripción (texto)

    -   Departamento relacionado (texto)

    -   Se trata de un grupo de excelencia (Sí, No)

    -   Fecha de creación (fecha)

    -   Fecha de desaparición (fecha)

-   Tipos de participación de los miembros de un grupo de investigación

    -   Tipo de participación (texto)

    -   Descripción (texto)

-   Datos del equipo

    -   Identificador del grupo (texto)

    -   Número (número)

    -   Identificador de persona (texto)

    -   Tipo de participación (texto)

    -   Responsable del grupo (Sí, No)

    -   Equivalente a dedicación plena (texto)

    -   Fecha inicio (fecha)

    -   Fecha fin (fecha)

-   Conceptos asociados a grupos de investigación (líneas de
    investigación, descriptores, oferta investigadora, ...)

    -   Identificador del grupo (texto)

    -   Número (número)

    -   Tipo de concepto (texto)

    -   Texto (texto)

-   Conceptos asociados a cada investigador

    -   Identificador de persona (texto)

    -   Número (número)

    -   Tipo de concepto (texto)

    -   Texto (texto)

-   Usuarios validadores de producción científica

    -   Identificador del grupo (texto)

    -   Número (número)

    -   Identificador de persona (texto)

    -   Fecha inicio (fecha)

    -   Fecha fin (fecha)

-   Datos de contacto asociados a un grupo de investigación

    -   Identificador del grupo (texto)

    -   Número (número)

    -   Tipo de forma de contacto (texto)

    -   Valor (texto)

Otros tipos de proyectos
------------------------

Actividades \[prov:Activity\]
-----------------------------

-   Tipos de actividades

    -   Tipo de actividad (texto)

    -   Descripción (texto)

-   Grupos de actividades

    -   Identificador del grupo de actividades (texto)

    -   Tipo de actividad (texto)

-   Relación de los grupos de actividades con proyectos

    -   Identificador de proyecto (texto)

    -   Número (número)

    -   Identificador del grupo de actividades (texto)

    -   Fecha inicio (fecha)

    -   Fecha fin (fecha)

-   Información general de las actividades

    -   Identificador de actividad (texto)

    -   Tipo de actividad (texto)

    -   Tipo de actividad (texto)

    -   Título de la actividad (texto)

    -   Identificador de tercero (texto)

    -   Tercero confidencial (Sí, No)

    -   Tipo de moneda (texto)

    -   Importe base (número)

    -   Tipo de impuesto (texto)

    -   Tipo impositivo (número)

    -   Importe repercutido (número)

    -   Importe total (número)

    -   Fecha inicio (fecha)

    -   Fecha fin (fecha)

-   Facturas emitidas por cada actividad \[frapo:Invoice;
    schema:Invoice\]

    -   Identificador de actividad (texto)

    -   Número (número)

    -   Identificador de factura (texto)

En este caso no hay facturas a emitir porque no se conoce a priori. Es
el caso de, por ejemplo, los contratos art.83 donde en el propio
contrato ya vienen la fecha y el importe de las facturas que se deben
emitir.

-   Impuestos repercutidos de las actividades \[dbpedia-owl:Tax;
    lgdo:Tax\]

    -   Identificador de actividad (texto)

    -   Número (número)

    -   Tipo de impuesto (texto)

    -   Tipo de moneda (texto)

    -   Importe base (número)

    -   Tipo impositivo (número)

    -   Importe (número)

    -   Exento (Sí, No)

    -   Motivo exención (texto)

Patentes \[all:Patent\]
-----------------------

-   Datos generales

    -   Identificador de patente (texto)

    -   Tipo de patente (Patente, DPI, Modelo)

    -   Referencia (texto)

    -   Título (texto)

    -   Identificador Agente de la propiedad industrial (texto)

    -   Observaciones (texto)

    -   Provincia solicitud DPI (texto) (Derechos de propiedad
        intelectual)

    -   Número solicitud DPI (texto)

    -   Año solicitud DPI (número)

    -   Fecha solicitud DPI (fecha)

    -   Año asiento registro propiedad industrial (número)

    -   Número asiento registro propiedad industrial (texto)

-   Vías de protección de las patentes

    -   Identificador de patente (texto)

    -   Número (número)

    -   Tipo de vía de protección (texto)

    -   Número de solicitud (número)

    -   Fecha en la que se solicita (fecha)

    -   Número de publicación (número)

    -   Fecha de publicación (fecha)

    -   Fecha en la que la organización tiene prioridad (fecha)

    -   Fecha en la que finaliza la prioridad (fecha)

    -   Fecha en la que se concede (fecha)

    -   Fecha en la que se abandona (fecha)

    -   Referencia (texto)

    -   Motivo del cambio de fecha (texto)

-   Empresas titulares de las patentes

    -   Identificador de patente (texto)

    -   Número (número)

    -   Identificador Tercero titular (texto)

    -   Porcentaje participación (número)

    -   Observaciones (texto)

    -   Fecha inicio (fecha)

    -   Fecha fin (fecha)

-   Empresas que explotan las patentes

    -   Identificador de patente (texto)

    -   Identificador Tercero que explota la patente (texto)

    -   Observaciones (texto)

    -   Fecha inicio (fecha)

    -   Fecha fin (fecha)

-   Costes de las patentes

    -   Identificador de patente (texto)

    -   Número (número)

    -   Tipo de coste (texto)

    -   Identificador del proyecto (número)

    -   Identificador del documento de gasto (texto)

    -   Identificador del tercero a quien hay que pagar o que paga
        (texto)

    -   Nombre del tercero (texto)

    -   Tipo de moneda (texto)

    -   Importe (número)

    -   Fecha de pago (fecha)

    -   Observaciones (texto)

-   Inventores de la patente

    -   Identificador de patente (texto)

    -   Número (número)

    -   Identificador de persona (texto)

    -   Observaciones (texto)

    -   Inventor principal (Sí, No)

    -   Personal propio (Sí, No)

    -   Orden (número)

-   Países a los que se ha extendido la patente

    -   Identificador de patente (texto)

    -   Número (número)

    -   País (texto)

    -   País prioritario (Sí, No)

    -   Año de registro en el país (número)

    -   Referencia del registro de la patente en el país (texto)

-   Sectores industriales

    -   Identificador de patente (texto)

    -   Número (número)

    -   Sector Industrial (texto)

-   Notas a realizar sobre las patentes

    -   Identificador de patente (texto)

    -   Número nota (número)

    -   Tipo nota (Observaciones, Seguimientos, Avisos)

    -   Observaciones (texto)

    -   Usuario (texto)

GOLIAT
------

-   Alarmas: para que se notifique por correo llegada una fecha:

    -   Fecha de la alarma

    -   Observaciones

    -   Emails a los que avisar

-   Work packages: paquetes de trabajo en los que se divide el proyecto,
    de cara a la imputación de horas en las timesheets:

    -   Orden

    -   Nombre

    -   Descripción

    -   Person/Months (cuantas personas trabajan teóricamente a tiempo
        completo en el proyecto por mes)

    -   Inicio

    -   Fin

    -   Work logs: en cada work package se indican las horas que ha
        trabajado cada investigador en cada día

        -   Investigador

        -   Fecha

        -   Número de horas

-   Work description: cada mes se puede indicar en lenguaje natural el
    trabajo que ha realizado un investigador en un proyecto:

    -   Investigador

    -   Descripción

    -   Mes

-   Timesheets: las hojas de trabajo en las que se imputan las horas de
    trabajo de los investigadores:

    -   Mes

    -   Investigador

    -   Datos de firma

    -   Binario del PDF

-   Para cada investigador también se registran diversos datos que son
    útiles para la gestión de sus timesheets:

    -   Dedicación del investigador a cada proyecto y en total (horas
        anuales)

    -   No laborables (vacaciones, bajas, etc)

PAGINA
------

-   Modificaciones en grupos de investigación: altas y bajas

    -   Grupo de Investigación (texto)

    -   Investigador principal (texto)

    -   Investigador para el que se solicita la modificación (texto)

    -   Fecha de incorporación (texto)

    -   Fecha de baja (texto)

    -   Documento conforme del interesado (PDF)

    -   Documentación colaboradores y becarios (PDF)

    -   Status (texto)

    -   EDP dedicación del investigador (0, 0.5, 1)

-   Alegaciones y reclamaciones

    -   Tipo de reclamación (Contratos predoctorales, ACI, Reparaciones,
        PAI, Ayudas de Iniciación a la Investigación, Contratos
        postdoctorales, Estancias breves, Contratos postdoctorales para
        la continuidad investigadora)

    -   Título (texto)

    -   Persona reclamante (texto)

    -   Motivo de la reclamación (texto)

    -   Texto de la reclamación (Texto)

    -   Ficheros adjuntos

        -   Fichero (zip, rar, rtf, doc, bmp, jpg, jpeg, pdf, doc)

    -   Texto de resolución (texto)

    -   Enviar correo informando de la resolución (Sí, No)

-   Producción científica

    -   Artículos

        -   Título (texto)

        -   Artículo con DOI sin fecha de publicación (Sí, No)

        -   Año de publicación (número)

        -   País (texto)

        -   Revista

            -   ISSN (texto)

            -   Nombre (texto)

            -   Catálogo (texto)

            -   Área (dentro del catálogo) (texto)

            -   Cuartil (dentro del área) (texto)

            -   URL (texto)

        -   Volumen (número)

        -   Número (número)

        -   Página inicial (número)

        -   Página final (número)

        -   Número de páginas (número)

        -   Coautoría con extranjeros (Sí, No)

        -   Publicación CMN (Sí, No)

        -   Palabras clave

            -   Palabra (texto)

        -   Autores

            -   DNI (texto)

            -   Nombre y Apellidos (texto)

            -   Orden (número)

    -   Otras publicaciones científicas

        -   Título (texto)

        -   Año de publicación (número)

        -   País (texto)

        -   Revista

            -   ISSN (texto)

            -   Nombre (texto)

            -   Catálogo (texto)

            -   Área (dentro del catálogo) (texto)

            -   Cuartil (dentro del área) (texto)

            -   URL (texto)

        -   Volumen (número)

        -   Número (número)

        -   Página inicial (número)

        -   Página final (número)

        -   Número de páginas (número)

        -   Tipo de publicación (Recensiones en Humanidades,
            Traducciones y ediciones anotadas en Humanidades, Prólogo de
            publicaciones científicas o cartas al editor, Revistas
            electrónicas sin ISSN, Reseña legislativa de libro)

        -   Coautoría con extranjeros (Sí, No)

        -   Publicación CMN (Sí, No)

        -   Palabras clave

            -   Palabra (texto)

        -   Autores

            -   DNI (texto)

            -   Nombre y Apellidos (texto)

            -   Orden (número)

    -   Prólogos de libros

        -   ISBN (texto)

        -   Depósito Legal (texto)

        -   Tipo de participación (autores libro completo, autores por
            capítulos, editores)

        -   Título (texto)

        -   Editorial

            -   Editorial (texto)

            -   Clasificación (texto)

        -   Número de páginas (número)

        -   Número de capítulos (número)

        -   Año de publicación (número)

        -   Coautoría con extranjeros (Sí, No)

        -   Publicación CMN (Sí, No)

        -   Prólogos del libro

            -   Número (número)

            -   Número de páginas (número)

            -   Autores

                -   DNI (texto)

                -   Nombre (texto)

                -   Apellidos (texto)

                -   Orden (número)

        -   Palabras clave

            -   Palabra (texto)

    -   Participaciones en congresos

        -   Título de contribución (texto)

        -   Tipo de participación (Cartel, Comunicación escrita,
            Comunicación oral, Conferencia, Congreso, Exposición oral,
            Mesa redonda, Otros, Panel, Ponencia, Poster, Taller)

        -   Título del congreso (texto)

        -   Fecha de celebración (fecha)

        -   Lugar de celebración (texto)

        -   Congreso Internacional (Sí, No)

        -   Palabras clave

            -   Palabra (texto)

        -   Miembros de la participación en el congreso

            -   DNI (texto)

            -   Nombre y Apellidos (texto)

            -   Orden (número)

    -   Libros

        -   ISBN (texto)

        -   Depósito Legal (texto)

        -   Tipo de participación (autores libro completo, autores por
            capítulos, editores)

        -   Título (texto)

        -   Editorial

            -   Editorial (texto)

            -   Clasificación (texto)

        -   Número de páginas (número)

        -   Número de capítulos (número)

        -   Año de publicación (número)

        -   Coautoría con extranjeros (Sí, No)

        -   Publicación CMN (Sí, No)

        -   Palabras clave

            -   Palabra (texto)

    -   Tesis dirigidas (se introducen desde gestión académica)

    -   Trabajos fin de master dirigidos (se introducen desde la
        aplicación TF)

    -   Diploma de estudios avanzados

        -   Autor

            -   DNI (texto)

            -   Nombre (texto)

            -   Apellidos (texto)

        -   Título (texto)

        -   Fecha de lectura (fecha)

        -   Facultad o escuela (texto)

        -   Directores

            -   DNI (texto)

            -   Nombre (texto)

            -   Apellidos (texto)

            -   Orden (número)

    -   Exposiciones

        -   Título (texto)

        -   Fecha celebración (fecha)

        -   Lugar de celebración (texto)

        -   Tipo (Individual o Colectiva)

        -   Indicios de calidad

            -   Criterio 1

            -   Criterio 2

            -   Criterio 3

            -   Criterio 4

        -   Obra artística a incorporar a CVN (Sí, No)

        -   Autores participantes de la exposición

            -   DNI (texto)

            -   Nombre (texto)

            -   Apellidos (texto)

            -   Orden (número)

    -   Diseños

        -   Título (texto)

        -   Fecha (fecha)

        -   Tipo (Carteles, Catálogos, Ilustraciones completas de
            libros, Logotipos y anagramas, Página web, Portada de
            libros)

        -   Indicios de calidad

            -   Criterio 1

            -   Criterio 2

            -   Criterio 3

        -   Autores participantes en el diseño

            -   DNI (texto)

            -   Nombre (texto)

            -   Apellidos (texto)

            -   Orden (número)

    -   Estancias

        -   DNI Investigador (texto)

        -   Nombre (texto)

        -   Apellidos (texto)

        -   Centro (texto)

        -   Localidad (texto)

        -   País (texto)

        -   Fecha de inicio (fecha)

        -   Fecha de fin (fecha)

        -   Tema de la estancia (fecha)

        -   Clave (Doctorado, Postdoctorado, Invitado, Contratado,
            Otros)

    -   ...

-   Producción científica externa

    -   Tesis dirigidas

        -   Autor

            -   DNI (texto)

            -   Nombre (texto)

            -   Apellidos (texto)

        -   Título (texto)

        -   Premio extraordinario (Sí, No)

        -   Mención de Doctorado Europeo (Sí, No)

        -   Datos de lectura

            -   Fecha de lectura (fecha)

            -   Universidad Nacional (texto)

            -   Universidad Extranjera

                -   Universidad (texto)

                -   Código del país (texto)

                -   Descripción del país (texto)

        -   Área de conocimiento obligatoria

            -   Código (texto)

            -   Descripción (texto)

        -   Área de conocimiento opcional

            -   Código (texto)

            -   Descripción (texto)

        -   Titulación Inicial

            -   Código (texto)

            -   Descripción (texto)

        -   Titulación final

            -   Código (texto)

            -   Descripción (texto)

        -   Código UNESCO obligatorio

            -   Área (texto)

            -   Campo (texto)

            -   Línea (texto)

            -   Descripción (texto)

        -   Directores participantes en la tesis

            -   DNI (texto)

            -   Nombre y Apellidos (texto)

    -   Patentes/Reg. Propiedad

        -   Título (texto)

        -   Tipo de patente (Patente, Registro de la propiedad)

        -   Fecha de solicitud (fecha)

        -   Número de referencia de solicitud (texto)

        -   Fecha concesión (fecha)

        -   Fecha fin vigencia (fecha)

        -   Conferencia internacional

            -   Código país (texto)

            -   Año (número)

            -   Número (número)

        -   Empresa titular

            -   Código (texto)

            -   Descripción (texto)

        -   Agente de la propiedad industrial (Texto)

        -   Sector industrial

            -   Código (texto)

            -   Descripción (texto)

        -   Inventores de la patente

            -   DNI (texto)

            -   Nombre y Apellidos (texto)

            -   Orden (número)

        -   Países a los que se ha extendido

            -   Código de país (Texto)

            -   Nombre (texto)

            -   Prioridad (Sí, No)

        -   Empresas que la están explotando

            -   Código (texto)

            -   Nombre (texto)

            -   Observaciones (texto)

    -   Tesinas dirigidas

        -   Datos del autor

            -   Nombre (texto)

            -   Apellidos (texto)

            -   DNI (texto)

        -   Título (texto)

        -   Datos de lectura

            -   Fecha de lectura

            -   Universidad Nacional (texto)

            -   Universidad Extranjera

                -   Universidad (texto)

                -   Código del país (texto)

                -   Descripción del país (texto)

        -   Directores

            -   DNI (texto)

            -   Nombre y Apellidos (texto)

    -   Trabajos fin de master dirigidos

    -   Diploma de estudios avanzados

    -   Proyectos externos

    -   ...

-   Recursos Humanos

    -   Ayudas de iniciación a la investigación

    -   Contratos predoctorales

    -   Contratos postdoctorales

    -   Estancias breves

    -   Ayudas postdoctorales para la continuidad investigadora

    -   U-Impact

    -   ...

-   Ayuda complementarias Investigación (ACI): reparto

-   Proyectos de cooperación internacional

-   Hace constar. Certificados de producción científica y pertenencia a
    grupos

-   Comisión de ética en Investigación

-   Boletín de investigación y transferencia

[^1]: 

[^2]: https://sparontologies.github.io/frapo/current/frapo.html\#d4e3251
