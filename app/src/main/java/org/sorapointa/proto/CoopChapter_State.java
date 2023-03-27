package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public enum CoopChapter_State {
        @Tag(tag=0) Close ,
        @Tag(tag=1) CondNotMeet ,
        @Tag(tag=2) CondMeet ,
        @Tag(tag=3) Accept ;
}
