package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public enum PlatformType {
        @Tag(tag=0) Editor ,
        @Tag(tag=1) Ios ,
        @Tag(tag=2) Android ,
        @Tag(tag=3) Pc ,
        @Tag(tag=4) Ps4 ,
        @Tag(tag=5) Server ,
        @Tag(tag=6) CloudAndroid ,
        @Tag(tag=7) CloudIos ,
        @Tag(tag=8) Ps5 ,
        @Tag(tag=9) CloudWeb ,
        @Tag(tag=10) CloudTv ,
        @Tag(tag=11) CloudMac ,
        @Tag(tag=12) CloudPc ,
        @Tag(tag=13) CloudThirdPartyMobile ,
        @Tag(tag=14) CloudThirdPartyPc ;
}
