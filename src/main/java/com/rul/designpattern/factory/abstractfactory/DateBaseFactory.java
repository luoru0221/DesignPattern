package com.rul.designpattern.factory.abstractfactory;

/**
 * 抽象工厂
 *
 * @author LuoRu
 */
public interface DateBaseFactory {
    Connection createConnection();

    Statement createStatement();
}


/**
 * 具体工厂
 *
 * @author LuoRu
 */
class OracleFactory implements DateBaseFactory {

    @Override
    public Connection createConnection() {
        return new OracleConnection();
    }

    @Override
    public Statement createStatement() {
        return new OracleStatement();
    }
}

class MySQLFactory implements DateBaseFactory {

    @Override
    public Connection createConnection() {
        return new MySQLConnection();
    }

    @Override
    public Statement createStatement() {
        return new MySQLStatement();
    }
}