package system;

import common.BucketTestCase;
import liquibase.Liquibase;
import liquibase.database.Database;
import liquibase.database.DatabaseFactory;
import liquibase.resource.ClassLoaderResourceAccessor;
import lombok.SneakyThrows;

/**
 * End to end extension test on specific change logs
 */
public class LiquiBaseSystemTest extends BucketTestCase {

    /**
     * @param changeLogFile full path to test xml file
     * @return Ready to execute Liquibase instance
     */
    @SneakyThrows
    protected Liquibase liquiBase(String changeLogFile) {
        DatabaseFactory instance = DatabaseFactory.getInstance();
        Database db = instance.findCorrectDatabaseImplementation(database.getConnection());
        return new Liquibase(changeLogFile, new ClassLoaderResourceAccessor(), db);
    }

}
