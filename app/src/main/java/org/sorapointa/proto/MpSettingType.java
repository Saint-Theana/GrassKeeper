package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public enum MpSettingType {
        @Tag(tag=0) MP_SETTING_TYPE_NO_ENTER ,
        @Tag(tag=1) MP_SETTING_TYPE_ENTER_FREELY ,
        @Tag(tag=2) MP_SETTING_TYPE_ENTER_AFTER_APPLY ;
}
