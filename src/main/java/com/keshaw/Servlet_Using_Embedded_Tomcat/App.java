package com.keshaw.Servlet_Using_Embedded_Tomcat;

import org.apache.catalina.Context;
import org.apache.catalina.LifecycleException;
import org.apache.catalina.startup.Tomcat;

public class App 
{
    public static void main( String[] args ) throws LifecycleException
    {
        System.out.println( "Hello World!" );
        
        
        Tomcat tomcat = new Tomcat();
        //Setting port number if needed
        tomcat.setPort(8080);
        
        Context context = tomcat.addContext("", null);
        Tomcat.addServlet(context, "helloServlet", new HelloServlet());
        context.addServletMappingDecoded("/hello", "helloServlet");
        
        
        //Starting the tomcat
        tomcat.start();
        
        //Telling tomcat to wait for request
        tomcat.getServer().await();
    }
}
