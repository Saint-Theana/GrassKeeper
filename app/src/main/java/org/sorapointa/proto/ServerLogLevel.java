package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public enum ServerLogLevel {
        @Tag(tag=0) LogLevelNone ,
        @Tag(tag=1) LogLevelDebug ,
        @Tag(tag=2) LogLevelInfo ,
        @Tag(tag=3) LogLevelWarning ,
        @Tag(tag=4) LogLevelError ;
}
