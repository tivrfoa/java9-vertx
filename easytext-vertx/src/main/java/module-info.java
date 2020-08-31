module easytext.vertx {
    requires transitive vertx.rx.java2;

    exports javamodularity.easytext.vertx;

    provides io.vertx.reactivex.core.Vertx with javamodularity.easytext.vertx.VertxProvider;

}