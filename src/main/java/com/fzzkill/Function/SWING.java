package com.fzzkill.Function;

import com.fzzkill.Language.Languages;
import com.fzzkill.other.Return;
import org.json.JSONObject;

import javax.swing.*;
import java.awt.*;

public class SWING {

    JSONObject ZH_CN = Languages.Languages_Object.ZH_CN.getJSONObject("JavaSwing");

    final JFrame JF = new JFrame();
    final Button CLOSE    = new Button(ZH_CN.getJSONArray("Button").getString(0));
    final Button CHOOSE   = new Button(ZH_CN.getJSONArray("Button").getString(1));
    final Button DOWNLOAD = new Button(ZH_CN.getJSONArray("Button").getString(2));
    final JLabel NOTFIND  = new JLabel(ZH_CN.getString("Title"));
    final Font NOTFIND_FONT = new Font("", 15, 15);

    public static boolean DownloadLibs() {

        return true;

    }

}
