package liquibase.ext.couchbase.changelog;

import liquibase.changelog.ChangeSet;
import liquibase.changelog.RanChangeSet;

public class CouchbaseRanChangeset extends RanChangeSet {

    public CouchbaseRanChangeset(ChangeSet changeSet) {
        super(changeSet);
    }

}
