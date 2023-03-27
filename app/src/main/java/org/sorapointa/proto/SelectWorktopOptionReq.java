package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class SelectWorktopOptionReq {
    public enum SelectWorktopOptionReq_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=820) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ,
        @Tag(tag=1) IsAllowClient ;
    }

    @Tag(tag=1) public Integer optionId = null;
    @Tag(tag=15) public Integer gadgetEntityId = null;
}
