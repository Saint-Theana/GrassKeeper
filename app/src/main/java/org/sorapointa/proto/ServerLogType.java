package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public enum ServerLogType {
        @Tag(tag=0) ServerLogTypeNone ,
        @Tag(tag=1) ServerLogTypeAbility ,
        @Tag(tag=2) ServerLogTypeLevel ,
        @Tag(tag=3) ServerLogTypeEntity ,
        @Tag(tag=4) ServerLogTypeLua ;
}
