package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.BeginCameraSceneLookNotify_KeepRotType.*;
import org.sorapointa.proto.BeginCameraSceneLookNotify_KeepRotType;
import org.sorapointa.proto.Vector.*;
import org.sorapointa.proto.Vector;

public class BeginCameraSceneLookNotify {
    public enum BeginCameraSceneLookNotify_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=279) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=2) public Boolean isForceWalk = null;
    @Tag(tag=8) public Boolean isSetScreenXY = null;
    @Tag(tag=1) public Boolean isChangePlayMode = null;
    @Tag(tag=10,isFloat=true) public Float duration = null;
    @Tag(tag=14) public Integer keepRotType = null;
    @Tag(tag=13) public Vector lookPos = null;
    @Tag(tag=5,isFloat=true) public Float screenY = null;
    @Tag(tag=11,isFloat=true) public Float customRadius = null;
    @Tag(tag=12) public List<String> otherParams = new ArrayList<>();
    @Tag(tag=167) public Integer entityId = null;
    @Tag(tag=4) public Boolean isSetFollowPos = null;
    @Tag(tag=3) public Boolean isAllowInput = null;
    @Tag(tag=1965) public Integer blendType = null;
    @Tag(tag=15) public Boolean isRecoverKeepCurrent = null;
    @Tag(tag=2004,isFloat=true) public Float blendDuration = null;
    @Tag(tag=106) public Integer disableProtect = null;
    @Tag(tag=7) public Vector followPos = null;
    @Tag(tag=644) public Boolean isAbsFollowPos = null;
    @Tag(tag=6,isFloat=true) public Float screenX = null;
    @Tag(tag=9) public Boolean isForce = null;
}
