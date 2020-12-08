package com.rul.designpattern.factory.abstractfactory;

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
class OracleConnection implements Connection {
    OracleConnection() {
        System.out.println("OracleConnection created");
    }
}

class MySQLConnection implements Connection {
    MySQLConnection() {
        System.out.println("MySQLConnection created");
    }
}
