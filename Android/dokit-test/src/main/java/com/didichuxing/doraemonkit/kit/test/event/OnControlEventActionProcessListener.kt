package com.didichuxing.doraemonkit.kit.test.event

import android.app.Activity
import android.view.View


/**
 * didi Create on 2022/4/13 .
 *
 * Copyright (c) 2022/4/13 by didiglobal.com.
 *
 * @author <a href="realonlyone@126.com">zhangjun</a>
 * @version 1.0
 * @Date 2022/4/13 7:00 下午
 * @Description 用一句话说明文件功能
 */

interface OnControlEventActionProcessListener {

    fun onControlEventProcessSuccess(activity: Activity?, view: View?, controlEvent: ControlEvent)


    fun onControlEventProcessFailed(activity: Activity?, view: View?, controlEvent: ControlEvent, code: Int, message: String)

}
