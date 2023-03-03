package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.Vector.*;
import org.sorapointa.proto.Vector;

public class BeginCameraSceneLookNotify {
    public enum KeepRotType {
        @Tag(tag=0) KEEP_ROT_TYPE_X ,
        @Tag(tag=1) KEEP_ROT_TYPE_XY ;
    }

    @Tag(tag=1154) public Integer blendType = null;
    @Tag(tag=7,isFloat=true) public Float customRadius = null;
    @Tag(tag=5) public Boolean isSetScreenXy = null;
    @Tag(tag=4) public Vector lookPos = null;
    @Tag(tag=11) public Boolean isRecoverKeepCurrent = null;
    @Tag(tag=1375) public Boolean isAbsFollowPos = null;
    @Tag(tag=6) public KeepRotType keepRotType = null;
    @Tag(tag=9) public Boolean isChangePlayMode = null;
    @Tag(tag=1103) public Integer disableProtect = null;
    @Tag(tag=15,isFloat=true) public Float screenY = null;
    @Tag(tag=13) public Boolean isSetFollowPos = null;
    @Tag(tag=12) public Boolean isForce = null;
    @Tag(tag=1758,isFloat=true) public Float blendDuration = null;
    @Tag(tag=1327) public Integer entityId = null;
    @Tag(tag=3,isFloat=true) public Float screenX = null;
    @Tag(tag=10) public Boolean isForceWalk = null;
    @Tag(tag=1) public List<String> otherParams = new ArrayList<>();
    @Tag(tag=8) public Vector followPos = null;
    @Tag(tag=2) public Boolean isAllowInput = null;
    @Tag(tag=14,isFloat=true) public Float duration = null;
}
