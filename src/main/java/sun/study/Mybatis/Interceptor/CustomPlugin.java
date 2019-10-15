package sun.study.Mybatis.Interceptor;

import org.apache.ibatis.executor.Executor;
import org.apache.ibatis.mapping.BoundSql;
import org.apache.ibatis.mapping.MappedStatement;
import org.apache.ibatis.plugin.*;
import org.apache.ibatis.session.ResultHandler;
import org.apache.ibatis.session.RowBounds;
import sun.study.Mybatis.Entity.User;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.Properties;

@Intercepts({
    @Signature(
            type = Executor.class,
            method = "query",
            args = {MappedStatement.class, Object.class , RowBounds.class, ResultHandler.class})
})
public class CustomPlugin implements Interceptor {

    @Override
    public Object intercept(Invocation invocation) throws Throwable {

        Object[] queryArgs = invocation.getArgs();
        MappedStatement mappedStatement = (MappedStatement)queryArgs[0];
        Object parameter = queryArgs[1];
        BoundSql boundSql = mappedStatement.getBoundSql(parameter);
        String sql = boundSql.getSql(); // 获取SQL
        String name = invocation.getMethod().getName();
        System.out.println("拦截的方法是：" + name);
        System.out.println("参数：" + queryArgs[1]);
        System.out.println("SQL：" + sql);
        if (queryArgs[1] instanceof User){
            User user = (User) queryArgs[1];
            user.setName("Royi");
        }
        return invocation.proceed();
    }

    @Override
    public Object plugin(Object o) {
        return Plugin.wrap(o, this);
    }

    @Override
    public void setProperties(Properties properties) {
        Iterator iterator = properties.entrySet().iterator();
        if (iterator.hasNext())
            System.out.println(iterator.next());
    }
}
