package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public enum MatchType {
        @Tag(tag=0) None ,
        @Tag(tag=1) Dungeon ,
        @Tag(tag=2) MpPlay ,
        @Tag(tag=3) Mechanicus ,
        @Tag(tag=4) General ,
        @Tag(tag=5) Gcg ;
}
