package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.SocialDetail.*;
import org.sorapointa.proto.SocialDetail;

public class GetPlayerSocialDetailRsp {
    public enum GetPlayerSocialDetailRsp_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=4014) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=15) public SocialDetail detailData = null;
    @Tag(tag=14,isSigned=true) public Integer retcode = null;
}
