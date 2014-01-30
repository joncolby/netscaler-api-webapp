dataSource {
    //pooled = true
    // pooling is not recommended for H2
    pooled = false
    //driverClassName = "org.hsqldb.jdbcDriver"
    // H2 driver
    driverClassName = "org.h2.Driver"
    username = "sa"
    password = ""
}
hibernate {
    cache.use_second_level_cache = true
    cache.use_query_cache = true
    cache.provider_class = 'net.sf.ehcache.hibernate.EhCacheProvider'
}
// environment specific settings
environments {
    development {
        dataSource {
            dbCreate = "create-drop" // one of 'create', 'create-drop','update'
            //url = "jdbc:h2:mem:devDB;MODE=MYSQL"
            //url = "jdbc:h2:file:~/.h2;MODE=MYSQL"
            workdir = System.properties.getProperty('workdir') ?: '/tmp'
            url = "jdbc:h2:file:" + workdir + "/.h2;MODE=MYSQL"

        }
    }
    test {
        dataSource {
            dbCreate = "update"
            //url = "jdbc:h2:mem:testDb;MODE=MYSQL"
            //url = "jdbc:h2:file:~/.h2;MODE=MYSQL"
            workdir = System.properties.getProperty('workdir') ?: '/tmp'
            url = "jdbc:h2:file:" + workdir + "/.h2;MODE=MYSQL"
        }
    }
    production {
        dataSource {
            //dbCreate = "update"
            dbCreate = "create-drop" // one of 'create', 'create-drop','update'
            //url = "jdbc:hsqldb:file:prodDb;shutdown=true"
            //url = "jdbc:h2:mem:prodDb;MODE=MYSQL"
            //url = "jdbc:h2:file:~/.h2;MODE=MYSQL"
            workdir = System.properties.getProperty('workdir') ?: '/tmp'
            url = "jdbc:h2:file:" + workdir + "/.h2;MODE=MYSQL"
        }
    }
}
