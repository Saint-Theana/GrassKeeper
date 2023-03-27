package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public enum ChapterState {
        @Tag(tag=0) Invalid ,
        @Tag(tag=1) UnableToBegin ,
        @Tag(tag=2) Begin ,
        @Tag(tag=3) End ;
}
