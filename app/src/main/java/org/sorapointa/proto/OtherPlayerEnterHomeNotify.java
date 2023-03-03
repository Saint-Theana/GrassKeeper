package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class OtherPlayerEnterHomeNotify {
    public enum Reason {
        @Tag(tag=0) REASON_INVALID ,
        @Tag(tag=1) REASON_ENTER ,
        @Tag(tag=2) REASON_LEAVE ;
    }

    @Tag(tag=7) public String nickname = null;
    @Tag(tag=3) public Reason reason = null;
}
