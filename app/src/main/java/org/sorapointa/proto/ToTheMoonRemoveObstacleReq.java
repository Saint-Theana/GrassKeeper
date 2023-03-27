package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class ToTheMoonRemoveObstacleReq {
    public enum GJHBFLDKNPH {
        @Tag(tag=0) None ,
        @Tag(tag=6170) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ,
        @Tag(tag=1) IsAllowClient ;
    }

    @Tag(tag=2) public Integer sceneId = null;
    @Tag(tag=13,isSigned=true) public Integer queryId = null;
    @Tag(tag=9,isSigned=true) public Integer handle = null;
}
