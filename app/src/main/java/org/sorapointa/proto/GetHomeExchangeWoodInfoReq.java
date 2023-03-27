package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class GetHomeExchangeWoodInfoReq {
    public enum DOHACOMPLLC {
        @Tag(tag=0) None ,
        @Tag(tag=4775) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ,
        @Tag(tag=1) IsAllowClient ;
    }

}
