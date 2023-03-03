package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public enum HideAndSeekStageType {
        @Tag(tag=0) HIDE_AND_SEEK_STAGE_TYPE_PREPARE ,
        @Tag(tag=1) HIDE_AND_SEEK_STAGE_TYPE_PICK ,
        @Tag(tag=2) HIDE_AND_SEEK_STAGE_TYPE_GAME ,
        @Tag(tag=3) HIDE_AND_SEEK_STAGE_TYPE_HIDE ,
        @Tag(tag=4) HIDE_AND_SEEK_STAGE_TYPE_SEEK ,
        @Tag(tag=5) HIDE_AND_SEEK_STAGE_TYPE_SETTLE ;
}
