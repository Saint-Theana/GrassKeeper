package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.BlossomBriefInfo.*;
import org.sorapointa.proto.BlossomBriefInfo;

public class BlossomBriefInfoNotify {
    public enum BlossomBriefInfoNotify_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=2787) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ,
        @Tag(tag=1) IsAllowClient ;
    }

    @Tag(tag=9) public List<BlossomBriefInfo> briefInfoList = new ArrayList<>();
}
