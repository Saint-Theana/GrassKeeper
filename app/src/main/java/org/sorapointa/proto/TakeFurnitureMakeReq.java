package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class TakeFurnitureMakeReq {
    public enum TakeFurnitureMakeReq_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=4825) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ,
        @Tag(tag=1) IsAllowClient ;
    }

    @Tag(tag=6) public Integer index = null;
    @Tag(tag=15) public Boolean isFastFinish = null;
    @Tag(tag=9) public Integer makeId = null;
}
