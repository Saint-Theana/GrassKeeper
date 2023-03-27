package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class BlossomChestCreateNotify {
    public enum BlossomChestCreateNotify_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=2774) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ,
        @Tag(tag=1) IsAllowClient ;
    }

    @Tag(tag=9) public Integer circleCampId = null;
    @Tag(tag=1) public Integer refreshId = null;
}
