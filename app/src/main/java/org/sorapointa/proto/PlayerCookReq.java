package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class PlayerCookReq {
    public enum PlayerCookReq_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=175) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ,
        @Tag(tag=1) IsAllowClient ;
    }

    @Tag(tag=15) public Integer recipeId = null;
    @Tag(tag=6) public Integer assistAvatar = null;
    @Tag(tag=13) public Integer qteQuality = null;
    @Tag(tag=3) public Integer cookCount = null;
}
