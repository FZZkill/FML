package com.fzzkill.Language;

import org.apache.commons.io.FileUtils;
import org.json.JSONObject;

import java.io.File;
import java.io.IOException;


public class Languages {
    private final File ZH_CN_FILE = new File("src/main/resources/com/fzzkill/language/zn_cn.json");
    String zh_cn;

    {
        try {
            zh_cn = FileUtils.readFileToString(ZH_CN_FILE,"UTF-8");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public final JSONObject ZH_CN = new JSONObject(zh_cn);
    public static Languages Languages_Object = new Languages();
    private Languages(){

    }

}
