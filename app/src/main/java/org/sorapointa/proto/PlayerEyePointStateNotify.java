package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class PlayerEyePointStateNotify {
    public enum PlayerEyePointStateNotify_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=3435) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=1) public Boolean isUseEyePoint = null;
    @Tag(tag=14) public Vector eyePointPos = null;
    @Tag(tag=11) public Integer regionGroupId = null;
    @Tag(tag=2) public Integer regionShape = null;
    @Tag(tag=4) public Integer regionConfigId = null;
    @Tag(tag=6,isSigned=true) public Integer fixLodLevel = null;
    @Tag(tag=5) public Integer regionEntityId = null;
    @Tag(tag=10) public Boolean isFilterStreamPos = null;
    @Tag(tag=152,isFloat=true) public Float sphereRadius = null;
    @Tag(tag=879) public Vector cubicSize = null;
    @Tag(tag=1320) public CylinderSize cylinderSize = null;
    @Tag(tag=1996) public PolygonSize polygonSize = null;
}
