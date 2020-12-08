package com.rul.designpattern.factory.abstractfactory;

/**
 * 抽象产品
 *
 * @author LuoRu
 */
public interface Statement {
}


/**
 * 具体产品
 *
 * @author LuoRu
 */
class OracleStatement implements Statement {
    OracleStatement() {
        System.out.println("OracleStatement created");
    }
}

class MySQLStatement implements Statement {
    MySQLStatement() {
        System.out.println("MySQLStatement created");
    }
}