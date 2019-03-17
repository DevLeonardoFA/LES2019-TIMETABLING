<?xml version="1.0" encoding="UTF-8"?>
<persistence version="2.0" xmlns="http://java.sun.com/xml/ns/persistence" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xsi:schemaLocation="http://java.sun.com/xml/ns/persistence http://java.sun.com/xml/ns/persistence/persistence_2_0.xsd">
    <persistence-unit name="TimeTab">
		<p dir="ltr">
  		<provider>org.hibernate.jpa.HibernatePersistenceProvider</provider>
     	  	<class>model.Professor</class>
       		<class>model.Curso</class>
       		<class>model.Materia</class>
       	  
     <properties>
     <property name="javax.persistence.jdbc.driver" value="com.mysql.jdbc.Driver" />
     <property name="javax.persistence.jdbc.url" value="jdbc:mysql://localhost:3306/TimeTab" />
     <property name="javax.persistence.jdbc.user" value="root" />
     <property name="javax.persistence.jdbc.password" value="root" />

     <property name="hibernate.dialect" value="org.hibernate.dialect.MySQLDialect" />
     <property name="hibernate.show_sql" value="true" />
     <property name="hibernate.hbm2ddl.auto" value="update" />
     </properties>
       
    </persistence-unit>
 </persistence>