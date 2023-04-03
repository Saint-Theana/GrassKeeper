package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.GMObstacleInfo.*;
import org.sorapointa.proto.GMObstacleInfo;

public class GMShowObstacleRsp {
    public enum GMShowObstacleRsp_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=2356) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=12,isSigned=true) public Integer retcode = null;
    @Tag(tag=7) public List<GMObstacleInfo> obstacles = new ArrayList<>();
}
