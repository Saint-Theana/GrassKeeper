package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public enum ChapterState {
        @Tag(tag=0) CHAPTER_STATE_INVALID ,
        @Tag(tag=1) CHAPTER_STATE_UNABLE_TO_BEGIN ,
        @Tag(tag=2) CHAPTER_STATE_BEGIN ,
        @Tag(tag=3) CHAPTER_STATE_END ;
}
