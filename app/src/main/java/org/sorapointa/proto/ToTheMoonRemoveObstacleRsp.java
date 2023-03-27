package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class ToTheMoonRemoveObstacleRsp {
    public enum BAEILLHPINF {
        @Tag(tag=0) None ,
        @Tag(tag=6162) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=4,isSigned=true) public Integer queryId = null;
    @Tag(tag=8) public DynamicNodes dynamicNodes = null;
    @Tag(tag=3,isSigned=true) public Integer retcode = null;
}
