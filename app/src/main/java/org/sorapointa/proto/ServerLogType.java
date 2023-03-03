package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public enum ServerLogType {
        @Tag(tag=0) SERVER_LOG_TYPE_NONE ,
        @Tag(tag=1) SERVER_LOG_TYPE_ABILITY ,
        @Tag(tag=2) SERVER_LOG_TYPE_LEVEL ,
        @Tag(tag=3) SERVER_LOG_TYPE_ENTITY ,
        @Tag(tag=4) SERVER_LOG_TYPE_LUA ;
}
