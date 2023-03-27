package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class BrickBreakerSelectAvatarRsp {
    public enum HCCMDPLDFKP {
        @Tag(tag=0) None ,
        @Tag(tag=5302) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=13) public List<Integer> avatarId = new ArrayList<>();
    @Tag(tag=9,isSigned=true) public Integer retcode = null;
}
