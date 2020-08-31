import javamodularity.easytext.pagefetch.WikipediaFetcher;
import javamodularity.easytext.pagefetch.impl.WikipediaFetchImpl;

module easytext.pagefetch {

    requires vertx.rx.java2;
    requires vertx.web.client;
    requires io.reactivex.rxjava2;
    requires easytext.vertx;
    
    exports javamodularity.easytext.pagefetch;

    uses io.vertx.reactivex.core.Vertx;
    provides WikipediaFetcher with WikipediaFetchImpl;

}