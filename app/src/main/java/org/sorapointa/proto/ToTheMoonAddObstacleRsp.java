package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class ToTheMoonAddObstacleRsp {
    public enum FAJPJAOONHC {
        @Tag(tag=0) None ,
        @Tag(tag=6180) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=11,isSigned=true) public Integer retcode = null;
    @Tag(tag=8,isSigned=true) public Integer queryId = null;
    @Tag(tag=4) public DynamicNodes dynamicNodes = null;
}
