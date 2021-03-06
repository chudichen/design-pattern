package com.michael.caching;

import lombok.extern.slf4j.Slf4j;

/**
 * @author Michael Chu
 * @since 2019-08-06 14:49
 */
@Slf4j
public class App {

    /**
     * Program entry point
     *
     * @param args command line args
     */
    public static void main(String[] args) {
        AppManager.initDb(false); // VirtualDB (instead of MongoDB) was used in running the JUnit tests
        // and the App class to avoid Maven compilation errors. Set flag to
        // true to run the tests with MongoDB (provided that MongoDB is
        // installed and socket connection is open).
        AppManager.initCacheCapacity(3);
        App app = new App();
        app.useReadAndWriteThroughStrategy();
        app.useReadThroughAndWriteAroundStrategy();
        app.useReadThroughAndWriteBehindStrategy();
        app.useCacheAsideStategy();
    }

    /**
     * Read-through and write-through
     */
    public void useReadAndWriteThroughStrategy() {
        log.info("# CachingPolicy.THROUGH");
        AppManager.initCachingPolicy(CachingPolicy.THROUGH);

        UserAccount userAccount1 = new UserAccount("001", "John", "He is a boy.");

        AppManager.save(userAccount1);
        log.info(AppManager.printCacheContent());
        AppManager.find("001");
        AppManager.find("001");
    }

    /**
     * Read-through and write-around
     */
    public void useReadThroughAndWriteAroundStrategy() {
        log.info("# CachingPolicy.AROUND");
        AppManager.initCachingPolicy(CachingPolicy.AROUND);

        UserAccount userAccount2 = new UserAccount("002", "Jane", "She is a girl.");

        AppManager.save(userAccount2);
        log.info(AppManager.printCacheContent());
        AppManager.find("002");
        log.info(AppManager.printCacheContent());
        userAccount2 = AppManager.find("002");
        userAccount2.setUserName("Jane G.");
        AppManager.save(userAccount2);
        log.info(AppManager.printCacheContent());
        AppManager.find("002");
        log.info(AppManager.printCacheContent());
        AppManager.find("002");
    }

    /**
     * Read-through and write-behind
     */
    public void useReadThroughAndWriteBehindStrategy() {
        log.info("# CachingPolicy.BEHIND");
        AppManager.initCachingPolicy(CachingPolicy.BEHIND);

        UserAccount userAccount3 = new UserAccount("003", "Adam", "He likes food.");
        UserAccount userAccount4 = new UserAccount("004", "Rita", "She hates cats.");
        UserAccount userAccount5 = new UserAccount("005", "Isaac", "He is allergic to mustard.");

        AppManager.save(userAccount3);
        AppManager.save(userAccount4);
        AppManager.save(userAccount5);
        log.info(AppManager.printCacheContent());
        AppManager.find("003");
        log.info(AppManager.printCacheContent());
        UserAccount userAccount6 = new UserAccount("006", "Yasha", "She is an only child.");
        AppManager.save(userAccount6);
        log.info(AppManager.printCacheContent());
        AppManager.find("004");
        log.info(AppManager.printCacheContent());
    }

    /**
     * Cache-Aside
     */
    public void useCacheAsideStategy() {
        log.info("# CachingPolicy.ASIDE");
        AppManager.initCachingPolicy(CachingPolicy.ASIDE);
        log.info(AppManager.printCacheContent());

        UserAccount userAccount3 = new UserAccount("003", "Adam", "He likes food.");
        UserAccount userAccount4 = new UserAccount("004", "Rita", "She hates cats.");
        UserAccount userAccount5 = new UserAccount("005", "Isaac", "He is allergic to mustard.");
        AppManager.save(userAccount3);
        AppManager.save(userAccount4);
        AppManager.save(userAccount5);

        log.info(AppManager.printCacheContent());
        AppManager.find("003");
        log.info(AppManager.printCacheContent());
        AppManager.find("004");
        log.info(AppManager.printCacheContent());
    }
}
