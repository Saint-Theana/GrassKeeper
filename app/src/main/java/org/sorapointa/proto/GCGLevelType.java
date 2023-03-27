package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public enum GCGLevelType {
        @Tag(tag=0) GCGLevelNone ,
        @Tag(tag=1) GCGLevelConst ,
        @Tag(tag=2) GCGLevelWeek ,
        @Tag(tag=3) GCGLevelWorld ,
        @Tag(tag=4) GCGLevelBoss ,
        @Tag(tag=5) GCGLevelCharacter ,
        @Tag(tag=6) GCGLevelBreak ,
        @Tag(tag=7) GCGLevelQuest ,
        @Tag(tag=8) GCGLevelGuideGroup ,
        @Tag(tag=9) HLFDBCIJMHL ;
}
