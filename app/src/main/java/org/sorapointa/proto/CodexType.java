package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public enum CodexType {
        @Tag(tag=0) CODEX_TYPE_NONE ,
        @Tag(tag=1) CODEX_TYPE_QUEST ,
        @Tag(tag=2) CODEX_TYPE_WEAPON ,
        @Tag(tag=3) CODEX_TYPE_ANIMAL ,
        @Tag(tag=4) CODEX_TYPE_MATERIAL ,
        @Tag(tag=5) CODEX_TYPE_BOOKS ,
        @Tag(tag=6) CODEX_TYPE_PUSHTIPS ,
        @Tag(tag=7) CODEX_TYPE_VIEW ,
        @Tag(tag=8) CODEX_TYPE_RELIQUARY ;
}
