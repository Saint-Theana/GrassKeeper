package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class UgcNotify {
    public enum UgcNotify_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=6337) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=13) public Boolean isUgcPublishBan = null;
    @Tag(tag=5) public Boolean isUgcPublishFeatureClosed = null;
    @Tag(tag=10) public Boolean isUgcFeatureClosed = null;
}
