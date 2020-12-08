package com.rul.designpattern.factory.factorymethod;

/**
 * 抽象工厂
 *
 * @author LuoRu
 */
public interface ConnectionFactory {
    Connection createConnection();
}


/**
 * 具体工厂
 *
 * @author LuoRu
 */
class POP3ConnectionFactory implements ConnectionFactory {

    @Override
    public Connection createConnection() {
        return new POP3Connection();
    }
}

class IMAPConnectionFactory implements ConnectionFactory {

    @Override
    public Connection createConnection() {
        return new POP3Connection();
    }
}

class HTTPConnectionFactory implements ConnectionFactory {

    @Override
    public Connection createConnection() {
        return new HTTPConnection();
    }
}