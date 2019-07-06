package itboy.arouterdemo;

import android.app.Application;

import com.alibaba.android.arouter.launcher.ARouter;

public class MyApp extends Application {
    @Override
    public void onCreate() {
        super.onCreate();

        ARouter.openDebug();
        ARouter.openLog();

        /**
         * 主要是查找编译的时候生成的文件，并将文件存的到内存中，生成一个调用的路由表
         */
        ARouter.init(this);
    }
}
