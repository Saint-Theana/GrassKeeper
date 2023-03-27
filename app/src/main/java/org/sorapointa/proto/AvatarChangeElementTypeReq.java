package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class AvatarChangeElementTypeReq {
    public enum AvatarChangeElementTypeReq_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=1664) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ,
        @Tag(tag=1) IsAllowClient ;
    }

    @Tag(tag=8) public Integer sceneId = null;
    @Tag(tag=1) public Integer areaId = null;
}
