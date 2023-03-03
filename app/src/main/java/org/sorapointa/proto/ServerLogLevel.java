package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public enum ServerLogLevel {
        @Tag(tag=0) SERVER_LOG_LEVEL_NONE ,
        @Tag(tag=1) SERVER_LOG_LEVEL_DEBUG ,
        @Tag(tag=2) SERVER_LOG_LEVEL_INFO ,
        @Tag(tag=3) SERVER_LOG_LEVEL_WARNING ,
        @Tag(tag=4) SERVER_LOG_LEVEL_ERROR ;
}
