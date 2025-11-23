package org.h2.test.db;

import org.junit.jupiter.api.Test;
import org.h2.test.db.TestIndex;
import org.h2.test.db.TestIndexHints;
import org.h2.test.db.TestCompoundIndexSearch;
import org.h2.test.db.TestCompoundIndexParamSearch;
import org.h2.test.db.TestOptimizations;
import org.h2.test.db.TestQueryCache;

/**
 * JUnit wrapper to execute only the {@link TestTableEngines} suite and obtain
 * standard Surefire/JUnit pass/fail reporting, without invoking the full
 * aggregated test harness.
 */
public class TestMinimalJUnit {

    @Test
    public void runSubset() throws Exception {
        TestTableEngines t = new TestTableEngines();
        t.init(); // initialize base test configuration
        t.test(); // execute the subset contained in TestTableEngines
    }

    @Test
    public void runTestIndex() throws Exception {
        TestIndex t = new TestIndex();
        t.init();
        t.test();
    }

    @Test
    public void runTestIndexHints() throws Exception {
        TestIndexHints t = new TestIndexHints();
        t.init();
        t.test();
    }

    @Test
    public void runTestCompoundIndexSearch() throws Exception {
        TestCompoundIndexSearch t = new TestCompoundIndexSearch();
        t.init();
        t.test();
    }

    @Test
    public void runTestCompoundIndexParamSearch() throws Exception {
        TestCompoundIndexParamSearch t = new TestCompoundIndexParamSearch();
        t.init();
        t.test();
    }

    @Test
    public void runTestOptimizations() throws Exception {
        TestOptimizations t = new TestOptimizations();
        t.init();
        t.test();
    }

    @Test
    public void runTestQueryCache() throws Exception {
        TestQueryCache t = new TestQueryCache();
        t.init();
        t.test();
    }
}
