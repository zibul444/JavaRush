/**
 * Created by abcherkashin on 15.11.17.
 */
/*
 * #%L
 * HTTP SSL Client Example
 * %%
 * Copyright (C) 2014 Antonio Musarra
 * %%
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as
 * published by the Free Software Foundation, either version 3 of the
 * License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public
 * License along with this program.  If not, see
 * <http://www.gnu.org/licenses/gpl-3.0.html>.
 * #L%
 */
/**
 *
 */
//package it.dontesta.blog.ssl;

import java.net.URL;
import java.security.Principal;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.List;

import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocketFactory;


/**
 * @author amusarra
 *
 *         VM Arguments
 *
 *         -Djavax.net.debug=ssl
 *         -Djavax.net.ssl.trustStore=/Users/amusarra/Documents/workspace-myBlog/http-ssl-client-example/src/main/resources/cacerts.jks
 *         -Djavax.net.ssl.trustStorePassword=changeit
 *
 *         Documents di riferimento:
 *         	JavaTM Secure Socket Extension (JSSE) Reference Guide http://docs.oracle.com/javase/6/docs/technotes/guides/security/jsse/JSSERefGuide.html
 *         	JavaTM Secure Socket Extension (JSSE) Reference Guide http://docs.oracle.com/javase/7/docs/technotes/guides/security/jsse/JSSERefGuide.html
 *         	Transport Layer Security (TLS) Renegotiation Issue Readme http://www.oracle.com/technetwork/java/javase/documentation/tlsreadme2-176330.html
 */
public class HTTPSClientExample {

    private static List<String> targetURL = new ArrayList<String>();

    static {
        // for localhost testing only
        javax.net.ssl.HttpsURLConnection
                .setDefaultHostnameVerifier(new javax.net.ssl.HostnameVerifier() {

                    @Override
                    public boolean verify(String hostname,
                                          javax.net.ssl.SSLSession sslSession) {
                        if (hostname.equals("localhost")) {
                            return true;
                        }
                        return false;
                    }
                });
    }

    /**
     *
     */
    public HTTPSClientExample() {
        // TODO Auto-generated constructor stub
    }

    /**
     * @param args
     */
    public static void main(String[] args) {
        targetURL.add("https://www.goodreads.com/book/show/18734728-enterprise-integration-with-wso2-esb?from_search=true");
        targetURL.add("https://www.liferay.com/it/products/liferay-portal/overview");
        targetURL.add("https://crm-shiruslabs.dontesta.it:8443/SugarEnt-Full-7.1.0/");

        for (String httpURL : targetURL) {
            HttpsURLConnection connection = null;
            try {
                // Create connection

                URL url = new URL(httpURL);
                connection = (HttpsURLConnection) url.openConnection();

                // Prepare a GET request Action
                connection.setRequestMethod("GET");
                connection.setRequestProperty("User-Agent", "Antonio Musarra's Blog Java Client 1.0");
                connection.setRequestProperty("Accept", "text/html,application/xhtml+xml,application/xml");
                connection.setRequestProperty("Accept-Language", "it-IT,it");

                connection.setUseCaches(false);
                connection.setDoOutput(true);

                // Create a SSL SocketFactory
                SSLSocketFactory sslSocketFactory = getFactorySimple();
                connection.setSSLSocketFactory(sslSocketFactory);


                Certificate[] serverCertificate = connection.getServerCertificates();

                for (Certificate certificate : serverCertificate) {


                    if (certificate instanceof X509Certificate) {
                        X509Certificate x509cert = (X509Certificate) certificate;

                        // Get subject
                        Principal principal = x509cert.getSubjectDN();


                        // Get issuer
                        principal = x509cert.getIssuerDN();

                    }
                }

                // Close Connection
                connection.disconnect();

            } catch (Exception e) {
                if (connection != null) {
                    connection.disconnect();
                }

            }
        }
    }

    /**
     *
     * @return
     * @throws Exception
     */
    private static SSLSocketFactory getFactorySimple() throws Exception {
        SSLContext context = SSLContext.getInstance("TLS");
        context.init(null, null, null);
        return context.getSocketFactory();
    }
}
