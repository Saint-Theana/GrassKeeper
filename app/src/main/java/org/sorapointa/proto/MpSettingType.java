package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public enum MpSettingType {
        @Tag(tag=0) MpSettingNoEnter ,
        @Tag(tag=1) MpSettingEnterFreely ,
        @Tag(tag=2) MpSettingEnterAfterApply ;
}
