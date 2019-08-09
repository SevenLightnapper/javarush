package javarush.java_collections_4.level7.lecture8.task2.connectors;

import javarush.java_collections_4.level7.lecture8.task2.security.SecurityChecker;

public class SecurityProxyConnector implements Connector {
    SimpleConnector simpleConnector;
    SecurityChecker securityChecker;

    public SecurityProxyConnector(String resourceString) {
        simpleConnector = new SimpleConnector(resourceString);
    }

    @Override
    public void connect() {
        if (securityChecker.performSecurityCheck())
            simpleConnector.connect();
    }
}
