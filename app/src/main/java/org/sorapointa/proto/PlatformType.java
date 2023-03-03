package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public enum PlatformType {
        @Tag(tag=0) PLATFORM_TYPE_EDITOR ,
        @Tag(tag=1) PLATFORM_TYPE_IOS ,
        @Tag(tag=2) PLATFORM_TYPE_ANDROID ,
        @Tag(tag=3) PLATFORM_TYPE_PC ,
        @Tag(tag=4) PLATFORM_TYPE_PS4 ,
        @Tag(tag=5) PLATFORM_TYPE_SERVER ,
        @Tag(tag=6) PLATFORM_TYPE_CLOUD_ANDROID ,
        @Tag(tag=7) PLATFORM_TYPE_CLOUD_IOS ,
        @Tag(tag=8) PLATFORM_TYPE_PS5 ,
        @Tag(tag=9) PLATFORM_TYPE_CLOUD_WEB ,
        @Tag(tag=10) PLATFORM_TYPE_CLOUD_TV ,
        @Tag(tag=11) PLATFORM_TYPE_CLOUD_MAC ,
        @Tag(tag=12) PLATFORM_TYPE_CLOUD_PC ,
        @Tag(tag=13) PLATFORM_TYPE_CLOUD_THIRD_PARTY_MOBILE ,
        @Tag(tag=14) PLATFORM_TYPE_CLOUD_THIRD_PARTY_PC ;
}
