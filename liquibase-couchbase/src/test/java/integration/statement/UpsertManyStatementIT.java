package integration.statement;

import com.google.common.collect.ImmutableMap;

import org.junit.jupiter.api.Test;

import java.util.Map;

import common.BucketTestCase;
import static common.constants.TestConstants.TEST_DOCUMENT;
import static common.constants.TestConstants.TEST_DOCUMENT_2;
import static common.constants.TestConstants.TEST_DOCUMENT_3;
import static common.constants.TestConstants.TEST_ID;
import static common.constants.TestConstants.TEST_ID_2;

class UpsertManyStatementIT extends BucketTestCase {

    private final Map<String, String> testDocuments = ImmutableMap.of(
            TEST_ID, TEST_DOCUMENT,
            TEST_ID_2, TEST_DOCUMENT_2
    );

    @Test
    void Should_insert_and_update_many_documents() {
        insertDocInTestCollection(TEST_ID, TEST_DOCUMENT_3);
//        UpsertManyStatement statement = new UpsertManyStatement(TEST_KEYSPACE, testDocuments);

//        statement.execute(database.getConnection());
//
//        Collection collection = getTestCollection();
//        assertThat(collection).containDocuments(testDocuments);
//        removeDocsFromTestCollection(TEST_ID, TEST_ID_2);
    }

}
