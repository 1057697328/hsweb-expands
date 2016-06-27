package org.hsweb.expands.script.engine.js;


import org.hsweb.commons.StringUtils;
import org.hsweb.expands.script.engine.common.CommonScriptEngine;

import javax.script.CompiledScript;

/**
 * Created by 浩 on 2015-10-27 0027.
 */
public class JavaScriptEngine extends CommonScriptEngine {

    @Override
    public String getScriptName() {
        return "javascript";
    }

    @Override
    public boolean compile(String id, String code) throws Exception {
        code = StringUtils.concat("(function(){", code, "\n})();");
        return super.compile(id,code);
    }
}
