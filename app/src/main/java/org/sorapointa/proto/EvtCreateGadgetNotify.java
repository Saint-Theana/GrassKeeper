package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class EvtCreateGadgetNotify {
    public enum EvtCreateGadgetNotify_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=320) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ,
        @Tag(tag=1) IsAllowClient ;
    }

    @Tag(tag=6) public Integer targetLockPointIndex = null;
    @Tag(tag=137) public Boolean isTrueLifeTimeByOwner = null;
    @Tag(tag=3) public Integer ownerEntityId = null;
    @Tag(tag=11) public Vector initEulerAngles = null;
    @Tag(tag=1) public Integer propOwnerEntityId = null;
    @Tag(tag=15) public Integer roomId = null;
    @Tag(tag=7) public Integer forwardType = null;
    @Tag(tag=14) public Integer campId = null;
    @Tag(tag=13) public Integer configId = null;
    @Tag(tag=10) public Integer targetEntityId = null;
    @Tag(tag=5) public Long guid = null;
    @Tag(tag=2) public Boolean sightGroupWithOwner = null;
    @Tag(tag=9) public Vector initPos = null;
    @Tag(tag=4) public Integer entityId = null;
    @Tag(tag=771) public Boolean isPeerIdFromPlayer = null;
    @Tag(tag=1252) public List<Integer> targetLockPointIndexList = new ArrayList<>();
    @Tag(tag=8) public Boolean isAsyncLoad = null;
    @Tag(tag=12) public Integer campType = null;
    @Tag(tag=1591) public List<Integer> targetEntityIdList = new ArrayList<>();
}
