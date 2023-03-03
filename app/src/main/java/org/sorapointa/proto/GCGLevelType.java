package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public enum GCGLevelType {
        @Tag(tag=0) GCG_LEVEL_TYPE_NONE ,
        @Tag(tag=1) GCG_LEVEL_TYPE_CONST ,
        @Tag(tag=2) GCG_LEVEL_TYPE_WEEK ,
        @Tag(tag=3) GCG_LEVEL_TYPE_WORLD ,
        @Tag(tag=4) GCG_LEVEL_TYPE_BOSS ,
        @Tag(tag=5) GCG_LEVEL_TYPE_CHARACTER ;
}
