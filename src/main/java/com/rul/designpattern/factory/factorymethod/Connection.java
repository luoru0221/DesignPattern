package com.rul.designpattern.factory.factorymethod;

/**
 * 抽象产品
 *
 * @author LuoRu
 */
public interface Connection {
}


/**
 * 具体产品
 *
 * @author LuoRu
 */
class POP3Connection implements Connection {
    POP3Connection() {
        System.out.println("POP3Connection created");
    }
}

class IMAPConnection implements Connection {
    IMAPConnection() {
        System.out.println("IMAPConnection created");
    }
}

class HTTPConnection implements Connection {
    HTTPConnection() {
        System.out.println("HTTPConnection created");
    }
}
