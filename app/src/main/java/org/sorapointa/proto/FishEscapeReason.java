package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public enum FishEscapeReason {
        @Tag(tag=0) FISH_ESCAPE_REASON_NONE ,
        @Tag(tag=1) FISH_ESCAPE_REASON_SHOCKED ,
        @Tag(tag=2) FISH_ESCAPE_REASON_UNHOOK ;
}
